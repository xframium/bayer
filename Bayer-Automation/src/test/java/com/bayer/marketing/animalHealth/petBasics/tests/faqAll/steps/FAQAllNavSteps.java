package com.bayer.marketing.animalHealth.petBasics.tests.faqAll.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class FAQAllNavSteps extends AbstractStep {
	
	private static final String osType="WINDOWS";
	
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
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.twenty9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.thirty9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fourty9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty1", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty2", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty3", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty4", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty5", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty6", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty7", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty8", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.fifty9", webDriver, wait);
		this.showQuestionAndItsAnswer("petbasics.faq.all.question.sixty", webDriver, wait);
		
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
