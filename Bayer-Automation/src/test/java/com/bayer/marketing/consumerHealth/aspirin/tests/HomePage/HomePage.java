package com.bayer.marketing.consumerHealth.aspirin.tests.HomePage;


import com.bayer.marketing.consumerHealth.aspirin.tests.HomePage.steps.HomePageNavSteps;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;


public class HomePage extends AbstractTest {	
	
	public String url = "http://test.bayeraspirin.com/";
    
	public String getUrl(){ 
		return url;
	}
	/*
	@TestDescriptor( testName="PetBasics Home Nav Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
        System.out.println(url);
		executeSteps( new Step[] { new Navigate(url), 
        							new HomePageNavSteps(),
        							new TimedNavigate(url, 4000),
        							
        } );
    }
    
    
    @TestDescriptor( testName="Home Page Validation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/"),
        						   new StructureValidator("Main Now Approved Banner", "/HomePageValidation.xml"),
        						   //new StructureValidator("Key"),
        						   
        						    } );
    }
    */
    @TestDescriptor( testName="Home Page Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	System.out.println("The url currently being used it" + url);
    	executeSteps(new Step[] { 
    			new LinkValidator("http://test.bayeraspirin.com/", 70)
    			
   
    	});
    }
    	
 
} //end class
