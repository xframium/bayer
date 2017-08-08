package com.bayer.marketing.consumerHealth.aleve.tests;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.steps.FAQNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class FAQNavRun extends AbstractTest
{
   
    @TestDescriptor( testName="Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void structureTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com/faq/" ), new FAQNavStep() } );
    }
    
}


// push test 5