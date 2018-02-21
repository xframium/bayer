package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.Facebook;


import com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.Facebook.Steps.FacebookStep;
import com.bayer.exampleTemplate.tests.Example.steps.PrivacyPolicy;
import com.bayer.exampleTemplate.tests.Example.steps.ConditionsOfUse;
import org.testng.annotations.Test;

//import com.bayer.common.Accessibility;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class Facebook extends AbstractTest {
	
public String url = "https://www.claritin.com/";
    
	public String getUrl(){ 
		return url;
	}
	
    @TestDescriptor( testName="Claritin Facebook" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new FacebookStep() } );
    }
    
    
    @TestDescriptor( testName="BlueSkyLiving Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5