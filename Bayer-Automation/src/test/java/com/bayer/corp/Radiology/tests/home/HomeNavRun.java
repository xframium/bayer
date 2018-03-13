package com.bayer.corp.Radiology.tests.home;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.corp.Radiology.tests.home.steps.HomeNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class HomeNavRun extends AbstractTest {
	
	public String url = "https://www.radiologysolutions.bayer.com/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Radiology Home visual validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateRadiologyHome(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new HomeNavStep()});
	}
}

