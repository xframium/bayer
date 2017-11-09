package com.bayer.marketing.animalHealth.petBasics.tests.faqDog.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class ApplyFilterToFAQDogNavSteps extends AbstractStep {

	public ApplyFilterToFAQDogNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		waitForElement("petbasics.faq.all", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		waitForElement("petbasics.faq.all.mobile.filter.showbtn", webDriver, 15);
		BayerWebElement filterButton = getElement("petbasics.faq.all.mobile.filter.showbtn", webDriver);
		if(filterButton.isDisplayed()) {
			Util.scrollToElement(webDriver, filterButton, wait);
			filterButton.click();
		}
		
		waitForElement("petbasics.faq.all.filter.brands", webDriver, 15);
		BayerWebElement brands = getElement("petbasics.faq.all.filter.brands", webDriver);
		Util.scrollToElement(webDriver, brands, wait);
		
		waitForElement("petbasics.faq.all.filter.brand.two", webDriver, 15);
		BayerWebElement brand2 = getElement("petbasics.faq.all.filter.brand.two", webDriver);
		Util.scrollToElement(webDriver, brand2, wait);
		brand2.click();
		
		waitForElement("petbasics.faq.all.filter.brand.four", webDriver, 15);
		BayerWebElement brand4 = getElement("petbasics.faq.all.filter.brand.four", webDriver);
		Util.scrollToElement(webDriver, brand4, wait);
		brand4.click();
		
		waitForElement("petbasics.faq.all.filter.brand.six", webDriver, 15);
		BayerWebElement brand6 = getElement("petbasics.faq.all.filter.brand.six", webDriver);
		Util.scrollToElement(webDriver, brand6, wait);
		brand6.click();
		
		waitForElement("petbasics.faq.all.filter.brand.eight", webDriver, 15);
		BayerWebElement brand8 = getElement("petbasics.faq.all.filter.brand.eight", webDriver);
		Util.scrollToElement(webDriver, brand8, wait);
		brand8.click();
		
		waitForElement("petbasics.faq.all.filter.brand.ten", webDriver, 15);
		BayerWebElement brand10 = getElement("petbasics.faq.all.filter.brand.ten", webDriver);
		Util.scrollToElement(webDriver, brand10, wait);
		brand10.click();
		
		waitForElement("petbasics.faq.all.filter.brand.twelve", webDriver, 15);
		BayerWebElement brand12 = getElement("petbasics.faq.all.filter.brand.twelve", webDriver);
		Util.scrollToElement(webDriver, brand12, wait);
		brand12.click();
		
		waitForElement("petbasics.faq.all.filter.concerns", webDriver, 15);
		BayerWebElement concerns = getElement("petbasics.faq.all.filter.concerns", webDriver);
		Util.scrollToElement(webDriver, concerns, wait);
		
		waitForElement("petbasics.faq.all.filter.concern.one", webDriver, 15);
		BayerWebElement concern1 = getElement("petbasics.faq.all.filter.concern.one", webDriver);
		Util.scrollToElement(webDriver, concern1, wait);
		concern1.click();
		
		waitForElement("petbasics.faq.all.filter.concern.three", webDriver, 15);
		BayerWebElement concern3 = getElement("petbasics.faq.all.filter.concern.three", webDriver);
		Util.scrollToElement(webDriver, concern3, wait);
		concern3.click();
		
		waitForElement("petbasics.faq.all.filter.concern.five", webDriver, 15);
		BayerWebElement concern5 = getElement("petbasics.faq.all.filter.concern.five", webDriver);
		Util.scrollToElement(webDriver, concern5, wait);
		concern5.click();
		
		waitForElement("petbasics.faq.all.filter.concern.six", webDriver, 15);
		BayerWebElement concern6 = getElement("petbasics.faq.all.filter.concern.six", webDriver);
		Util.scrollToElement(webDriver, concern6, wait);
		concern6.click();
				
		waitForElement("petbasics.faq.all.apply.filter", webDriver, 15);
		BayerWebElement applyFilter = getElement("petbasics.faq.all.apply.filter", webDriver);
		Util.scrollToElement(webDriver, applyFilter, wait);
		applyFilter.click();
		
		waitForElement("petbasics.faq.all", webDriver, 15);
		BayerWebElement baseImage = getElement("petbasics.faq.all", webDriver);
		Util.scrollToElement(webDriver, baseImage, wait);
		
		return true;
	}

}
