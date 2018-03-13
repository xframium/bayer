package com.bayer.corp.Radiology.tests.aboutUs;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.corp.Radiology.tests.aboutUs.steps.AboutUsNavStep;
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
}

