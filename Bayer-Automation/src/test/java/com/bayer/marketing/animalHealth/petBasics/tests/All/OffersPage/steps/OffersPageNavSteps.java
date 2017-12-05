package com.bayer.marketing.animalHealth.petBasics.tests.All.OffersPage.steps;


import java.awt.Dialog.ModalExclusionType;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.animalHealth.petBasics.tests.All.AboutPage.AboutPage;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.marketing.animalHealth.petBasics.tests.All.OffersPage.OffersPage;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;
public class OffersPageNavSteps extends AbstractStep  {
	
	//protected String url = "https://www.petbasics.com/about-bayer";
    public OffersPageNavSteps() {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	OffersPage urlVar = new OffersPage();
    	String url = urlVar.getUrl();
    	System.out.println("Page url: " + url);
    	
    	
    	BayerWebElement window = getElement( "modal.window", webDriver );
    	if (window.isDisplayed()) {
    		waitForElement( "modal.skip", webDriver, 15 );
        	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    		skipButton.click();	
		}
    
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	BayerWebElement image = getElement( "petbasics.offers.image", webDriver );
    	//Util.scrollToElement(webDriver, btn1, wait);
    	waitForElement("petbasics.offers.image", webDriver, 15 ); 
    	
    	BayerWebElement nocoupon = getElement( "petbasics.offers.nocoupon", webDriver );
    	//Util.scrollToElement(webDriver, btn2, wait);
    	waitForElement("petbasics.offers.nocoupon", webDriver, 15 );
    	
    	BayerWebElement filtermenu = getElement( "petbasics.offers.filtermenu", webDriver );
    	//Util.scrollToElement(webDriver, btn3, wait);
    	waitForElement("petbasics.offers.filtermenu", webDriver, 15 );    	
    	filtermenu.click();
    	waitForElement("petbasics.offers.menuopen", webDriver, 15 );
    	BayerWebElement filteritem1 = getElement( "petbasics.offers.filteritem1", webDriver );
    	waitForElement("petbasics..offers.filteritem1", webDriver, 15 );  
    	filteritem1.click();
    	BayerWebElement applyfilter = getElement( "petbasics.offers.applyfilter", webDriver );
    	applyfilter.click();
    	waitForElement("petbasics.offers.applyfilter.validate", webDriver, 15 );
    	BayerWebElement clearfilter = getElement( "petbasics.offers.clearfilter", webDriver );
    	clearfilter.click();
    	BayerWebElement cleanscreen = getElement( "petbasics.offers.cleanscreen", webDriver );
    	cleanscreen.click();
    	waitForElement("petbasics.offers.cleanscreen.validate", webDriver, 15 );   	
    	
    	webDriver.navigate().to(url);
    	
        return true;
    }

}
