package com.bayer.marketing.consumerHealth.aleve.tests;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aleve.tests.steps.saveStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
<<<<<<< HEAD
import org.openqa.selenium.internal.WrapsElement;
=======

>>>>>>> branch 'master' of https://github.com/xframium/bayer.git
public class Save extends AbstractTest
{
   
   
    @TestDescriptor( testName="Coupon Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void couponTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate("https://www.aleve.com/save/coupon.php"), new saveStep() } );
    }
    
}
