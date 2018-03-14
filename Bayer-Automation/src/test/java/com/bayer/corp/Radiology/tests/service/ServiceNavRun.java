package com.bayer.corp.Radiology.tests.service;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.corp.Radiology.tests.home.steps.HomeNavStep;
import com.bayer.corp.Radiology.tests.service.steps.ServiceNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class ServiceNavRun extends AbstractTest {
	
	public String url = "https://www.radiologysolutions.bayer.com/service/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Radiology Service visual validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateRadiologyService(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new ServiceNavStep()});
	}
}

