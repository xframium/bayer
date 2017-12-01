package com.bayer.marketing.consumerHealth.aspirin.tests.footerNav;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aspirin.tests.footerNav.steps.FooterNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class FooterNavRun extends AbstractTest {

	public String url = "http://test.bayeraspirin.com/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Aspirin Footer Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateFooter(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new FooterNavStep()});
	}

	@TestDescriptor(testName = "Aspirin Footer Timed Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void timedNavigation(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate(url, 6000) });
	}

	@TestDescriptor(testName = "Aspirin Footer Structure Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void footerStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url),
				new StructureValidator("H1Tag",
						"/com/bayer/marketing/consumerHealth/aspirin/tests/footerNav/FooterNavValidation.xml"),
				});
	}

	@TestDescriptor(testName = "Aspirin Footer Link Validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void linkValidationTest(DeviceContainer dC) {
		executeSteps(new Step[] { new LinkValidator(url, 1)

		});
	}

}
