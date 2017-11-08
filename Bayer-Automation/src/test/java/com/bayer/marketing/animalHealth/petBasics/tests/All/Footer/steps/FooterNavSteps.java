package com.bayer.marketing.animalHealth.petBasics.tests.All.Footer.steps;


import java.awt.Dialog.ModalExclusionType;

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
    	
    	
    	BayerWebElement window = getElement( "modal.window", webDriver );
    	if (window.isDisplayed()) {
    		waitForElement( "modal.skip", webDriver, 15 );
        	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    		skipButton.click();	 
		}
    
    	
    	waitForElement( "footer.logo", webDriver, 15 );
    	BayerWebElement footerLogo = getElement( "footer.logo", webDriver );
    	footerLogo.click();
    	webDriver.navigate().to(url);
    	waitForElement( "footer.logo", webDriver, 15 );
    	//Util.scrollToElement(webDriver, footerLogo, wait);
    	//waitForElement( "footer.buyNearMe", webDriver, 15 );
    	BayerWebElement buy = getElement( "footer.buyNearMe", webDriver );
    	buy.sendKeys("07960");
    	
    	
    	waitForElement( "footer.buyBtn", webDriver, 15 );
    	BayerWebElement buyBtn = getElement( "footer.buyBtn", webDriver );
    	buyBtn.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.allProducts", webDriver, 15 );
    	BayerWebElement allProducts = getElement( "footer.allProducts", webDriver );
    	allProducts.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.catProducts", webDriver, 15 );
    	BayerWebElement catProducts = getElement( "footer.catProducts", webDriver );
    	catProducts.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.dogProducts", webDriver, 15 );
    	BayerWebElement dogProducts = getElement( "footer.dogProducts", webDriver );
    	dogProducts.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.allEducation", webDriver, 15 );
    	BayerWebElement allEdu = getElement( "footer.allEducation", webDriver );
    	allEdu.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.catEducation", webDriver, 15 );
    	BayerWebElement catEdu = getElement( "footer.catEducation", webDriver );
    	catEdu.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.dogEducation", webDriver, 15 );
    	BayerWebElement dogEdu = getElement( "footer.dogEducation", webDriver );
    	dogEdu.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.allFAQ", webDriver, 15 );
    	BayerWebElement allFAQ = getElement( "footer.allFAQ", webDriver );
    	allFAQ.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.catFAQ", webDriver, 15 );
    	BayerWebElement catFAQ = getElement( "footer.catFAQ", webDriver );
    	catFAQ.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.dogFAQ", webDriver, 15 );
    	BayerWebElement dogFAQ = getElement( "footer.dogFAQ", webDriver );
    	dogFAQ.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.aboutBayer", webDriver, 15 );
    	BayerWebElement aboutBayer = getElement( "footer.aboutBayer", webDriver );
    	aboutBayer.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.history", webDriver, 15 );
    	BayerWebElement history = getElement( "footer.history", webDriver );
    	history.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.vetPartners", webDriver, 15 );
    	BayerWebElement partners = getElement( "footer.vetPartners", webDriver );
    	partners.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.news", webDriver, 15 );
    	BayerWebElement news = getElement( "footer.news", webDriver );
    	news.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.twitter", webDriver, 15 );
    	BayerWebElement twitter = getElement( "footer.twitter", webDriver );
    	twitter.click();
    	waitForElement( "footer.confLeave", webDriver, 15 );
    	BayerWebElement leave = getElement( "footer.confLeave", webDriver );
    	leave.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.conditions", webDriver, 15 );
    	BayerWebElement conditions = getElement( "footer.conditions", webDriver );
    	conditions.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.privacy", webDriver, 15 );
    	BayerWebElement privacy = getElement( "footer.privacy", webDriver );
    	privacy.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.siteMap", webDriver, 15 );
    	BayerWebElement siteMap = getElement( "footer.siteMap", webDriver );
    	siteMap.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.contactUs", webDriver, 15 );
    	BayerWebElement contactUs = getElement( "footer.contactUs", webDriver );
    	contactUs.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.supplyChains", webDriver, 15 );
    	BayerWebElement supplyChains = getElement( "footer.supplyChains", webDriver );
    	supplyChains.click();
    	webDriver.navigate().to(url);
    	
    	waitForElement( "footer.bayerLogo", webDriver, 15 );
    	BayerWebElement bayerLogo = getElement( "footer.bayerLogo", webDriver );
    	bayerLogo.click();
    	webDriver.navigate().to(url);
    	
    	
        return true;
    }

}
