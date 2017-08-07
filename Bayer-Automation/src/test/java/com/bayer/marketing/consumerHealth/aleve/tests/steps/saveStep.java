package com.bayer.marketing.consumerHealth.aleve.tests.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class saveStep extends AbstractStep
{

    public saveStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        waitForElement( "aleve.coupon.aleveDCheck", webDriver, 15 );
        BayerWebElement aleveDCheck = getElement( "aleve.coupon.aleveDCheck", webDriver );
        aleveDCheck.click();
        
        BayerWebElement alevePMCheck = getElement( "aleve.coupon.alevePMCheck", webDriver );
        alevePMCheck.click();
        
        BayerWebElement print = getElement( "aleve.coupon.print", webDriver );
        print.click();
        
        

        
        
        return true;
    }

}
