package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.legal;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.legal.steps.CaliforniaTransparency;
import com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.legal.steps.PrivacyPolicy;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class PrivacyPage extends AbstractTest {
	
public String url = "http://colin:Bayer123@03342-claritin-qa.photoninfotech.com:8081";
    
	public String getUrl(){ 
		return url;
	}
    @TestDescriptor( testName="CaliforniaTransparency Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void californiaTransparencyTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new CaliforniaTransparency() } );
    }
    
    @TestDescriptor( testName="Privacy Policy Validation" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void privacyPolicyTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy() } );
    }
    
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5