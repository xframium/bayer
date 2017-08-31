package com.bayer.marketing.consumerHealth.aleve.tests.LiveWell.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class LiveWellNavStep extends AbstractStep
{

    public LiveWellNavStep()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	waitForElement( "aleve.understand.arthritis", webDriver, 15 );
    	BayerWebElement arthritis = getElement( "aleve.understand.arthritis", webDriver );
    	arthritis.click();
    	
    	waitForElement( "aleve.test", webDriver, 15 );
    	
    	webDriver.navigate().to("https://www.aleve.com/understand-pain/");
       
    	waitForElement( "aleve.understand.arthritis", webDriver, 15 );
        BayerWebElement back = getElement( "aleve.understand.back", webDriver );
        back.click();
     
        waitForElement( "aleve.test", webDriver, 15 );
    	webDriver.navigate().to("https://www.aleve.com/understand-pain/");
        
    	waitForElement( "aleve.understand.arthritis", webDriver, 15 );
        BayerWebElement knee = getElement( "aleve.understand.knee", webDriver );
        knee.click();
        
        waitForElement( "aleve.test", webDriver, 15 );
        webDriver.navigate().to("https://www.aleve.com/understand-pain/");
        
        waitForElement( "aleve.understand.arthritis", webDriver, 15 );
        BayerWebElement headache = getElement( "aleve.understand.headache", webDriver );
        headache.click();
        
        waitForElement( "aleve.test", webDriver, 15 );
        webDriver.navigate().to("https://www.aleve.com/understand-pain/");
        
        waitForElement( "aleve.understand.arthritis", webDriver, 15 );
        BayerWebElement shoulder = getElement( "aleve.understand.shoulder", webDriver );
        shoulder.click();
        
        waitForElement( "aleve.test", webDriver, 15 );
        webDriver.navigate().to("https://www.aleve.com/understand-pain/");
        
        waitForElement( "aleve.understand.arthritis", webDriver, 15 );
        BayerWebElement sinus = getElement( "aleve.understand.sinus", webDriver );
        sinus.click();
        
        waitForElement( "aleve.test", webDriver, 15 );
        
         
        
        return true;
    }

}
