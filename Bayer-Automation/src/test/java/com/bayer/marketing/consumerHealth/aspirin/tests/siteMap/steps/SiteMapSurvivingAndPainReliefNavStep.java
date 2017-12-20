package com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class SiteMapSurvivingAndPainReliefNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public SiteMapSurvivingAndPainReliefNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String siteMap = webDriver.getCurrentUrl();
		waitForElement("aspirin.sitemap.base.test", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.validate("aspirin.sitemap.surviving.heart.attack", webDriver, "aspirin.sitemap.surviving.heart.attack.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.warning.signs.symptoms", webDriver, "aspirin.sitemap.warning.signs.symptoms.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.heart.attack.symptoms", webDriver, "aspirin.sitemap.heart.attack.symptoms.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.what.happens.during.attack", webDriver, "aspirin.sitemap.what.happens.during.attack.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.aspirin.during.heart.attack", webDriver, "aspirin.sitemap.aspirin.during.heart.attack.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.pain.relief", webDriver, "aspirin.sitemap.pain.relief.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.works.pain", webDriver, "aspirin.sitemap.works.pain.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.trusted.pain.relief", webDriver, "aspirin.sitemap.trusted.pain.relief.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.takeit.pain.life", webDriver, "aspirin.sitemap.takeit.pain.life.validate", wait);
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
