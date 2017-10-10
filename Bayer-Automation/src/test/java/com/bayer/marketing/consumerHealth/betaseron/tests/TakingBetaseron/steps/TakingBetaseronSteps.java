package com.bayer.marketing.consumerHealth.betaseron.tests.TakingBetaseron.steps;

import javax.print.CancelablePrintJob;

import org.eclipse.jetty.client.ContinueProtocolHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class TakingBetaseronSteps extends AbstractStep
{

    public TakingBetaseronSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	
    	String takingBetaseronUrl = webDriver.getCurrentUrl();
    	WebDriverWait wait = new WebDriverWait(webDriver, 30);
    	/*
    	BayerWebElement mobile = getElement( "betaseron.mobile.menu", webDriver );
    	if(mobile.isDisplayed()==false){
    		
    		waitForElement( "betaseron.taking.desktopApp", webDriver, 15 );
        	BayerWebElement desktopApp = getElement( "betaseron.taking.desktopApp", webDriver );
        	Util.scrollToElement(webDriver, desktopApp, wait );
        	desktopApp.click();
        	
        	Util.recallBaseURL(webDriver, takingBetaseronUrl);
 
    		
    	}
    	*/
    	
    	waitForElement( "betaseron.home.betaAppVid", webDriver, 15 );
    	BayerWebElement vid = getElement( "betaseron.home.betaAppVid", webDriver );
    	vid.click();
    	
    	waitForElement( "betaseron.taking.videoClose", webDriver, 15 );
    	BayerWebElement videoClose = getElement( "betaseron.taking.videoClose", webDriver );
    	videoClose.click();
    	
    	
    	waitForElement( "betaseron.taking.appleApp", webDriver, 15 );
    	BayerWebElement apple = getElement( "betaseron.taking.appleApp", webDriver );
    	Util.scrollToElement(webDriver, apple, wait );
    	apple.click();
    	
    	waitForElement( "betaseron.taking.cancel", webDriver, 15 );
    	BayerWebElement cancel = getElement( "betaseron.taking.cancel", webDriver );
    	cancel.click();
   
    	waitForElement( "betaseron.taking.androidApp", webDriver, 15 );
    	BayerWebElement android = getElement( "betaseron.taking.androidApp", webDriver );
    	android.click();
    	
    	waitForElement( "betaseron.taking.continue", webDriver, 15 );
    	BayerWebElement continueButton = getElement( "betaseron.taking.continue", webDriver );
        continueButton.click(); 
        Util.recallBaseURL(webDriver, takingBetaseronUrl);
        
      	waitForElement( "betaseron.taking.signUp1", webDriver, 15 );
    	BayerWebElement signUp1 = getElement( "betaseron.taking.signUp1", webDriver );
    	Util.scrollToElement(webDriver, signUp1, wait );
    	signUp1.click();         
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
      	waitForElement( "betaseron.taking.learnMore", webDriver, 15 );
    	BayerWebElement learnMore = getElement( "betaseron.taking.learnMore", webDriver );
    	Util.scrollToElement(webDriver, learnMore, wait );
    	learnMore.click();     
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	waitForElement( "betaseron.taking.register", webDriver, 15 );
    	BayerWebElement register = getElement( "betaseron.taking.register", webDriver );
    	Util.scrollToElement(webDriver, register, wait );
    	register.click();    
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	waitForElement( "betaseron.taking.signUp2", webDriver, 15 );
    	BayerWebElement signUp2 = getElement( "betaseron.taking.signUp2", webDriver );
    	Util.scrollToElement(webDriver, signUp2, wait );
    	signUp2.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
        
    	waitForElement( "betaseron.taking.PI", webDriver, 15 );
    	BayerWebElement PI = getElement( "betaseron.taking.PI", webDriver );
    	Util.scrollToElement(webDriver, PI, wait );
    	PI.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	waitForElement( "betaseron.taking.IFU", webDriver, 15 );
    	BayerWebElement IFU = getElement( "betaseron.taking.IFU", webDriver );
    	Util.scrollToElement(webDriver, IFU, wait );
    	IFU.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	waitForElement( "betaseron.taking.IFU2", webDriver, 15 );
    	BayerWebElement IFU2 = getElement( "betaseron.taking.IFU2", webDriver );
    	Util.scrollToElement(webDriver, IFU2, wait );
    	IFU2.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	waitForElement( "betaseron.taking.discussionGuide", webDriver, 15 );
    	BayerWebElement discussionGuide = getElement( "betaseron.taking.discussionGuide", webDriver );
    	Util.scrollToElement(webDriver, discussionGuide, wait );
    	discussionGuide.click();      
    	Util.recallBaseURL(webDriver, takingBetaseronUrl);
    	
    	
        return true;
    }

}
