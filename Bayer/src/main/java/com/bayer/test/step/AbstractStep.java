package com.bayer.test.step;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.objectRepository.ORLookup;
import com.bayer.objectRepository.PropertyReader;
import com.bayer.test.step.factory.Step;
import com.bayer.test.step.factory.StepListener;
import com.bayer.test.step.factory.StepManager;
import com.bayer.utiilty.XMLEscape;

public abstract class AbstractStep implements Step
{
	private static NumberFormat numberFormat = new DecimalFormat( "0000" );
    private String description;
    private String failureMessage;
    private StepListener stepListener;

    protected abstract boolean _executeStep( BayerWebDriver webDriver );

    protected AbstractStep( String description, String failureMessage )
    {
        this.description = description;
        this.failureMessage = failureMessage;
    }

    public boolean executeStep( BayerWebDriver webDriver )
    {

        boolean returnValue = false;
        //
        // Notify Perfecto reporting services if configured
        //
        if ( webDriver.getReportiumClient() != null )
        {
            webDriver.getReportiumClient().stepStart( description );
        }

        StepManager.instance().beforeStep( webDriver );

        try
        {
            if ( log.isInfoEnabled() )
                log.info( "Executing " + this.getDescription() );
            returnValue = _executeStep( webDriver );

            if ( !returnValue )
                webDriver.getReportiumClient().stepEnd( failureMessage );
            else
                webDriver.getReportiumClient().stepEnd();

        }
        catch ( Exception e )
        {
            webDriver.getReportiumClient().stepEnd( failureMessage + " caused by " + e.getMessage() );
            e.printStackTrace();
        }

        StepManager.instance().afterStep( webDriver, returnValue );

        return returnValue;
    }

    public StepListener getStepListener()
    {
        return stepListener;
    }

    public void setStepListener( StepListener stepListener )
    {
        this.stepListener = stepListener;
    }

    public String getDescription()
    {
        return description;
    }

    protected void setDescription( String description )
    {
        this.description = description;
    }

    public String getFailureMessage()
    {
        return failureMessage;
    }

    protected void setFailureMessage( String failureMessage )
    {
        this.failureMessage = failureMessage;
    }

    protected Log log = LogFactory.getLog( AbstractStep.class );

    protected WebElement getElement( String[] objectArray, BayerWebDriver webDriver )
    {

        for ( String objectName : objectArray )
        {
            try
            {
                WebElement currentElement = getElement( objectName, webDriver );
                if ( currentElement != null )
                    return currentElement;
            }
            catch ( Exception e )
            {

            }
        }

        return null;
    }

    protected BayerWebElement getElement( String objectName, BayerWebDriver webDriver )
    {
        ORLookup orLookup = PropertyReader.instance().getElement( objectName, webDriver.getOsType() );

        if ( orLookup.getOrContext() != null )
            webDriver.switchContext( orLookup.getOrContext() );

        String lookupValue = orLookup.getOrValue();

        switch ( orLookup.getOrType() )
        {
            case "XPATH":
                return (BayerWebElement) webDriver.findElement( By.xpath( lookupValue ) );
            case "CSS":
                return (BayerWebElement) webDriver.findElement( By.cssSelector( lookupValue ) );
            case "ID":
                return (BayerWebElement) webDriver.findElement( By.id( lookupValue ) );
            case "NAME":
                return (BayerWebElement) webDriver.findElement( By.name( lookupValue ) );
            case "VISUAL":
                return (BayerWebElement) webDriver.findElement( By.linkText( lookupValue ) );
            default:
                return (BayerWebElement) webDriver.findElement( By.xpath( lookupValue ) );
        }
    }
    
    private class CheckPointFiles implements FilenameFilter
    {
        private String checkPointName;

        public CheckPointFiles( String checkPointName )
        {
            this.checkPointName = checkPointName;
        }

        @Override
        public boolean accept( File dir, String name )
        {
            return (name.startsWith( checkPointName ));
        }
    }

