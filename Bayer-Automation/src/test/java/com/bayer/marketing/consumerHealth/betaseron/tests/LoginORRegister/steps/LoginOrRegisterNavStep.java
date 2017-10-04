package com.bayer.marketing.consumerHealth.betaseron.tests.LoginORRegister.steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class LoginOrRegisterNavStep extends AbstractStep {

	public LoginOrRegisterNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String betaSeronRegisterUrl = webDriver.getCurrentUrl();
		waitForElement("betaseron.login.base.check", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		BayerWebElement logoText = getElement("betaseron.login.base.check", webDriver);
		Assert.assertEquals(logoText.getText(), "BETAPLUS");
		
		this.validate("betaseron.login.login.now", webDriver, "betaseron.login.login.now.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronRegisterUrl);
		waitForElement("betaseron.login.base.check", webDriver, 30);
		
		this.validate("betaseron.login.tellus.permission", webDriver, "betaseron.login.tellus.permission.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronRegisterUrl);
		waitForElement("betaseron.login.base.check", webDriver, 30);
		
		waitForElement("betaseron.login.tellus.yourself", webDriver, 15);
		BayerWebElement yourself = getElement("betaseron.login.tellus.yourself", webDriver);
		Util.scrollToElement(webDriver, yourself, wait);
		Assert.assertEquals(yourself.getText(), "Tell us a little about yourself");
		
		String randomString = RandomStringUtils.random(5, true, false);
		
		this.enterDetails("betaseron.login.tellus.email", webDriver, randomString+"1"+"@bayer.com", wait);
		
		this.enterDetails("betaseron.login.tellus.email.confirm", webDriver, randomString+"1"+"@bayer.com", wait);
		
		this.enterDetails("betaseron.login.tellus.password", webDriver, randomString, wait);
		
		this.enterDetails("betaseron.login.tellus.password.confirm", webDriver, randomString, wait);
		
		this.enterDetails("betaseron.login.tellus.firstname", webDriver, "test", wait);
		
		this.enterDetails("betaseron.login.tellus.lastname", webDriver, "bayer", wait);
		
		this.enterDetails("betaseron.login.tellus.zipcode", webDriver, "56006", wait);
		
		this.enterDetails("betaseron.login.tellus.phonenumber", webDriver, "8002662120", wait);
		
		this.enterDetails("betaseron.login.tellus.month", webDriver, "06", wait);
		
		this.enterDetails("betaseron.login.tellus.date", webDriver, "15", wait);
		
		this.enterDetails("betaseron.login.tellus.year", webDriver, "1987", wait);
		
		BayerWebElement radioBox = getElement("betaseron.login.tellus.areyou", webDriver);
		Util.scrollToElement(webDriver, radioBox, wait);
		waitForElement("betaseron.login.tellus.areyou", webDriver, 30);
		radioBox.click();
		
		BayerWebElement signUp = getElement("betaseron.login.tellus.signup", webDriver);
		Util.scrollToElement(webDriver, signUp, wait);
		waitForElement("betaseron.login.tellus.signup", webDriver, 30);
		signUp.click();
		
		waitForElement("betaseron.login.tellus.signup.validate", webDriver, 15);
		BayerWebElement thankYou = getElement("betaseron.login.tellus.signup.validate", webDriver);
		Util.scrollToElement(webDriver, thankYou, wait);
		
		waitForElement("betaseron.login.tellus.signup.continue", webDriver, 15);
		BayerWebElement signupcontinue = getElement("betaseron.login.tellus.signup.continue", webDriver);
		Util.scrollToElement(webDriver, signupcontinue, wait);
		waitForElement("betaseron.login.tellus.signup.continue", webDriver, 30);
		signupcontinue.click();
		
		Util.recallBaseURL(webDriver, betaSeronRegisterUrl);
		waitForElement("betaseron.login.base.check", webDriver, 30);
		
				
		return true;
	}

	public void validate(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait) {
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		waitForElement(objectName, webDriver, 30);
		element.click();

		waitForElement(objectValidator, webDriver, 30);

	}
	
	public void enterDetails(String fieldName, BayerWebDriver webDriver, String fieldData, WebDriverWait wait) {
		BayerWebElement field = getElement( fieldName, webDriver );
		Util.scrollToElement(webDriver, field, wait);
		waitForElement(fieldName, webDriver, 30);
		field.clear();
		field.sendKeys(fieldData);

	}

}
