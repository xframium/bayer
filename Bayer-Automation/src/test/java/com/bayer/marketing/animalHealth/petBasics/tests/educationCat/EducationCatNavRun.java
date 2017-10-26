package com.bayer.marketing.animalHealth.petBasics.tests.educationCat;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.educationAll.steps.ApplyFilterToEducationAllNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.educationAll.steps.EducationAllNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.educationCat.steps.ApplyFilterToEducationCatNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.educationCat.steps.EducationCatNavSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;


public class EducationCatNavRun extends AbstractTest {	
	
	public String url = "https://www.petbasics.com/cat-education/?pref=cat";
    
	public String getUrl(){ 
		return url;
	}
	@TestDescriptor( testName="PetBasics Education Cat Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new EducationCatNavSteps()/*,
        							new TimedNavigate(url, 4000)*/
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Education Cat Filter Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void applyFilterTest( DeviceContainer dC ) {
		executeSteps( new Step[] { new Navigate(url), 
        							new ApplyFilterToEducationCatNavSteps()/*,
        							new TimedNavigate(url, 4000)*/
        							
        } );
    }
	
	@TestDescriptor( testName="PetBasics Timed Navigation for Education Cat" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigation( DeviceContainer dC ) {
		executeSteps( new Step[] { new TimedNavigate(url, 4000)} );
    }
	
	@TestDescriptor(testName = "PetBasics Education Cat Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void educationCatStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] {new StructureValidator("All Education", "/EducationCatValidation.xml") 
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
