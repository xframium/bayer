package com.bayer.marketing.consumerHealth.claritin.SmartAllergy.tests.SiteWideTests.Accessibility;

import com.bayer.marketing.consumerHealth.claritin.SmartAllergy.tests.SiteWideTests.Accessibility.steps.HomeStep;
import com.bayer.exampleTemplate.tests.Example.steps.PrivacyPolicy;
import com.bayer.exampleTemplate.tests.Example.steps.ConditionsOfUse;
import org.testng.annotations.Test;

import com.bayer.common.Accessibility;
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

public class SmartAllergyAccessibility extends AbstractTest {
	
public String url = "http://claritin.cd.uat.bch.inter.fe.claritin.us.build.dev-bbs.sitecore.bayer-ag.com/products/childrens-claritin";
    
	public String getUrl(){ 
		return url;
	}
    @TestDescriptor( testName="BlueSkyLiving Conditions of Use Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ConditionsOfUse() } );
    }
    
    @TestDescriptor( testName="BlueSkyLiving Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url) } );
    }
    @TestDescriptor( testName="Claritin Smart Allergy Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void accessibilityTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new Accessibility() } );
    }
    @TestDescriptor ( testName = "Claritin Blue Sky General Testing")
    @Test ( dataProvider = "deviceList", enabled = false)
    public void claristinBSLTest( DeviceContainer dC )
    {
        //String baseUrl = "http://colin:Bayer123@03342-claritin-qa.photoninfotech.com:8081/";
        executeSteps( new Step[] { new Navigate(url), new LinkValidator(url, -1 ), new Accessibility(url) } );
    }
    @TestDescriptor( testName="BlueSkyLiving Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5