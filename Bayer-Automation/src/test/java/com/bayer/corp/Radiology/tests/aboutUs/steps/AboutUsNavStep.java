package com.bayer.corp.Radiology.tests.aboutUs.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class AboutUsNavStep extends AbstractStep {

	public AboutUsNavStep() {
		super("message", "error message");
	}

	@Override
    protected boolean _executeStep(BayerWebDriver webDriver){
		
		Eyes eyes=Util.initilizeEyesServer(webDriver, webDriver.getCurrentUrl(),"Radiology about us", "radiology-aboutus", "radiology-aboutus");
		
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.scrollAndTakeScreenShot("radiology.aboutus.snap.one",eyes,webDriver,wait);
		
		this.scrollAndTakeScreenShot("radiology.aboutus.snap.two",eyes,webDriver,wait);
		
		this.scrollAndTakeScreenShot("radiology.aboutus.snap.three",eyes,webDriver,wait);
		
		this.scrollAndTakeScreenShot("radiology.aboutus.snap.four",eyes,webDriver,wait);
		
		this.scrollAndTakeScreenShot("radiology.aboutus.snap.five",eyes,webDriver,wait);
    	
		Util.closeEyes(eyes);
		
		return true;
	}

	private void scrollAndTakeScreenShot(String xpathKey, Eyes eyes, BayerWebDriver webDriver, WebDriverWait wait) {
		waitForElement(xpathKey, webDriver, 30);
		BayerWebElement element = getElement(xpathKey, webDriver);
		if(element.isDisplayed()) {
			Util.scrollToElement(webDriver, element, wait);
			element.click();
			Util.takeScreenShot(eyes,xpathKey);
		}
		
	}
}
