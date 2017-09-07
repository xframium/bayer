package com.bayer.marketing.consumerHealth.aleve.tests.Save.steps;


import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;


import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.functors.SwitchTransformer;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class saveStep extends AbstractStep
{

    public saveStep()
    {
        super( "message", "error message" );
    }
    
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	
    	waitForElement( "aleve.mobile.wtb.menu", webDriver, 15 );
        WebElement menu = getElement( "aleve.mobile.wtb.menu", webDriver );
        
        if(menu.isDisplayed()){
        	
        	waitForElement( "aleve.coupon.mobile", webDriver, 15 );
        	WebElement mobile = getElement( "aleve.coupon.mobile", webDriver );
        	mobile.click(); 
        	
        }else{
    	
	    	waitForElement( "aleve.coupon.iframe", webDriver, 15 );
	        WebElement iframe = getElement( "aleve.coupon.iframe", webDriver );
	        webDriver.switchTo().frame(0);
	        
	    	
	    	waitForElement( "aleve.coupon.aleveDCheck", webDriver, 15 );
	        BayerWebElement aleveDCheck = getElement( "aleve.coupon.aleveDCheck", webDriver );
	        aleveDCheck.click();
	   
	        BayerWebElement print = getElement( "aleve.coupon.print", webDriver );
	       // print.click();
        
        
        }
        return true;
    }

}
