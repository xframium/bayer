package com.bayer.marketing.consumerHealth.aleve.tests.FAQ.steps;

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
        
    	waitForElement( "aleve.faq.link.dropdown", webDriver, 15 );
    	BayerWebElement dropDown = getElement( "aleve.faq.link.dropdown", webDriver );
    	
    	if(dropDown.isDisplayed()){
    		//Mobile Test
    		
    		dropDown.click();
        	
        	BayerWebElement faq = getElement( "aleve.faq.link.faq", webDriver );
            faq.click();
           
            BayerWebElement dropDown1 = getElement( "aleve.faq.link.dropdown", webDriver );
            dropDown1.click();
            
            BayerWebElement ingredients = getElement( "aleve.faq.link.ingredients", webDriver );
            ingredients.click();
            
        
            BayerWebElement dropDown2 = getElement( "aleve.faq.link.dropdown", webDriver );
            dropDown2.click();
            
            BayerWebElement dosage = getElement( "aleve.faq.link.dosage", webDriver );
            dosage.click();
            
            
            BayerWebElement dropDown3 = getElement( "aleve.faq.link.dropdown", webDriver );
            dropDown3.click();
            
            BayerWebElement labelandusage = getElement( "aleve.faq.link.labelandusage", webDriver );
            labelandusage.click();
            
            
            BayerWebElement dropDown4 = getElement( "aleve.faq.link.dropdown", webDriver );
            dropDown4.click();
            
            BayerWebElement packaging = getElement( "aleve.faq.link.packaging", webDriver );
            packaging.click();
            
            
            BayerWebElement dropDown5 = getElement( "aleve.faq.link.dropdown", webDriver );
            dropDown5.click();
            
            BayerWebElement alevepm = getElement( "aleve.faq.link.alevepm", webDriver );
            alevepm.click();
            
            
            BayerWebElement dropDown6 = getElement( "aleve.faq.link.dropdown", webDriver );
            dropDown6.click();
            
            BayerWebElement aleved = getElement( "aleve.faq.link.aleved", webDriver );
            aleved.click();
            
            
            BayerWebElement dropDown7 = getElement( "aleve.faq.link.dropdown", webDriver );
            dropDown7.click();
            
            BayerWebElement sinusandcold = getElement( "aleve.faq.link.sinusandcold", webDriver );
            sinusandcold.click();
            
            waitForElement( "aleve.faq.link.verify", webDriver, 15 );
        	BayerWebElement verify = getElement( "aleve.faq.link.verify", webDriver );
            verify.click();
            
    		
    	}else{
    	
    	//Desktop Test	
    	
    	BayerWebElement faq = getElement( "aleve.faq.link.faq", webDriver );
        faq.click();
       
        BayerWebElement ingredients = getElement( "aleve.faq.link.ingredients", webDriver );
        ingredients.click();
       
        BayerWebElement dosage = getElement( "aleve.faq.link.dosage", webDriver );
        dosage.click();
        
        BayerWebElement labelandusage = getElement( "aleve.faq.link.labelandusage", webDriver );
        labelandusage.click();
        
        BayerWebElement packaging = getElement( "aleve.faq.link.packaging", webDriver );
        packaging.click();
        
        BayerWebElement alevepm = getElement( "aleve.faq.link.alevepm", webDriver );
        alevepm.click();
        
        BayerWebElement aleved = getElement( "aleve.faq.link.aleved", webDriver );
        aleved.click();
        
        BayerWebElement sinusandcold = getElement( "aleve.faq.link.sinusandcold", webDriver );
        sinusandcold.click();
    	}
        
        return true;
    }

}
