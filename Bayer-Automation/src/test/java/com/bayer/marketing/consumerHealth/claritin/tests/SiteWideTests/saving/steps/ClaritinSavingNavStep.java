package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.saving.steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.FixedCutProvider;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class ClaritinSavingNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";
	private static final String platFormName="platformName";
	private static final String applitoolsKey = "jT5nmDPxXHb8fAnnRYVmJ4vItCKH0R9Z2Mm791U9UQc110";

	public ClaritinSavingNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String savingUrl = webDriver.getCurrentUrl();
		
		Eyes eyes=Util.initilizeEyesServer(webDriver, savingUrl,"Claritin Saving", "calritin-saving", "claritin-saving");
		
		if(osType.equals(webDriver.getOsType())){
			waitForElement("claritin.saving.header.text", webDriver, 30);
		      Util.takeScreenShot(eyes,"claritin-saving-header");
		}else {
			waitForElement("claritin.saving.mobile.base.image", webDriver, 30);
			  Util.takeScreenShot(eyes,"claritin-saving-header-mobile");
			
		}
		
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		BayerWebElement coupons = getElement("claritin.saving.coupons", webDriver);
		if(coupons.isDisplayed()) {
		Util.scrollToElement(webDriver, coupons, wait);
		Util.takeScreenShot(eyes,"claritin-saving-coupons");
		coupons.click();
		}
		BayerWebElement skyLiving = getElement("claritin.saving.coupons.sky.living", webDriver);
		if(skyLiving.isDisplayed()) {
			Util.scrollToElement(webDriver, skyLiving, wait);
			Util.takeScreenShot(eyes,"claritin-saving-coupons-sky-living");
		}
		
		this.validate("claritin.saving.coupons.cash.back", webDriver, "claritin.saving.coupons.cash.back.validate", wait,eyes);
		
		coupons = getElement("claritin.saving.coupons", webDriver);
		if(coupons.isDisplayed()) {
			Util.scrollToElement(webDriver, coupons, wait);
			coupons.click();
		}
		
		BayerWebElement allergyTipsSaving = getElement("claritin.saving.allergy.tips.savings", webDriver);
		if(allergyTipsSaving.isDisplayed()) {
			Util.scrollToElement(webDriver, allergyTipsSaving, wait);
			Util.takeScreenShot(eyes,"claritin-saving-allergy-tips");
		}
		
		skyLiving = getElement("claritin.saving.blue.sky.living", webDriver);
		if(skyLiving.isDisplayed()) {
			Util.scrollToElement(webDriver, skyLiving, wait);
		}
				
		BayerWebElement allergyMom = getElement("claritin.saving.smart.allergy.mom", webDriver);
		if(allergyMom.isDisplayed()) {
			Util.scrollToElement(webDriver, allergyMom, wait);
			Util.takeScreenShot(eyes,"claritin-saving-smart-allergy-mom");
		}
		
		BayerWebElement saving = getElement("claritin.saving.allergy.saving", webDriver);
		if(saving.isDisplayed()) {
			Util.scrollToElement(webDriver, saving, wait);
			Util.takeScreenShot(eyes,"claritin-saving-allergy-saving");
		}
		
		BayerWebElement rebates = getElement("claritin.mail.in.rebates", webDriver);
		if(rebates.isDisplayed()) {	
			Util.scrollToElement(webDriver, rebates, wait);
			Util.takeScreenShot(eyes,"claritin-mail-in-rebates");
		}
		BayerWebElement backByEmail = getElement("claritin.get.back.by.mail", webDriver);
		if(backByEmail.isDisplayed()) {
			Util.scrollToElement(webDriver, backByEmail, wait);
			Util.takeScreenShot(eyes,"claritin-get-back-by-mail");
		}	
		
		BayerWebElement imageOne = getElement("claritin.get.back.by.mail.image.one", webDriver);
		if(imageOne.isDisplayed()) {
			Util.scrollToElement(webDriver, imageOne, wait);
			Util.takeScreenShot(eyes,"claritin-get-back-by-mail-image-one");
		}	
		
		
		BayerWebElement imageTwo = getElement("claritin.get.back.by.mail.image.two", webDriver);
		if(imageTwo.isDisplayed()) {
		      Util.scrollToElement(webDriver, imageTwo, wait);
		      Util.takeScreenShot(eyes,"claritin-get-back-by-mail-image-two");
		}      
		
		Util.closeEyes(eyes);
		return true;
	}

	public void validate(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait,Eyes eyes) {
		BayerWebElement element = getElement(objectName, webDriver);
		if(element.isDisplayed()) {
		Util.scrollToElement(webDriver, element, wait);
		Util.takeScreenShot(eyes,objectName);
		waitForElement(objectName, webDriver, 30);
		element.click();
		waitForElement(objectValidator, webDriver, 30);
		Util.takeScreenShot(eyes,objectValidator);
		}	
	}
}
