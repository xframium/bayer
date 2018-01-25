package com.bayer.marketing.consumerHealth.claritin.tests.FAQ;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.FAQ.steps.FAQNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class FAQNavRun extends AbstractTest
{
   private String url = "https://www.claritin.com/";
   
    @TestDescriptor( testName="FAQ Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void faqTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.claritin.com/faq/" ), new FAQNavStep() } );
    }
    @TestDescriptor ( testName = "Claritin Link Checker Test")
    @Test ( dataProvider = "deviceList", enabled = true)
    public void gdprLinkChecker( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate(url), new LinkValidator(url, -1) } );
    }
}