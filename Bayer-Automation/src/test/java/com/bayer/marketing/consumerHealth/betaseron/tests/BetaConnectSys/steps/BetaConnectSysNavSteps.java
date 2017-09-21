package com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectSys.steps;

import org.openqa.selenium.WebElement;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.gargoylesoftware.htmlunit.WebClient;

public class BetaConnectSysNavSteps extends AbstractStep
{

    public BetaConnectSysNavSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	waitForElement( "betaseron.mobile.menu", webDriver, 15 );
    	BayerWebElement menu = getElement( "betaseron.mobile.menu", webDriver );

	if(menu.isDisplayed()){
		
		//WebElement w1 = webDriver.findElementByXPath ( "//*[@resource-id='com.android.chrome:id/menu_button']");
		//w1.click();
		
		//WebElement w2 = webDriver.findElementByXPath( "//*[@content-desc='Settings']");
        //w2.click();
        
		//WebElement w3 = webDriver.findElementByXPath( "//*[@text='Site settings']");
        //w3.click();
        
		//WebElement w4 = webDriver.findElementByXPath( "//*[@text='Pop-ups']");
        //w4.click();
        
        	menu.click();        	

        	BayerWebElement tab3caret = getElement( "betaseron.mobile.menu.tab3.caret", webDriver );
            tab3caret.click();
            
            BayerWebElement app = getElement( "betaseron.mobile.menu.tab3.caret.drop2", webDriver );
            app.click();
            
    		WebElement openvid = webDriver.findElementByXPath( "//*[text()='Watch it in action ']");
            openvid.click();
    		WebElement closevid = webDriver.findElementByXPath( "//*[@class='close']/span");
            closevid.click();
            
            
          

	}       
         
        return true;
    }

}