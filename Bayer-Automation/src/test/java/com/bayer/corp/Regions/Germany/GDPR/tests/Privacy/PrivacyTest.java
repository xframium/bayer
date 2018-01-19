package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy;

import com.bayer.exampleTemplate.tests.Example.steps.ExampleStep;
import com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps.PrivacyPolicy;
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
import java.io.*;

public class PrivacyTest extends AbstractTest {
		
			
	public String url = "https://www.cropscience.bayer.de/";
		    
			public String getUrl(){ 
				return url;
			}
		    
		    @TestDescriptor( testName="GDPR Privacy Policy Validation" )
		    @Test ( dataProvider = "deviceList", enabled=true)
		    public void privacyPolicyTest( DeviceContainer dC ) {
		        executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy() } );
		    }
		    
		    @TestDescriptor( testName="GDPR Navigation Test" )
		    @Test ( dataProvider = "deviceList", enabled=false)
		    public void navigateTest( DeviceContainer dC ) {
		        executeSteps( new Step[] { new Navigate(url), new ExampleStep() } );
		    }
		    
		    @TestDescriptor( testName="GDPR Timed Navigation Test" )
		    @Test ( dataProvider = "deviceList", enabled=false)
		    public void timedNavigateTest( DeviceContainer dC ) {
		        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
		    }
		}//end for loop 


// push test 5