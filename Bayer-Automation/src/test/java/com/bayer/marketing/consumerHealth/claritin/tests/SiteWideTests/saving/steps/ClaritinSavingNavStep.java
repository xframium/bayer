package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.saving.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class ClaritinSavingNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public ClaritinSavingNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String savingUrl = webDriver.getCurrentUrl();
		
		if(osType.equals(webDriver.getOsType())){
			waitForElement("claritin.saving.header.text", webDriver, 30);
		}else {
			waitForElement("claritin.saving.mobile.base.image", webDriver, 30);
		}
		
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		BayerWebElement coupons = getElement("claritin.saving.coupons", webDriver);
		Util.scrollToElement(webDriver, coupons, wait);
		coupons.click();
		
		BayerWebElement skyLiving = getElement("claritin.saving.coupons.sky.living", webDriver);
		Util.scrollToElement(webDriver, skyLiving, wait);
		
		this.validate("claritin.saving.coupons.cash.back", webDriver, "claritin.saving.coupons.cash.back.validate", wait);
		
		coupons = getElement("claritin.saving.coupons", webDriver);
		Util.scrollToElement(webDriver, coupons, wait);
		coupons.click();
		
		BayerWebElement mayLike = getElement("claritin.saving.you.may.like", webDriver);
		Util.scrollToElement(webDriver, mayLike, wait);
		
		BayerWebElement instruction = getElement("claritin.saving.coupon.printing.instruction", webDriver);
		Util.scrollToElement(webDriver, instruction, wait);
		instruction.click();
		waitForElement("claritin.saving.coupon.printing.instruction.close", webDriver, 30);
		BayerWebElement closeModel = getElement("claritin.saving.coupon.printing.instruction.close", webDriver);
		Util.scrollToElement(webDriver, closeModel, wait);
		closeModel.click();
		
		BayerWebElement allClaritinCoupon = getElement("claritin.saving.all.claritin.coupon", webDriver);
		Util.scrollToElement(webDriver, allClaritinCoupon, wait);
		
		instruction = getElement("claritin.saving.all.claritin.printing.instruction", webDriver);
		Util.scrollToElement(webDriver, instruction, wait);
		instruction.click();
		waitForElement("claritin.saving.all.claritin.printing.instruction.close", webDriver, 30);
		closeModel = getElement("claritin.saving.all.claritin.printing.instruction.close", webDriver);
		Util.scrollToElement(webDriver, closeModel, wait);
		closeModel.click();
		
		BayerWebElement allergyTipsSaving = getElement("claritin.saving.allergy.tips.savings", webDriver);
		Util.scrollToElement(webDriver, allergyTipsSaving, wait);
		
		skyLiving = getElement("claritin.saving.blue.sky.living", webDriver);
		Util.scrollToElement(webDriver, skyLiving, wait);
		
		BayerWebElement allergyMom = getElement("claritin.saving.smart.allergy.mom", webDriver);
		Util.scrollToElement(webDriver, allergyMom, wait);
		
		this.validate("claritin.saving.allergy.saving", webDriver, "claritin.saving.allergy.saving.validate", wait);
		Util.recallBaseURL(webDriver, savingUrl);
		if(osType.equals(webDriver.getOsType())){
			waitForElement("claritin.saving.header.text", webDriver, 30);
		}else {
			waitForElement("claritin.saving.mobile.base.image", webDriver, 30);
		}
		
		BayerWebElement rebates = getElement("claritin.mail.in.rebates", webDriver);
		Util.scrollToElement(webDriver, rebates, wait);
		
		BayerWebElement backByEmail = getElement("claritin.get.back.by.mail", webDriver);
		Util.scrollToElement(webDriver, backByEmail, wait);
		
		BayerWebElement imageOne = getElement("claritin.get.back.by.mail.image.one", webDriver);
		Util.scrollToElement(webDriver, imageOne, wait);
		
		// Todo
		
		BayerWebElement imageTwo = getElement("claritin.get.back.by.mail.image.two", webDriver);
		Util.scrollToElement(webDriver, imageTwo, wait);
		
		//webDriver.navigate().back();
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
