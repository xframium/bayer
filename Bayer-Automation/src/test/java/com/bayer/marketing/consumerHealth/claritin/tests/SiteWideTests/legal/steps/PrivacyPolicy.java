package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.legal.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class PrivacyPolicy extends AbstractStep
{

    public PrivacyPolicy()
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
        
    	waitForElement( "bayer.privacy", webDriver, 15 );
        BayerWebElement conditions = getElement("bayer.privacy", webDriver);
        Util.scrollToElement(webDriver, conditions, wait);
        conditions.click();
        waitForElement( "bayer.key", webDriver, 15 );
        
        new StructureValidator("H1tag","/com/bayer/marketing/consumerHealth/claritin/tests/SiteWideTests/legal/PrivacyPageValidation.xml");
        new StructureValidator("H2tag","/com/bayer/marketing/consumerHealth/claritin/tests/SiteWideTests/legal/PrivacyPageValidation.xml");
        new StructureValidator("Paragraphs","/com/bayer/marketing/consumerHealth/claritin/tests/SiteWideTests/legal/PrivacyPageValidation.xml");
        new StructureValidator("CookiesTableData","/com/bayer/marketing/consumerHealth/claritin/tests/SiteWideTests/legal/PrivacyPageValidation.xml");
    	
             
        
        return true;
        
    }

}
