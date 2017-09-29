package com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectAutoinjector.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Scroll;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class BetaConnectAutoinjectorNavStep extends AbstractStep {

	public BetaConnectAutoinjectorNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String betaConnectAutoinjectorUrl = webDriver.getCurrentUrl();

		waitForElement("betaconnect.autoinjector.key.logo", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		BayerWebElement logoText = getElement("betaconnect.autoinjector.key.logo", webDriver);

		this.validate("betaconnect.autoinjector.here.link", webDriver, "betaconnect.autoinjector.here.link.validate", wait);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.key.logo", webDriver, 30);

		BayerWebElement btnOne = getElement("betaconnect.autoinjector.btn.one", webDriver);
		Util.scrollToElement(webDriver, btnOne, wait);
		waitForElement("betaconnect.autoinjector.btn.one", webDriver, 15);
		Assert.assertEquals(btnOne.getText(), "Watch BETACONNECT in action");
		btnOne.click();
		waitForElement("betaconnect.autoinjector.btn.one.validate", webDriver, 15);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.key.logo", webDriver, 30);

		BayerWebElement btnTwo = getElement("betaconnect.autoinjector.btn.two", webDriver);
		Util.scrollToElement(webDriver, btnTwo, wait);
		waitForElement("betaconnect.autoinjector.btn.two", webDriver, 15);
		Assert.assertEquals(btnTwo.getText(), "Watch myBETAapp in action");
		btnTwo.click();
		waitForElement("betaconnect.autoinjector.btn.two.validate", webDriver, 15);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.key.logo", webDriver, 30);
		
		BayerWebElement btnThree = getElement("betaconnect.autoinjector.btn.three", webDriver);
		Util.scrollToElement(webDriver, btnThree, wait);
		waitForElement("betaconnect.autoinjector.btn.three", webDriver, 15);
		Assert.assertEquals(btnTwo.getText(), "Watch it in actionn");
		btnThree.click();
		waitForElement("betaconnect.autoinjector.btn.three.validate", webDriver, 15);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.key.logo", webDriver, 30);
		
		BayerWebElement btnFour = getElement("betaconnect.autoinjector.btn.four", webDriver);
		Util.scrollToElement(webDriver, btnFour, wait);
		waitForElement("betaconnect.autoinjector.btn.four", webDriver, 15);
		Assert.assertEquals(btnTwo.getText(), "Watch it in actionn");
		btnFour.click();
		waitForElement("betaconnect.autoinjector.btn.four.validate", webDriver, 15);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.key.logo", webDriver, 30);

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