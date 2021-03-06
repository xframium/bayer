package com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage;


import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.steps.HomePageNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.steps.AccessitilitySteps;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.Accessibility;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;


public class HomePage extends AbstractTest {	
	
	public String url = "https://www.petbasics.com/";
    
	public String getUrl(){ 
		return url;
	}
	
	@TestDescriptor( testName="PetBasics Home Nav Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC ) {
        System.out.println(url);
		executeSteps( new Step[] { new Navigate(url),
									new HomePageNavSteps(),
        							//new TimedNavigate(url, 5000),
        							
        } );
    }
    
    @TestDescriptor( testName="PetBasics Home Validation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url),
        						   new StructureValidator("H1 Tag", "/HomePageValidation.xml"),    						  
        						   //new StructureValidator("Key"),
        						   
        						    } );
    }
    
    @TestDescriptor( testName="PetBasics Home Accessibility Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void accessibilityTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url),
        						   new AccessitilitySteps(),
        						   
        						    } );
    }
    @TestDescriptor( testName="Home Page Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	System.out.println("The url currently being used is " + url);
    	executeSteps(new Step[] { 
    			new LinkValidator("https://www.petbasics.com/", 148)
    			
   
    	});
    }
    
 
} //end class
