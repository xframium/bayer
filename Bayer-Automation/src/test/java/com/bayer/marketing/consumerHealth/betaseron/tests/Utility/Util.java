package com.bayer.marketing.consumerHealth.betaseron.tests.Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;

public class Util {
	
	private static final String osType="WINDOWS";

	public static void scrollToElement(BayerWebDriver webDriver, BayerWebElement webElment, WebDriverWait wait) {
		if(!osType.equals(webDriver.getOsType())) {
			Point point = webElment.getLocation();
			((JavascriptExecutor) webDriver).executeScript("return window.title;");
			wait = new WebDriverWait(webDriver, 30);
			((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0," + (point.getY() - 200) + ");");
		}
	}
	
	public static void moveToElement(BayerWebDriver webDriver, BayerWebElement webElment, WebDriverWait wait) {
		
		JavascriptExecutor jse = (JavascriptExecutor)webDriver;

		//jse.executeScript("arguments[0].scrollIntoView()", (WebElement)webElment); 
		
		/* String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                 + "var elementTop = arguments[0].getBoundingClientRect().top;"
                 + "window.scrollBy(0, elementTop-(viewPortHeight/2));";*/

		 //jse.executeScript(scrollElementIntoMiddle, webElment);
		// jse.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight));");

		Point point = webElment.getLocation();
		((JavascriptExecutor) webDriver).executeScript("return window.title;");
		wait = new WebDriverWait(webDriver, 30);
		//((JavascriptExecutor) webDriver).executeScript("window.scrollBy("+ (point.getX())+"," + (point.getY()) + ");");
		((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0," + (point.getY()) + ");");

		
		/*Point point = webElment.getLocation();
		((JavascriptExecutor) webDriver).executeScript("return window.title;");
		List<WebElement> webElementList = new ArrayList();
		webElementList.add(webElment.getWebElement());
        wait.until(ExpectedConditions.visibilityOfAllElements(webElementList));
		((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0," + (point.getY() - 200) + ");");
		webElementList.clear();
		webElementList=null;*/
	}

	public static void recallBaseURL(BayerWebDriver webDriver, String url) {
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		webDriver.get(url);
		wait = new WebDriverWait(webDriver, 10);

	}
	
}
