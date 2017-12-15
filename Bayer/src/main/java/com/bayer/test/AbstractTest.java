package com.bayer.test;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.bayer.BayerWebDriver;
import com.bayer.configuration.ConfigurationManager;
import com.bayer.test.device.Device;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.device.DeviceManager;
import com.bayer.test.step.factory.Step;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public abstract class AbstractTest
{
	@Retention(RetentionPolicy.RUNTIME)
	public @interface TestDescriptor
	{

		/**
		 * Site name.
		 *
		 * @return the string
		 */
		String testName() default "";

		/**
		 * Page name.
		 *
		 * @return the string
		 */
		String[] testTags() default {};

		String version() default "0.0.1";

	}

	private ThreadLocal<BayerWebDriver> tlDriver = new ThreadLocal<BayerWebDriver>();
	private ThreadLocal<Device> tlDevice = new ThreadLocal<Device>();
	private Capabilities rtCaps;

	protected Log log = LogFactory.getLog( AbstractTest.class );

	@DataProvider ( name = "deviceList", parallel = true )
	public Object[][] getDevices()
	{
		DeviceContainer[] cArray = DeviceManager.instance().getDevices();
		Object[][] objectArray = new Object[ cArray.length ][ 1 ];

		
		for ( int i=0; i<cArray.length; i++ )
		{
		    log.info( "Adding Device Container as [" + cArray[ i ] + "]" );
			objectArray[ i ][ 0 ] = cArray[ i ];
		}
		
		return objectArray; 
	}

	protected void executeSteps( Step[] stepArray )
	{
		for ( Step currentStep : stepArray )
		{
			if ( !currentStep.executeStep( tlDriver.get() ) )
			{
				throw new IllegalStateException( currentStep.getFailureMessage() );
			}
		}
	}

	@BeforeMethod( alwaysRun=true )
	public void beforeMethod( Method currentMethod, ITestContext testContext, Object[] testArgs ) {
		try
		{
			String methodKey = currentMethod.getDeclaringClass().getSimpleName() + "." + currentMethod.getName();
			
			log.info( "*** Attempting to locate a device for " + methodKey );
			
			//
			// Use the TestDescriptor to initialize the name & tags
			//
			TestDescriptor tD = currentMethod.getAnnotation( TestDescriptor.class );
			String testName = currentMethod.getName();
			String testVersion = "0.0.1";
			List<String> tagString = new ArrayList<String>( 10 );
			tagString.add( "Bayer Development" );
			tagString.add( ConfigurationManager.instance().getProperty( "UserName" ) );
			
			
			if ( tD != null )
			{
				if ( tD.testName() != null && !tD.testName().isEmpty() )
				{
					testName = tD.testName();
				}

				if ( tD.testTags() != null && tD.testTags().length > 0 )
				{
					tagString.addAll( Arrays.asList( tD.testTags() ) );
				}

				if ( tD.version() != null && !tD.version().isEmpty() )
				{
					testVersion = tD.version();
				}
			}


            
            DeviceContainer dContainer = (DeviceContainer) testArgs[ 0 ];
            BayerWebDriver webDriver = null;
            int retryCounter = 0;
            Device currentDevice = null;
            String driverType = null;

            log.info( Thread.currentThread().getName() + ": Attempting to acquire device for " + currentMethod.getName() );

            while ( webDriver == null )
            {
                try
                {
                    
                    currentDevice = dContainer.getDevice( methodKey );
                    if ( currentDevice != null )
                    {
                        log.info( "*** Executing " + methodKey + " on " + currentDevice );
                        tlDevice.set( currentDevice );
                    }

                    DesiredCapabilities dC = currentDevice.getdC();

                    //
                    // Attempt to acquire a device
                    //
                    driverType = (String) dC.getCapability( "_driverType" );
                    if ( driverType == null )
                        driverType = "selenium";
                    driverType = driverType.toLowerCase();

			String cloudUrl = "https://" + URLEncoder.encode( ConfigurationManager.instance().getProperty( "UserName" ), "UTF-8" ) + ":" + URLEncoder.encode( ConfigurationManager.instance().getProperty( "Password" ), "UTF-8" ) + "@" + ConfigurationManager.instance().getProperty( "CloudURL" ) + "/nexperience/perfectomobile/wd/hub";

			if ( log.isInfoEnabled() )
				log.info( "Connecting to " + cloudUrl + " using\r\n " + dC );
                    
                    if ( "appium".equals( driverType ) )
                    {
                        dC.setCapability("automationName", "Appium");
                        
                        if ( ConfigurationManager.instance().getProperty( "Instrumentation" ).equalsIgnoreCase("TRUE") )
                        {
                            dC.setCapability( "autoInstrument", true );
                        }
                        
                        String os = (String) dC.getCapability( "platformName" );
                        if ( os.toLowerCase().equals( "ios" ) ) 
                        {
                            if ( ConfigurationManager.instance().getProperty( "LoadAppAtStart" ).equalsIgnoreCase("TRUE") ) 
                            {     
                                dC.setCapability("bundleId", ConfigurationManager.instance().getProperty( "BundleID" ) );
                            }                           
                            webDriver = new BayerWebDriver( new IOSDriver( new URL( cloudUrl ), dC ) );
                        }
                        else if ( os.toLowerCase().equals( "android" ) )
                        {
                            if ( ConfigurationManager.instance().getProperty( "LoadAppAtStart" ).equalsIgnoreCase("TRUE") ) 
                            {           
                                dC.setCapability("appPackage", ConfigurationManager.instance().getProperty( "AppPackage" ) );
                            }   
                            webDriver = new BayerWebDriver( new AndroidDriver( new URL( cloudUrl ), dC ) );
                        }
                        
                       
                    }
                    else
                    {
                        webDriver = new BayerWebDriver( new RemoteWebDriver( new URL( cloudUrl ), dC ) );
                        //webDriver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );
                        String initialUrl = (String) dC.getCapability( "initialUrl" );
                        if ( initialUrl != null && !initialUrl.isEmpty() )
                            webDriver.get( initialUrl );
                    }
                    
                    
                }
                catch( Exception e )
                {   
                    log.error( "Error connecting to device", e );
                    if ( currentDevice != null )
                        currentDevice.releaseLock();
                    retryCounter++;
                    
                    
                    try { Thread.sleep( 5000 ); } catch( Exception e2 ) {}
                    if ( retryCounter >= 15 )
                        throw e;
                }
            }

			//
			// Configure Perfecto reporting services
			//

			dContainer.markUsed( currentDevice, methodKey );

            PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder().withProject( new Project( testContext.getSuite().getName(), testVersion )).withContextTags( tagString.toArray( new String[ 0 ] ) ).withWebDriver( webDriver ).build();
            try
            {
                webDriver.setReportiumClient( new ReportiumClientFactory().createPerfectoReportiumClient( perfectoExecutionContext ) );
                webDriver.getReportiumClient().testStart( testName, new TestContext() );
            }
            catch( Exception e )
            {
                log.error( "Could not create reporting instance" );
            }
            //webDriver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );
            rtCaps = webDriver.getCapabilities();
            webDriver.setOsType( rtCaps.getCapability( "platformName" ) + "" );
            webDriver.setDeviceId( rtCaps.getCapability( "deviceName" ) + "" );
            
            
            Thread.currentThread().setName( rtCaps.getCapability( "deviceName" ) + "" );
            
            tlDriver.set( webDriver );

		}
		catch( Exception e )
		{
			e.printStackTrace();
			throw new SkipException( "Could not acquire device", e );
		}


	}

	public String getReportUrl()
	{
		if ( rtCaps != null )
			return (String) rtCaps.getCapability( "testGridReportUrl" );
		else
			return null;
	}

	@AfterMethod
	public void afterMethod( Method currentMethod, ITestResult testResult )
	{
		if ( tlDriver.get() == null )
			return;

	    try
	    {
	        if ( tlDriver.get().getReportiumClient() != null )
	        {
	            tlDriver.get().getReportiumClient().testStop( testResult.getStatus() == ITestResult.SUCCESS ? TestResultFactory.createSuccess() : TestResultFactory.createFailure( testResult.getThrowable().getMessage(), testResult.getThrowable() ) );
	        }
	    }
	    catch( Exception e )
	    {
	       
	    }
	
	    try
	    {
	        tlDriver.get().close();
	    }
	    catch( Exception e )
	    {
	        e.printStackTrace();
	    }
	
	    try
	    {
	        tlDriver.get().quit();
	        tlDriver.remove();
	    }
	    catch( Exception e )
	    {
	        e.printStackTrace();
	    }
	
	    if ( tlDevice.get() != null )
	        tlDevice.get().releaseLock();
	    
	}
	

	public static void sleep( long millis )
	{
		try
		{
			Thread.sleep( millis );
		}
		catch ( InterruptedException e )
		{

		}
	}


	protected BayerWebDriver getWebDriver()
	{
		return tlDriver.get();
	}
}