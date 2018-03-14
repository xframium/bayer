package com.bayer.corp.Radiology.tests.aboutUs.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class AboutUsNavCongressesStep extends AbstractStep {

	public AboutUsNavCongressesStep() {
		super("message", "error message");
	}

	@Override
    protected boolean _executeStep(BayerWebDriver webDriver){
		
		Eyes eyes=Util.initilizeEyesServer(webDriver, webDriver.getCurrentUrl(),"Radiology about us congresses", "radiology-aboutus-congresses", "radiology-aboutus-congresses");
		
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		
		this.scrollAndTakeScreenShot("radiology.aboutus.congresses.validate",eyes,webDriver,wait);
    	
		Util.closeEyes(eyes);
		
		return true;
	}

	private void scrollAndTakeScreenShot(String xpathKey, Eyes eyes, BayerWebDriver webDriver, WebDriverWait wait) {
		waitForElement(xpathKey, webDriver, 30);
		BayerWebElement element = getElement(xpathKey, webDriver);
		if(element.isDisplayed()) {
			Util.scrollToElement(webDriver, element, wait);
			element.click();
			Util.takeScreenShot(eyes,xpathKey);
		}
		
	}
	
	public void click(BayerWebElement a,BayerWebElement b,BayerWebDriver driver)
	{
		try 
		 {
			 String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			 ((JavascriptExecutor) driver).executeScript(mouseOverScript,a);
			 Thread.sleep(1000);
			 ((JavascriptExecutor) driver).executeScript(mouseOverScript,b);
			 Thread.sleep(1000);
			 ((JavascriptExecutor)driver).executeScript("arguments[1].click();",b);
			
			
		} catch (Exception e) {
			// TODO: handle exception

		}
	}
}
