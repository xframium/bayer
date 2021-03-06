package com.bayer.marketing.consumerHealth.aleve.tests.Contact.steps;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class contactUsComplimentStep extends AbstractStep
{

    public contactUsComplimentStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	waitForElement( "aleve.contact.generalInquiry", webDriver, 15 );
        BayerWebElement generalInquiry = getElement( "aleve.contact.compliment", webDriver );
        generalInquiry.click();
       
        BayerWebElement continueButton = getElement( "aleve.contact.continue", webDriver );
        continueButton.click();
       
        BayerWebElement ageCheck = getElement( "aleve.contact.form.ageCheck", webDriver );
        ageCheck.click();
        
        BayerWebElement fname = getElement( "aleve.contact.form.fname", webDriver );
        fname.sendKeys("Michael");
        
        BayerWebElement lname = getElement( "aleve.contact.form.lname", webDriver );
        lname.sendKeys("O'Handley");
        
        BayerWebElement mail = getElement( "aleve.contact.form.mail", webDriver );
        mail.sendKeys("test@test.com");
        
        BayerWebElement cmail = getElement( "aleve.contact.form.cmail", webDriver );
        cmail.sendKeys("test@test.com");
        
        BayerWebElement address1 = getElement( "aleve.contact.form.address1", webDriver );
        address1.sendKeys("111 Waterview Blvd");
        
        BayerWebElement city = getElement( "aleve.contact.form.city", webDriver );
        city.sendKeys("Parsippany");
        
        BayerWebElement nj = getElement( "aleve.contact.form.nj", webDriver );
        nj.click();
        
        BayerWebElement zip = getElement( "aleve.contact.form.zip", webDriver );
        zip.sendKeys("07054");
        
        BayerWebElement phone = getElement( "aleve.contact.form.phone", webDriver );
        phone.sendKeys("862 404 6034");
        
        BayerWebElement comm = getElement( "aleve.contact.form.comm", webDriver );
        comm.sendKeys("Test Compliment.If anyone reads this sorry about all the tests.");

        BayerWebElement submit = getElement( "aleve.contact.form.submit", webDriver );
        submit.click();
        
       // waitForElement( "aleve.contact.form.verify", webDriver, 15 );
        
        
        
        return true;
    }

}
