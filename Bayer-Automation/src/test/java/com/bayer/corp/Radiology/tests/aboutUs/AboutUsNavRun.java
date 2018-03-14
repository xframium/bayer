package com.bayer.corp.Radiology.tests.aboutUs;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.corp.Radiology.tests.aboutUs.steps.AboutUsLocationsStep;
import com.bayer.corp.Radiology.tests.aboutUs.steps.AboutUsNavCongressesStep;
import com.bayer.corp.Radiology.tests.aboutUs.steps.AboutUsNavStep;
import com.bayer.corp.Radiology.tests.aboutUs.steps.AboutUsSolutionsStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class AboutUsNavRun extends AbstractTest {
	
	public String url = "https://www.radiologysolutions.bayer.com/aboutus/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Radiology About us visual validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateRadiologyHome(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new AboutUsNavStep()});
	}
	
	@TestDescriptor(testName = "About us Radiology Congresses visual validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateRadiologyCongresses(DeviceContainer dC) {
		url ="https://www.radiologysolutions.bayer.com/aboutus/congresses/";
		executeSteps(new Step[] { new Navigate(url), new AboutUsNavCongressesStep()});
	}
	
	@TestDescriptor(testName = "About us Radiology Locations visual validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateRadiologyLocations(DeviceContainer dC) {
		url ="https://www.radiologysolutions.bayer.com/aboutus/locations/";
		executeSteps(new Step[] { new Navigate(url), new AboutUsLocationsStep()});
	}
	
	@TestDescriptor(testName = "About us Radiology Solutions visual validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateRadiologySolutions(DeviceContainer dC) {
		url ="https://www.radiologysolutions.bayer.com/aboutus/solutions-people-insights/";
		executeSteps(new Step[] { new Navigate(url), new AboutUsSolutionsStep()});
	}
}

