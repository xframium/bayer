package com.bayer.marketing.consumerHealth.claritin.tests.Pollen;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.claritin.tests.Pollen.steps.PollenStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class PollenRun extends AbstractTest
{
   private String url = "https://www.claritin.com/";
   
    @TestDescriptor( testName="Pollen Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void pollenTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.claritin.com/" ), new PollenStep() } );
    }
    //@TestDescriptor ( testName = "Claritin Link Checker Test")
    //@Test ( dataProvider = "deviceList", enabled = true)
    //public void gdprLinkChecker( DeviceContainer dC )
    //{
    //    executeSteps( new Step[] { new Navigate(url), new LinkValidator(url, -1) } );
    //}
}