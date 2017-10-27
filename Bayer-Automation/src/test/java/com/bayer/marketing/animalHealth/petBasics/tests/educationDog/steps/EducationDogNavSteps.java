package com.bayer.marketing.animalHealth.petBasics.tests.educationDog.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class EducationDogNavSteps extends AbstractStep {

	public EducationDogNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String educationDog = webDriver.getCurrentUrl();

		waitForElement("petbasics.dog.education", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);

		waitForElement("petbasics.dog.education.base.image", webDriver, 15);
		BayerWebElement baseImage = getElement("petbasics.dog.education.base.image", webDriver);
		Util.scrollToElement(webDriver, baseImage, wait);

		this.validateEducationContent("petbasics.dog.education.featured.content", "petbasics.dog.education.featured.content.readmore",
				webDriver, "petbasics.dog.education.featured.content.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);

		this.validateEducationContent("petbasics.dog.education.your.dog.atrisk", "petbasics.dog.education.your.dog.atrisk.readmore", webDriver,
				"petbasics.dog.education.your.dog.atrisk.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);

		this.validateEducationContent("petbasics.dog.education.heartworms", "petbasics.dog.education.heartworms.readmore",
				webDriver, "petbasics.dog.education.heartworms.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);

		this.validateEducationContent("petbasics.dog.education.whipworms", "petbasics.dog.education.whipworms.readmore",
				webDriver, "petbasics.dog.education.whipworms.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);

		this.validateEducationContent("petbasics.dog.education.top10.mosquito", "petbasics.dog.education.top10.mosquito.readmore", webDriver,
				"petbasics.dog.education.top10.mosquito.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);

		this.validateEducationContent("petbasics.dog.education.how.shelters.dog", "petbasics.dog.education.how.shelters.dog.readmore", webDriver,
				"petbasics.dog.education.how.shelters.dog.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);

		this.validateEducationContent("petbasics.dog.education.every.dog.owner", "petbasics.dog.education.every.dog.owner.readmore",
				webDriver, "petbasics.dog.education.every.dog.owner.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);
		
		this.validateEducationContent("petbasics.dog.education.flea.life.cycle", "petbasics.dog.education.flea.life.cycle.readmore",
				webDriver, "petbasics.dog.education.flea.life.cycle.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);
		
		this.validateEducationContent("petbasics.dog.education.mosquitoes", "petbasics.dog.education.mosquitoes.readmore",
				webDriver, "petbasics.dog.education.mosquitoes.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);
		
		this.validateEducationContent("petbasics.dog.education.tick.disease", "petbasics.dog.education.tick.disease.readmore",
				webDriver, "petbasics.dog.education.tick.disease.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationDog);
		waitForElement("petbasics.dog.education", webDriver, 15);

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
