package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.legal.steps;

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

public class CaliforniaTransparency extends AbstractStep
{

    public CaliforniaTransparency()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
        
    	waitForElement( "bayer.key", webDriver, 15 );
    	
    	BayerWebElement cookiesPopup = getElement("bayer.cookiesVisible", webDriver);
        if(cookiesPopup.isDisplayed()){
        	BayerWebElement cookiesConf = getElement("bayer.cookiesConfirm", webDriver);
        	cookiesConf.click();
        }
        
        new StructureValidator("H1tag","/com/bayer/marketing/consumerHealth/claritin/tests/SiteWideTests/legal/CaliforniaTransparency.xml");
    	waitForElement( "bayer.privacy", webDriver, 15 );
        BayerWebElement conditions = getElement("bayer.privacy", webDriver);
        Util.scrollToElement(webDriver, conditions, wait);
        conditions.click();
        waitForElement( "bayer.key", webDriver, 15 );
             
        
        return true;
        
    }

}
