package com.bayer.marketing.consumerHealth.aleve.tests.SocialMedia.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class SocialMediaNavStep extends AbstractStep
{

    public SocialMediaNavStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	waitForElement( "aleve.mobile.wtb.menu", webDriver, 15 );
    	BayerWebElement menutext = getElement( "aleve.mobile.wtb.menu", webDriver );
    	menutext.click();
    	
    	waitForElement( "aleve.socialmedia.facebook", webDriver, 15 );
    	BayerWebElement facebookicon = getElement( "aleve.socialmedia.facebook", webDriver );
    	facebookicon.click();
    	
    	waitForElement( "aleve.socialmedia.facebook.externalContinue", webDriver, 15 );
    	BayerWebElement externalContinue = getElement( "aleve.socialmedia.facebook.externalContinue", webDriver );
    	externalContinue.click();
    	
        return true;
    }

}
