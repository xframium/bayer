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
        
    	waitForElement( "claritin.home.pollenArrow", webDriver, 15 );
    	BayerWebElement pollenArrow = getElement( "claritin.home.pollenArrow", webDriver );
    	
    	if(pollenArrow.isDisplayed()){
    		//Mobile and desktop Test
           
            BayerWebElement launch = getElement( "claritin.home.pollenArrow", webDriver );
            launch.click();
            
            BayerWebElement claritin = getElement( "claritin.faq.content.claritin", webDriver );
            claritin.click();
            
            BayerWebElement claritind = getElement( "claritin.faq.content.claritind", webDriver );
            claritind.click(); 
            
            BayerWebElement children = getElement( "claritin.faq.content.children", webDriver );
            children.click();
    		
    	}
        
        return true;
    }

}
