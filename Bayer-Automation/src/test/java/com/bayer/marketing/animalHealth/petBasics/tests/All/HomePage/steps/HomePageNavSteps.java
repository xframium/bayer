package com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.steps;

//import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.url;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class HomePageNavSteps extends AbstractStep  {
	
	protected String url = "https://www.petbasics.com/";
    public HomePageNavSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	String url = "https://www.petbasics.com/";
    	waitForElement( "modal.skip", webDriver, 15 );
    	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    	
    	if (skipButton.isDisplayed()) {
    		skipButton.click();
		}
    	
    	waitForElement( "home.whywedoit", webDriver, 15 );
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	BayerWebElement whywedo = getElement( "home.whywedoit", webDriver );
    	whywedo.click();
    	waitForElement( "waitForFlag", webDriver, 15 );
    	webDriver.navigate().to(url);
    	
    	
        
         
        
        return true;
    }

}
