package com.bayer.marketing.consumerHealth.aleve.tests.CelebrateStrength.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class celebrateStrengthStep extends AbstractStep
{

    public celebrateStrengthStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        waitForElement( "aleve.strength.walkVid", webDriver, 15 );
        BayerWebElement walkVid = getElement( "aleve.strength.walkVid", webDriver );
        walkVid.click();
        
        waitForElement( "aleve.strength.closeVid", webDriver, 15 );
        BayerWebElement closeVid = getElement( "aleve.strength.closeVid", webDriver );
        closeVid.click();
     
       BayerWebElement kelleyVid = getElement( "aleve.strength.kelleyVid", webDriver );
       kelleyVid.click();
        
       waitForElement( "aleve.strength.closeVid", webDriver, 15 );
       closeVid.click();
       
       waitForElement( "aleve.strength.learn", webDriver, 15 );
       BayerWebElement learn = getElement( "aleve.strength.learn", webDriver );
       learn.click();
       
       waitForElement( "aleve.strength.continue", webDriver, 15 );
       BayerWebElement continues = getElement( "aleve.strength.continue", webDriver );
       continues.click();
       
       
       
        return true;
        
    }

}
