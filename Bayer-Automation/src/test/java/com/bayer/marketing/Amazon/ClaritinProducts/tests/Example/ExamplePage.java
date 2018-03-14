package com.bayer.marketing.Amazon.ClaritinProducts.tests.Example;

import com.bayer.marketing.Amazon.ClaritinProducts.tests.Example.steps.ExampleStep;
import com.bayer.marketing.Amazon.ClaritinProducts.tests.Example.steps.GrabDataStep;
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

public class ExamplePage extends AbstractTest {
	
public String url = "https://www.amazon.com/";
    
	public String getUrl(){ 
		return url;
	}
    
    @TestDescriptor( testName="Amazon Example Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void amazonNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ExampleStep() } );
    }
    @TestDescriptor( testName="Amazon Example Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void amazonDataGrabTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new GrabDataStep() } );
    }
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5