package com.bayer.marketing.consumerHealth.aleve.tests;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.steps.FAQNavStep;
import com.bayer.marketing.consumerHealth.aleve.tests.steps.FAQNavStepMobile;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class FAQNavRunMobile extends AbstractTest
{
   
    @TestDescriptor( testName="FAQ Mobile Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void faqTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com/faq/" ), new FAQNavStepMobile() } );
    }
    
}

