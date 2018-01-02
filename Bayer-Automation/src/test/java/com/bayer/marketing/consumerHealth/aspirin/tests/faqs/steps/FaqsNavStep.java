package com.bayer.marketing.consumerHealth.aspirin.tests.faqs.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FaqsNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public FaqsNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String faqs = webDriver.getCurrentUrl();

		waitForElement("aspirin.faq.base.text", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.validate("aspirin.faq.how.aspirin.works", webDriver, "aspirin.faq.how.aspirin.works.header", wait);
		this.validate("aspirin.faq.how.aspirin.works.collapse", webDriver, "aspirin.faq.how.aspirin.works.collapse.validate", wait);
		this.validate("aspirin.faq.how.aspirin.works.link1", webDriver, "aspirin.faq.how.aspirin.works.link1.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		
		this.validate("aspirin.faq.how.aspirin.works", webDriver, "aspirin.faq.how.aspirin.works.header", wait);
		this.validate("aspirin.faq.how.aspirin.works.collapse", webDriver, "aspirin.faq.how.aspirin.works.collapse.validate", wait);
		this.validate("aspirin.faq.how.aspirin.works.link2", webDriver, "aspirin.faq.how.aspirin.works.link2.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		
		this.validate("aspirin.faq.how.aspirin.works", webDriver, "aspirin.faq.how.aspirin.works.header", wait);
		this.validate("aspirin.faq.how.aspirin.works.collapse", webDriver, "aspirin.faq.how.aspirin.works.collapse.validate", wait);
		this.validate("aspirin.faq.how.aspirin.works.link3", webDriver, "aspirin.faq.how.aspirin.works.link3.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		
		this.validate("aspirin.faq.how.aspirin.works", webDriver, "aspirin.faq.how.aspirin.works.header", wait);
		this.validate("aspirin.faq.how.aspirin.works.collapse", webDriver, "aspirin.faq.how.aspirin.works.collapse.validate", wait);
		this.validate("aspirin.faq.how.aspirin.works.link4", webDriver, "aspirin.faq.how.aspirin.works.link4.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		
		this.validate("aspirin.faq.direction.safety", webDriver, "aspirin.faq.direction.safety.header", wait);
		this.validate("aspirin.faq.direction.safety.section1.collapse", webDriver, "aspirin.faq.direction.safety.section1.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section1.link1", webDriver, "aspirin.faq.direction.safety.section1.link1.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		
		this.validate("aspirin.faq.direction.safety", webDriver, "aspirin.faq.direction.safety.header", wait);
		this.validate("aspirin.faq.direction.safety.section1.collapse", webDriver, "aspirin.faq.direction.safety.section1.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section1.link2", webDriver, "aspirin.faq.direction.safety.section1.link2.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		
		this.validate("aspirin.faq.direction.safety", webDriver, "aspirin.faq.direction.safety.header", wait);
		this.validate("aspirin.faq.direction.safety.section1.collapse", webDriver, "aspirin.faq.direction.safety.section1.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section1.link3", webDriver, "aspirin.faq.direction.safety.section1.link3.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		
		this.validate("aspirin.faq.direction.safety", webDriver, "aspirin.faq.direction.safety.header", wait);
		this.validate("aspirin.faq.direction.safety.section2.collapse", webDriver, "aspirin.faq.direction.safety.section2.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section3.collapse", webDriver, "aspirin.faq.direction.safety.section3.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section3.link1", webDriver, "aspirin.faq.direction.safety.section3.link1.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		this.validate("aspirin.faq.direction.safety", webDriver, "aspirin.faq.direction.safety.header", wait);
		this.validate("aspirin.faq.direction.safety.section4.collapse", webDriver, "aspirin.faq.direction.safety.section4.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section5.collapse", webDriver, "aspirin.faq.direction.safety.section5.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section6.collapse", webDriver, "aspirin.faq.direction.safety.section6.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section7.collapse", webDriver, "aspirin.faq.direction.safety.section7.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section7.link1", webDriver, "aspirin.faq.direction.safety.section7.link1.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		this.validate("aspirin.faq.direction.safety", webDriver, "aspirin.faq.direction.safety.header", wait);
		this.validate("aspirin.faq.direction.safety.section7.collapse", webDriver, "aspirin.faq.direction.safety.section7.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section7.link2", webDriver, "aspirin.faq.direction.safety.section7.link2.validate", wait);
		Util.recallBaseURL(webDriver, faqs);
		
		waitForElement("aspirin.faq.base.text", webDriver, 30);
		this.validate("aspirin.faq.direction.safety", webDriver, "aspirin.faq.direction.safety.header", wait);
		this.validate("aspirin.faq.direction.safety.section8.collapse", webDriver, "aspirin.faq.direction.safety.section8.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section9.collapse", webDriver, "aspirin.faq.direction.safety.section9.collapse.validate", wait);
		this.validate("aspirin.faq.direction.safety.section10.collapse", webDriver, "aspirin.faq.direction.safety.section10.collapse.validate", wait);
		
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
