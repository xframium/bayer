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
	    	waitForElement( "aspirin.menu.mobile.prevention.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu2 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu2.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus1b = getElement( "aspirin.mobile.menu.plus1", webDriver );
	    	plus1b.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.talking", webDriver, 15 );
	    	BayerWebElement mobileTalking = getElement( "aspirin.menu.mobile.talking", webDriver );
	    	mobileTalking.click();
	    	waitForElement( "aspirin.menu.mobile.talking.validate", webDriver, 15 );
			
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu3 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu3.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus1c = getElement( "aspirin.mobile.menu.plus1", webDriver );
	    	plus1c.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.after", webDriver, 15 );
	    	BayerWebElement mobileAfter = getElement( "aspirin.menu.mobile.after", webDriver );
	    	mobileAfter.click();
	    	waitForElement( "aspirin.menu.heartHealth.after.validate", webDriver, 15 );
	    	
			
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu4 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu4.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2 = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.stroke", webDriver, 15 );
	    	BayerWebElement mobileStroke = getElement( "aspirin.menu.mobile.stroke", webDriver );
	    	mobileStroke.click();
	    	waitForElement( "aspirin.menu.mobile.stroke.validate", webDriver, 15 );
									
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu5 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu5.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2a = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2a.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.strokeCauses", webDriver, 15 );
	    	BayerWebElement mobileStrokeCauses = getElement( "aspirin.menu.mobile.strokeCauses", webDriver );
	    	mobileStrokeCauses.click();
	    	waitForElement( "aspirin.menu.mobile.strokeCauses.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu6 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu6.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2b = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2b.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.clot", webDriver, 15 );
	    	BayerWebElement mobileClot = getElement( "aspirin.menu.mobile.clot", webDriver );
	    	mobileClot.click();
	    	waitForElement( "aspirin.menu.mobile.clot.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu7 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu7.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2c = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2c.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.life", webDriver, 15 );
	    	BayerWebElement mobileLife = getElement( "aspirin.menu.mobile.life", webDriver );
	    	mobileLife.click();
	    	waitForElement( "aspirin.menu.mobile.life.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu8 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu8.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
	    	BayerWebElement plus2d = getElement( "aspirin.mobile.menu.plus2", webDriver );
	    	plus2d.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.ASA", webDriver, 15 );
	    	BayerWebElement mobileASA = getElement( "aspirin.menu.mobile.ASA", webDriver );
	    	mobileASA.click();
	    	waitForElement( "aspirin.menu.mobile.ASA.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu9 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu9.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus3 = getElement( "aspirin.mobile.menu.plus3", webDriver );
	    	plus3.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.warning", webDriver, 15 );
	    	BayerWebElement mobileWarning = getElement( "aspirin.menu.mobile.warning", webDriver );
	    	mobileWarning.click();
	    	waitForElement( "aspirin.menu.mobile.warning.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu10 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu10.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus3a = getElement( "aspirin.mobile.menu.plus3", webDriver );
	    	plus3a.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.how", webDriver, 15 );
	    	BayerWebElement mobileHow = getElement( "aspirin.menu.mobile.how", webDriver );
	    	mobileHow.click();
	    	waitForElement( "aspirin.menu.mobile.how.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu11 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu11.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus3b = getElement( "aspirin.mobile.menu.plus3", webDriver );
	    	plus3b.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.hero", webDriver, 15 );
	    	BayerWebElement mobileHero = getElement( "aspirin.menu.mobile.hero", webDriver );
	    	mobileHero.click();
	    	waitForElement( "aspirin.menu.mobile.hero.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu12 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu12.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus4 = getElement( "aspirin.mobile.menu.plus4", webDriver );
	    	plus4.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.learn", webDriver, 15 );
	    	BayerWebElement mobileLearn = getElement( "aspirin.menu.mobile.learn", webDriver );
	    	mobileLearn.click();
	    	waitForElement( "aspirin.menu.mobile.learn.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu13 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu13.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus4a = getElement( "aspirin.mobile.menu.plus4", webDriver );
	    	plus4a.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.trusted", webDriver, 15 );
	    	BayerWebElement mobileTrusted = getElement( "aspirin.menu.mobile.trusted", webDriver );
	    	mobileTrusted.click();
	    	waitForElement( "aspirin.menu.mobile.trusted.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu14 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu14.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus4b = getElement( "aspirin.mobile.menu.plus4", webDriver );
	    	plus4b.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.take", webDriver, 15 );
	    	BayerWebElement mobileTake = getElement( "aspirin.menu.mobile.take", webDriver );
	    	mobileTake.click();
	    	waitForElement( "aspirin.menu.mobile.take.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu15 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu15.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus3", webDriver, 15 );
	    	BayerWebElement plus5 = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.lowDose", webDriver, 15 );
	    	BayerWebElement mobileLowDose = getElement( "aspirin.menu.mobile.lowDose", webDriver );
	    	mobileLowDose.click();
	    	waitForElement( "aspirin.menu.mobile.lowDose.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu16 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu16.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5a = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5a.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.women", webDriver, 15 );
	    	BayerWebElement mobileWomen = getElement( "aspirin.menu.mobile.women", webDriver );
	    	mobileWomen.click();
	    	waitForElement( "aspirin.menu.mobile.women.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu17 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu17.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5b = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5b.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.chewable", webDriver, 15 );
	    	BayerWebElement mobileChewable = getElement( "aspirin.menu.mobile.chewable", webDriver );
	    	mobileChewable.click();
	    	waitForElement( "aspirin.menu.mobile.chewable.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu18 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu18.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5c = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5c.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.regularDose", webDriver, 15 );
	    	BayerWebElement mobileRegularDose = getElement( "aspirin.menu.mobile.regularDose", webDriver );
	    	mobileRegularDose.click();
	    	waitForElement( "aspirin.menu.mobile.regularDose.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu19 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu19.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5d = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5d.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.genuine", webDriver, 15 );
	    	BayerWebElement mobileGenuine = getElement( "aspirin.menu.mobile.genuine", webDriver );
	    	mobileGenuine.click();
	    	waitForElement( "aspirin.menu.mobile.genuine.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu20 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu20.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5e = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5e.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.extra", webDriver, 15 );
	    	BayerWebElement mobileExtra = getElement( "aspirin.menu.mobile.extra", webDriver );
	    	mobileExtra.click();
	    	waitForElement( "aspirin.menu.mobile.extra.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu21 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu21.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5f = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5f.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.back", webDriver, 15 );
	    	BayerWebElement mobileBack = getElement( "aspirin.menu.mobile.back", webDriver );
	    	mobileBack.click();
	    	waitForElement( "aspirin.menu.mobile.back.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu22 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu22.click();
	    	
	    	waitForElement( "aspirin.mobile.menu.plus5", webDriver, 15 );
	    	BayerWebElement plus5g = getElement( "aspirin.mobile.menu.plus5", webDriver );
	    	plus5g.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.genuine2", webDriver, 15 );
	    	BayerWebElement mobileGenuine2 = getElement( "aspirin.menu.mobile.genuine2", webDriver );
	    	mobileGenuine2.click();
	    	waitForElement( "aspirin.menu.mobile.genuine.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu23 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu23.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.offers", webDriver, 15 );
	    	BayerWebElement mobileOffers = getElement( "aspirin.menu.mobile.offers", webDriver );
	    	mobileOffers.click();
	    	waitForElement( "aspirin.menu.mobile.offers.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu24 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu24.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.offers", webDriver, 15 );
	    	BayerWebElement mobileFAQ = getElement( "aspirin.menu.mobile.faq", webDriver );
	    	mobileFAQ.click();
	    	waitForElement( "aspirin.menu.mobile.faq.validate", webDriver, 15 );
	    	
	    	
	    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
	    	BayerWebElement mobileMenu25 = getElement( "aspirin.mobile.menu", webDriver );
	    	mobileMenu25.click();
	    	
	    	waitForElement( "aspirin.menu.mobile.bayerGlobal", webDriver, 15 );
	    	BayerWebElement mobileBayerGlobal = getElement( "aspirin.menu.mobile.bayerGlobal", webDriver );
	    	mobileBayerGlobal.click();
	    	waitForElement( "aspirin.menu.mobile.bayerGlobal.validate", webDriver, 15 );
	    	
	    	
	    
	    	
		}else{
    	//Desktop
    	
			waitForElement( "aspirin.menu.desktop.heartHealth", webDriver, 15 );
	    	BayerWebElement desktopHeartHealth = getElement( "aspirin.menu.desktop.heartHealth", webDriver );
	    	BayerWebElement desktopHeartHealthRisk = getElement( "aspirin.menu.desktop.heartHealth.risk", webDriver );
	    	
	    	Actions actions= new Actions(webDriver);
	    	actions.moveToElement(desktopHeartHealth).moveToElement(desktopHeartHealthRisk).click().build().perform();
	    	waitForElement( "aspirin.menu.heartHealth.risk.validate", webDriver, 15 );
		
	    	
	    	waitForElement( "aspirin.desktop.menu.heartHealth", webDriver, 15 );
	    	BayerWebElement desktopHeartHealth2 = getElement( "aspirin.menu.desktop.heartHealth", webDriver );
	    	BayerWebElement desktopPrevention= getElement( "aspirin.menu.desktop.prevention", webDriver );
	    	
	    	actions.moveToElement(desktopHeartHealth2).moveToElement(desktopPrevention).click().build().perform();
	    	waitForElement( "aspirin.menu.mobile.prevention.validate", webDriver, 15 );
		
	   
	    	
	    	
	    	
	    	
		
		}
    	
		
		
		return true;
	}


}