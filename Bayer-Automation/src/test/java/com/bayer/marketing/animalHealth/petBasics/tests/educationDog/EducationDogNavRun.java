package com.bayer.marketing.animalHealth.petBasics.tests.educationDog;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.educationDog.steps.ApplyFilterToEducationDogNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.educationDog.steps.EducationDogNavSteps;
import com.bayer.test.AbstractTest;
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
	@Test(dataProvider = "deviceList", enabled = false)
	public void educationCatStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] {new StructureValidator("All Education", "/EducationDogtValidation.xml") 
					 			 });
	}
    
    /*
    @TestDescriptor( testName="Home Page Validation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/"),
        						   new StructureValidator("Main Now Approved Banner", "/HomePageValidation.xml"),
        						   //new StructureValidator("Key"),
        						   
        						    } );
    }
    @TestDescriptor( testName="Home Page Link Validation" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void linkValidationTest(DeviceContainer dC){
    	executeSteps(new Step[] { 
    			new LinkValidator("https://www.betaseron.com/", 70)
    			
   
    	});
    }
    */	
 
} //end class
