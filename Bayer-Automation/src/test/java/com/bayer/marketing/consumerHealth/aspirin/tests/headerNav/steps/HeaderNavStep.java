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
    	
		
		
		
		
		
								
		return true;
	}

	
	

}
