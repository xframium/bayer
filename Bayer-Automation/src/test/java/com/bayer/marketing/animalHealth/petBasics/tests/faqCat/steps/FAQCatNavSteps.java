package com.bayer.marketing.animalHealth.petBasics.tests.faqCat.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FAQCatNavSteps extends AbstractStep {

	private static final String osType="WINDOWS";
	
	public FAQCatNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		
		waitForElement("petbasics.faq.all", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.10", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.11", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.12", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.13", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.14", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.15", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.16", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.17", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.18", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.19", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.20", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.21", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.22", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.23", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.24", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.25", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.26", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.27", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.28", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.29", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.30", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.31", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.32", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.33", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.34", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.35", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.36", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.37", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.38", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.39", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.40", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.41", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.42", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.43", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.44", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.45", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.46", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.47", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.48", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.49", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.50", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.51", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.52", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.53", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.54", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.55", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.56", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.57", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.58", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.59", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.60", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.cat.question.61", webDriver, wait);
		
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
