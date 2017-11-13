package com.bayer.MobileApps.CrowdCompass.tests.CrowdCompass;

import com.bayer.exampleTemplate.tests.Example.steps.ExampleStep;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class CrowdCompass extends AbstractTest {
	
    @TestDescriptor( testName="Example Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.bayer.com/" ), new ExampleStep() } );
    }
    
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate( "https://www.bayer.com/", 6000) } );
    }
    
    
}

// push test 5