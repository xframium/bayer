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
        
    	waitForElement( "claritin.faq.link.dropdown", webDriver, 15 );
    	BayerWebElement dropDown = getElement( "claritin.faq.link.dropdown", webDriver );
    	
    	if(dropDown.isDisplayed()){
    		//Mobile Test
    		
    		dropDown.click();
        	
        	BayerWebElement faq = getElement( "claritin.faq.link.faq", webDriver );
            faq.click();
           
            BayerWebElement dropDown1 = getElement( "claritin.faq.link.dropdown", webDriver );
            dropDown1.click();
            
            BayerWebElement general = getElement( "claritin.faq.link.general", webDriver );
            general.click();
            
        
            BayerWebElement dropDown2 = getElement( "claritin.faq.link.dropdown", webDriver );
            dropDown2.click();
            
            BayerWebElement claritin = getElement( "claritin.faq.link.claritin", webDriver );
            claritin.click();
            
            
            BayerWebElement dropDown3 = getElement( "claritin.faq.link.dropdown", webDriver );
            dropDown3.click();
            
            BayerWebElement claritind = getElement( "claritin.faq.link.claritind", webDriver );
            claritind.click();
            
            
            BayerWebElement dropDown4 = getElement( "claritin.faq.link.dropdown", webDriver );
            dropDown4.click();
            
            BayerWebElement children = getElement( "claritin.faq.link.children", webDriver );
            children.click();
            
            waitForElement( "claritin.faq.link.verify", webDriver, 15 );
        	BayerWebElement verify = getElement( "claritin.faq.link.verify", webDriver );
            verify.click();
            
    		
    	}else{
    	
    	//Desktop Test	
    	
    	BayerWebElement faq = getElement( "claritin.faq.link.faq", webDriver );
        faq.click();
       
        BayerWebElement general = getElement( "claritin.faq.link.general", webDriver );
        general.click();
       
        BayerWebElement ingredients = getElement( "claritin.faq.link.ingredients", webDriver );
        ingredients.click();
        
        BayerWebElement claritin = getElement( "claritin.faq.link.claritin", webDriver );
        claritin.click();
        
        BayerWebElement claritind = getElement( "claritin.faq.link.claritind", webDriver );
        claritind.click();
        
        BayerWebElement children39sclaritin = getElement( "claritin.faq.link.children39sclaritin", webDriver );
        children39sclaritin.click();

    	}
        
        return true;
    }

}
