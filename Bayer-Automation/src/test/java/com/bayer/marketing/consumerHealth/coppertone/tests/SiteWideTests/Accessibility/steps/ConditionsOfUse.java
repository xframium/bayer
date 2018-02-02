package com.bayer.marketing.consumerHealth.coppertone.tests.SiteWideTests.Accessibility.steps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class ConditionsOfUse extends AbstractStep
{

    public ConditionsOfUse()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
        
    	waitForElement( "bayer.key", webDriver, 15 );
    	
    	try{
	    	BayerWebElement cookiesPopup = getElement("bayer.cookiesVisible", webDriver);
	        if(cookiesPopup.isDisplayed()){
	        	BayerWebElement cookiesConf = getElement("bayer.cookiesConfirm", webDriver);
	        	cookiesConf.click();
	        }
    	}
    	catch (Exception e) {
			System.out.println("Cookie popup not displayed");
		}
        
        
    	waitForElement( "bayer.conditions", webDriver, 15 );
        BayerWebElement conditions = getElement("bayer.conditions", webDriver);
        Util.scrollToElement(webDriver, conditions, wait);
        conditions.click();
        waitForElement( "bayer.key", webDriver, 15 );
        
        new StructureValidator("Conditions", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        
        
        ///////////////Example Code Structure///////////////////
        /*BayerWebElement emailAddress = getElement( "login.emailAddress", webDriver );
        emailAddress.sendKeys( "test@bayer.com" );
        
        BayerWebElement confirmEmailAddress = getElement( "login.confirmEmailAddress", webDriver );
        confirmEmailAddress.sendKeys( "test@bayer.com" );
        
        BayerWebElement password = getElement( "login.password", webDriver );
        password.sendKeys( "password" );
        
        
        String bImage = password.getCssValue( "color" );
        */
        
        return true;
        
    }

}
