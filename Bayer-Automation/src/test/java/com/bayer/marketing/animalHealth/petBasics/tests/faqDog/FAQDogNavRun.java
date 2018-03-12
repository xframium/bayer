package com.bayer.marketing.animalHealth.petBasics.tests.faqDog;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.faqAll.steps.ApplyFilterToFAQAllNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.faqDog.steps.FAQDogSet1NavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.faqDog.steps.FAQDogSet2NavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;


public class FAQDogNavRun extends AbstractTest {	
	
	public String url = "https://www.petbasics.com/faq/?filter=dog&pref=dog";
    
	public String getUrl(){ 
		return url;
	}
	@TestDescriptor( testName="PetBasics FAQ Dog Set1 Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new FAQDogSet1NavSteps()
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics FAQ Dog Set2 Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navigateTestSet2( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new FAQDogSet2NavSteps()
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics FAQ Dog Filter Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void applyFilterTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new ApplyFilterToFAQAllNavSteps()
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Timed Navigation for FAQ Dog" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigation( DeviceContainer dC ) {
		executeSteps( new Step[] { new TimedNavigate(url, 4000)} );
    }
	
	@TestDescriptor(testName = "PetBasics FAQ Dog Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void faqDogStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] {new Navigate(url),
								 new StructureValidator("FAQH1Tag", "/com/bayer/marketing/animalHealth/petBasics/tests/faqDog/FAQDogValidation.xml"),
								 new StructureValidator("FAQH2Tag", "/com/bayer/marketing/animalHealth/petBasics/tests/faqDog/FAQDogValidation.xml"),

					 			 });
	}
	
	@TestDescriptor( testName="PetBasics Dog All Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	executeSteps(new Step[] { 
    			new LinkValidator(url, -1)
    			
   
    	});
    }
 
} //end class
