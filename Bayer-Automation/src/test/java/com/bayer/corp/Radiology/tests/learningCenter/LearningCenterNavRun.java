package com.bayer.corp.Radiology.tests.learningCenter;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.corp.Radiology.tests.learningCenter.steps.LearningCenterNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class LearningCenterNavRun extends AbstractTest {
	
	public String url = "https://www.radiologysolutions.bayer.com/learning-center/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Radiology Learning Center visual validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateRadiologyLearningCenter(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new LearningCenterNavStep()});
	}
}

