package com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronSafety.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class BetaseronSafetyNavStep extends AbstractStep {

	public BetaseronSafetyNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String betaSeronSafetyUrl = webDriver.getCurrentUrl();

		waitForElement("betaseron.safety.key.logo", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		BayerWebElement logoText = getElement("betaseron.safety.key.logo", webDriver);
		Assert.assertEquals(logoText.getText(), "Safety Information");
		
		waitForElement("betaseron.safety.impInfo.toKnow", webDriver, 15);
		BayerWebElement toKnow = getElement("betaseron.safety.impInfo.toKnow", webDriver);
		Util.scrollToElement(webDriver, toKnow, wait);
		Assert.assertEquals(toKnow.getText(), "Most Important Information to Know about BETASERON");
		
		waitForElement("betaseron.safety.impInfo.toKnow.info1", webDriver, 15);
		BayerWebElement toKnowInfo = getElement("betaseron.safety.impInfo.toKnow.info1", webDriver);
		Util.scrollToElement(webDriver, toKnowInfo, wait);
		Assert.assertEquals(toKnowInfo.getText(), "Before you take BETASERON, tell your healthcare provider if you:");
		
		toKnow.click();
		
		waitForElement("betaseron.safety.once.taking", webDriver, 15);
		BayerWebElement onceTaking = getElement("betaseron.safety.once.taking", webDriver);
		Util.scrollToElement(webDriver, onceTaking, wait);
		Assert.assertEquals(onceTaking.getText(), "Once Taking BETASERON");
		onceTaking.click();

		waitForElement("betaseron.safety.once.taking.info1", webDriver, 15);
		BayerWebElement onceTakingInfo = getElement("betaseron.safety.once.taking.info1", webDriver);
		Util.scrollToElement(webDriver, onceTakingInfo, wait);
		Assert.assertEquals(onceTakingInfo.getText(), "How should I store BETASERON?");
		onceTaking.click();
		
		waitForElement("betaseron.safety.possible.sideeffects", webDriver, 15);
		BayerWebElement sideeffects = getElement("betaseron.safety.possible.sideeffects", webDriver);
		Util.scrollToElement(webDriver, sideeffects, wait);
		Assert.assertEquals(sideeffects.getText(), "Possible Side Effects4");
		sideeffects.click();
		
		BayerWebElement sideeffectsInfo = getElement("betaseron.safety.possible.sideeffects.info1", webDriver);
		Util.scrollToElement(webDriver, sideeffectsInfo, wait);
		Assert.assertEquals(sideeffectsInfo.getText(), "The most common side effects of BETASERON include:");
		
		sideeffects.click();
		
		this.validate("betaseron.safety.getDiscussion.guide", webDriver,
				"betaseron.safety.getDiscussion.guide.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronSafetyUrl);
		waitForElement("betaseron.safety.key.logo", webDriver, 30);

		this.validate("betaseron.safety.betaplus", webDriver, "betaseron.safety.betaplus.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronSafetyUrl);
		waitForElement("betaseron.safety.key.logo", webDriver, 30);

		this.checkUrlsFromWhereToNext("betaseron.safety.betaseron.heritage",webDriver,"betaseron.safety.betaseron.heritage.validate",wait,betaSeronSafetyUrl);
		
		this.checkUrlsFromWhereToNext("betaseron.safety.betaseron.efficacy",webDriver,"betaseron.safety.betaseron.efficacy.validate",wait,betaSeronSafetyUrl);
		
		this.checkUrlsFromWhereToNext("betaseron.safety.betaseron.safety",webDriver,"betaseron.safety.betaseron.safety.validate",wait,betaSeronSafetyUrl);
		
		return true;
	}

	public void validate(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait) {
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		waitForElement(objectName, webDriver, 30);
		element.click();

		waitForElement(objectValidator, webDriver, 30);

	}
	
	public void checkUrlsFromWhereToNext(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait,String betaSeronSafetyUrl) {
		BayerWebElement whereTonext = getElement("betaseron.safety.whereToNext", webDriver);
		Util.scrollToElement(webDriver, whereTonext, wait);
		this.validate(objectName, webDriver,objectValidator, wait);
		Util.recallBaseURL(webDriver, betaSeronSafetyUrl);
		waitForElement("betaseron.safety.key.logo", webDriver, 30);


	}

}
