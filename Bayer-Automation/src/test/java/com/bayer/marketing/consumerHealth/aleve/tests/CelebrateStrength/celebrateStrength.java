package com.bayer.marketing.consumerHealth.aleve.tests.CelebrateStrength;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.CelebrateStrength.steps.celebrateStrengthStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class celebrateStrength extends AbstractTest
{
    @TestDescriptor( testName="Celebrate Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void CelebrateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.aleve.com/celebrate-strength/" ), new celebrateStrengthStep() } );
    }
    

}
