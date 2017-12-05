package com.bayer.marketing.consumerHealth.aspirin.tests.whereToBuy;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aspirin.tests.whereToBuy.steps.WhereToBuyNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class WhereToBuyNavRun extends AbstractTest {

	public String url = "http://test.bayeraspirin.com/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Aspirin Where To Buy Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateWhereToBuy(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new WhereToBuyNavStep()});
	}

	@TestDescriptor(testName = "Aspirin Where To Buy Timed Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void timedNavigation(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate(url, 6000) });
	}

	@TestDescriptor(testName = "Aspirin Where To Buy Structure Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void whereToBuyStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url),
				new StructureValidator("H1Tag",
						"/com/bayer/marketing/consumerHealth/aspirin/tests/whereToBuy/WhereToBuyValidation.xml"),
				});
	}

	@TestDescriptor(testName = "Aspirin Where To Buy Link Validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void linkValidationTest(DeviceContainer dC) {
		executeSteps(new Step[] { new LinkValidator(url, 1)

		});
	}

}
