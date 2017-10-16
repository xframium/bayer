package com.bayer.marketing.consumerHealth.betaseron.tests.HomePage.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class HomePageNavSteps extends AbstractStep
{

    public HomePageNavSteps()
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
    	waitForElement( "betaseron.home.key", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
    	
    	waitForElement( "betaseron.home.notTakingBetaseron", webDriver, 15 );
    	BayerWebElement signup1 = getElement( "betaseron.home.notTakingBetaseron", webDriver );
    	signup1.click();
    	waitForElement( "betaseron.home.key", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
       
    	waitForElement( "betaseron.home.amTakingBetaseron", webDriver, 15 );
    	BayerWebElement signup2 = getElement( "betaseron.home.amTakingBetaseron", webDriver );
    	signup2.click();
    	waitForElement( "betaseron.home.key", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
    	
    	waitForElement( "betaseron.home.caregiver", webDriver, 15 );
    	BayerWebElement caregiver = getElement( "betaseron.home.caregiver", webDriver );
    	caregiver.click();
    	waitForElement( "betaseron.home.key", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
    	
    	waitForElement( "betaseron.home.learnMore", webDriver, 15 );
    	BayerWebElement learn = getElement( "betaseron.home.learnMore", webDriver );
    	learn.click();
    	waitForElement( "betaseron.home.key", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
    	
    	waitForElement( "betaseron.home.secondFlareUp", webDriver, 15 );
    	BayerWebElement flareUp = getElement( "betaseron.home.secondFlareUp", webDriver );
    	flareUp.click();
    	waitForElement( "betaseron.home.key", webDriver, 15 );
    	webDriver.navigate().to("https://www.betaseron.com/");
    	
        
         
        
        return true;
    }

}
