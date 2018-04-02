package com.bayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ContextAware;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.FindsByClassName;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.internal.FindsByLinkText;
import org.openqa.selenium.internal.FindsByName;
import org.openqa.selenium.internal.FindsByTagName;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.bayer.utiilty.XMLEscape;
import com.perfecto.reportium.client.ReportiumClient;

import io.appium.java_client.AppiumDriver;

public class BayerWebDriver implements WebDriver, FindsByClassName, FindsByCssSelector, FindsById, FindsByLinkText,
		FindsByName, FindsByTagName, FindsByXPath, JavascriptExecutor, TakesScreenshot, HasCapabilities, ContextAware, HasInputDevices, Locatable {
	private WebDriver nativeDriver;
	private ReportiumClient reportiumClient;
	private String currentContext;
	private String osType;
	private String deviceId;
	private String platformVersion;
	
	private boolean handlingError = false;
	public Object wait;
	
    public boolean isHandlingError()
    {
        return handlingError;
    }

    public void setHandlingError( boolean handlingError )
    {
        this.handlingError = handlingError;
    }

    public BayerWebDriver( WebDriver nativeDriver )
    {
        this.nativeDriver = nativeDriver;
    }
    
    public AppiumDriver asAppium()
    {
    	if ( nativeDriver instanceof AppiumDriver )
    		return (AppiumDriver) nativeDriver;
    	else
    		return null;
    }

    public RemoteWebDriver asRemote()
    {
    	if ( nativeDriver instanceof RemoteWebDriver )
    		return (RemoteWebDriver) nativeDriver;
    	else
    		return null;
    }
    
    public boolean verifySwitchWindow( String winExpValue )
    {

        Set<String> availableWindows = getWindowHandles();

        if ( !availableWindows.isEmpty() )
        {
            for ( String windowId : availableWindows )
            {

            	switchTo().window( windowId );
            	
            	if ( getTitle().trim().toLowerCase().contains( winExpValue.toLowerCase() ) || getCurrentUrl().trim().toLowerCase().contains( winExpValue.toLowerCase() ) )
            		return true;
            	
            }
        }

        return false;
    }
    
    public ReportiumClient getReportiumClient()
    {
        return reportiumClient;
    }

    public void setReportiumClient( ReportiumClient reportiumClient )
    {
        this.reportiumClient = reportiumClient;
    }

    public String getOsType()
    {
        return osType;
    }

    public String getDeviceId()
    {
        return deviceId;
    }
    
    public String getPlatFormVersion()
    {
        return platformVersion;
    }

    public void setOsType( String osType )
    {
        this.osType = osType.toUpperCase();
    }
    
    public void setDeviceId( String deviceId )
    {
        this.deviceId = deviceId;
    }
    
	public void setPlatformVersion(String platformVersion) 
	{
		this.platformVersion = platformVersion;
	}

    public BayerWebDriver switchContext( String newContext )
    {
        if ( currentContext != null )
        {
            if ( currentContext.equals( newContext ) )
                return this;
            else
            {
                context( newContext );
                currentContext = newContext;
            }
        }
        else 
        {
            context( newContext );
            currentContext = newContext;
        }
            

        return this;
    }

    public WebDriver getNative()
    {
        return nativeDriver;
    }
    
    public BayerWebDriver asVisual()
    {
        if ( currentContext != null )
        {
            if ( currentContext.equals( "VISUAL" ) )
                return this;
            else
            {
                context( "VISUAL" );
                currentContext = "VISUAL";
            }
        }

        return this;
    }

    protected BayerWebDriver getNativeDriver()
    {
        if ( currentContext != null )
        {
            if ( currentContext.equals( "NATIVE_APP" ) )
                return this;
            else
            {
                context( "NATIVE_APP" );
                currentContext = "NATIVE_APP";
            }
        }

        return this;
    }

    protected BayerWebDriver getWebDriver()
    {
        if ( currentContext != null )
        {
            if ( currentContext.equals( "WEB_VIEW" ) )
                return this;
            else
            {
                context( "WEB_VIEW" );
                currentContext = "WEB_VIEW";
            }
        }

        return this;
    }


    @Override
    public WebElement findElementByXPath( String using )
    {
        return findElement( By.xpath( using ) );
    }

    @Override
    public List<WebElement> findElementsByXPath( String using )
    {
        return findElements( By.xpath( using ) );
    }

    @Override
    public WebElement findElementByTagName( String using )
    {
        return findElement( By.tagName( using ) );
    }

    @Override
    public List<WebElement> findElementsByTagName( String using )
    {
        return findElements( By.tagName( using ) );
    }

    @Override
    public WebElement findElementByName( String using )
    {
        return findElement( By.name( using ) );
    }

    @Override
    public List<WebElement> findElementsByName( String using )
    {
        return findElements( By.name( using ) );
    }

    @Override
    public WebElement findElementByLinkText( String using )
    {
        return findElement( By.linkText( using ) );
    }

    @Override
    public List<WebElement> findElementsByLinkText( String using )
    {
        return findElements( By.linkText( using ) );
    }

    @Override
    public WebElement findElementByPartialLinkText( String using )
    {
        return findElement( By.partialLinkText( using ) );
    }

    @Override
    public List<WebElement> findElementsByPartialLinkText( String using )
    {
        return findElements( By.partialLinkText( using ) );
    }

    @Override
    public WebElement findElementById( String using )
    {
        return findElement( By.id( using ) );
    }

    @Override
    public List<WebElement> findElementsById( String using )
    {
        return findElements( By.id( using ) );
    }

    @Override
    public WebElement findElementByCssSelector( String using )
    {
        return findElement( By.cssSelector( using ) );
    }

    @Override
    public List<WebElement> findElementsByCssSelector( String using )
    {
        return findElements( By.cssSelector( using ) );
    }

    @Override
    public WebElement findElementByClassName( String using )
    {
        return findElement( By.className( using ) );
    }

    @Override
    public List<WebElement> findElementsByClassName( String using )
    {
        return findElements( By.className( using ) );
    }

    @Override
    public void get( String url )
    {
        nativeDriver.get( url );
        
    }

    @Override
    public String getCurrentUrl()
    {
        return nativeDriver.getCurrentUrl();
    }

    @Override
    public String getTitle()
    {
        return nativeDriver.getTitle();
    }

    @Override
    public List<WebElement> findElements( By by )
    {
        List<WebElement> elementList = new ArrayList<WebElement>( 10 );
        List<WebElement> currentList = new ArrayList<WebElement>( 10 );
        
        
        currentList = nativeDriver.findElements( by );
        
        for ( WebElement wE : currentList )
            elementList.add( new BayerWebElement( wE, this ) );
        
        return elementList;
            
    }

    @Override
    public WebElement findElement( By by )
    {
        return new BayerWebElement( by, this );
    }
    
    public WebElement findRawElement( By by )
    {
        return nativeDriver.findElement( by );
    }

    @Override
    public String getPageSource()
    {

        String pageSource = nativeDriver.getPageSource();

        if ( pageSource != null )
        {
            // if ( ApplicationRegistry.instance().getAUT() != null ||
            // ApplicationRegistry.instance().getAUT().isWeb() )
            // return XMLEscape.toHTML( pageSource );
            // else
            return XMLEscape.toXML( pageSource );
        }
        else
            return "";

    }

    @Override
    public void close()
    {
        nativeDriver.close();
    }

    @Override
    public void quit()
    {
        nativeDriver.quit();
    }

    @Override
    public Set<String> getWindowHandles()
    {
        return nativeDriver.getWindowHandles();
    }

    @Override
    public String getWindowHandle()
    {
        return nativeDriver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo()
    {
        return nativeDriver.switchTo();
    }

    @Override
    public Navigation navigate()
    {
        return nativeDriver.navigate();
    }

    @Override
    public Options manage()
    {
        return nativeDriver.manage();
    }

    @Override
    public <X> X getScreenshotAs( OutputType<X> target ) throws WebDriverException
    {
        if ( nativeDriver instanceof TakesScreenshot )
            return ( (TakesScreenshot) nativeDriver ).getScreenshotAs( target );
        else
            return null;
    }

    @Override
    public Object executeScript( String script, Object... args )
    {
        if ( nativeDriver instanceof JavascriptExecutor )
            return ( (JavascriptExecutor) nativeDriver ).executeScript( script, args );
        else
            return null;
    }

    @Override
    public Object executeAsyncScript( String script, Object... args )
    {
        if ( nativeDriver instanceof JavascriptExecutor )
            return ( (JavascriptExecutor) nativeDriver ).executeAsyncScript( script, args );
        else
            return null;
    }

    @Override
    public Capabilities getCapabilities()
    {
        if ( nativeDriver instanceof HasCapabilities )
            return ( (HasCapabilities) nativeDriver ).getCapabilities();
        else
            return null;
    }



    @Override
    public WebDriver context( String name )
    {
        if ( nativeDriver instanceof ContextAware )
            ( (ContextAware) nativeDriver ).context( name );
        
        return this;
    }



    @Override
    public Set<String> getContextHandles()
    {
        if ( nativeDriver instanceof ContextAware )
            return ( (ContextAware) nativeDriver ).getContextHandles();
        
        return null;
    }

    @Override
    public String getContext()
    {
        if ( nativeDriver instanceof ContextAware )
            return ( (ContextAware) nativeDriver ).getContext();
        
        return null;
    }

    @Override
    public Keyboard getKeyboard()
    {
        if ( nativeDriver instanceof HasInputDevices )
            return ( (HasInputDevices) nativeDriver ).getKeyboard();
        else
            return null;
    }

    @Override
    public Mouse getMouse()
    {
        if ( nativeDriver instanceof HasInputDevices )
            return ( (HasInputDevices) nativeDriver ).getMouse();
        else
            return null;
    }

    @Override
    public Coordinates getCoordinates()
    {
        if ( nativeDriver instanceof Coordinates )
            return ( (Locatable) nativeDriver ).getCoordinates();
        else
            return null;
    }

}
