package com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class SiteMapNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public SiteMapNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String siteMap = webDriver.getCurrentUrl();
		waitForElement("aspirin.sitemap.base.test", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.validate("aspirin.sitemap.hearth.health", webDriver, "aspirin.sitemap.hearth.health.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.hearth.attack.risk", webDriver, "aspirin.sitemap.hearth.attack.risk.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.risk.for.hearth.attack", webDriver, "aspirin.sitemap.risk.for.hearth.attack.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.genetic.risk.factor.hearth.attack", webDriver, "aspirin.sitemap.genetic.risk.factor.hearth.attack.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.diabetes.hearth.disease", webDriver, "aspirin.sitemap.diabetes.hearth.disease.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.hearth.attack.prevention", webDriver, "aspirin.sitemap.hearth.attack.prevention.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.therapy.benefits", webDriver, "aspirin.sitemap.therapy.benefits.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.medication.tips", webDriver, "aspirin.sitemap.medication.tips.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.prevent.another.attack", webDriver, "aspirin.sitemap.prevent.another.attack.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.talk.to.doctor", webDriver, "aspirin.sitemap.talk.to.doctor.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.ask.your.doctor", webDriver, "aspirin.sitemap.ask.your.doctor.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.after.attack.talk.to.doctor", webDriver, "aspirin.sitemap.after.attack.talk.to.doctor.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.heart.health.terms", webDriver, "aspirin.sitemap.heart.health.terms.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
			
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
