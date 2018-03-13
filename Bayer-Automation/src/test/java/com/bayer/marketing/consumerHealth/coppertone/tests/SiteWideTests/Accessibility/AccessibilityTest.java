package com.bayer.marketing.consumerHealth.coppertone.tests.SiteWideTests.Accessibility;

import com.bayer.marketing.consumerHealth.coppertone.tests.SiteWideTests.Accessibility.steps.AccessibilityStep;
import com.bayer.marketing.consumerHealth.coppertone.tests.SiteWideTests.Legal.steps.ConditionsOfUse;
import com.bayer.marketing.consumerHealth.coppertone.tests.SiteWideTests.Legal.steps.PrivacyPolicy;
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

public class AccessibilityTest extends AbstractTest {
	
public String url = "https://www.coppertone.com/";
    
	public String getUrl(){ 
		return url;
	}
    @TestDescriptor( testName="Conditions of Use Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ConditionsOfUse() } );
    }
    @TestDescriptor( testName="Accessibility Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void accessibilityTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new Accessibility() } );
    }
    
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

