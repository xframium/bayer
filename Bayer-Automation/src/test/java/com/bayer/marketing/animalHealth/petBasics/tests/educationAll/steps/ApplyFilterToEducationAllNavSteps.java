package com.bayer.marketing.animalHealth.petBasics.tests.educationAll.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class ApplyFilterToEducationAllNavSteps extends AbstractStep {

	public ApplyFilterToEducationAllNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String educationAll = webDriver.getCurrentUrl();
		
		waitForElement("petbasics.all.education", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		waitForElement("petbasics.all.mobile.filter.showbtn", webDriver, 15);
		BayerWebElement filterButton = getElement("petbasics.all.mobile.filter.showbtn", webDriver);
		if(filterButton.isDisplayed()) {
			Util.scrollToElement(webDriver, filterButton, wait);
			filterButton.click();
		}
		
		waitForElement("petbasics.all.filter.cat", webDriver, 15);
		BayerWebElement catImage = getElement("petbasics.all.filter.cat", webDriver);
		Util.scrollToElement(webDriver, catImage, wait);
		catImage.click();
		
		waitForElement("petbasics.all.filter.concern", webDriver, 15);
		BayerWebElement concerns = getElement("petbasics.all.filter.concern", webDriver);
		Util.scrollToElement(webDriver, concerns, wait);
		
		waitForElement("petbasics.all.filter.concernTicks", webDriver, 15);
		BayerWebElement concernTicks = getElement("petbasics.all.filter.concernTicks", webDriver);
		Util.scrollToElement(webDriver, concernTicks, wait);
		concernTicks.click();
		
		waitForElement("petbasics.all.filter.concernEarCare", webDriver, 15);
		BayerWebElement concernEarCare = getElement("petbasics.all.filter.concernEarCare", webDriver);
		Util.scrollToElement(webDriver, concernEarCare, wait);
		concernEarCare.click();
		
		waitForElement("petbasics.all.apply.filter", webDriver, 15);
		BayerWebElement applyFilter = getElement("petbasics.all.apply.filter", webDriver);
		Util.scrollToElement(webDriver, applyFilter, wait);
		applyFilter.click();
		
		waitForElement("petbasics.all.base.image", webDriver, 15);
		BayerWebElement baseImage = getElement("petbasics.all.base.image", webDriver);
		Util.scrollToElement(webDriver, baseImage, wait);
		
		waitForElement("petbasics.all.featured.content.readmore", webDriver, 15);
		BayerWebElement featuredReadMore = getElement("petbasics.all.featured.content.readmore", webDriver);
		Util.scrollToElement(webDriver, featuredReadMore, wait);
		
		waitForElement("petbasics.all.get.my.offer", webDriver, 15);
		BayerWebElement myOffer = getElement("petbasics.all.get.my.offer", webDriver);
		Util.scrollToElement(webDriver, myOffer, wait);
		
		waitForElement("petbasics.all.get.my.offer.link", webDriver, 15);
		BayerWebElement myOfferLink = getElement("petbasics.all.get.my.offer.link", webDriver);
		Util.scrollToElement(webDriver, myOfferLink, wait);
		waitForElement("petbasics.all.get.my.offer.link", webDriver, 30);
		myOfferLink.click();
		waitForElement("petbasics.all.get.my.offer.link.validate", webDriver, 30);
		
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);
		
		waitForElement("petbasics.all.search.product", webDriver, 15);
		BayerWebElement searchProduct = getElement("petbasics.all.search.product", webDriver);
		Util.scrollToElement(webDriver, searchProduct, wait);
		
		waitForElement("petbasics.all.search.product.zip", webDriver, 15);
		BayerWebElement zipCode = getElement("petbasics.all.search.product.zip", webDriver);
		Util.scrollToElement(webDriver, zipCode, wait);
		zipCode.sendKeys("56006");
		
		waitForElement("petbasics.all.search.product.submit", webDriver, 15);
		BayerWebElement submit = getElement("petbasics.all.search.product.submit", webDriver);
		submit.click();
		waitForElement("petbasics.all.search.product.submit.validate", webDriver, 30);
		
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);
		
		waitForElement("petbasics.all.signup", webDriver, 15);
		BayerWebElement signup = getElement("petbasics.all.signup", webDriver);
		Util.scrollToElement(webDriver, signup, wait);
		
		waitForElement("petbasics.all.signup.button", webDriver, 15);
		BayerWebElement signupbutton = getElement("petbasics.all.signup.button", webDriver);
		Util.scrollToElement(webDriver, signupbutton, wait);
		signupbutton.click();
		
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);
		

		return true;
	}

}
