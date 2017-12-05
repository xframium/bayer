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
    	
    	// confirm offers page header image
    	waitForElement("petbasics.offers.image", webDriver, 15 ); 
    	// confirm no offers on initial page
    	waitForElement("petbasics.offers.nocoupon", webDriver, 15 );
    	// open filter menu in mobile
    	BayerWebElement filtermenu = getElement( "petbasics.offers.filtermenu", webDriver );
    	waitForElement("petbasics.offers.filtermenu", webDriver, 15 );    	
    	filtermenu.click();
    	waitForElement("petbasics.offers.menuopen", webDriver, 15 );
    	
    	// select item 1, confirm offer, clear screen
    	BayerWebElement filteritem1 = getElement( "petbasics.offers.filteritem1", webDriver );
    	waitForElement("petbasics.offers.filteritem1", webDriver, 15 );  
    	filteritem1.click();
    	BayerWebElement applyfilter = getElement( "petbasics.offers.applyfilter", webDriver );
    	applyfilter.click();
    	//validate offer
    	waitForElement("petbasics.offers.applyfilter.validate", webDriver, 15 );
    	//clear filter and update
    	BayerWebElement clearfilter = getElement( "petbasics.offers.clearfilter", webDriver );
    	clearfilter.click();
    	BayerWebElement cleanscreen = getElement( "petbasics.offers.cleanscreen", webDriver );
    	cleanscreen.click();
    	waitForElement("petbasics.offers.cleanscreen.validate", webDriver, 15 ); 
    	
    	// select item 2, confirm offer, clear screen
    	BayerWebElement filteritem2 = getElement( "petbasics.offers.filteritem2", webDriver );
    	waitForElement("petbasics.offers.filteritem2", webDriver, 15 );  
    	filteritem2.click();
    	BayerWebElement applyfilter2 = getElement( "petbasics.offers.applyfilter", webDriver );
    	applyfilter2.click();
    	//validate offer
    	waitForElement("petbasics.offers.applyfilter.validate", webDriver, 15 );
    	//clear filter and update
    	BayerWebElement clearfilter2 = getElement( "petbasics.offers.clearfilter", webDriver );
    	clearfilter2.click();
    	BayerWebElement cleanscreen2 = getElement( "petbasics.offers.cleanscreen", webDriver );
    	cleanscreen2.click();
    	waitForElement("petbasics.offers.cleanscreen.validate", webDriver, 15 );
    	

    	
    	webDriver.navigate().to(url);
    	
        return true;
    }

}
