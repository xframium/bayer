package com.bayer.marketing.animalHealth.petBasics.tests.All.Footer;


import com.bayer.marketing.animalHealth.petBasics.tests.All.Footer.steps.FooterNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.steps.HomePageNavSteps;
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


public class Footer extends AbstractTest {	
	
	public String url = "https://www.petbasics.com/";
    
	public String getUrl(){ 
		return url;
	}
	
	@TestDescriptor( testName="Pet Basics Footer Nav Test")
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
        System.out.println(url);
		executeSteps( new Step[] { new Navigate(url),
									new FooterNavSteps()
        							
        } );
    }
    
	
    @TestDescriptor( testName="Pet Basics Footer Validation Test")
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url),
        						   //new StructureValidator("Copyright", "/HomePageValidation.xml"),
        						   
        						    } );
    }
    
    @TestDescriptor( testName="Home Page Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void linkValidationTest(DeviceContainer dC){
    	System.out.println("The url currently being used it" + url);
    	executeSteps(new Step[] { 
    			new LinkValidator("https://www.petbasics.com/", 297)
    			
   
    	});
    }
    	
 
} //end class
