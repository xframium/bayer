package com.bayer.test.step.spi.claritin.search;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class Search extends AbstractStep
{
    public Search()
    {
        super( "Search the application for c-d", "Failed to Search the application for c-d" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        waitForElement( "claritin.home.searchBox", webDriver, 15 );
        BayerWebElement emailAddress = getElement( "claritin.home.searchBox", webDriver );
        emailAddress.sendKeys( "claritin-d" );
        
        
        
        
        
        
        
        return true;
    }

}
