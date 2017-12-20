package com.bayer.marketing.consumerHealth.aspirin.tests.SiteWideTests.headerNav.steps;

import org.apache.commons.collections.functors.IfClosure;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.Navigate;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

import junit.framework.Test;

public class HeaderNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public HeaderNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		
		
		
		//mobile
		
	
    	BayerWebElement mobileMenu = getElement( "aspirin.mobile.menu", webDriver );
		
    	if(mobileMenu.isDisplayed()==true){
    		
    		mobileMenu.click();
    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus1 = getElement( "aspirin.mobile.menu.plus1", webDriver );
	    	plus1.click();
	    
	    	waitForElement( "aspirin.mobile.menu.heartHealth.risk", webDriver, 15 );
	    	BayerWebElement mobileRisk = getElement( "aspirin.mobile.menu.heartHealth.risk", webDriver );
	    	mobileRisk.click();
	    	waitForElement( "aspirin.menu.heartHealth.risk.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu1 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu1.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus1a = getElement( "aspirin.mobile.menu.plus1", webDriver );
	    	plus1a.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.heartHealth.prevention", webDriver, 15 );
	    	BayerWebElement mobilePrevention = getElement( "aspirin.mobile.menu.heartHealth.prevention", webDriver );
	    	mobilePrevention.click();
	    	waitForElement( "aspirin.menu.heartHealth.prevention.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu2 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu2.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus1b = getElement( "aspirin.mobile.menu.plus1", webDriver );
	    	plus1b.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.talking", webDriver, 15 );
	    	BayerWebElement mobileTalking = getElement( "aspirin.menu.heartHealth.talking", webDriver );
	    	mobileTalking.click();
	    	waitForElement( "aspirin.menu.heartHealth.talking.validate", webDriver, 15 );
			
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu3 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu3.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus1c = getElement( "aspirin.mobile.menu.plus1", webDriver );
	    	plus1c.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.after", webDriver, 15 );
	    	BayerWebElement mobileAfter = getElement( "aspirin.menu.heartHealth.after", webDriver );
	    	mobileAfter.click();
	    	waitForElement( "aspirin.menu.heartHealth.after.validate", webDriver, 15 );
	    	
			
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu4 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu4.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2 = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.stroke", webDriver, 15 );
	    	BayerWebElement mobileStroke = getElement( "aspirin.menu.heartHealth.stroke", webDriver );
	    	mobileStroke.click();
	    	waitForElement( "aspirin.menu.heartHealth.stroke.validate", webDriver, 15 );
									
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu5 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu5.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2a = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2a.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.strokeCauses", webDriver, 15 );
	    	BayerWebElement mobileStrokeCauses = getElement( "aspirin.menu.heartHealth.strokeCauses", webDriver );
	    	mobileStrokeCauses.click();
	    	waitForElement( "aspirin.menu.heartHealth.strokeCauses.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu6 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu6.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2b = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2b.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.clot", webDriver, 15 );
	    	BayerWebElement mobileClot = getElement( "aspirin.menu.heartHealth.clot", webDriver );
	    	mobileClot.click();
	    	waitForElement( "aspirin.menu.heartHealth.clot.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu7 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu7.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2c = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2c.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.life", webDriver, 15 );
	    	BayerWebElement mobileLife = getElement( "aspirin.menu.heartHealth.life", webDriver );
	    	mobileLife.click();
	    	waitForElement( "aspirin.menu.heartHealth.life.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu8 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu8.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2d = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2d.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.ASA", webDriver, 15 );
	    	BayerWebElement mobileASA = getElement( "aspirin.menu.heartHealth.ASA", webDriver );
	    	mobileASA.click();
	    	waitForElement( "aspirin.menu.heartHealth.ASA.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu9 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu9.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus3 = getElement( "aspirin.mobile.menu.plus3", webDriver );
	    	plus3.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.warning", webDriver, 15 );
	    	BayerWebElement mobileWarning = getElement( "aspirin.menu.heartHealth.warning", webDriver );
	    	mobileWarning.click();
	    	waitForElement( "aspirin.menu.heartHealth.warning.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu10 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu10.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus3a = getElement( "aspirin.mobile.menu.plus3", webDriver );
	    	plus3a.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.how", webDriver, 15 );
	    	BayerWebElement mobileHow = getElement( "aspirin.menu.heartHealth.how", webDriver );
	    	mobileHow.click();
	    	waitForElement( "aspirin.menu.heartHealth.how.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu11 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu11.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus3b = getElement( "aspirin.mobile.menu.plus3", webDriver );
	    	plus3b.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.hero", webDriver, 15 );
	    	BayerWebElement mobileHero = getElement( "aspirin.menu.heartHealth.hero", webDriver );
	    	mobileHero.click();
	    	waitForElement( "aspirin.menu.heartHealth.hero.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu12 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu12.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus4 = getElement( "aspirin.mobile.menu.plus4", webDriver );
	    	plus4.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.learn", webDriver, 15 );
	    	BayerWebElement mobileLearn = getElement( "aspirin.menu.heartHealth.learn", webDriver );
	    	mobileLearn.click();
	    	waitForElement( "aspirin.menu.heartHealth.learn.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu13 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu13.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus4a = getElement( "aspirin.mobile.menu.plus4", webDriver );
	    	plus4a.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.trusted", webDriver, 15 );
	    	BayerWebElement mobileTrusted = getElement( "aspirin.menu.heartHealth.trusted", webDriver );
	    	mobileTrusted.click();
	    	waitForElement( "aspirin.menu.heartHealth.trusted.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu14 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu14.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus4b = getElement( "aspirin.mobile.menu.plus4", webDriver );
	    	plus4b.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.take", webDriver, 15 );
	    	BayerWebElement mobileTake = getElement( "aspirin.menu.heartHealth.take", webDriver );
	    	mobileTake.click();
	    	waitForElement( "aspirin.menu.heartHealth.take.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu15 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu15.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus5 = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.lowDose", webDriver, 15 );
	    	BayerWebElement mobileLowDose = getElement( "aspirin.menu.heartHealth.lowDose", webDriver );
	    	mobileLowDose.click();
	    	waitForElement( "aspirin.menu.heartHealth.lowDose.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu16 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu16.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5a = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5a.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.women", webDriver, 15 );
	    	BayerWebElement mobileWomen = getElement( "aspirin.menu.heartHealth.women", webDriver );
	    	mobileWomen.click();
	    	waitForElement( "aspirin.menu.heartHealth.women.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu17 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu17.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5b = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5b.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.chewable", webDriver, 15 );
	    	BayerWebElement mobileChewable = getElement( "aspirin.menu.heartHealth.chewable", webDriver );
	    	mobileChewable.click();
	    	waitForElement( "aspirin.menu.heartHealth.chewable.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu18 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu18.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5c = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5c.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.regularDose", webDriver, 15 );
	    	BayerWebElement mobileRegularDose = getElement( "aspirin.menu.heartHealth.regularDose", webDriver );
	    	mobileRegularDose.click();
	    	waitForElement( "aspirin.menu.heartHealth.regularDose.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu19 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu19.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5d = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5d.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.genuine", webDriver, 15 );
	    	BayerWebElement mobileGenuine = getElement( "aspirin.menu.heartHealth.genuine", webDriver );
	    	mobileGenuine.click();
	    	waitForElement( "aspirin.menu.heartHealth.genuine.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu20 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu20.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5e = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5e.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.extra", webDriver, 15 );
	    	BayerWebElement mobileExtra = getElement( "aspirin.menu.heartHealth.extra", webDriver );
	    	mobileExtra.click();
	    	waitForElement( "aspirin.menu.heartHealth.extra.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu21 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu21.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5f = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5f.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.back", webDriver, 15 );
	    	BayerWebElement mobileBack = getElement( "aspirin.menu.heartHealth.back", webDriver );
	    	mobileBack.click();
	    	waitForElement( "aspirin.menu.heartHealth.back.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu22 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu22.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5g = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5g.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.genuine2", webDriver, 15 );
	    	BayerWebElement mobileGenuine2 = getElement( "aspirin.menu.heartHealth.genuine2", webDriver );
	    	mobileGenuine2.click();
	    	waitForElement( "aspirin.menu.heartHealth.genuine.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu23 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu23.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.offers", webDriver, 15 );
	    	BayerWebElement mobileOffers = getElement( "aspirin.menu.heartHealth.offers", webDriver );
	    	mobileOffers.click();
	    	waitForElement( "aspirin.menu.heartHealth.offers.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu24 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu24.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.offers", webDriver, 15 );
	    	BayerWebElement mobileFAQ = getElement( "aspirin.menu.heartHealth.faq", webDriver );
	    	mobileFAQ.click();
	    	waitForElement( "aspirin.menu.heartHealth.faq.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu25 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu25.click();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.bayerGlobal", webDriver, 15 );
	    	BayerWebElement mobileBayerGlobal = getElement( "aspirin.menu.heartHealth.bayerGlobal", webDriver );
	    	mobileBayerGlobal.click();
	    	waitForElement( "aspirin.menu.heartHealth.bayerGlobal.validate", webDriver, 15 );
	    	
	    	
	    
	    	
		}else{
    	//Desktop
    	
			waitForElement( "aspirin.desktop.menu.heartHealth", webDriver, 15 );
	    	BayerWebElement desktopHeartHealth = getElement( "aspirin.desktop.menu.heartHealth", webDriver );
	    	BayerWebElement desktopHeartHealthRisk = getElement( "aspirin.desktop.menu.heartHealth.risk", webDriver );
	    	
	    	
	    	Actions actions= new Actions(webDriver);
	    	actions.moveToElement(desktopHeartHealth).moveToElement(desktopHeartHealthRisk).click().build().perform();
	    	
	    	waitForElement( "aspirin.menu.heartHealth.risk.validate", webDriver, 15 );
		
	    	
	    	
	    	
	    	waitForElement("aspirin.desktop.menu.heartHealth", webDriver, 15);
	    	
	    	
		
		}
    	
		
		
		return true;
	}


}