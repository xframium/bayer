package com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectSys;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectSys.steps.BetaConnectSysNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class BetaConnectSys extends AbstractTest
{
   
    @TestDescriptor( testName="BetaConnectSys Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void BetaConnectSysTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/" ), new BetaConnectSysNavSteps() } );
    }
    
}