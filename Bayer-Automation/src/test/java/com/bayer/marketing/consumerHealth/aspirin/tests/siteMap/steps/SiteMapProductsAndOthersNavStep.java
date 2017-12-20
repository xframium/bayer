package com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class SiteMapProductsAndOthersNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public SiteMapProductsAndOthersNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String siteMap = webDriver.getCurrentUrl();
		waitForElement("aspirin.sitemap.base.test", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.validate("aspirin.sitemap.products", webDriver, "aspirin.sitemap.products.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.products.regimen.lowdose", webDriver, "aspirin.sitemap.products.regimen.lowdose.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.products.women.lowdose", webDriver, "aspirin.sitemap.products.women.lowdose.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.products.chewable.aspirin", webDriver, "aspirin.sitemap.products.chewable.aspirin.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.products.regimen.regdose", webDriver, "aspirin.sitemap.products.regimen.regdose.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.products.genuine.aspirin", webDriver, "aspirin.sitemap.products.genuine.aspirin.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.products.extra.strength", webDriver, "aspirin.sitemap.products.extra.strength.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.products.back.body", webDriver, "aspirin.sitemap.products.back.body.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.know.risk", webDriver, "aspirin.sitemap.know.risk.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.offers", webDriver, "aspirin.sitemap.offers.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.search.results", webDriver, "aspirin.sitemap.search.results.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.faq", webDriver, "aspirin.sitemap.faq.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validateEducationContent("aspirin.sitemap.managing.risk", "aspirin.sitemap.tell.me.how.aspirin.works", webDriver,
				"aspirin.sitemap.tell.me.how.aspirin.works.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validateEducationContent("aspirin.sitemap.risk.of.heart.attack", "aspirin.sitemap.start.creating.my.plan", webDriver,
				"aspirin.sitemap.start.creating.my.plan.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validateEducationContent("aspirin.sitemap.visit.the.offer.page", "aspirin.sitemap.get.coupons", webDriver,
				"aspirin.sitemap.get.coupons.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validateEducationContent("aspirin.sitemap.doctor.recommended", "aspirin.sitemap.doctor.recommended.tell.more", webDriver,
				"aspirin.sitemap.doctor.recommended.tell.more.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		BayerWebElement element = getElement("aspirin.sitemap.products.fits.needs", webDriver);
		Util.scrollToElement(webDriver, element, wait);
		
		this.validate("aspirin.sitemap.save.on.aspirin", webDriver, "aspirin.sitemap.save.on.aspirin.validate", wait);
		Util.recallBaseURL(webDriver, siteMap);
		waitForElement("aspirin.sitemap.base.test", webDriver, 15);
		
		this.validate("aspirin.sitemap.view.all", webDriver, "aspirin.sitemap.view.all.validate", wait);
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
	
	public void validateEducationContent(String educationContent, String readMoreLink, BayerWebDriver webDriver,
			String validationText, WebDriverWait wait) {
		waitForElement(educationContent, webDriver, 15);
		BayerWebElement content = getElement(educationContent, webDriver);
		Util.scrollToElement(webDriver, content, wait);
		this.validate(readMoreLink, webDriver, validationText, wait);
	}
}
