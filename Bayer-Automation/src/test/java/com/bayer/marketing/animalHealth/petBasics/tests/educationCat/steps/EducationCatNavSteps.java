package com.bayer.marketing.animalHealth.petBasics.tests.educationCat.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class EducationCatNavSteps extends AbstractStep {

	public EducationCatNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String educationCat = webDriver.getCurrentUrl();

		waitForElement("petbasics.cat.education", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);

		waitForElement("petbasics.cat.education.base.image", webDriver, 15);
		BayerWebElement baseImage = getElement("petbasics.cat.education.base.image", webDriver);
		Util.scrollToElement(webDriver, baseImage, wait);

		this.validateEducationContent("petbasics.cat.education.featured.content", "petbasics.cat.education.featured.content.readmore",
				webDriver, "petbasics.cat.education.featured.content.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);

		this.validateEducationContent("petbasics.cat.education.your.cat.atrisk", "petbasics.cat.education.your.cat.atrisk.readmore", webDriver,
				"petbasics.cat.education.your.cat.atrisk.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);

		this.validateEducationContent("petbasics.cat.education.every.cat.owner", "petbasics.cat.education.every.cat.owner.readmore",
				webDriver, "petbasics.cat.education.every.cat.owner.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);

		this.validateEducationContent("petbasics.cat.education.how.shelters.cat", "petbasics.cat.education.how.shelters.cat.readmore",
				webDriver, "petbasics.cat.education.how.shelters.cat.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);

		this.validateEducationContent("petbasics.cat.education.myth.ticks.cat", "petbasics.cat.education.myth.ticks.cat.readmore", webDriver,
				"petbasics.cat.education.myth.ticks.cat.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);

		this.validateEducationContent("petbasics.cat.education.why.flea.comeback", "petbasics.cat.education.why.flea.comeback.readmore", webDriver,
				"petbasics.cat.education.why.flea.comeback.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);

		this.validateEducationContent("petbasics.cat.education.heartworms.cat", "petbasics.cat.education.heartworms.cat.readmore",
				webDriver, "petbasics.cat.education.heartworms.cat.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationCat);
		waitForElement("petbasics.cat.education", webDriver, 15);

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
