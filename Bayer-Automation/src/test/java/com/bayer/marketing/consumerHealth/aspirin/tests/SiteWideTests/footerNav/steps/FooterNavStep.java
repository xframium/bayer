package com.bayer.marketing.consumerHealth.aspirin.tests.SiteWideTests.footerNav.steps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FooterNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public FooterNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String footerUrl = webDriver.getCurrentUrl();

		waitForElement("aspirin.base.image", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		//HEART HEALTH
		this.validate("aspirin.footer.heart.health", webDriver, "aspirin.footer.heart.health.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.heart.attack.risk", webDriver, "aspirin.footer.heart.attack.risk.validate", wait, "aspirin.footer.heart.health.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.heart.attack.prevention", webDriver, "aspirin.footer.heart.attack.prevention.validate", wait, "aspirin.footer.heart.health.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.heart.doctor", webDriver, "aspirin.footer.heart.doctor.validate", wait, "aspirin.footer.heart.health.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.after.heart.attack", webDriver, "aspirin.footer.after.heart.attack.validate", wait, "aspirin.footer.heart.health.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		//stroke
		this.validate("aspirin.footer.stroke", webDriver, "aspirin.footer.stroke.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.what.is.stroke", webDriver, "aspirin.footer.what.is.stroke.validate", wait, "aspirin.footer.stroke.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.what.is.stroke", webDriver, "aspirin.footer.what.is.stroke.validate", wait, "aspirin.footer.stroke.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.causes.stroke", webDriver, "aspirin.footer.causes.stroke.validate", wait, "aspirin.footer.stroke.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.clot.related.stroke", webDriver, "aspirin.footer.clot.related.stroke.validate", wait, "aspirin.footer.stroke.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.life.after.stroke", webDriver, "aspirin.footer.life.after.stroke.validate", wait, "aspirin.footer.stroke.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.end.stroke", webDriver, "aspirin.footer.end.stroke.validate", wait, "aspirin.footer.stroke.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		//Surviving a Heart Attack
		this.validate("aspirin.footer.surviving.attack", webDriver, "aspirin.footer.surviving.attack.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.warning.signs.attack", webDriver, "aspirin.footer.warning.signs.attack.validate", wait, "aspirin.footer.surviving.attack.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.save.attack", webDriver, "aspirin.footer.save.attack.validate", wait, "aspirin.footer.surviving.attack.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.herosmiths", webDriver, "aspirin.footer.herosmiths.validate", wait, "aspirin.footer.surviving.attack.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15); 
		
		
		//pain-relief
		this.validate("aspirin.footer.pain.relief", webDriver, "aspirin.footer.pain.relief.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.learn.pain.relief", webDriver, "aspirin.footer.learn.pain.relief.validate", wait, "aspirin.footer.pain.relief.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.trusted.pain.relief", webDriver, "aspirin.footer.trusted.pain.relief.validate", wait, "aspirin.footer.pain.relief.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.takefor.pain.orlife", webDriver, "aspirin.footer.takefor.pain.orlife.validate", wait, "aspirin.footer.pain.relief.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);

		// PRODUCTS
		this.validate("aspirin.footer.product", webDriver, "aspirin.footer.product.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.regimen", webDriver, "aspirin.footer.regimen.validate", wait, "aspirin.footer.product.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.women.aspirin", webDriver, "aspirin.footer.women.aspirin.validate", wait, "aspirin.footer.product.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.chewable.aspirin", webDriver, "aspirin.footer.chewable.aspirin.validate", wait, "aspirin.footer.product.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.regimen.regular.dose", webDriver, "aspirin.footer.regimen.regular.dose.validate", wait, "aspirin.footer.product.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.genuine", webDriver, "aspirin.footer.genuine.validate", wait, "aspirin.footer.product.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.extra.strength", webDriver, "aspirin.footer.extra.strength.validate", wait, "aspirin.footer.product.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.back.body", webDriver, "aspirin.footer.back.body.validate", wait, "aspirin.footer.product.plus", true);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		//
		this.validate("aspirin.footer.know.risk.heart.attack", webDriver, "aspirin.footer.know.risk.heart.attack.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.faq", webDriver, "aspirin.footer.faq.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.contact.us", webDriver, "aspirin.footer.contact.us.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.validate("aspirin.footer.sitemap", webDriver, "aspirin.footer.sitemap.validate", wait, null, false);
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		this.socialMediaNavigation("aspirin.footer.share.facebook", webDriver, "aspirin.footer.share.facebook.close", wait);
		this.socialMediaNavigation("aspirin.footer.share.twitter", webDriver, "aspirin.footer.share.twitter.close", wait);
		this.socialMediaNavigation("aspirin.footer.find.support.facebook", webDriver, "aspirin.footer.find.support.facebook.close", wait);
		
		Util.recallBaseURL(webDriver, footerUrl);
		waitForElement("aspirin.base.image", webDriver, 15);
		
		waitForElement("aspirin.footer.where.to.buy", webDriver, 15);
		BayerWebElement wheretobuy = getElement("aspirin.footer.where.to.buy", webDriver);
		Util.scrollToElement(webDriver, wheretobuy, wait);
		wheretobuy.click();
		
		webDriver.navigate().to(footerUrl);
		waitForElement("aspirin.base.image", webDriver, 30);
		
String parentWindow = webDriver.getWindowHandle();
		
		//External links opened in new browser tab
		this.switchToNewTabAndClose("aspirin.footer.bayer.global", webDriver, wait, parentWindow);
		Util.recallBaseURL(webDriver, footerUrl);
		this.switchToNewTabAndClose("aspirin.footer.bayer.consumer.health", webDriver, wait, parentWindow);
		Util.recallBaseURL(webDriver, footerUrl);
		this.switchToNewTabAndClose("aspirin.footer.bayer.privacy.statement", webDriver, wait, parentWindow);
		Util.recallBaseURL(webDriver, footerUrl);
		this.switchToNewTabAndClose("aspirin.footer.bayer.condition.use", webDriver, wait, parentWindow);
		Util.recallBaseURL(webDriver, footerUrl);
		this.switchToNewTabAndClose("aspirin.footer.bayer.imprint", webDriver, wait, parentWindow);
		Util.recallBaseURL(webDriver, footerUrl);
		this.switchToNewTabAndClose("aspirin.footer.bayer.transparency.chain", webDriver, wait, parentWindow);
			
						
		return true;
	}

	public void validate(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait,
			String subMenuExpansion, boolean isSubMenuApplicable) {
		if (!osType.equals(webDriver.getOsType()) && isSubMenuApplicable) {
			BayerWebElement submenu = getElement(subMenuExpansion, webDriver);
			Util.scrollToElement(webDriver, submenu, wait);
			submenu.click();
		}
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		waitForElement(objectName, webDriver, 30);
		element.click();
		waitForElement(objectValidator, webDriver, 30);
	}
	
	public void socialMediaNavigation(String objectName, BayerWebDriver webDriver, String closeButtonPath, WebDriverWait wait) {
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		element.click();
		waitForElement(closeButtonPath, webDriver, 30);
		BayerWebElement close = getElement(closeButtonPath, webDriver);
		close.click();
	}
	
	public void switchToNewTabAndClose(String externalLink,BayerWebDriver webDriver,WebDriverWait wait,String parentWindow) {
		wait =new WebDriverWait(webDriver, 50);
		waitForElement(externalLink, webDriver, 30);
		BayerWebElement link = getElement(externalLink, webDriver);
		Util.scrollToElement(webDriver, link, wait);
		link.click();
		String childWindow;
		Set<String> childWindows=webDriver.getWindowHandles();
		Iterator tabIterator = childWindows.iterator();
		while(tabIterator.hasNext()) {
			childWindow = tabIterator.next().toString();
			if(!childWindow.equals(parentWindow)){
				webDriver.switchTo().window(childWindow);
				wait = new WebDriverWait(webDriver,70);
				webDriver.close();
			}
		} 
	}

}
