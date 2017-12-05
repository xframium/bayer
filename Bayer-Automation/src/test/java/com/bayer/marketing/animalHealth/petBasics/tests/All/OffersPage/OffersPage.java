package com.bayer.marketing.animalHealth.petBasics.tests.All.OffersPage;

import com.bayer.marketing.animalHealth.petBasics.tests.All.OffersPage.steps.OffersPageNavSteps;
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


public class OffersPage extends AbstractTest {	
	
	protected String url = "https://www.petbasics.com/coupons-and-rebates/?pref=all";
	
	public String getUrl(){ 
		return url;
	}
	 
	@TestDescriptor( testName="Offers Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate("https://www.petbasics.com/coupons-and-rebates/?pref=all"), 
        							new OffersPageNavSteps(),
        					
        } );
    }

   
    @TestDescriptor( testName="Offers Bayer Validation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void validateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.petbasics.com/coupons-and-rebates/?pref=all"),
        						   new StructureValidator("H1 Test", "/com/bayer/marketing/animalHealth/petBasics/tests/All/OffersPage/OffersPageValidation.xml"),
        						   new StructureValidator("H2 Test","/com/bayer/marketing/animalHealth/petBasics/tests/All/OffersPage/OffersPageValidation.xml"),
        						   
    						    } );
    }
    @TestDescriptor( testName="Offers Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new TimedNavigate("https://www.petbasics.com/coupons-and-rebates/?pref=all", 6000)
        } );
    }

    
} //end class
