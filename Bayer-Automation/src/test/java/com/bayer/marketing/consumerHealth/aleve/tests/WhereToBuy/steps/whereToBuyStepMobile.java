package com.bayer.marketing.consumerHealth.aleve.tests.WhereToBuy.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class whereToBuyStepMobile extends AbstractStep
{

    public whereToBuyStepMobile()
    {
        super( "Success", "Error" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        waitForElement( "aleve.mobile.wtb.menu", webDriver, 15 );
        BayerWebElement menu = getElement( "aleve.mobile.wtb.menu", webDriver );
        menu.click();
        
        BayerWebElement wheretobuy = getElement( "aleve.mobile.wtb.wheretobuy", webDriver );
        wheretobuy.click();
       
        BayerWebElement nearby = getElement( "aleve.mobile.wtb.findNearby", webDriver );
        nearby.click();

        BayerWebElement zip = getElement( "aleve.wtb.zip", webDriver );
        zip.clear();
        zip.sendKeys("07981");
        
        BayerWebElement online = getElement( "aleve.mobile.wtb.findOnline", webDriver );
        online.click();
        
        BayerWebElement PRFR = getElement( "aleve.wtb.PRFR", webDriver );
        PRFR.click();
        
        BayerWebElement buyNow = getElement( "aleve.wtb.buyNow1", webDriver );
        buyNow.click();
       
        
        
     
        
        return true;
    }

}
