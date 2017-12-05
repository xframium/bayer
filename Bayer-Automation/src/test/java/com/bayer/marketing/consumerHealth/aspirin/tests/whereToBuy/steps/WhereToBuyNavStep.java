package com.bayer.marketing.consumerHealth.aspirin.tests.whereToBuy.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;

public class WhereToBuyNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public WhereToBuyNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String whereToBuy = webDriver.getCurrentUrl();

		waitForElement("aspirin.base.image", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
			
		return true;
	}
}
