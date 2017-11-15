package com.bayer.marketing.animalHealth.petBasics.tests.Cat.CatHomePage.steps;


import java.awt.Dialog.ModalExclusionType;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.test.step.AbstractStep;

public class CatHomePageSteps extends AbstractStep  {
	
	//protected String url = "https://www.petbasics.com/";
    public CatHomePageSteps() {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	HomePage urlVar = new HomePage();
    	String url = urlVar.getUrl();
    	System.out.println("Page url: " + url);
    	
    	
    	BayerWebElement window = getElement( "modal.window", webDriver );
    	if (window.isDisplayed()) {
    		waitForElement( "modal.cat", webDriver, 15 );
        	BayerWebElement catButton = getElement( "modal.cat", webDriver );
        	catButton.click();	
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
    	
    	waitForElement( "home.partner", webDriver, 15 );
    	BayerWebElement partners = getElement( "home.partner", webDriver );
    	partners.click();
    	webDriver.navigate().to(url);
    	
        return true;
    }

}
