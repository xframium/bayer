package com.bayer;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BayerWebElement implements WebElement, Locatable
{
    public WebElement getWebElement() {
		return webElement;
	}

	private WebElement webElement;
    private By by;
    private BayerWebDriver webDriver;
    private boolean populationFailed = false;
    
    public BayerWebElement( By useBy, BayerWebDriver webDriver )
    {
        this.by = useBy;
        
        this.webDriver = webDriver;
    }
    
    public BayerWebElement( WebElement webElement, BayerWebDriver webDriver )
    {
        this.webElement = webElement;
        this.webDriver = webDriver;
    }
    
    public WebElement getUnderlyingElement()
    {
        return this.webElement;
    }
    
    @Override
    public <X> X getScreenshotAs( OutputType<X> target ) throws WebDriverException
    {
        if ( webElement == null && !populationFailed )
            populateElement( false );
        return webElement.getScreenshotAs( target );
    }

    @Override
    public void click()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        
        webElement.click();
    }

    @Override
    public void submit()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        webElement.submit();
    }
    
    public boolean exists( boolean handlePopups )
    {
        if ( webElement == null && !populationFailed )
            populateElement( handlePopups );
        
        return webElement != null;
    }
    
    
    
    
    public boolean exists( boolean handlePopups , int intTimeOut)
    {
    	

    	try
    	{
    		webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    		Wait<WebDriver> wait = new FluentWait<WebDriver>( webDriver.getNative() )
    								.withTimeout( intTimeOut, TimeUnit.SECONDS)
    								.pollingEvery( 500, TimeUnit.MILLISECONDS)
    								.ignoring(NoSuchElementException.class);
	
	    	webElement = (WebElement) wait.until( new Function<WebDriver, WebElement>()
            {
    	        @Override
    	        public WebElement apply( WebDriver t )
    	        {
    	            // TODO Auto-generated method stub
    	            return ExpectedConditions.presenceOfElementLocated(by).apply( t );
    	        }
            } );
	    	        
	    	        
	    	        
    	}
    	catch( Exception e )
    	{
    		System.out.println(e.getMessage());
    	}
    	finally
    	{
    		webDriver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
    	}
    	
    	if ( handlePopups )
    	{
	    	if ( webElement == null && !populationFailed )
	    		populateElement( handlePopups );
    	}
    	return webElement != null;
    }

    @Override
    public void sendKeys( CharSequence... keysToSend )
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        webElement.sendKeys( keysToSend );
        
    }

    @Override
    public void clear()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        webElement.clear();
    }

    @Override
    public String getTagName()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.getTagName();
    }

    @Override
    public String getAttribute( String name )
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.getAttribute( name );
    }

    @Override
    public boolean isSelected()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.isSelected();
    }

    @Override
    public boolean isEnabled()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.isEnabled();
    }

    @Override
    public String getText()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.getText();
    }

    @Override
    public List<WebElement> findElements( By by )
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.findElements( by );
    }

    @Override
    public WebElement findElement( By by )
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.findElement( by );
    }

    @Override
    public boolean isDisplayed()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.isDisplayed();
    }
    
    public boolean isDisplayed( boolean handlePopup )
    {
        if ( webElement == null && !populationFailed )
            populateElement( handlePopup );
        return webElement.isDisplayed();
    }

    @Override
    public Point getLocation()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.getLocation();
    }

    @Override
    public Dimension getSize()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.getSize();
    }

    @Override
    public Rectangle getRect()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.getRect();
    }

    @Override
    public String getCssValue( String propertyName )
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return webElement.getCssValue( propertyName );
    }
    
    private void populateElement( boolean handlePopups )
    {
        try
        {
            
            webElement = webDriver.findRawElement( by );
        }
        finally
        {
            if ( webElement == null )
                populationFailed = true;
        }
    }

    @Override
    public Coordinates getCoordinates()
    {
        if ( webElement == null && !populationFailed )
            populateElement( true );
        return ( (Locatable) webElement).getCoordinates();
    }

}
