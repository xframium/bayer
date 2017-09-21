package com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronEfficacy.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Scroll;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class BetaseronEfficacyNavStep extends AbstractStep {

	public BetaseronEfficacyNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String betaSeronEfficacyUrl = webDriver.getCurrentUrl();

		waitForElement("betaseron.efficacy.key.logo", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		BayerWebElement logoText = getElement("betaseron.efficacy.key.logo", webDriver);

		this.validate("betaseron.efficacy.proven.link", webDriver, "betaseron.efficacy.proven.link.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronEfficacyUrl);
		waitForElement("betaseron.heritage.key.logo", webDriver, 30);

		BayerWebElement tabOne = getElement("betaseron.efficacy.tab.one", webDriver);
		Util.scrollToElement(webDriver, tabOne, wait);
		waitForElement("betaseron.efficacy.tab.one", webDriver, 15);
		Assert.assertEquals(tabOne.getText(), "Delay time to a second flare-up");
		tabOne.click();

		waitForElement("betaseron.efficacy.tab.one.validation.one", webDriver, 15);
		tabOne.click();

		waitForElement("betaseron.efficacy.tab.two", webDriver, 15);
		BayerWebElement tabtwo = getElement("betaseron.efficacy.tab.two", webDriver);
		Util.scrollToElement(webDriver, tabtwo, wait);
		Assert.assertEquals(tabtwo.getText(), "Reduce number of newly active lesions");
		tabtwo.click();

		waitForElement("betaseron.efficacy.tab.two.validation.one", webDriver, 15);
		tabtwo.click();

		waitForElement("betaseron.efficacy.tab.three", webDriver, 15);
		BayerWebElement tabthree = getElement("betaseron.efficacy.tab.three", webDriver);
		Util.scrollToElement(webDriver, tabthree, wait);
		Assert.assertEquals(tabthree.getText(), "Cut number of flare-ups per year");
		tabthree.click();

		waitForElement("betaseron.efficacy.tab.three.validation.one", webDriver, 15);
		tabthree.click();

		this.validate("betaseron.efficacy.learnMore.safety", webDriver, "betaseron.efficacy.learnMore.safety.validate",
				wait);
		Util.recallBaseURL(webDriver, betaSeronEfficacyUrl);
		waitForElement("betaseron.heritage.key.logo", webDriver, 30);

		this.validate("betaseron.efficacy.getDiscussion.guide", webDriver,
				"betaseron.efficacy.getDiscussion.guide.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronEfficacyUrl);
		waitForElement("betaseron.heritage.key.logo", webDriver, 30);

		this.validate("betaseron.efficacy.betaplus", webDriver, "betaseron.efficacy.betaplus.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronEfficacyUrl);
		waitForElement("betaseron.heritage.key.logo", webDriver, 30);

		BayerWebElement whereToNext = getElement("betaseron.efficacy.whereToNext", webDriver);
		Util.scrollToElement(webDriver, whereToNext, wait);
		this.validate("betaseron.efficacy.financial.support", webDriver,
				"betaseron.efficacy.financial.support.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronEfficacyUrl);
		waitForElement("betaseron.heritage.key.logo", webDriver, 30);

		BayerWebElement whereTonext = getElement("betaseron.efficacy.whereToNext", webDriver);
		Util.scrollToElement(webDriver, whereTonext, wait);
		this.validate("betaseron.efficacy.stepByStep.training", webDriver,
				"betaseron.efficacy.stepByStep.training.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronEfficacyUrl);
		waitForElement("betaseron.heritage.key.logo", webDriver, 30);

		return true;
	}

	public void validate(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait) {
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		waitForElement(objectName, webDriver, 30);
		element.click();

		waitForElement(objectValidator, webDriver, 30);

	}

}
