package com.bayer.marketing.consumerHealth.aleve.tests.Contact;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.steps.contactUsComplimentStep;
import com.bayer.marketing.consumerHealth.aleve.tests.steps.contactUsGeneralStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class ContactUs extends AbstractTest
{
   
    @TestDescriptor( testName="Contact Us Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void faqTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com/contact-us/" ), new contactUsGeneralStep(), 
        		new Navigate( "https://www.aleve.com/contact-us/"), new contactUsComplimentStep()  } );
    }
    
}

