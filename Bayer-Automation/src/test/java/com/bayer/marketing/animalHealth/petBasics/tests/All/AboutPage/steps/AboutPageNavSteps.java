package com.bayer.marketing.animalHealth.petBasics.tests.All.AboutPage.steps;


import java.awt.Dialog.ModalExclusionType;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.animalHealth.petBasics.tests.All.AboutPage.AboutPage;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;
public class AboutPageNavSteps extends AbstractStep  {
	
	//protected String url = "https://www.petbasics.com/about-bayer";
    public AboutPageNavSteps() {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	AboutPage urlVar = new AboutPage();
    	String url = urlVar.getUrl();
    	System.out.println("Page url: " + url);
    	
    	
    	BayerWebElement window = getElement( "modal.window", webDriver );
    	if (window.isDisplayed()) {
    		waitForElement( "modal.skip", webDriver, 15 );
        	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    		skipButton.click();	
		}
    
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	BayerWebElement btn1 = getElement( "petbasics.about.btn.1", webDriver );
    	//Util.scrollToElement(webDriver, btn1, wait);
    	waitForElement("petbasics.about.btn.1", webDriver, 15 );    	
    	btn1.click();
    	waitForElement("petbasics.about.btn.1.validate", webDriver, 15 );
    	webDriver.navigate().to(url);
    	
    	BayerWebElement btn2 = getElement( "petbasics.about.btn.2", webDriver );
    	//Util.scrollToElement(webDriver, btn2, wait);
    	waitForElement("petbasics.about.btn.2", webDriver, 15 );    	
    	btn2.click();
    	waitForElement("petbasics.about.btn.2.validate", webDriver, 15 );
    	webDriver.navigate().to(url);
    	
    	BayerWebElement btn3 = getElement( "petbasics.about.btn.3", webDriver );
    	//Util.scrollToElement(webDriver, btn3, wait);
    	waitForElement("petbasics.about.btn.3", webDriver, 15 );    	
    	btn3.click();
    	waitForElement("petbasics.about.btn.3.validate", webDriver, 15 );
    	webDriver.navigate().to(url);
    	
    	BayerWebElement btn4 = getElement( "petbasics.about.btn.4", webDriver );
    	//Util.scrollToElement(webDriver, btn4, wait);
    	waitForElement("petbasics.about.btn.4", webDriver, 15 );    	
    	btn4.click();
    	waitForElement("petbasics.about.btn.4.validate", webDriver, 15 );
    	webDriver.navigate().to(url);
    	
        return true;
    }

}
