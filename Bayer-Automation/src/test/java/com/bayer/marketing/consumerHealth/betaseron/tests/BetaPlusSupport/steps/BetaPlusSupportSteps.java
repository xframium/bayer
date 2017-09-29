package com.bayer.marketing.consumerHealth.betaseron.tests.BetaPlusSupport.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class BetaPlusSupportSteps extends AbstractStep
{

    public BetaPlusSupportSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	waitForElement( "betaseron.home.betaAppVid", webDriver, 15 );
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	BayerWebElement arthritis = getElement( "betaseron.home.betaAppVid", webDriver );
    	arthritis.click();
    	
    	waitForElement( "aleve.test", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
    	
    	waitForElement( "betaseron.home.apply", webDriver, 15 );
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	BayerWebElement signup = getElement( "betaseron.home.betaAppVid", webDriver );
    	signup.click();
    	
    	waitForElement( "aleve.test", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
       
    	
        
         
        
        return true;
    }

}
