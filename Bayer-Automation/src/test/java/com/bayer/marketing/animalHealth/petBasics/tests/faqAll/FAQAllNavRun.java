package com.bayer.marketing.animalHealth.petBasics.tests.faqAll;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.faqAll.steps.ApplyFilterToFAQAllNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.faqAll.steps.FAQAllNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;


public class FAQAllNavRun extends AbstractTest {	
	
	public String url = "https://www.petbasics.com/faq/?pref=all";
    
	public String getUrl(){ 
		return url;
	}
	@TestDescriptor( testName="PetBasics FAQ All Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new FAQAllNavSteps()/*,
        							new TimedNavigate(url, 4000)*/
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics FAQ All Filter Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void applyFilterTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new ApplyFilterToFAQAllNavSteps()/*,
        							new TimedNavigate(url, 4000)*/
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Timed Navigation for FAQ All" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigation( DeviceContainer dC ) {
		executeSteps( new Step[] { new TimedNavigate(url, 4000)} );
    }
	
	@TestDescriptor(testName = "PetBasics FAQ All Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void faqAllStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] {new StructureValidator("FAQ All", "/FAQAllValidation.xml") 
					 			 });
	}
 
} //end class
