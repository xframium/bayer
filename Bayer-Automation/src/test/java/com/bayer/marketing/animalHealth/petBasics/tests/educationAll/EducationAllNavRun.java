package com.bayer.marketing.animalHealth.petBasics.tests.educationAll;


import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.marketing.animalHealth.petBasics.tests.educationAll.steps.ApplyFilterToEducationAllNavSteps;
import com.bayer.marketing.animalHealth.petBasics.tests.educationAll.steps.EducationAllNavSteps;
import com.bayer.test.AbstractTest;
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
