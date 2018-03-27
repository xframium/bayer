package com.bayer.marketing.consumerHealth.claritin.tests.Pollen.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class PollenStep extends AbstractStep
{

    public PollenStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        
    	waitForElement( "claritin.pollenArrow", webDriver, 15 );
    	BayerWebElement pollenArrow = getElement( "claritin.pollenArrow", webDriver );
    	
    	if(pollenArrow.isDisplayed()){
    		//Mobile and desktop Test
           
            BayerWebElement launch = getElement( "claritin.pollenArrow", webDriver );
            launch.click();
            
            BayerWebElement zipsearch = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch.click();
            
            BayerWebElement zipinsert = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert.click(); 
            
            BayerWebElement find = getElement( "claritin.pollenModalZipBtn", webDriver );
            find.click();
            
            BayerWebElement close = getElement( "claritin.pollenModalClose", webDriver );
            close.click();
    		
    	}
        
        return true;
    }

}
