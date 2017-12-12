package com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class SiteMapNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";

	public SiteMapNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String siteMap = webDriver.getCurrentUrl();

		System.out.println("Yet to be done");
			
		return true;
	}
}
