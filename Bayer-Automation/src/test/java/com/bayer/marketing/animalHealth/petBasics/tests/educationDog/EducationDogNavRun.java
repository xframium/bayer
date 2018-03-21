package com.bayer.marketing.animalHealth.petBasics.tests.educationDog;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.educationDog.steps.ApplyFilterToEducationDogNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.educationDog.steps.EducationDogNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;


public class EducationDogNavRun extends AbstractTest {	
	
	public String url = "https://www.petbasics.com/dog-education/?pref=dog";
    
	public String getUrl(){ 
		return url;
	}
	@TestDescriptor( testName="PetBasics Education Dog Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new EducationDogNavSteps()/*,
        							new TimedNavigate(url, 4000)*/
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Education Dog Filter Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void applyFilterTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new ApplyFilterToEducationDogNavSteps()/*,
        							new TimedNavigate(url, 4000)*/
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Timed Navigation for Education Dog" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigation( DeviceContainer dC ) {
		executeSteps( new Step[] { new TimedNavigate(url, 4000)} );
    }
	
	@TestDescriptor(testName = "PetBasics Education Dog Structure Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void educationDogStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] {new Navigate(url),
								 new StructureValidator("H1Tag", "/com/bayer/marketing/animalHealth/petBasics/tests/educationDog/EducationDogtValidation.xml"),
								 new StructureValidator("H2Tag", "/com/bayer/marketing/animalHealth/petBasics/tests/educationDog/EducationDogtValidation.xml"),
								// new StructureValidator("CommonH2Tag"),
					 			 });
	}
    
	@TestDescriptor( testName="PetBasics Education Dog Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	executeSteps(new Step[] { 
    			new LinkValidator(url, -1)
    			
   
    	});
    }
    	
 
} //end class
