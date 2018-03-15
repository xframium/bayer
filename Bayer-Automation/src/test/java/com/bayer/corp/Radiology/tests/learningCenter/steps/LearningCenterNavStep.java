package com.bayer.corp.Radiology.tests.learningCenter.steps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.corp.Radiology.tests.common.RadiologyScreen;
import com.bayer.corp.Radiology.tests.common.RadiologyScreenUtility;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class LearningCenterNavStep extends AbstractStep {

	public LearningCenterNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		Set<String> screenKeyset = RadiologyScreenUtility.getLearningCenterScreens().keySet();

		for (String screen : screenKeyset) {
			this.initilizeAndTakeScreenShot(webDriver, screen);
		}

		return true;
	}

	private void initilizeAndTakeScreenShot(BayerWebDriver webDriver, String screen) {
		RadiologyScreen ascreen = RadiologyScreenUtility.getLearningCenterScreens().get(screen);

		Eyes eyes = Util.initilizeEyesServer(webDriver, ascreen.getUrl(), ascreen.getBatchName(),
				ascreen.getScreenName(), ascreen.getScreenName());

		WebDriverWait wait = new WebDriverWait(webDriver, 30);

		this.scrollAndTakeScreenShot(ascreen.getXpathKey(), eyes, webDriver, wait);

		Util.closeEyes(eyes);
	}

	private void scrollAndTakeScreenShot(String xpathKey, Eyes eyes, BayerWebDriver webDriver, WebDriverWait wait) {
		waitForElement(xpathKey, webDriver, 30);
		BayerWebElement element = getElement(xpathKey, webDriver);
		if (element.isDisplayed()) {
			Util.scrollToElement(webDriver, element, wait);
			element.click();
			Util.takeScreenShot(eyes, xpathKey);
		}
	}

}
