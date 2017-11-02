package com.bayer.marketing.animalHealth.petBasics.tests.faqAll.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FAQAllSet3NavSteps extends AbstractStep {

	public FAQAllSet3NavSteps() {
		super("Successful", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		//String faqAll = webDriver.getCurrentUrl();
		
		waitForElement("petbasics.faq.all", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.twenty9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.thirty", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fourty9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.fifty9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.sixty9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.seventy9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.eighty", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.eighty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.hundred.eighty2", webDriver, wait);
		
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
