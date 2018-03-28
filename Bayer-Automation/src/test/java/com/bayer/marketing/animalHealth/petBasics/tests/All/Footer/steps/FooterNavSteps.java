package com.bayer.marketing.animalHealth.petBasics.tests.All.Footer.steps;


import java.awt.Dialog.ModalExclusionType;
import java.util.HashMap;
import java.util.Map;

import org.apache.xml.serializer.utils.Utils;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.animalHealth.petBasics.tests.All.Footer.Footer;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FooterNavSteps extends AbstractStep  {
	
	//protected String url = "https://www.petbasics.com/";
    public FooterNavSteps() {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	Footer urlVar = new Footer();
    	String url = urlVar.getUrl();
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
    	try {
    	    Map<String, Object> params = new HashMap<>();
    	    params.put("content", "Remember this decision");
    	    params.put("index", "1");
    	    params.put("timeout", 10);
    	    params.put("screen.top", "0");
    	    params.put("screen.height", "30%");
    	    params.put("screen.width", "35%");
    	    webDriver.executeScript("mobile:text:select", params);
    	} catch (Exception e) {
    	    System.out.println("No browser popup found, continue with script");
    	}
    	try {
    	    Map<String, Object> params = new HashMap<>();
    	    params.put("content", "Allow Location Access");
    	    params.put("index", "1");
    	    params.put("timeout", 10);
    	    params.put("screen.top", "0");
    	    params.put("screen.height", "30%");
    	    params.put("screen.width", "35%");
    	    webDriver.executeScript("mobile:text:select", params);
    	} catch (Exception e) {
    	    System.out.println("No browser popup found, continue with script");
    	}
    	try {
    		BayerWebElement window = getElement( "modal.window", webDriver );
        	if (window.isDisplayed()) {
        		waitForElement( "modal.skip", webDriver, 15 );
            	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
        		skipButton.click();	 
    		}
		} catch (Exception e) {
			System.out.println("Popup window not displayed.");
		}
    	
    	try {
    		BayerWebElement dismissPopup = waitForVisible("footer.dismiss", webDriver, 15);
        	Util.scrollToElement(webDriver, dismissPopup, wait);   	
        	dismissPopup.click();
		} catch (Exception e) {
			System.out.println("Popup window not displayed.");
		}
    	//waitForElement( "footer.logo", webDriver, 15 );
    	try {
	    	BayerWebElement footerLogo = waitForVisible("footer.logo", webDriver, 15);
	    	Util.scrollToElement(webDriver, footerLogo, wait);
	    	
	    	footerLogo.click();
	    	webDriver.navigate().back();
    	}
	    	catch(Exception e) { 
	    		System.out.println("Footer logo not displayed");
	    	}
    	
    	//Util.scrollToElement(webDriver, footerLogo, wait);
    	//waitForElement( "footer.buyNearMe", webDriver, 15 );
    	BayerWebElement buy = waitForVisible("footer.buyNearMe", webDriver, 15);
    	buy.sendKeys("07960");
    	
    	
    	waitForElement( "footer.buyBtn", webDriver, 15 );
    	BayerWebElement buyBtn = waitForVisible("footer.buyBtn", webDriver, 15);
    	Util.scrollToElement(webDriver, buyBtn, wait);
    	buyBtn.click();
    	webDriver.navigate().back();
    	
    	waitForElement( "footer.allProducts", webDriver, 15 );
    	BayerWebElement allProducts = waitForVisible("footer.allProducts", webDriver, 15);
    	allProducts.click();
    	webDriver.navigate().back();
    	
    	waitForElement( "footer.catProducts", webDriver, 15 );
    	BayerWebElement catProducts = waitForVisible("footer.catProducts", webDriver, 15);
    	catProducts.click();
    	webDriver.navigate().back();
    	
    	//waitForElement( "footer.dogProducts", webDriver, 15 );
    	BayerWebElement dogProducts = waitForVisible("footer.dogProducts", webDriver, 15);
    	Util.scrollToElement(webDriver, dogProducts, wait);
    	dogProducts.click();
    	webDriver.navigate().back();
    	
    	//waitForElement( "footer.allEducation", webDriver, 15 );
    	BayerWebElement allEdu = waitForVisible("footer.allEducation", webDriver, 15);
    	allEdu.click();
    	webDriver.navigate().back();
    	
    	//waitForElement( "footer.catEducation", webDriver, 15 );
    	BayerWebElement catEdu = waitForVisible("footer.catEducation", webDriver, 15);
    	catEdu.click();
    	webDriver.navigate().back();
    	
    	//waitForElement( "footer.dogEducation", webDriver, 15 );
    	BayerWebElement dogEdu = waitForVisible("footer.dogEducation", webDriver, 15);
    	dogEdu.click();
    	webDriver.navigate().back();
    	
    	//waitForElement( "footer.allFAQ", webDriver, 15 );
    	BayerWebElement allFAQ = waitForVisible("footer.allFAQ", webDriver, 15);
    	allFAQ.click();
    	webDriver.navigate().back();
    	
    	//waitForElement( "footer.catFAQ", webDriver, 15 );
    	BayerWebElement catFAQ = waitForVisible("footer.catFAQ", webDriver, 15);
    	catFAQ.click();
    	webDriver.navigate().back();
    	
    	waitForElement( "footer.dogFAQ", webDriver, 15 );
    	BayerWebElement dogFAQ = waitForVisible("footer.dogFAQ", webDriver, 15);
    	dogFAQ.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.aboutBayer", webDriver, 15 );
    	BayerWebElement aboutBayer = waitForVisible("footer.aboutBayer", webDriver, 15);
    	aboutBayer.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.history", webDriver, 15 );
    	BayerWebElement history = waitForVisible("footer.history", webDriver, 15);
    	history.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.vetPartners", webDriver, 15 );
    	BayerWebElement partners = waitForVisible("footer.vetPartners", webDriver, 15);
    	partners.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.news", webDriver, 15 );
    	BayerWebElement news = waitForVisible("footer.news", webDriver, 15);
    	news.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.twitter", webDriver, 15 );
    	BayerWebElement twitter = waitForVisible("footer.twitter", webDriver, 15);
    	twitter.click();
    	waitForElement( "footer.confLeave", webDriver, 15 );
    	BayerWebElement leave = waitForVisible("footer.confLeave", webDriver, 15);
    	leave.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.conditions", webDriver, 15 );
    	BayerWebElement conditions = waitForVisible("footer.conditions", webDriver, 15);
    	conditions.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.privacy", webDriver, 15 );
    	BayerWebElement privacy = waitForVisible("footer.privacy", webDriver, 15);
    	privacy.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.siteMap", webDriver, 15 );
    	BayerWebElement siteMap = waitForVisible("footer.siteMap", webDriver, 15);
    	siteMap.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.contactUs", webDriver, 15 );
    	BayerWebElement contactUs = waitForVisible("footer.contactUs", webDriver, 15);
    	contactUs.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.supplyChains", webDriver, 15 );
    	BayerWebElement supplyChains = waitForVisible("footer.supplyChains", webDriver, 15);
    	supplyChains.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.bayerLogo", webDriver, 15 );
    	BayerWebElement bayerLogo = waitForVisible("footer.bayerLogo", webDriver, 15);
    	bayerLogo.click();
    	webDriver.navigate().to(url);
    	
    	
        return true;
    }

}
