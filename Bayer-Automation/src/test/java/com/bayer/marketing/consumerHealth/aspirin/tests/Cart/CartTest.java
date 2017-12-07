package com.bayer.marketing.consumerHealth.aspirin.tests.Cart;


import com.bayer.marketing.consumerHealth.aspirin.tests.Cart.steps.*;
import com.bayer.marketing.consumerHealth.aspirin.tests.HomePage.steps.ConditionsOfUse;
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
    @Test ( dataProvider = "deviceList", enabled= true)
    public void conditionsTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( url),
        						   new ConditionsOfUse(),
        						    } );
    }
    
    @TestDescriptor( testName="Aspirin Home Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	//System.out.println("The url currently being used it" + url);
    	executeSteps(new Step[] { 
    			new LinkValidator(url, 42),
    			
   
    	});
    }
    	
 
} //end class
