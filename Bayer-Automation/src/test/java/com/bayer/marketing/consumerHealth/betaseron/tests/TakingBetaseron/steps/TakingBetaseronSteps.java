package com.bayer.marketing.consumerHealth.betaseron.tests.TakingBetaseron.steps;

import javax.print.CancelablePrintJob;

import org.eclipse.jetty.client.ContinueProtocolHandler;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
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
    	waitForElement( "betaseron.home.betaAppVid", webDriver, 15 );
    	BayerWebElement vid = getElement( "betaseron.home.betaAppVid", webDriver );
    	vid.click();
    	
    	waitForElement( "betaseron.home.betaAppVid", webDriver, 15 );
    	BayerWebElement vid = getElement( "betaseron.home.betaAppVid", webDriver );
    	vid.click();
    	
    	
    	waitForElement( "betaseron.taking.appleApp", webDriver, 15 );
    	BayerWebElement apple = getElement( "betaseron.taking.appleApp", webDriver );
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
        
        
        
        return true;
    }

}
