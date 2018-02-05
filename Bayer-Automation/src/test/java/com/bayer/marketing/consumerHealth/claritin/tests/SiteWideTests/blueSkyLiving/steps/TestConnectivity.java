package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.blueSkyLiving.steps;

import java.util.Iterator;
import java.util.Set;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class TestConnectivity extends AbstractStep
{

    public TestConnectivity()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
    	waitForElement("claritin.bsl.base.text", webDriver, 30);
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lo_BtnJoinNowBanner']")));
    	if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
    	BayerWebElement join = getElement("claritin.bsl.base.join.free", webDriver);
    	if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		Util.scrollToElement(webDriver, join, wait);
		join.click();
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		waitForElement("claritin.bsl.base.join.free.validate", webDriver, 30);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}     
        
        return true;
        
    }
    
    public boolean isAlertPresents(BayerWebDriver webDriver) {
    	try {
    		webDriver.switchTo().alert();
    		return true;
    	}catch (Exception e) {
    			return false;
    	}
    }

}
