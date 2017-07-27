package com.bayer.marketing.consumerHealth.aleve.tests.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class whereToBuyStep extends AbstractStep
{

    public whereToBuyStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        waitForElement( "aleve.wtb.link", webDriver, 15 );
        BayerWebElement link = getElement( "aleve.wtb.link", webDriver );
        link.click();
        
        waitForElement( "aleve.wtb.zip", webDriver, 15 );
        BayerWebElement zip = getElement( "aleve.wtb.zip", webDriver );
        zip.clear();
        zip.sendKeys("07981");
        
 
        BayerWebElement buyNow = getElement( "aleve.wtb.buyNow", webDriver );
        buyNow.click();

        

        
        
        return true;
    }

}
