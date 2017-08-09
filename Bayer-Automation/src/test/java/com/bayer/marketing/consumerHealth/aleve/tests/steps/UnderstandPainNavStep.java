package com.bayer.marketing.consumerHealth.aleve.tests.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.aleve.tests.FAQNavRun;
import com.bayer.test.step.AbstractStep;

public class UnderstandPainNavStep extends AbstractStep
{

    public UnderstandPainNavStep()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	waitForElement( "aleve.understand.arthritis", webDriver, 15 );
    	BayerWebElement arthritis = getElement( "aleve.understand.arthritis", webDriver );
    	arthritis.click();
    	
    	webDriver.executeScript("window.history.go(-1)");
       
        BayerWebElement back = getElement( "aleve.understand.back", webDriver );
        back.click();
       
        webDriver.executeScript("window.history.go(-1)");
        
        BayerWebElement knee = getElement( "aleve.understand.knee", webDriver );
        knee.click();
        
        webDriver.executeScript("window.history.go(-1)");
        
        BayerWebElement headache = getElement( "aleve.understand.headache", webDriver );
        headache.click();
        
        webDriver.executeScript("window.history.go(-1)");
        
        BayerWebElement shoulder = getElement( "aleve.understand.shoulder", webDriver );
        shoulder.click();
        
        webDriver.executeScript("window.history.go(-1)");
        
        BayerWebElement sinus = getElement( "aleve.understand.sinus", webDriver );
        sinus.click();
        
        
         
        
        return true;
    }

}
