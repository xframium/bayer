package com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectSys.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

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
        	
        	menu.click();        	

        	BayerWebElement tab3caret = getElement( "betaseron.mobile.menu.tab3.caret", webDriver );
            tab3caret.click();
            
            BayerWebElement app = getElement( "betaseron.mobile.menu.tab3.caret.drop2", webDriver );
            app.click();        	

	}       
         
        return true;
    }

}