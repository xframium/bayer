package com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectAutoinjector.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;


public class BetaConnectAutoinjectorNavStep extends AbstractStep {

	public BetaConnectAutoinjectorNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String betaConnectAutoinjectorUrl = webDriver.getCurrentUrl();

		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);

		this.validate("betaconnect.autoinjector.here.link", webDriver, "betaconnect.autoinjector.here.link.validate", wait);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15);	

		BayerWebElement btnOne = getElement("betaconnect.autoinjector.btn.one", webDriver);
		//Util.scrollToElement(webDriver, btnOne, wait);
		waitForElement("betaconnect.autoinjector.btn.one", webDriver, 15);
		btnOne.click();
		waitForElement("betaconnect.autoinjector.btn.one.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15);

		BayerWebElement btnTwo = getElement("betaconnect.autoinjector.btn.two", webDriver);
		//Util.scrollToElement(webDriver, btnTwo, wait);
		waitForElement("betaconnect.autoinjector.btn.two", webDriver, 15);
		btnTwo.click();
		waitForElement("betaconnect.autoinjector.btn.two.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15);
		
		BayerWebElement btnThree = getElement("betaconnect.autoinjector.btn.three", webDriver);
		//Util.scrollToElement(webDriver, btnThree, wait);
		waitForElement("betaconnect.autoinjector.btn.three", webDriver, 15);
		btnThree.click();
		waitForElement("betaconnect.autoinjector.btn.three.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15);
		
		BayerWebElement btnFour = getElement("betaconnect.autoinjector.btn.four", webDriver);
		//Util.scrollToElement(webDriver, btnFour, wait);
		waitForElement("betaconnect.autoinjector.btn.four", webDriver, 15);
		Util.scrollToElement(webDriver, btnFour, wait);
		waitForElement("betaconnect.autoinjector.btn.four", webDriver, 15);	
		btnFour.click();
		waitForElement("betaconnect.autoinjector.btn.four.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15);
		
		BayerWebElement btnFive = getElement("betaconnect.autoinjector.btn.five", webDriver);
		//Util.scrollToElement(webDriver, btnFive, wait);
		waitForElement("betaconnect.autoinjector.btn.five", webDriver, 15);
		btnFive.click();
		waitForElement("betaconnect.autoinjector.btn.five.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15);
		
		BayerWebElement btnSix = getElement("betaconnect.autoinjector.btn.six", webDriver);
		//Util.scrollToElement(webDriver, btnSix, wait);
		waitForElement("betaconnect.autoinjector.btn.six", webDriver, 15);
		btnSix.click();
		waitForElement("betaconnect.autoinjector.btn.six.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15);
		
		BayerWebElement btnSeven = getElement("betaconnect.autoinjector.btn.seven", webDriver);
		//Util.scrollToElement(webDriver, btnSeven, wait);
		waitForElement("betaconnect.autoinjector.btn.seven", webDriver, 15);
		btnSeven.click();
		waitForElement("betaconnect.autoinjector.btn.seven.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15);
		
		/*BayerWebElement btnEight = getElement("betaconnect.autoinjector.btn.eight", webDriver);
		//Util.scrollToElement(webDriver, btnEight, wait);
		waitForElement("betaconnect.autoinjector.btn.eight", webDriver, 15);
		btnEight.click();
		waitForElement("betaconnect.autoinjector.btn.eight.validate", webDriver, 30);
		Util.recallBaseURL(webDriver, betaConnectAutoinjectorUrl);
		waitForElement("betaconnect.autoinjector.inj.logo", webDriver, 15); 
	*/
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