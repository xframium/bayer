package com.bayer.marketing.consumerHealth.aleve.tests.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.aleve.tests.Products.AleveCapletsPage;
import com.bayer.test.step.AbstractStep;

public class AleveCapletsSteps extends AbstractStep
{

    public AleveCapletsSteps()
    {
        super( "message", "error message" );
    }
    
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
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
        
        
        return true;
    }

}
