package com.bayer.marketing.consumerHealth.aleve.tests.WriteReview.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class WriteReviewNavStep extends AbstractStep
{

    public WriteReviewNavStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	    	
    	waitForElement( "aleve.writereview.button", webDriver, 15 );
    	BayerWebElement writereviewbutton = getElement( "aleve.writereview.button", webDriver );
    	writereviewbutton.click();
    	
    	waitForElement( "aleve.writereview.text", webDriver, 15 );
    	
    	waitForElement( "aleve.writereview.close", webDriver, 	15 );
    	BayerWebElement closebutton = getElement( "aleve.writereview.close", webDriver );
    	closebutton.click();
    	
    	waitForElement( "aleve.click.staricons", webDriver, 15 );
    	BayerWebElement scrolldown = getElement( "aleve.click.staricons", webDriver );
    	scrolldown.click();
    	
    	waitForElement( "aleve.check.reviews", webDriver, 15 );
    	
    	return true;
    }

}
