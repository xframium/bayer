package com.bayer.marketing.consumerHealth.aleve.tests.HomePage;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.HomePage.steps.HomePageNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class HomePage extends AbstractTest
{
    @TestDescriptor( testName="Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false, groups = "bayer" )
    public void navigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com/" ),new HomePageNavStep() } );
    }

    @TestDescriptor( testName="Structure Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com" ), new StructureValidator( "ISI" ), new Navigate("https://www.aleve.com/live-well/") } );
    }
    @TestDescriptor( testName="Link Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void linkTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new LinkValidator("https://www.aleve.com",-1) } );
    }
}

// push test 6