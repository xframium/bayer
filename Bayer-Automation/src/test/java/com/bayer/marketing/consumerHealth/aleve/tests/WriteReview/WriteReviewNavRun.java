package com.bayer.marketing.consumerHealth.aleve.tests.WriteReview;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.marketing.consumerHealth.aleve.tests.WriteReview.steps.WriteReviewNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class WriteReviewNavRun extends AbstractTest
{
   
	@TestDescriptor( testName="Write Review Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void writeReviewNavTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.aleve.com/aleve-pm/" ), new WriteReviewNavStep() } );
    }
    
}

