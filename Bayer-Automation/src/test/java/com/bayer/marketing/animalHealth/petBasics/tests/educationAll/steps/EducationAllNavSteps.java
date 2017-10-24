package com.bayer.marketing.animalHealth.petBasics.tests.educationAll.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class EducationAllNavSteps extends AbstractStep {

	public EducationAllNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String educationAll = webDriver.getCurrentUrl();

		waitForElement("petbasics.all.education", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);

		waitForElement("petbasics.all.base.image", webDriver, 15);
		BayerWebElement baseImage = getElement("petbasics.all.base.image", webDriver);
		Util.scrollToElement(webDriver, baseImage, wait);

		this.validateEducationContent("petbasics.all.featured.content", "petbasics.all.featured.content.readmore",
				webDriver, "petbasics.all.featured.content.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.clean.pets", "petbasics.all.clean.pets.readmore", webDriver,
				"petbasics.all.clean.pets.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.your.cat.atrisk", "petbasics.all.your.cat.atrisk.readmore",
				webDriver, "petbasics.all.your.cat.atrisk.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.your.dog.atrisk", "petbasics.all.your.dog.atrisk.readmore",
				webDriver, "petbasics.all.your.dog.atrisk.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.tapeworms", "petbasics.all.tapeworms.readmore", webDriver,
				"petbasics.all.tapeworms.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.roundworms", "petbasics.all.roundworms.readmore", webDriver,
				"petbasics.all.roundworms.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.intestinal.worms", "petbasics.all.intestinal.worms.readmore",
				webDriver, "petbasics.all.intestinal.worms.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.not.alone.infight", "petbasics.all.not.alone.infight.readmore",
				webDriver, "petbasics.all.not.alone.infight.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.hookworms", "petbasics.all.hookworms.readmore", webDriver,
				"petbasics.all.hookworms.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.heartworms", "petbasics.all.heartworms.readmore", webDriver,
				"petbasics.all.heartworms.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.whipworms", "petbasics.all.whipworms.readmore", webDriver,
				"petbasics.all.whipworms.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.when.where", "petbasics.all.when.where.readmore", webDriver,
				"petbasics.all.when.where.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.fleas.ticks", "petbasics.all.fleas.ticks.readmore", webDriver,
				"petbasics.all.fleas.ticks.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.top10.mosquito", "petbasics.all.top10.mosquito.readmore",
				webDriver, "petbasics.all.top10.mosquito.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.how.shelters.dog", "petbasics.all.how.shelters.dog.readmore",
				webDriver, "petbasics.all.how.shelters.dog.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.every.dog.owner", "petbasics.all.every.dog.owner.readmore",
				webDriver, "petbasics.all.every.dog.owner.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.every.cat.owner", "petbasics.all.every.cat.owner.readmore",
				webDriver, "petbasics.all.every.cat.owner.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.how.shelters.cat", "petbasics.all.how.shelters.cat.readmore",
				webDriver, "petbasics.all.how.shelters.cat.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.flea.bite.cat", "petbasics.all.flea.bite.cat.readmore", webDriver,
				"petbasics.all.flea.bite.cat.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.myth.ticks.cat", "petbasics.all.myth.ticks.cat.readmore",
				webDriver, "petbasics.all.myth.ticks.cat.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.why.flea.comeback", "petbasics.all.why.flea.comeback.readmore",
				webDriver, "petbasics.all.why.flea.comeback.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.heartworms.cat", "petbasics.all.heartworms.cat.readmore",
				webDriver, "petbasics.all.heartworms.cat.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.fleas.annoying", "petbasics.all.fleas.annoying.readmore",
				webDriver, "petbasics.all.fleas.annoying.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.mosquitoes", "petbasics.all.mosquitoes.readmore", webDriver,
				"petbasics.all.mosquitoes.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

		this.validateEducationContent("petbasics.all.tick.disease", "petbasics.all.tick.disease.readmore", webDriver,
				"petbasics.all.tick.disease.readmore.validate", wait);
		Util.recallBaseURL(webDriver, educationAll);
		waitForElement("petbasics.all.education", webDriver, 15);

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
