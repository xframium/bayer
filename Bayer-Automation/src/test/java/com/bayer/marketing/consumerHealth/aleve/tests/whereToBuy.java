package com.bayer.marketing.consumerHealth.aleve.tests;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.steps.couponStep;
import com.bayer.marketing.consumerHealth.aleve.tests.steps.whereToBuyStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class whereToBuy extends AbstractTest
{
   
   
    @TestDescriptor( testName="WTB Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void wtbTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com/" ), new whereToBuyStep() } );
    }
    
}

