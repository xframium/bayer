package com.bayer.test.betaseron;

import org.testng.annotations.Test;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.bayer.test.step.spi.authentication.Login;
import com.bayer.test.step.spi.common.Navigate;
import com.bayer.test.step.spi.common.utility.StructureValidator;

public class HomePage2 extends AbstractTest
{
    @TestDescriptor( testName="Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://betaseron.com" ) } );
    }
    
    @TestDescriptor( testName="Structure Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/important-safety-information/" ), new StructureValidator( "ISI" ) } );
    }
    
    @TestDescriptor( testName="Field Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void fieldTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/registration/" ), new Login() } );
    }

}
