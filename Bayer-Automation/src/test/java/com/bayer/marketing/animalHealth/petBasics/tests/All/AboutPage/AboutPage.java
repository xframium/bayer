package com.bayer.marketing.animalHealth.petBasics.tests.All.AboutPage;

import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.All.AboutPage.steps.AboutPageNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;


public class AboutPage extends AbstractTest {	
	
	protected String url = "https://www.petbasics.com/about-bayer";
	
	public String getUrl(){ 
		return url;
	}
	 
	@TestDescriptor( testName="About Bayer Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate("https://www.petbasics.com/about-bayer"), 
        							new AboutPageNavSteps(),
        					
        } );
    }

   
    @TestDescriptor( testName="About Bayer Validation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void validateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.petbasics.com/about-bayer"),
        						   new StructureValidator("H1 Test", "/com/bayer/marketing/animalHealth/petBasics/tests/All/AboutPage/AboutPageValidation.xml"),
        						   new StructureValidator("H2 Test","/com/bayer/marketing/animalHealth/petBasics/tests/All/AboutPage/AboutPageValidation.xml"),
        						   
    						    } );
    }
    @TestDescriptor( testName="About Bayer Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void timedNavigateTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new TimedNavigate("https://www.petbasics.com/about-bayer", 6000)
        } );
    }

    
} //end class
