package com.bayer.marketing.consumerHealth.betaseron.tests.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;

public class Util {

	public static void scrollToElement(BayerWebDriver webDriver, BayerWebElement webElment, WebDriverWait wait) {
		Point point = webElment.getLocation();
		((JavascriptExecutor) webDriver).executeScript("return window.title;");
		wait = new WebDriverWait(webDriver, 30);
		((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0," + (point.getY() - 200) + ");");

	}

	public static void recallBaseURL(BayerWebDriver webDriver, String url) {
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		webDriver.get(url);
		wait = new WebDriverWait(webDriver, 10);

	}

}
