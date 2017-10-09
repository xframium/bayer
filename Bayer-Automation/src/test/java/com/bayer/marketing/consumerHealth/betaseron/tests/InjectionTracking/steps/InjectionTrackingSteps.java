package com.bayer.marketing.consumerHealth.betaseron.tests.InjectionTracking.steps;

import javax.print.CancelablePrintJob;

import org.eclipse.jetty.client.ContinueProtocolHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class InjectionTrackingSteps extends AbstractStep
{

    public InjectionTrackingSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	
    	String injectionTrainingURL = webDriver.getCurrentUrl();
    	WebDriverWait wait = new WebDriverWait(webDriver, 30);
    	
    	waitForElement( "betaseron.injectionSteps.chapter1", webDriver, 15 );
    	BayerWebElement chapter1 = getElement( "betaseron.injectionSteps.chapter1", webDriver );
    	Util.scrollToElement(webDriver, chapter1, wait );
    	chapter1.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter2", webDriver, 15 );
    	BayerWebElement chapter2 = getElement( "betaseron.injectionSteps.chapter2", webDriver );
    	Util.scrollToElement(webDriver, chapter2, wait );
    	chapter2.click();

    	waitForElement( "betaseron.injectionSteps.chapter3", webDriver, 15 );
    	BayerWebElement chapter3 = getElement( "betaseron.injectionSteps.chapter3", webDriver );
    	Util.scrollToElement(webDriver, chapter3, wait );
    	chapter3.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter31", webDriver, 15 );
    	BayerWebElement chapter31 = getElement( "betaseron.injectionSteps.chapter31", webDriver );
    	Util.scrollToElement(webDriver, chapter31, wait );
    	chapter31.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter32", webDriver, 15 );
    	BayerWebElement chapter32 = getElement( "betaseron.injectionSteps.chapter32", webDriver );
    	Util.scrollToElement(webDriver, chapter32, wait );
    	chapter32.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter33", webDriver, 15 );
    	BayerWebElement chapter33 = getElement( "betaseron.injectionSteps.chapter33", webDriver );
    	Util.scrollToElement(webDriver, chapter33, wait );
    	chapter33.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter34", webDriver, 15 );
    	BayerWebElement chapter34 = getElement( "betaseron.injectionSteps.chapter34", webDriver );
    	Util.scrollToElement(webDriver, chapter34, wait );
    	chapter34.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter35", webDriver, 15 );
    	BayerWebElement chapter35 = getElement( "betaseron.injectionSteps.chapter35", webDriver );
    	Util.scrollToElement(webDriver, chapter35, wait );
    	chapter35.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter36", webDriver, 15 );
    	BayerWebElement chapter36 = getElement( "betaseron.injectionSteps.chapter36", webDriver );
    	Util.scrollToElement(webDriver, chapter36, wait );
    	chapter36.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter4", webDriver, 15 );
    	BayerWebElement chapter4 = getElement( "betaseron.injectionSteps.chapter4", webDriver );
    	Util.scrollToElement(webDriver, chapter4, wait );
    	chapter4.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter5", webDriver, 15 );
    	BayerWebElement chapter5 = getElement( "betaseron.injectionSteps.chapter5", webDriver );
    	Util.scrollToElement(webDriver, chapter5, wait );
    	chapter5.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter6", webDriver, 15 );
    	BayerWebElement chapter6 = getElement( "betaseron.injectionSteps.chapter6", webDriver );
    	Util.scrollToElement(webDriver, chapter6, wait );
    	chapter6.click();
    	
    	waitForElement( "betaseron.injectionSteps.chapter7", webDriver, 15 );
    	BayerWebElement chapter7 = getElement( "betaseron.injectionSteps.chapter7", webDriver );
    	Util.scrollToElement(webDriver, chapter7, wait );
    	chapter7.click();
    	
    	
    	waitForElement( "betaseron.injectionSteps.register", webDriver, 15 );
    	BayerWebElement register = getElement( "betaseron.injectionSteps.register", webDriver );
    	Util.scrollToElement(webDriver, register, wait );
    	register.click();
    	Util.recallBaseURL(webDriver, injectionTrainingURL);
    	
  	
        return true;
    }

}
