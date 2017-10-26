package com.bayer.marketing.animalHealth.petBasics.tests.educationCat.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class ApplyFilterToEducationCatNavSteps extends AbstractStep {

	public ApplyFilterToEducationCatNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String educationCat = webDriver.getCurrentUrl();
		
		waitForElement("petbasics.cat.education", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		waitForElement("petbasics.cat.education.mobile.filter.showbtn", webDriver, 15);
		BayerWebElement filterButton = getElement("petbasics.cat.education.mobile.filter.showbtn", webDriver);
		if(filterButton.isDisplayed()) {
			Util.scrollToElement(webDriver, filterButton, wait);
			filterButton.click();
		}
		
		waitForElement("petbasics.cat.education.filter.concern", webDriver, 15);
		BayerWebElement concerns = getElement("petbasics.cat.education.filter.concern", webDriver);
		Util.scrollToElement(webDriver, concerns, wait);
		
		waitForElement("petbasics.cat.education.filter.concernTicks", webDriver, 15);
		BayerWebElement concernTicks = getElement("petbasics.cat.education.filter.concernTicks", webDriver);
		Util.scrollToElement(webDriver, concernTicks, wait);
		concernTicks.click();
		
		waitForElement("petbasics.cat.education.filter.concernEarCare", webDriver, 15);
		BayerWebElement concernEarCare = getElement("petbasics.cat.education.filter.concernEarCare", webDriver);
		Util.scrollToElement(webDriver, concernEarCare, wait);
		concernEarCare.click();
		
		waitForElement("petbasics.cat.education.apply.filter", webDriver, 15);
		BayerWebElement applyFilter = getElement("petbasics.cat.education.apply.filter", webDriver);
		Util.scrollToElement(webDriver, applyFilter, wait);
		applyFilter.click();
		
		waitForElement("petbasics.cat.education.base.image", webDriver, 15);
		BayerWebElement baseImage = getElement("petbasics.cat.education.base.image", webDriver);
		Util.scrollToElement(webDriver, baseImage, wait);
		
		waitForElement("petbasics.cat.education.featured.content.readmore", webDriver, 15);
		BayerWebElement featuredReadMore = getElement("petbasics.cat.education.featured.content.readmore", webDriver);
		Util.scrollToElement(webDriver, featuredReadMore, wait);
		
		waitForElement("petbasics.cat.education.get.my.offer", webDriver, 15);
		BayerWebElement myOffer = getElement("petbasics.cat.education.get.my.offer", webDriver);
		Util.scrollToElement(webDriver, myOffer, wait);
		
		waitForElement("petbasics.cat.education.get.my.offer.link", webDriver, 15);
		BayerWebElement myOfferLink = getElement("petbasics.cat.education.get.my.offer.link", webDriver);
		Util.scrollToElement(webDriver, myOfferLink, wait);
		waitForElement("petbasics.cat.education.get.my.offer.link", webDriver, 30);
		myOfferLink.click();
		waitForElement("petbasics.cat.education.get.my.offer.link.validate", webDriver, 30);
		
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);
		
		waitForElement("petbasics.cat.education.search.product", webDriver, 15);
		BayerWebElement searchProduct = getElement("petbasics.cat.education.search.product", webDriver);
		Util.scrollToElement(webDriver, searchProduct, wait);
		
		waitForElement("petbasics.cat.education.search.product.zip", webDriver, 15);
		BayerWebElement zipCode = getElement("petbasics.cat.education.search.product.zip", webDriver);
		Util.scrollToElement(webDriver, zipCode, wait);
		zipCode.sendKeys("56006");
		
		waitForElement("petbasics.cat.education.search.product.submit", webDriver, 15);
		BayerWebElement submit = getElement("petbasics.cat.education.search.product.submit", webDriver);
		submit.click();
		waitForElement("petbasics.cat.education.search.product.submit.validate", webDriver, 30);
		
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);
		
		waitForElement("petbasics.cat.education.signup", webDriver, 15);
		BayerWebElement signup = getElement("petbasics.cat.education.signup", webDriver);
		Util.scrollToElement(webDriver, signup, wait);
		
		waitForElement("petbasics.cat.education.signup.button", webDriver, 15);
		BayerWebElement signupbutton = getElement("petbasics.cat.education.signup.button", webDriver);
		Util.scrollToElement(webDriver, signupbutton, wait);
		signupbutton.click();
		
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);
		

		return true;
	}

}
