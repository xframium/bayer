package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.ContactUs;


import com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.ContactUs.Steps.ContactUsRun;
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

public class ContactUs extends AbstractTest {
	
public String url = "colin:Bayer123@03342-claritin-qa.photoninfotech.com:8081";
    
	public String getUrl(){ 
		return url;
	}
	
    @TestDescriptor( testName="Contact Us" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ContactUsRun() } );
    }
    /*
    @TestDescriptor( testName="BlueSkyLiving Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url) } );
    }
    @TestDescriptor ( testName = "Claritin Blue Sky General Testing ")
    @Test ( dataProvider = "deviceList", enabled = false)
    public void claristinBSLTest( DeviceContainer dC )
    {
        String baseUrl = "http://colin:Bayer123@03342-claritin-qa.photoninfotech.com:8081/";
     //   executeSteps( new Step[] { new Navigate( baseUrl ), new LinkValidator( baseUrl, -1 ), new Accessibility( baseUrl ) } );
    }
    @TestDescriptor( testName="BlueSkyLiving Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     */
}

// push test 5