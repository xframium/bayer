package com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronSafety.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Scroll;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class BetaseronSafetyNavStep extends AbstractStep {

	public BetaseronSafetyNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String betaSeronSafetyUrl = webDriver.getCurrentUrl();

		waitForElement("betaseron.safety.key.logo", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		BayerWebElement logoText = getElement("betaseron.safety.key.logo", webDriver);
		Assert.assertEquals(logoText.getText(), "Safety Information");
		
		waitForElement("betaseron.safety.impInfo.toKnow", webDriver, 15);
		BayerWebElement toKnow = getElement("betaseron.safety.impInfo.toKnow", webDriver);
		Util.scrollToElement(webDriver, toKnow, wait);
		Assert.assertEquals(toKnow.getText(), "Most Important Information to Know about BETASERON");
		
		waitForElement("betaseron.safety.impInfo.toKnow.info1", webDriver, 15);
		BayerWebElement toKnowInfo = getElement("betaseron.safety.impInfo.toKnow.info1", webDriver);
		Util.scrollToElement(webDriver, toKnowInfo, wait);
		System.out.println(" toKnowInfo.getText() "+toKnowInfo.getText());
		toKnow.click();
		
		waitForElement("betaseron.safety.once.taking", webDriver, 15);
		BayerWebElement onceTaking = getElement("betaseron.safety.once.taking", webDriver);
		Util.scrollToElement(webDriver, onceTaking, wait);
		Assert.assertEquals(onceTaking.getText(), "Once Taking BETASERON");
		onceTaking.click();

		waitForElement("betaseron.safety.once.taking.info1", webDriver, 15);
		BayerWebElement onceTakingInfo = getElement("betaseron.safety.once.taking.info1", webDriver);
		Util.scrollToElement(webDriver, onceTakingInfo, wait);
		System.out.println(" onceTakingInfo.getText() "+onceTakingInfo.getText());
		
		onceTaking.click();
		
		waitForElement("betaseron.safety.possible.sideeffects", webDriver, 15);
		BayerWebElement sideeffects = getElement("betaseron.safety.possible.sideeffects", webDriver);
		Util.scrollToElement(webDriver, sideeffects, wait);
		//Assert.assertEquals(onceTaking.getText(), "Once Taking BETASERON");
		sideeffects.click();
		((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,1100);");
		sideeffects.click();
		
		
		return true;
	}

	public void validate(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait) {
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		waitForElement(objectName, webDriver, 30);
		element.click();

		waitForElement(objectValidator, webDriver, 30);

	}

}
