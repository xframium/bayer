package com.bayer.marketing.consumerHealth.betaseron.tests.WhyBetaseron;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.WhyBetaseron.steps.WhyBetaseronNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class WhyBetaseronNavRun extends AbstractTest
{
   
    @TestDescriptor( testName="WhyBetaseron Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void whyBetaseronTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/why-betaseron/" ), new WhyBetaseronNavStep() } );
    }
    
    @TestDescriptor( testName="Why Betaseron Structure Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void whyBetaseronStructureTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new TimedNavigate( "https://www.betaseron.com/why-betaseron/", 3000 ), 
        						   new StructureValidator( "ISI" ), 
        						   new StructureValidator("Text Verification") } );
    }
}

