package com.bayer.marketing.consumerHealth.claritin.tests.Coupons;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.marketing.consumerHealth.aleve.tests.Save.steps.saveStep;
import com.bayer.marketing.consumerHealth.claritin.tests.Coupons.steps.couponsStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import org.openqa.selenium.internal.WrapsElement;

public class CouponsNav extends AbstractTest
{
   
   
    @TestDescriptor( testName="Claritin Coupon Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void couponTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate("https://www.claritin.com/coupons/"), new couponsStep() } );
    }
    
}

