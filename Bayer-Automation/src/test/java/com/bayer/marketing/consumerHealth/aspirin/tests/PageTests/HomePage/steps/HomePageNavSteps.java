package com.bayer.marketing.consumerHealth.aspirin.tests.HomePage.steps;


import java.awt.Dialog.ModalExclusionType;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class HomePageNavSteps extends AbstractStep  {
	
	//protected String url = "https://www.petbasics.com/";
    public HomePageNavSteps() {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	HomePage urlVar = new HomePage();
    	String url = urlVar.getUrl();
    	System.out.println(url);
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
        
    	waitForElement( "bayer.key", webDriver, 15 );
    	
    	/* Check for pop-up window
    	 BayerWebElement cookiesPopup = getElement("bayer.cookiesVisible", webDriver);
        if(cookiesPopup.isDisplayed()){
        	BayerWebElement cookiesConf = getElement("bayer.cookiesConfirm", webDriver);
        	cookiesConf.click();
        }
        */
        
        
    	waitForElement( "bayer.conditions", webDriver, 15 );
        BayerWebElement conditions = getElement("bayer.conditions", webDriver);
        Util.scrollToElement(webDriver, conditions, wait);
        conditions.click();
        waitForElement( "bayer.key", webDriver, 15 );
        
        new StructureValidator("Conditions", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
    	
    	
        
        
        return true;
    }

}
