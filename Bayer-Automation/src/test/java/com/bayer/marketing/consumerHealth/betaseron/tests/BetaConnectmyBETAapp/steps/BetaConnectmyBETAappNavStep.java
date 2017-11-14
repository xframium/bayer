package com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectmyBETAapp.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class BetaConnectmyBETAappNavStep extends AbstractStep {

	public BetaConnectmyBETAappNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String betaConnectmyBETAappUrl = webDriver.getCurrentUrl();

		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);

		BayerWebElement btnOne = getElement("betaconnect.mybetaapp.btn.one", webDriver);
		Util.scrollToElement(webDriver, btnOne, wait);
		waitForElement("betaconnect.mybetaapp.btn.one", webDriver, 15);
		btnOne.click();
		waitForElement("betaconnect.mybetaapp.btn.one.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);

		BayerWebElement btnTwo = getElement("betaconnect.mybetaapp.btn.two", webDriver);
		Util.scrollToElement(webDriver, btnTwo, wait);
		waitForElement("betaconnect.mybetaapp.btn.two", webDriver, 15);
		btnTwo.click();
		waitForElement("betaconnect.mybetaapp.btn.two.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
		
		BayerWebElement btnThree = getElement("betaconnect.mybetaapp.btn.three", webDriver);
		Util.scrollToElement(webDriver, btnThree, wait);
		waitForElement("betaconnect.mybetaapp.btn.three", webDriver, 15);
		btnThree.click();
		waitForElement("betaconnect.mybetaapp.btn.three.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
		
		BayerWebElement btnFour = getElement("betaconnect.mybetaapp.btn.four", webDriver);
		Util.scrollToElement(webDriver, btnFour, wait);
		waitForElement("betaconnect.mybetaapp.btn.four", webDriver, 15);
		btnFour.click();
		waitForElement("betaconnect.mybetaapp.btn.four.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
		/*
		BayerWebElement btnFive = getElement("betaconnect.mybetaapp.btn.five", webDriver);
		Util.scrollToElement(webDriver, btnFive, wait);
		waitForElement("betaconnect.mybetaapp.btn.five", webDriver, 15);
		btnFive.click();
		waitForElement("betaconnect.mybetaapp.btn.five.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
*/
		BayerWebElement btnSix = getElement("betaconnect.mybetaapp.btn.six", webDriver);
		Util.scrollToElement(webDriver, btnSix, wait);
		waitForElement("betaconnect.mybetaapp.btn.six", webDriver, 15);
		btnSix.click();
		waitForElement("betaconnect.mybetaapp.btn.six.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
		
		BayerWebElement linkOne = getElement("betaconnect.mybetaapp.link.one", webDriver);
		Util.scrollToElement(webDriver, linkOne, wait);
		waitForElement("betaconnect.mybetaapp.link.one", webDriver, 15);
		linkOne.click();
		waitForElement("betaconnect.mybetaapp.link.one.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
		
		BayerWebElement linkTwo = getElement("betaconnect.mybetaapp.link.two", webDriver);
		Util.scrollToElement(webDriver, linkTwo, wait);
		waitForElement("betaconnect.mybetaapp.link.two", webDriver, 15);
		linkTwo.click();
		waitForElement("betaconnect.mybetaapp.link.two.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
		
		BayerWebElement linkThree = getElement("betaconnect.mybetaapp.link.three", webDriver);
		Util.scrollToElement(webDriver, linkThree, wait);
		waitForElement("betaconnect.mybetaapp.link.three", webDriver, 15);
		linkThree.click();
		waitForElement("betaconnect.mybetaapp.link.three.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
				
		BayerWebElement linkFour = getElement("betaconnect.mybetaapp.link.four", webDriver);
		Util.scrollToElement(webDriver, linkFour, wait);
		waitForElement("betaconnect.mybetaapp.link.four", webDriver, 15);
		linkFour.click();
		waitForElement("betaconnect.mybetaapp.link.four.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
		
		BayerWebElement linkFive = getElement("betaconnect.mybetaapp.link.five", webDriver);
		Util.scrollToElement(webDriver, linkFive, wait);
		waitForElement("betaconnect.mybetaapp.link.five", webDriver, 15);
		linkFive.click();
		waitForElement("betaconnect.mybetaapp.link.five.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);
		
		BayerWebElement linkSix = getElement("betaconnect.mybetaapp.link.six", webDriver);
		Util.scrollToElement(webDriver, linkSix, wait);
		waitForElement("betaconnect.mybetaapp.link.six", webDriver, 15);
		linkSix.click();
		waitForElement("betaconnect.mybetaapp.link.six.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectmyBETAappUrl);
		waitForElement("betaconnect.mybetaapp.app.logo", webDriver, 15);

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