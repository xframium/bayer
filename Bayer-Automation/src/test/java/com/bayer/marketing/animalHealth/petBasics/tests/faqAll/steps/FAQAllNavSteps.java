package com.bayer.marketing.animalHealth.petBasics.tests.faqAll.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FAQAllNavSteps extends AbstractStep {

	public FAQAllNavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		//String faqAll = webDriver.getCurrentUrl();
		
		waitForElement("petbasics.faq.all", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.one", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.two", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.three", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.four", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.five", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.six", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.seven", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.eight", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.nine", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.ten", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.eleven", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twelve", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirteen", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourteen", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifteen", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.sixteen", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.seventeen", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.eighteen", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.nineteen", webDriver, wait);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty", webDriver, wait);
		
		return true;
		
	}

	public void showQuestionAndItsAnswer(String question, BayerWebDriver webDriver, WebDriverWait wait) {
		waitForElement(question, webDriver, 15);
		BayerWebElement questionItem = getElement(question, webDriver);
		Util.scrollToElement(webDriver, questionItem, wait);
		waitForElement(question, webDriver, 30);
		questionItem.click();
		
		waitForElement("petbasics.faq.all.question.answer", webDriver, 15);
		BayerWebElement answerSection = getElement("petbasics.faq.all.question.answer", webDriver);
		Util.scrollToElement(webDriver, answerSection, wait);
		
		waitForElement("petbasics.faq.all.close.answer", webDriver, 15);
		BayerWebElement closeButton = getElement("petbasics.faq.all.close.answer", webDriver);
		Util.scrollToElement(webDriver, closeButton, wait);
		waitForElement("petbasics.faq.all.close.answer", webDriver, 30);
		closeButton.click();
	}
}
