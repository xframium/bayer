package com.bayer.marketing.animalHealth.petBasics.tests.educationAll;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.educationAll.steps.ApplyFilterToEducationAllNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.educationAll.steps.EducationAllNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;


public class EducationAllNavRun extends AbstractTest {	
	
	public String url = "https://www.petbasics.com/education/?pref=all";
    
	public String getUrl(){ 
		return url;
	}
	@TestDescriptor( testName="PetBasics Education All Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new EducationAllNavSteps()/*,
        							new TimedNavigate(url, 4000)*/
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Education All Filter Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void applyFilterTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new ApplyFilterToEducationAllNavSteps()/*,
        							new TimedNavigate(url, 4000)*/
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Timed Navigation for Education All" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigation( DeviceContainer dC ) {
		executeSteps( new Step[] { new TimedNavigate(url, 6000)} );
    }
	
	@TestDescriptor(testName = "PetBasics Education All Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void educationAllStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] {new StructureValidator("All Education", "/EducationAllValidation.xml") 
					 			 });
	}
	
	@TestDescriptor(testName = "PetBasics Education All Structure Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void allEducationStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] {   new Navigate(url),
									new StructureValidator("H1Tag", "/com/bayer/marketing/animalHealth/petBasics/tests/educationAll/EducationAllValidation.xml"),
									new StructureValidator("H2Tag", "/com/bayer/marketing/animalHealth/petBasics/tests/educationAll/EducationAllValidation.xml"),
					 			 });
	}
	
	@TestDescriptor( testName="PetBasics Education All Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	executeSteps(new Step[] { 
    			new LinkValidator(url, 1)
    			
   
    	});
    }
     
} //end class
