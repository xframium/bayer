package com.bayer.marketing.consumerHealth.MiddleEast.claratine.tests.HomePage;

import com.bayer.marketing.consumerHealth.MiddleEast.claratine.tests.HomePage.steps.HomePageStep;
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

public class HomePage extends AbstractTest {
	
public String url = "http://claritin.cd.uat.bch.inter.fe.claritin.build.dev-bbs.sitecore.bayer-ag.com/";
    
	public String getUrl(){ 
		return url;
	}
    @TestDescriptor( testName=" Claratine Home Conditions of Use Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ConditionsOfUse() } );
    }
    
    @TestDescriptor( testName="Claratine Home Privacy Policy Validation" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void privacyPolicyTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy() } );
    }
    
    @TestDescriptor( testName="Claratine Home Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url)  } );
    }
    
    @TestDescriptor( testName="Claratine Home Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
    @TestDescriptor( testName="Claratine Home Link Checker Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkCheckerTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new LinkValidator(url, 15)} );
    }
     
}

// push test 5