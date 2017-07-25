package com.bayer.common;

import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.test.step.factory.Step;

public class Navigate extends AbstractStep implements Step
{
    private String url;
    public Navigate ( String url )
    {
        super( "Navigate to the url: " + url, "Failed to navigate to: " + url );
        this.url = url;
    }
    
    @Override 
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        webDriver.get( url );
        return true;
    }

}
