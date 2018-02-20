package com.bayer.marketing.consumerHealth.citracal.tests.SiteWideTests.UniversalTests;

import com.bayer.marketing.consumerHealth.coppertone.tests.SiteWideTests.Accessibility.steps.AccessibilityStep;
import org.testng.annotations.Test;

import com.bayer.common.Accessibility;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class UniversalTests extends AbstractTest {
	
public String url = "http://test.redesign.citracal.com/";
    
	public String getUrl(){ 
		return url;
	}
    @TestDescriptor( testName="Citracal LinkChecker Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new LinkValidator(url, -1) } );
    }
    @TestDescriptor( testName="Citracal Accessibility Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void accessibilityTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new LinkValidator(url, -1), new Accessibility() } );
    }
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5