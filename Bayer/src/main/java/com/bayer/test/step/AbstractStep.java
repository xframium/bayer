package com.bayer.test.step;

import java.util.function.Function;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
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

public abstract class AbstractStep implements Step
{
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
}
