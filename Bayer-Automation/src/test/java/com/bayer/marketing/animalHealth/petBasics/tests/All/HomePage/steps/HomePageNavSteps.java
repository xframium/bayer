package com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.steps;


import java.awt.Dialog.ModalExclusionType;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.test.step.AbstractStep;

public class HomePageNavSteps extends AbstractStep  {
	
	//protected String url = "https://www.petbasics.com/";
    public HomePageNavSteps() {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	HomePage urlVar = new HomePage();
    	String url = urlVar.getUrl();
    	System.out.println(url);
    	
    	waitForElement( "modal.window", webDriver, 15 );
    	BayerWebElement window = getElement( "modal.window", webDriver );
    	
    	if (window.isDisplayed()) {
    		waitForElement( "modal.skip", webDriver, 15 );
        	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    		skipButton.click();
		}
    	
    	
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	waitForElement( "home.whywedoit", webDriver, 15 );
    	BayerWebElement whywedo = getElement( "home.whywedoit", webDriver );
    	whywedo.click();
    	waitForElement( "waitForFlag", webDriver, 15 );
    	webDriver.navigate().to(url);
    	
    	
        
        
        return true;
    }

}
