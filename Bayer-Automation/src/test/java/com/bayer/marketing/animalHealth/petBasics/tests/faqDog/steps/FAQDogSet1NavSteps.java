package com.bayer.marketing.animalHealth.petBasics.tests.faqDog.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FAQDogSet1NavSteps extends AbstractStep {

	private static final String osType="WINDOWS";
	
	public FAQDogSet1NavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		
		waitForElement("petbasics.faq.all", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.10", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.11", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.12", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.13", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.14", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.15", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.16", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.17", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.18", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.19", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.20", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.21", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.22", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.23", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.24", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.25", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.26", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.27", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.28", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.29", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.30", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.31", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.32", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.33", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.34", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.35", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.36", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.37", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.38", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.39", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.40", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.41", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.42", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.43", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.44", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.45", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.46", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.47", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.48", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.49", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.50", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.51", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.52", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.53", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.54", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.55", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.56", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.57", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.58", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.59", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.60", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.61", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.62", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.63", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.64", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.65", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.66", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.67", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.dog.question.68", webDriver, wait);
		
		
		return true;
		
	}

	public void showQuestionAndItsAnswer(String question, BayerWebDriver webDriver, WebDriverWait wait) {
		waitForElement(question, webDriver, 15);
		BayerWebElement questionItem = getElement(question, webDriver);
		Util.scrollToElement(webDriver, questionItem, wait);
		waitForElement(question, webDriver, 30);
		if(!osType.equals(webDriver.getOsType())) {
			questionItem.click();
			waitForElement("petbasics.faq.all.question.answer", webDriver, 15);
			BayerWebElement answerSection = getElement("petbasics.faq.all.question.answer", webDriver);
			
			if(answerSection.isDisplayed()) {
				Util.scrollToElement(webDriver, answerSection, wait);
				waitForElement("petbasics.faq.all.close.answer", webDriver, 15);
				BayerWebElement closeButton = getElement("petbasics.faq.all.close.answer", webDriver);
				Util.scrollToElement(webDriver, closeButton, wait);
				waitForElement("petbasics.faq.all.close.answer", webDriver, 30);
				closeButton.click();
		}
	  }	
	}
}
