package com.bayer.marketing.consumerHealth.claritin.tests.FAQ.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class FAQNavStep extends AbstractStep
{

    public FAQNavStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        
    	waitForElement( "claritin.faq.multiAccordion", webDriver, 15 );
    	BayerWebElement multiAccordion = getElement( "claritin.faq.multiAccordion", webDriver );
    	
    	if(multiAccordion.isDisplayed()){
    		//Mobile Test
           
            BayerWebElement general = getElement( "claritin.faq.aLevel1.general", webDriver );
            general.click();
            
            BayerWebElement claritin = getElement( "claritin.faq.content.claritin", webDriver );
            claritin.click();
            
            BayerWebElement claritind = getElement( "claritin.faq.content.claritind", webDriver );
            claritind.click(); 
            
            BayerWebElement children = getElement( "claritin.faq.content.children", webDriver );
            children.click();
    		
    	}else{ 
    	
    	//Desktop Test	
       
        BayerWebElement general = getElement( "claritin.link.faq", webDriver );
        general.click();
       
        BayerWebElement ingredients = getElement( "claritin.faq.link.ingredients", webDriver );
        ingredients.click();
        
        BayerWebElement claritin = getElement( "claritin.faq.link.claritin", webDriver );
        claritin.click();
        
        BayerWebElement claritind = getElement( "claritin.faq.link.claritind", webDriver );
        claritind.click();

    	}
        
        return true;
    }

}
