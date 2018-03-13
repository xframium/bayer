package com.bayer.corp.Radiology.tests.home.steps;

import com.applitools.eyes.selenium.Eyes;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class HomeNavStep extends AbstractStep {

	public HomeNavStep() {
		super("message", "error message");
	}

	@Override
    protected boolean _executeStep(BayerWebDriver webDriver){
		
		String homePage = webDriver.getCurrentUrl();
		
		Eyes eyes=Util.initilizeEyesServer(webDriver, homePage,"Radiology Home", "radiology-home", "radiology-home");
		
		waitForElement("radiology.home.slide.one", webDriver, 30);
		BayerWebElement sildeOne = getElement("radiology.home.slide.one", webDriver);
		if(sildeOne.isDisplayed()) {
			sildeOne.click();
			Util.takeScreenShot(eyes,"radiology-home-slide-one");
		}
    	
		waitForElement("radiology.home.slide.two", webDriver, 30);
		BayerWebElement sildeTwo = getElement("radiology.home.slide.two", webDriver);
		if(sildeTwo.isDisplayed()) {
			sildeTwo.click();
			Util.takeScreenShot(eyes,"radiology-home-slide-two");
		}
		
		waitForElement("radiology.home.slide.three", webDriver, 30);
		BayerWebElement sildeThree = getElement("radiology.home.slide.three", webDriver);
		if(sildeThree.isDisplayed()) {
			sildeThree.click();
			Util.takeScreenShot(eyes,"radiology-home-slide-three");
		}
		
		waitForElement("radiology.home.slide.four", webDriver, 30);
		BayerWebElement sildeFour = getElement("radiology.home.slide.four", webDriver);
		if(sildeFour.isDisplayed()) {
			sildeFour.click();
			Util.takeScreenShot(eyes,"radiology-home-slide-four");
		}
		
		Util.closeEyes(eyes);
		
		return true;
	}
}
