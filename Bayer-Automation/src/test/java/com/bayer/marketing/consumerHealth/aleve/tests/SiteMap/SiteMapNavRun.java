package com.bayer.marketing.consumerHealth.aleve.tests.SiteMap;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps.SiteMapLiveWellNavStep;
import com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps.SiteMapUnderstandPainNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class SiteMapNavRun extends AbstractTest
{
   
	@TestDescriptor( testName="Site Map Live Well Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void liveWellNavTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.aleve.com/site-map/" ), new SiteMapLiveWellNavStep() } );
    }
	
	@TestDescriptor( testName="Site Map Understand pain Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void understandPainNavTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.aleve.com/site-map/" ), new SiteMapUnderstandPainNavStep() } );
    }
    
}

