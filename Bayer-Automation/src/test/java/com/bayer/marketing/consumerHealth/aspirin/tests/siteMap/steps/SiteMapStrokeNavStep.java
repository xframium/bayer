package com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class SiteMapStrokeNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public SiteMapStrokeNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String siteMap = webDriver.getCurrentUrl();
		waitForElement("aspirin.sitemap.base.test", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.validate("aspirin.sitemap.stroke", webDriver, "aspirin.sitemap.stroke.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.what.is.stroke", webDriver, "aspirin.sitemap.what.is.stroke.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.how.stroke.affect.body", webDriver, "aspirin.sitemap.how.stroke.affect.body.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.warning.signs", webDriver, "aspirin.sitemap.warning.signs.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.types.of.stroke", webDriver, "aspirin.sitemap.types.of.stroke.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.stroke.risk.factor", webDriver, "aspirin.sitemap.stroke.risk.factor.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.stroke.risk.factor.12", webDriver, "aspirin.sitemap.stroke.risk.factor.12.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.stroke.risk.factor.women", webDriver, "aspirin.sitemap.stroke.risk.factor.women.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.stroke.prevention.clot.related", webDriver, "aspirin.sitemap.stroke.prevention.clot.related.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.prevention.clot.related.steps", webDriver, "aspirin.sitemap.prevention.clot.related.steps.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.prevention.clot.how.aspirin.works", webDriver, "aspirin.sitemap.prevention.clot.how.aspirin.works.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.life.after.stroke", webDriver, "aspirin.sitemap.life.after.stroke.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.stroke.rehabilitation.exercises", webDriver, "aspirin.sitemap.stroke.rehabilitation.exercises.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.stroke.recovery.exercises", webDriver, "aspirin.sitemap.stroke.recovery.exercises.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.stroke.caregiver.information", webDriver, "aspirin.sitemap.stroke.caregiver.information.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.together.end.stroke", webDriver, "aspirin.sitemap.together.end.stroke.validate", wait);
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
