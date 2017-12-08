package com.bayer.marketing.consumerHealth.aspirin.tests.Cart.steps;


import java.awt.Dialog.ModalExclusionType;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class CartTestSteps extends AbstractStep  {
	
    public CartTestSteps() {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	HomePage urlVar = new HomePage();
    	String url = urlVar.getUrl();
    	System.out.println(url);
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
        waitForElement( "aspirin.key", webDriver, 15 );
    	
    	/* Check for pop-up window
    	 BayerWebElement cookiesPopup = getElement("bayer.cookiesVisible", webDriver);
        if(cookiesPopup.isDisplayed()){
        	BayerWebElement cookiesConf = getElement("bayer.cookiesConfirm", webDriver);
        	cookiesConf.click();
        }
        */
        
        
    	waitForElement( "aspirin.home.button", webDriver, 15 );
        BayerWebElement home = getElement("aspirin.home.button", webDriver);
        Util.scrollToElement(webDriver, home, wait);
        home.click();
        waitForElement( "aspirin.key", webDriver, 15 );
        webDriver.navigate().to(url);
        //new StructureValidator("Conditions", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
    	
        return true;
    }

}
