package com.bayer.marketing.consumerHealth.aleve.tests.SocialMedia;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.FAQ.steps.FAQNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class SocialMediaNavRun extends AbstractTest
{
   
    @TestDescriptor( testName="FAQ Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void faqTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com/faq/" ), new FAQNavStep() } );
    }
    
}

