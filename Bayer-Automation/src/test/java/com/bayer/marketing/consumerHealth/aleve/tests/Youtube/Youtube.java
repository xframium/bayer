package com.bayer.marketing.consumerHealth.aleve.tests.Youtube;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.marketing.consumerHealth.aleve.tests.Youtube.steps.YoutubeNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class Youtube extends AbstractTest
{
   
    @TestDescriptor( testName="Youtube Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void youTubeTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.betaseron.com" ), new YoutubeNavStep() } );
    }
    
}

