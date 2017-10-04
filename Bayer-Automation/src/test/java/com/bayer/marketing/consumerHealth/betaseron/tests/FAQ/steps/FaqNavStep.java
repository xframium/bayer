package com.bayer.marketing.consumerHealth.betaseron.tests.FAQ.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FaqNavStep extends AbstractStep {

	public FaqNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		
		String betaSeronFaqUrl = webDriver.getCurrentUrl();
		
		waitForElement("betaseron.faq.base.check", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		BayerWebElement logoText = getElement("betaseron.faq.base.check", webDriver);
		Assert.assertEquals(logoText.getText(), "Frequently");
		
		waitForElement("betaseron.faq.common.question", webDriver, 15);
		BayerWebElement commonQuestion = getElement("betaseron.faq.common.question", webDriver);
		Util.scrollToElement(webDriver, commonQuestion, wait);
		Assert.assertEquals(commonQuestion.getText(), "Common questions");
		
		waitForElement("betaseron.faq.common.question.two", webDriver, 15);
		BayerWebElement commonQuestiontwo = getElement("betaseron.faq.common.question.two", webDriver);
		Util.scrollToElement(webDriver, commonQuestiontwo, wait);
		
		waitForElement("betaseron.faq.common.question.four", webDriver, 15);
		BayerWebElement commonQuestionfour= getElement("betaseron.faq.common.question.four", webDriver);
		Util.scrollToElement(webDriver, commonQuestionfour, wait);
		
		Util.scrollToElement(webDriver, commonQuestion, wait);
		commonQuestion.click();
			
		waitForElement("betaseron.faq.inject.betaseron", webDriver, 15);
		BayerWebElement inject= getElement("betaseron.faq.inject.betaseron", webDriver);
		Util.scrollToElement(webDriver, inject, wait);
		inject.click();
		
		waitForElement("betaseron.faq.inject.betaseron.q2", webDriver, 15);
		BayerWebElement q2 = getElement("betaseron.faq.inject.betaseron.q2", webDriver);
		Util.scrollToElement(webDriver, q2, wait);
		
		waitForElement("betaseron.faq.inject.betaseron.q4", webDriver, 15);
		BayerWebElement q4= getElement("betaseron.faq.inject.betaseron.q4", webDriver);
		Util.scrollToElement(webDriver, q4, wait);
		
		this.validate("betaseron.faq.inject.betaseron.steps", webDriver, "betaseron.faq.inject.betaseron.steps.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronFaqUrl);
		waitForElement("betaseron.faq.base.check", webDriver, 30);
		
		this.flipCommonQuestion(webDriver, wait);	
		
		waitForElement("betaseron.faq.electronic.autoinjector", webDriver, 15);
		BayerWebElement autoinjector= getElement("betaseron.faq.electronic.autoinjector", webDriver);
		Util.scrollToElement(webDriver, autoinjector, wait);
		autoinjector.click();
		
		waitForElement("betaseron.faq.electronic.autoinjector.q4", webDriver, 15);
		BayerWebElement autoinjectorq4= getElement("betaseron.faq.electronic.autoinjector.q4", webDriver);
		Util.scrollToElement(webDriver, autoinjectorq4, wait);
		
		waitForElement("betaseron.faq.electronic.autoinjector.q9", webDriver, 15);
		BayerWebElement q9= getElement("betaseron.faq.electronic.autoinjector.q9", webDriver);
		Util.scrollToElement(webDriver, q9, wait);
		
		waitForElement("betaseron.faq.electronic.autoinjector.q13", webDriver, 15);
		BayerWebElement q13= getElement("betaseron.faq.electronic.autoinjector.q13", webDriver);
		Util.scrollToElement(webDriver, q13, wait);
		
		this.validate("betaseron.faq.electronic.autoinjector.more", webDriver, "betaseron.faq.electronic.autoinjector.more.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronFaqUrl);
		waitForElement("betaseron.faq.base.check", webDriver, 30);
		
		this.flipCommonQuestion(webDriver, wait);	
		
		waitForElement("betaseron.faq.mybeta.app", webDriver, 15);
		BayerWebElement mybetaapp= getElement("betaseron.faq.mybeta.app", webDriver);
		Util.scrollToElement(webDriver, mybetaapp, wait);
		mybetaapp.click();
		
		waitForElement("betaseron.faq.mybeta.app.q2", webDriver, 15);
		BayerWebElement mybetaappq2= getElement("betaseron.faq.mybeta.app.q2", webDriver);
		Util.scrollToElement(webDriver, mybetaappq2, wait);
		
		this.validate("betaseron.faq.mybeta.app.download", webDriver, "betaseron.faq.mybeta.app.download.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronFaqUrl);
		waitForElement("betaseron.faq.base.check", webDriver, 30);
		
		this.flipCommonQuestion(webDriver, wait);	
		
		waitForElement("betaseron.faq.mybeta.app", webDriver, 15);
		mybetaapp= getElement("betaseron.faq.mybeta.app", webDriver);
		Util.scrollToElement(webDriver, mybetaapp, wait);
		mybetaapp.click();
		
		waitForElement("betaseron.faq.mybeta.app.q3", webDriver, 15);
		BayerWebElement mybetaappq3= getElement("betaseron.faq.mybeta.app.q3", webDriver);
		Util.scrollToElement(webDriver, mybetaappq3, wait);
		
		waitForElement("betaseron.faq.mybeta.app.q4", webDriver, 15);
		BayerWebElement mybetaappq4= getElement("betaseron.faq.mybeta.app.q4", webDriver);
		Util.scrollToElement(webDriver, mybetaappq4, wait);
		
		waitForElement("betaseron.faq.mybeta.app.q5", webDriver, 15);
		BayerWebElement mybetaappq5= getElement("betaseron.faq.mybeta.app.q5", webDriver);
		Util.scrollToElement(webDriver, mybetaappq5, wait);
		
		waitForElement("betaseron.faq.mybeta.app.q6", webDriver, 15);
		BayerWebElement mybetaappq6= getElement("betaseron.faq.mybeta.app.q6", webDriver);
		Util.scrollToElement(webDriver, mybetaappq6, wait);
		
		waitForElement("betaseron.faq.mybeta.app.q7", webDriver, 15);
		BayerWebElement mybetaappq7= getElement("betaseron.faq.mybeta.app.q7", webDriver);
		Util.scrollToElement(webDriver, mybetaappq7, wait);
		
		waitForElement("betaseron.faq.mybeta.app.q8", webDriver, 15);
		BayerWebElement mybetaappq8= getElement("betaseron.faq.mybeta.app.q8", webDriver);
		Util.scrollToElement(webDriver, mybetaappq8, wait);
		
		waitForElement("betaseron.faq.mybeta.app.q9", webDriver, 15);
		BayerWebElement mybetaappq9= getElement("betaseron.faq.mybeta.app.q9", webDriver);
		Util.scrollToElement(webDriver, mybetaappq9, wait);
		
		this.validate("betaseron.faq.mybeta.app.more", webDriver, "betaseron.faq.mybeta.app.more.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronFaqUrl);
		waitForElement("betaseron.faq.base.check", webDriver, 30);
		
		this.flipCommonQuestion(webDriver, wait);	
		
		this.validate("betaseron.faq.create.custom.doctor", webDriver, "betaseron.faq.create.custom.doctor.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronFaqUrl);
		waitForElement("betaseron.faq.base.check", webDriver, 30);
		
		this.flipCommonQuestion(webDriver, wait);	
		
		this.validate("betaseron.faq.signup.betaplus", webDriver, "betaseron.faq.signup.betaplus.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronFaqUrl);
		waitForElement("betaseron.faq.base.check", webDriver, 30);
		
		this.flipCommonQuestion(webDriver, wait);	
		
		return true;
	}

	public void validate(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait) {
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		waitForElement(objectName, webDriver, 30);
		element.click();

		waitForElement(objectValidator, webDriver, 30);
		
	}
	
	public void flipCommonQuestion(BayerWebDriver webDriver, WebDriverWait wait) {
		waitForElement("betaseron.faq.common.question", webDriver, 15);
		BayerWebElement commonQuestion = getElement("betaseron.faq.common.question", webDriver);
		Util.scrollToElement(webDriver, commonQuestion, wait);
		Assert.assertEquals(commonQuestion.getText(), "Common questions");
		commonQuestion.click();
	}
	
}
