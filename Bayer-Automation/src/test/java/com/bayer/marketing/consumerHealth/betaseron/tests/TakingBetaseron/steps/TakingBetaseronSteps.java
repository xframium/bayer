package com.bayer.marketing.consumerHealth.betaseron.tests.TakingBetaseron.steps;

import javax.print.CancelablePrintJob;

import org.eclipse.jetty.client.ContinueProtocolHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class TakingBetaseronSteps extends AbstractStep
{

    public TakingBetaseronSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	/*
    	String takingBetaseronUrl = webDriver.getCurrentUrl();
    	
    	BayerWebElement mobile = getElement( "betaseron.mobile.menu", webDriver );
    	
    	if(mobile.isDisplayed()==false){
    		
    		waitForElement( "betaseron.taking.desktopApp", webDriver, 15 );
        	BayerWebElement desktopApp = getElement( "betaseron.taking.desktopApp", webDriver );     
        	desktopApp.click();
        	Util.recallBaseURL(webDriver, takingBetaseronUrl);
 
    		
    	}
    	
    	
    	waitForElement( "betaseron.home.betaAppVid", webDriver, 15 );
    	BayerWebElement vid = getElement( "betaseron.home.betaAppVid", webDriver );
    	vid.click();
    	
    	waitForElement( "betaseron.taking.videoClose", webDriver, 15 );
    	BayerWebElement videoClose = getElement( "betaseron.taking.videoClose", webDriver );
    	videoClose.click();
    	
    	
    	waitForElement( "betaseron.taking.appleApp", webDriver, 15 );
    	BayerWebElement apple = getElement( "betaseron.taking.appleApp", webDriver );
    	apple.click();
    	
    	waitForElement( "betaseron.taking. cancel", webDriver, 15 );
    	BayerWebElement cancel = getElement( "betaseron.taking.cancel", webDriver );
    	cancel.click();
*/
    	//waitForElement( "betaseron.taking.androidApp", webDriver, 15 );
    	//BayerWebElement android = getElement( "betaseron.taking.androidApp", webDriver );
    	//android.click();
    	
    	WebElement ele = webDriver.findElementByXPath("(//*[@src='/static/media/images/now-approved-orange/google-play.png'])[1]");
    	JavascriptExecutor executor = (JavascriptExecutor)webDriver;
    	executor.executeScript("arguments[0].click();", ele);
    	
    	
    /*
    	waitForElement( "betaseron.taking.continue", webDriver, 15 );
    	BayerWebElement continueButton = getElement( "betaseron.taking.continue", webDriver );
        continueButton.click(); 
        Util.recallBaseURL(webDriver, takingBetaseronUrl);
     
      	waitForElement( "betaseron.taking.signUp1", webDriver, 15 );
    	BayerWebElement signUp1 = getElement( "betaseron.taking.signUp1", webDriver );
    	signUp1.click();         
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	    
      	waitForElement( "betaseron.taking.learnMore", webDriver, 15 );
    	BayerWebElement learnMore = getElement( "betaseron.taking.learnMore", webDriver );
    	learnMore.click();     
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	waitForElement( "betaseron.taking.register", webDriver, 15 );
    	BayerWebElement register = getElement( "betaseron.taking.register", webDriver );
    	register.click();    
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	waitForElement( "betaseron.taking.signUp2", webDriver, 15 );
    	BayerWebElement signUp2 = getElement( "betaseron.taking.signUp2", webDriver );
    	signUp2.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
         
    	waitForElement( "betaseron.taking.PI", webDriver, 15 );
    	BayerWebElement PI = getElement( "betaseron.taking.PI", webDriver );
    	PI.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    		
    	waitForElement( "betaseron.taking.IFU", webDriver, 15 );
    	BayerWebElement IFU = getElement( "betaseron.taking.IFU", webDriver );
    	IFU.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    
    	waitForElement( "betaseron.taking.IFU2", webDriver, 15 );
    	BayerWebElement IFU2 = getElement( "betaseron.taking.IFU2", webDriver );
    	IFU2.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	 
    	waitForElement( "betaseron.taking.discussionGuide", webDriver, 15 );
    	BayerWebElement discussionGuide = getElement( "betaseron.taking.discussionGuide", webDriver );
    	discussionGuide.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	
    
    	*/
    	
    	
    	
        return true;
    }

}