    protected BayerWebElement waitForElement( String objectName, BayerWebDriver webDriver, int waitTime )
    {
        ORLookup orLookup = PropertyReader.instance().getElement( objectName, webDriver.getOsType() );

        if ( orLookup.getOrContext() != null )
            webDriver.switchContext( orLookup.getOrContext() );

        WebDriverWait waitFor = new WebDriverWait( webDriver, waitTime, 500 );

        final By useBy;

        switch ( orLookup.getOrType() )
        {
            case "XPATH":
                useBy = By.xpath( orLookup.getOrValue() );
                break;
            case "CSS":
                useBy = By.cssSelector( orLookup.getOrValue() );
                break;
            case "ID":
                useBy = By.id( orLookup.getOrValue() );
                break;
            case "NAME":
                useBy = By.name( orLookup.getOrValue() );
                break;
            case "VISUAL":
                useBy = By.linkText( orLookup.getOrValue() );
                break;
            default:
                useBy = By.xpath( orLookup.getOrValue() );
        }

        BayerWebElement webElement = (BayerWebElement) waitFor.until( new Function<WebDriver, WebElement>()
        {

            @Override
            public WebElement apply( WebDriver webDriver )
            {
                return ExpectedConditions.presenceOfElementLocated( useBy ).apply( webDriver );
            }

        } );

        return webElement;
    }
    
    protected BayerWebElement waitForVisible( String objectName, BayerWebDriver webDriver, int waitTime )
    {
        ORLookup orLookup = PropertyReader.instance().getElement( objectName, webDriver.getOsType() );

        if ( orLookup.getOrContext() != null )
            webDriver.switchContext( orLookup.getOrContext() );

        WebDriverWait waitFor = new WebDriverWait( webDriver, waitTime, 500 );

        final By useBy;

        switch ( orLookup.getOrType() )
        {
            case "XPATH":
                useBy = By.xpath( orLookup.getOrValue() );
                break;
            case "CSS":
                useBy = By.cssSelector( orLookup.getOrValue() );
                break;
            case "ID":
                useBy = By.id( orLookup.getOrValue() );
                break;
            case "NAME":
                useBy = By.name( orLookup.getOrValue() );
                break;
            case "VISUAL":
                useBy = By.linkText( orLookup.getOrValue() );
                break;
            default:
                useBy = By.xpath( orLookup.getOrValue() );
        }

        BayerWebElement webElement = (BayerWebElement) waitFor.until( new Function<WebDriver, WebElement>()
        {

            @Override
            public WebElement apply( WebDriver webDriver )
            {
                return ExpectedConditions.visibilityOfElementLocated( useBy ).apply( webDriver );
            }

        } );

        return webElement;
    }
    
