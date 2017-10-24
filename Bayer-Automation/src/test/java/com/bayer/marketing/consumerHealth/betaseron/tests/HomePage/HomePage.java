package com.bayer.marketing.consumerHealth.betaseron.tests.HomePage;

import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.HomePage.steps.HomePageNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class HomePage extends AbstractTest
{
    @TestDescriptor( testName="Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/" ), 
        							new HomePageNavSteps(),
        							new TimedNavigate("https://www.betaseron.com/", 4000)
        } );
    }
    
    
    @TestDescriptor( testName="Home Page Validation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void structureTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/"),
        						   new StructureValidator("Main Now Approved Banner", "/HomePageValidation.xml"),
        						   //new StructureValidator("Key"),
        						    } );
    }
    @TestDescriptor( testName="Home Page Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	executeSteps(new Step[] { 
    			
    			new LinkValidator("https://www.betaseron.com/", 67)

    	});
    }
    	
 
} //end class
