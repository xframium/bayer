package com.bayer.marketing.consumerHealth.aspirin.tests.Cart;


import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.marketing.consumerHealth.aspirin.tests.Cart.steps.CartTestSteps;
import com.bayer.marketing.consumerHealth.aspirin.tests.Cart.steps.ConditionsOfUse;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;


public class CartTest extends AbstractTest {	
	
	public String url = "http://test.bayeraspirin.com/";
    
	public String getUrl(){ 
		return url;
	}
	
	@TestDescriptor( testName="Aspirin Home Nav Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
        System.out.println(url);
		executeSteps( new Step[] { new Navigate(url), 						
        							new CartTestSteps(),							
        } );
    }
    
	
    @TestDescriptor( testName="Aspirin Conditons of Use Validation" )
    @Test ( dataProvider = "deviceList", enabled= false)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( url),
        						   new ConditionsOfUse(),
        						    } );
    }
    
    @TestDescriptor( testName="Aspirin Home Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void linkValidationTest(DeviceContainer dC){
    	//System.out.println("The url currently being used it" + url);
    	executeSteps(new Step[] { 
    			new LinkValidator(url, 42),
    			
   
    	});
    }
    	
 
} //end class
