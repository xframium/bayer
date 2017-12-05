package com.bayer.marketing.consumerHealth.aspirin.tests.headerNav.steps;

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
		
		waitForElement( "aspirin.mobile.menu", webDriver, 15 );
    	BayerWebElement mobileMenu = getElement( "aspirin.mobile.menu", webDriver );
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
    	
    	waitForElement( "aspirin.menu.heartHealth.strokeCauses", webDriver, 15 );
    	BayerWebElement mobileClot = getElement( "aspirin.menu.heartHealth.clot", webDriver );
    	mobileClot.click();
    	waitForElement( "aspirin.menu.heartHealth.clot.validate", webDriver, 15 );
    	
    	
    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
    	BayerWebElement mobileMenu7 = getElement( "aspirin.mobile.menu", webDriver );
    	mobileMenu7.click();
    	
    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
    	BayerWebElement plus2c = getElement( "aspirin.mobile.menu.plus2", webDriver );
    	plus2c.click();
    	
    	waitForElement( "aspirin.menu.heartHealth.strokeCauses", webDriver, 15 );
    	BayerWebElement mobileLife = getElement( "aspirin.menu.heartHealth.life", webDriver );
    	mobileLife.click();
    	waitForElement( "aspirin.menu.heartHealth.life.validate", webDriver, 15 );
    	
    	
    	waitForElement( "aspirin.mobile.menu", webDriver, 15 );
    	BayerWebElement mobileMenu8 = getElement( "aspirin.mobile.menu", webDriver );
    	mobileMenu8.click();
    	
    	waitForElement( "aspirin.mobile.menu.plus1", webDriver, 15 );
    	BayerWebElement plus2d = getElement( "aspirin.mobile.menu.plus2", webDriver );
    	plus2d.click();
    	
    	waitForElement( "aspirin.menu.heartHealth.strokeCauses", webDriver, 15 );
    	BayerWebElement mobileASA = getElement( "aspirin.menu.heartHealth.ASA", webDriver );
    	mobileASA.click();
    	waitForElement( "aspirin.menu.heartHealth.ASA.validate", webDriver, 15 );
    	
    	
		return true;
	}


}