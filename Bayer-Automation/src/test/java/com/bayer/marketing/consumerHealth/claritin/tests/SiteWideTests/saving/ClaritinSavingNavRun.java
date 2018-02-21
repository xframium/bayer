package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.saving;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.saving.steps.ClaritinSavingNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class ClaritinSavingNavRun extends AbstractTest {

	//public String url = "http://colin:Bayer123@03342-claritin-qa.photoninfotech.com:8081/savings";
	public String url = "https://www.claritin.com/savings";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Claritin Saving Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateClaritiSaving(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new ClaritinSavingNavStep()});
	}
	
	@TestDescriptor(testName = "Claritin Saving Timed Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void timedNavigation(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate(url, 6000) });
	}


}
