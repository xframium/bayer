package com.bayer.marketing.consumerHealth.aspirin.tests.PageTests.Products;

import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.All.ProductsAll.steps.ProductsAllSteps;
import com.bayer.marketing.consumerHealth.betaseron.tests.HomePage.steps.HomePageNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;


public class ProductsAll extends AbstractTest {	
	
	protected String url = "https://www.petbasics.com/products/?pref=all";
	 
	@TestDescriptor( testName="Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate("https://www.petbasics.com/products/?pref=all"), 
        							new ProductsAllSteps(),
        							//new TimedNavigate("https://www.petbasics.com/products/?pref=all", 10000)
        } );
    }
    
   
    @TestDescriptor( testName="Products All Validation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.petbasics.com/products/?pref=all"),
        						   new StructureValidator("H1 Test","/com/bayer/marketing/animalHealth/petBasics/tests/All/ProductsAll/ProductsAllValidation.xml"),
        						   new StructureValidator("H2 Test","/com/bayer/marketing/animalHealth/petBasics/tests/All/ProductsAll/ProductsAllValidation.xml"),
        						   
    						    } );
    }
    	

   
} //end class
