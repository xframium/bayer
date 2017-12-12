package com.bayer.marketing.consumerHealth.aspirin.tests.siteMap;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps.SiteMapNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class SiteMapNavRun extends AbstractTest {

	public String url = "http://test.bayeraspirin.com/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Aspirin SiteMap Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateSiteMap(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new SiteMapNavStep()});
	}

	@TestDescriptor(testName = "Aspirin SiteMap Timed Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void timedNavigation(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate(url, 6000) });
	}

	@TestDescriptor(testName = "Aspirin SiteMap Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void siteMapStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url),
				new StructureValidator("H1Tag",
						"/com/bayer/marketing/consumerHealth/aspirin/tests/siteMap/SiteMapValidation.xml"),
				});
	}

	@TestDescriptor(testName = "Aspirin SiteMap Link Validation")
	@Test(dataProvider = "deviceList", enabled = false)
	public void linkValidationTest(DeviceContainer dC) {
		executeSteps(new Step[] { new LinkValidator(url, 1)

		});
	}

}
