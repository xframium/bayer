package com.bayer.marketing.consumerHealth.betaseron.tests.TakingBetaseron.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class TakingBetaseronSteps extends AbstractStep
{

    public TakingBetaseronSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	waitForElement( "betaseron.home.betaAppVid", webDriver, 15 );
    	BayerWebElement arthritis = getElement( "aleve.understand.arthritis", webDriver );
    	arthritis.click();
    	
    	waitForElement( "aleve.test", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
       
    	
        
         
        
        return true;
    }

}
