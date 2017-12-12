package com.bayer.marketing.consumerHealth.aspirin.tests.whereToBuy.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
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
		
		waitForElement("aspirin.footer.where.to.buy", webDriver, 15);
		BayerWebElement wheretobuy = getElement("aspirin.footer.where.to.buy", webDriver);
		Util.scrollToElement(webDriver, wheretobuy, wait);
		wheretobuy.click();
		wait=new WebDriverWait(webDriver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='SELECT TYPE']")));
		waitForElement("aspirin.where.to.buy.validate", webDriver, 90);
		webDriver.navigate().to(whereToBuy);
		waitForElement("aspirin.base.image", webDriver, 30);
			
		return true;
	}
}
