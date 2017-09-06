package com.bayer.marketing.consumerHealth.aleve.tests.SocialMedia;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.marketing.consumerHealth.aleve.tests.SocialMedia.steps.SocialMediaNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class SocialMediaNavRun extends AbstractTest
{
   
	@TestDescriptor( testName="Social Media Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void socialMediaTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.aleve.com/" ), new SocialMediaNavStep() } );
    }
    
}

