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
    	
    	/*Alert alert = webDriver.switchTo().alert();
    	alert.accept();
    	webDriver.switchTo().defaultContent();*/
    	
    	/*webDriver.switchTo().alert();
    	//Selenium-WebDriver Java Code for entering Username & Password as below:
    	webDriver.findElement(By.id("userID")).sendKeys("colin");
    	webDriver.findElement(By.id("password")).sendKeys("Bayer123");
    	webDriver.switchTo().alert().accept();
    	webDriver.switchTo().defaultContent();*/
    	
    	/*String MainWindow=webDriver.getWindowHandle();
        // To handle all new opened window.				
        Set<String> s1=webDriver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		                                                                                                           
                    webDriver.switchTo().alert();
					//Selenium-WebDriver Java Code for entering Username & Password as below:
					webDriver.findElement(By.id("userID")).sendKeys("colin");
					webDriver.findElement(By.id("password")).sendKeys("Bayer123");
					webDriver.switchTo().alert().accept();
						
            }		
        }		
        // Switching to Parent window i.e Main Window.
        webDriver.switchTo().window(MainWindow);*/
        
       
        /*webDriver.switchTo().alert().authenticateUsing(new UserAndPassword("colin", "Bayer123"));
        webDriver.switchTo().defaultContent() ;*/
    	
    	/*webDriver.switchTo().alert().setCredentials(new UserAndPassword("colin", "Bayer123"));
    	webDriver.switchTo().alert().accept();*/
    	
    	if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
       /* 
       */
    	
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
