package com.bayer.marketing.consumerHealth.claritin.tests.HomePage;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;


public class HomePage extends AbstractTest {	
	
	public String url = "http://03342-claritin-qa.photoninfotech.com:8081/";
    
	public String getUrl(){ 
		return url;
	}
	
	@TestDescriptor( testName="Claritin Home Nav Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
        System.out.println(url);
		executeSteps( new Step[] { new Navigate(url), 
        							
        							new TimedNavigate(url, 15000)   							
        } );
    }
    
    @TestDescriptor( testName="Claritin Home Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void linkValidationTest(DeviceContainer dC){
    	//System.out.println("The url currently being used it" + url);
    	executeSteps(new Step[] { 
    			new LinkValidator(url, 42)    			
    	});
    }
    	
 
} //end class
