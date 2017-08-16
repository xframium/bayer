package com.bayer.marketing.consumerHealth.betaseron.tests;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class HomePage extends AbstractTest
{
    @TestDescriptor( testName="Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/" ) } );
    }
    
    @TestDescriptor( testName="Structure Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC )
    {
       executeSteps( new Step[] { new TimedNavigate( "https://www.betaseron.com/important-safety-information/" ), new StructureValidator( "ISI" ) } );
    }
    
}

