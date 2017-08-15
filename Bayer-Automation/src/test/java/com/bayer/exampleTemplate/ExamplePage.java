package com.bayer.exampleTemplate;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class ExamplePage extends AbstractTest
{
    @TestDescriptor( testName="Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.bayer.com/" ) } );
    }
    
    @TestDescriptor( testName="Structure Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void structureTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.bayer.com/" ), new StructureValidator( "ISI" ), new Navigate("https://www.aleve.com/live-well/") } );
    }
    
}

// push test 5