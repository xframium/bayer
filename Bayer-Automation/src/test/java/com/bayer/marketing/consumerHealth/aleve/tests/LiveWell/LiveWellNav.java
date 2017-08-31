package com.bayer.marketing.consumerHealth.aleve.tests.LiveWell;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.LiveWell.steps.LiveWellNavStep;
import com.bayer.marketing.consumerHealth.aleve.tests.UnderstandPain.steps.UnderstandPainNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class LiveWellNav extends AbstractTest
{
   
    @TestDescriptor( testName="Nav Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com/understand-pain/" ), new LiveWellNavStep() } );
    
    }
    
}

