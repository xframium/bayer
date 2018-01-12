package com.bayer.marketing.consumerHealth.drscholls.tests.PageTests.HomePage;

import com.bayer.marketing.consumerHealth.drscholls.tests.PageTests.HomePage.steps.HomePageStep;
import com.bayer.marketing.consumerHealth.drscholls.tests.PageTests.HomePage.steps.PrivacyPolicy;
import com.bayer.marketing.consumerHealth.drscholls.tests.PageTests.HomePage.steps.ConditionsOfUse;
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
	
public String url = "https://www.drscholls.com/";
    
	public String getUrl(){ 
		return url;
	}
    @TestDescriptor( testName="Conditions of Use Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ConditionsOfUse() } );
    }
    
    @TestDescriptor( testName="Privacy Policy Validation" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void privacyPolicyTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy() } );
    }
    
    @TestDescriptor( testName="Dr. Scholl's Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new HomePageStep() } );
    }
    @TestDescriptor( testName="Dr. Scholl's Link Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new LinkValidator(url, 44) } );
    }
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5