    protected String dumpState(BayerWebDriver webDriver, String checkPointName, int historicalCount, int deviationPercentage )
    {

    	try
    	{
	        File checkPointFolder = null;
	
	        if ( checkPointName != null )
	        {
	            checkPointFolder = new File( ".", "historicalComparison" );
	        }   
	
	        File useFolder = new File( ".", "artifacts" );
	        useFolder.mkdirs();
	
	        File screenFile = null;
	        File domFile = null;
	        File xpathFile = null;
	        
	        OutputStream os = null;
	        try
	        {
	            byte[] screenShot = webDriver.getScreenshotAs( OutputType.BYTES );
	            if ( checkPointName != null )
	                screenFile = new File( useFolder, "grid-" + checkPointName.replace( "-", "_" ) + "-" + webDriver.getOsType() + ".png" );
	            else
	                screenFile = File.createTempFile( "state", ".png", useFolder );
	
	            screenFile.getParentFile().mkdirs();
	            os = new BufferedOutputStream( new FileOutputStream( screenFile ) );
	            os.write( screenShot );
	            os.flush();
	            os.close();
	
	            if ( checkPointFolder != null )
	            {
	                //
	                // Dump state as historical
	                //
	                checkPointFolder.mkdirs();
	
	                if ( historicalCount > 0 )
	                {
	                    List<File> historicalFiles = Arrays.asList( checkPointFolder.listFiles( new CheckPointFiles( checkPointName + "-" ) ) );
	                    Collections.sort( historicalFiles );
	                    Collections.reverse( historicalFiles );
	
	                    if ( historicalFiles.size() >= historicalCount )
	                        historicalFiles.get( 0 ).delete();
	
	                    for ( File file : historicalFiles )
	                    {
	                        String[] fileParts = file.getName().split( "\\." );
	                        int fileNumber = Integer.parseInt( fileParts[0].substring( checkPointName.length() + 1 ) );
	
	                        file.renameTo( new File( file.getParentFile(), checkPointName + "-" + numberFormat.format( fileNumber + 1 ) + ".png" ) );
	                    }
	
	                    os = new BufferedOutputStream( new FileOutputStream( new File( checkPointFolder, checkPointName + "-0000.png" ) ) );
	                }
	                else
	                    os = new BufferedOutputStream( new FileOutputStream( new File( checkPointFolder, checkPointName + ".png" ) ) );
	
	                os.write( screenShot );
	                os.flush();
	                os.close();
	
	                if ( deviationPercentage >= 0 )
	                {
	                    //
	                    // Compare with the last image
	                    //
	                    File newFile = new File( checkPointFolder, checkPointName + "-0000.png" );
	                    File previousFile = new File( checkPointFolder, checkPointName + "-0001.png" );
	
	                    if ( newFile.exists() && previousFile.exists() )
	                    {
	                        double computedDeviation = (compareImages( ImageIO.read( newFile ), ImageIO.read( previousFile ) ) * 100);
	
	                        if ( computedDeviation > deviationPercentage )
	                            throw new RuntimeException( "Historical image comparison failed.  Expected a maximum difference of [" + deviationPercentage + "] but found [" + computedDeviation + "]" );
	                    }
	                }
	            }
	        }
	        finally
	        {
	            if ( os != null )
	                try
	                {
	                    os.close();
	                }
	                catch ( Exception e )
	                {
	                }
	        }
	
	
	        String pageSource = null;
	        
	        FileOutputStream outputStream = null;
	        try
	        {
	            File xmlFile = File.createTempFile( "dom-", ".xml", useFolder );
	
	            pageSource = webDriver.getPageSource();
	            outputStream = new FileOutputStream( xmlFile );
	            
	            outputStream.write( XMLEscape.toXML( pageSource ).getBytes() );
	
	            outputStream.flush();
	            outputStream.close();
	        }
	
	        finally
	        {
	            if ( outputStream != null )
	                try
	                {
	                    outputStream.close();
	                }
	                catch ( Exception e )
	                {
	                }
	        }
	        
	        return pageSource;
    	}
    	catch( Exception e )
    	{
    		e.printStackTrace();
    		return null;
    	}
    }
    
    private String removeScript( String o )
    {
        String newString = o;
        
        int scriptLocation = 0;
        
        while ( ( scriptLocation = newString.indexOf( "<script" ) ) != -1 )
        {
            int endLocation = newString.indexOf( "/script>", scriptLocation );
            if ( endLocation != -1 )
            {
                String begin = newString.substring( 0, scriptLocation );
                String end = newString.substring( endLocation + 8 );
                newString = begin + end;
            }
            else
                break;
                
        }
        
        return newString;
    }
    
    protected double compareImages( BufferedImage imageOne, BufferedImage imageTwo )
    {
        Dimension dimOne = new Dimension( imageOne.getWidth(), imageOne.getHeight() );
        Dimension dimTwo = new Dimension( imageTwo.getWidth(), imageTwo.getHeight() );
        
        int differenceCount = 0;
        
        if ( dimOne.getWidth() != dimTwo.getWidth() || dimOne.getHeight() != dimTwo.getHeight() )
            return 0;
        else
        {
            for( int x=0; x<dimOne.getWidth(); x++ )
            {
                for( int y=0; y<dimOne.getHeight(); y++ )
                {
                    if ( imageOne.getRGB( x, y ) != imageTwo.getRGB( x, y ) )
                        differenceCount++;
                }
            }
        }
        
        return differenceCount / ( dimOne.getWidth() * dimOne.getHeight() );
        
    }
    
    
    
}
