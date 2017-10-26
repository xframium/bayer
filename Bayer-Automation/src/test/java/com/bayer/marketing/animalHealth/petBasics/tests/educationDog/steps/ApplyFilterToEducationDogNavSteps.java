package com.bayer.marketing.animalHealth.petBasics.tests.educationDog.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class ApplyFilterToEducationDogNavSteps extends AbstractStep {

	public ApplyFilterToEducationDogNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String educationCat = webDriver.getCurrentUrl();
		
		waitForElement("petbasics.dog.education", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		waitForElement("petbasics.dog.education.mobile.filter.showbtn", webDriver, 15);
		BayerWebElement filterButton = getElement("petbasics.dog.education.mobile.filter.showbtn", webDriver);
		if(filterButton.isDisplayed()) {
			Util.scrollToElement(webDriver, filterButton, wait);
			filterButton.click();
		}
		
		waitForElement("petbasics.dog.education.filter.concern", webDriver, 15);
		BayerWebElement concerns = getElement("petbasics.dog.education.filter.concern", webDriver);
		Util.scrollToElement(webDriver, concerns, wait);
		
		waitForElement("petbasics.dog.education.filter.concernTicks", webDriver, 15);
		BayerWebElement concernTicks = getElement("petbasics.dog.education.filter.concernTicks", webDriver);
		Util.scrollToElement(webDriver, concernTicks, wait);
		concernTicks.click();
		
		waitForElement("petbasics.dog.education.filter.concernEarCare", webDriver, 15);
		BayerWebElement concernEarCare = getElement("petbasics.dog.education.filter.concernEarCare", webDriver);
		Util.scrollToElement(webDriver, concernEarCare, wait);
		concernEarCare.click();
		
		waitForElement("petbasics.dog.education.apply.filter", webDriver, 15);
		BayerWebElement applyFilter = getElement("petbasics.dog.education.apply.filter", webDriver);
		Util.scrollToElement(webDriver, applyFilter, wait);
		applyFilter.click();
		
		waitForElement("petbasics.dog.education.base.image", webDriver, 15);
		BayerWebElement baseImage = getElement("petbasics.dog.education.base.image", webDriver);
		Util.scrollToElement(webDriver, baseImage, wait);
		
		waitForElement("petbasics.dog.education.featured.content.readmore", webDriver, 15);
		BayerWebElement featuredReadMore = getElement("petbasics.dog.education.featured.content.readmore", webDriver);
		Util.scrollToElement(webDriver, featuredReadMore, wait);
		
		waitForElement("petbasics.dog.education.get.my.offer", webDriver, 15);
		BayerWebElement myOffer = getElement("petbasics.dog.education.get.my.offer", webDriver);
		Util.scrollToElement(webDriver, myOffer, wait);
		
		waitForElement("petbasics.dog.education.get.my.offer.link", webDriver, 15);
		BayerWebElement myOfferLink = getElement("petbasics.dog.education.get.my.offer.link", webDriver);
		Util.scrollToElement(webDriver, myOfferLink, wait);
		waitForElement("petbasics.dog.education.get.my.offer.link", webDriver, 30);
		myOfferLink.click();
		waitForElement("petbasics.dog.education.get.my.offer.link.validate", webDriver, 30);
		
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.dog.education", webDriver, 15);
		
		waitForElement("petbasics.dog.education.search.product", webDriver, 15);
		BayerWebElement searchProduct = getElement("petbasics.dog.education.search.product", webDriver);
		Util.scrollToElement(webDriver, searchProduct, wait);
		
		waitForElement("petbasics.dog.education.search.product.zip", webDriver, 15);
		BayerWebElement zipCode = getElement("petbasics.dog.education.search.product.zip", webDriver);
		Util.scrollToElement(webDriver, zipCode, wait);
		zipCode.sendKeys("56006");
		
		waitForElement("petbasics.dog.education.search.product.submit", webDriver, 15);
		BayerWebElement submit = getElement("petbasics.dog.education.search.product.submit", webDriver);
		submit.click();
		waitForElement("petbasics.dog.education.search.product.submit.validate", webDriver, 30);
		
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.dog.education", webDriver, 15);
		
		waitForElement("petbasics.dog.education.signup", webDriver, 15);
		BayerWebElement signup = getElement("petbasics.dog.education.signup", webDriver);
		Util.scrollToElement(webDriver, signup, wait);
		
		waitForElement("petbasics.dog.education.signup.button", webDriver, 15);
		BayerWebElement signupbutton = getElement("petbasics.dog.education.signup.button", webDriver);
		Util.scrollToElement(webDriver, signupbutton, wait);
		signupbutton.click();
		
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.dog.education", webDriver, 15);
		

		return true;
	}

}
