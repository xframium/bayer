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
    	System.out.println("Page url: " + url);
    	
    	try {
	    	BayerWebElement window = getElement( "modal.window", webDriver );
	    	if (window.isDisplayed()) {
	    		waitForElement( "modal.skip", webDriver, 15 );
	        	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
	    		skipButton.click();	
			}
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	waitForElement( "home.whywedoit", webDriver, 15 );
    	BayerWebElement whywedo = getElement( "home.whywedoit", webDriver );
    	whywedo.click(); 
    	//waitForElement( "waitForFlag2", webDriver, 15 );
    	//BayerWebElement flag = getElement( "waitForFlag2", webDriver );
    	webDriver.navigate().to(url);
    	
    	waitForElement( "home.findProduct", webDriver, 15 );
    	BayerWebElement findProduct = getElement( "home.findProduct", webDriver );
    	findProduct.click();
    	webDriver.navigate().to(url);
        
    	waitForElement( "home.chooseProduct", webDriver, 15 );
    	BayerWebElement chooseProduct = getElement( "home.chooseProduct", webDriver );
    	chooseProduct.click();
    	webDriver.navigate().to(url);
    	
        return true;
    }

}
