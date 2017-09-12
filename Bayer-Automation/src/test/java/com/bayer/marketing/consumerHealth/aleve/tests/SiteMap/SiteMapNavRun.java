package com.bayer.marketing.consumerHealth.aleve.tests.SiteMap;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps.SiteMapAleveAndPMAndPMD;
import com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps.SiteMapDirectTherapyAndContactUs;
import com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps.SiteMapFaqAndSaveNavStep;
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
	
	@TestDescriptor( testName="Site Map FAQ,save and celebrate strength Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void faqAndSaveNavTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.aleve.com/site-map/" ), new SiteMapFaqAndSaveNavStep() } );
    }
	
	@TestDescriptor( testName="Site Map Aleve,Aleve PM and Aleve PM-D Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void alevePMandPMDNavTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.aleve.com/site-map/" ), new SiteMapAleveAndPMAndPMD() } );
    }
	
	@TestDescriptor( testName="Site Map Direct Therapy and Contact Us Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void aleveDirectTherapyAndContactUsNavTest( DeviceContainer dC )
    {
    	executeSteps( new Step[] { new Navigate( "https://www.aleve.com/site-map/" ), new SiteMapDirectTherapyAndContactUs() } );
    }
    
}

