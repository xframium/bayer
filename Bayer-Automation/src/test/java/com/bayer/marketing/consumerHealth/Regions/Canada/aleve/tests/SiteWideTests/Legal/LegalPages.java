package com.bayer.marketing.consumerHealth.Regions.Canada.aleve.tests.SiteWideTests.Legal;

import com.bayer.exampleTemplate.tests.Example.steps.ExampleStep;
import com.bayer.exampleTemplate.tests.Example.steps.PrivacyPolicy;
import com.bayer.exampleTemplate.tests.Example.steps.ConditionsOfUse;
import org.testng.annotations.Test;
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

public class LegalPages extends AbstractTest {
	
public String url = "https://test.aleve.ca/fr/enonce-confidentialite/";
    
	public String getUrl(){ 
		return url;
	}
    @TestDescriptor( testName="Conditions of Use Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ConditionsOfUse() } );
    }
    
    @TestDescriptor( testName="Privacy Policy Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void privacyPolicyTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new StructureValidator("H1tag","/com/bayer/marketing/consumerHealth/Regions/Canada/aleve/tests/SiteWideTests/Legal/PrivacyPageValidation.xml") } );
    }
    @TestDescriptor( testName="URL TEST" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url),  } );
    }
    @TestDescriptor( testName="Example Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ExampleStep() } );
    }
    
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5