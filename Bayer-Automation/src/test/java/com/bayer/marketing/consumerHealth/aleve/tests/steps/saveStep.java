package com.bayer.marketing.consumerHealth.aleve.tests.steps;


import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;


import java.util.concurrent.TimeUnit;

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
    	//WebElement iframe = webDriver.findElement(By.xpath("//*[@id='mydiv']/iframe"));
    	webDriver.switchTo().frame(1);
    	
    	waitForElement( "aleve.coupon.aleveDCheck", webDriver, 15 );
        BayerWebElement aleveDCheck = getElement( "aleve.coupon.aleveDCheck", webDriver );
        aleveDCheck.click();
        
        
       // BayerWebElement alevePMCheck = getElement( "aleve.coupon.alevePMCheck", webDriver );
       // alevePMCheck.click();
   
        BayerWebElement print = getElement( "aleve.coupon.print", webDriver );
       // print.click();
         
        
        
        return true;
    }

}
