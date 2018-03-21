package com.bayer.marketing.animalHealth.petBasics.tests.faqCat;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.faqAll.steps.ApplyFilterToFAQAllNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.faqCat.steps.FAQCatNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;


public class FAQCatNavRun extends AbstractTest {	
	
	public String url = "https://www.petbasics.com/faq/?filter=cat&pref=cat";
    
	public String getUrl(){ 
		return url;
	}
	@TestDescriptor( testName="PetBasics FAQ Cat Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new FAQCatNavSteps()
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics FAQ Cat Filter Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void applyFilterTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new ApplyFilterToFAQAllNavSteps()
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Timed Navigation for FAQ Cat" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigation( DeviceContainer dC ) {
		executeSteps( new Step[] { new TimedNavigate(url, 4000)} );
    }
	
	@TestDescriptor(testName = "PetBasics FAQ Cat Structure Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void faqCatStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] {new Navigate(url),
				 				 new StructureValidator("FAQH1Tag", "/com/bayer/marketing/animalHealth/petBasics/tests/faqCat/FAQCatValidation.xml"),
				 				 new StructureValidator("FAQH2Tag", "/com/bayer/marketing/animalHealth/petBasics/tests/faqCat/FAQCatValidation.xml"),
				 
					 			 });
	}
	
	@TestDescriptor( testName="PetBasics FAQ Cat Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	executeSteps(new Step[] { 
    			new LinkValidator(url, -1)
    			
   
    	});
    }
 
} //end class
