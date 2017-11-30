package com.bayer.marketing.consumerHealth.miralax.tests.Footer;

import com.bayer.exampleTemplate.tests.Example.steps.ExampleStep;
import com.bayer.exampleTemplate.tests.Example.steps.PrivacyPolicy;
import com.bayer.exampleTemplate.tests.Example.steps.ConditionsOfUse;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class Footer extends AbstractTest {
	
    @TestDescriptor( testName="Conditions of Use Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.bayer.com/" ), new ConditionsOfUse() } );
    }
    @TestDescriptor( testName="Privacy Policy Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void privacyPolicyTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.bayer.com/" ), new PrivacyPolicy() } );
    }
    @TestDescriptor( testName="Example Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
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