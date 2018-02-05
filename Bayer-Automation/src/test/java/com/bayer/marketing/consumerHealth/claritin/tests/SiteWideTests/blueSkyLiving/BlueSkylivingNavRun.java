package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.blueSkyLiving;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.blueSkyLiving.steps.BlueSkylivingNavStep;
import com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.blueSkyLiving.steps.TestConnectivity;
import com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.saving.steps.ClaritinSavingNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class BlueSkylivingNavRun extends AbstractTest {

	public String url = "http://03342-bslqa.photoninfotech.com:8080/claritinblueskyliving";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Blue Sky Living Connectivity Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void testUrlConnectivity(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new TestConnectivity()});
	}
	
	@TestDescriptor(testName = "Blue Sky Living Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateBlueSkyLiving(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new BlueSkylivingNavStep()});
	}
	
	@TestDescriptor(testName = "Blue Sky Living Timed Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void timedNavigation(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate(url, 6000) });
	}


}
