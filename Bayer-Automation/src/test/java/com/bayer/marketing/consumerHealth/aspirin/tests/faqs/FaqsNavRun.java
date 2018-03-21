package com.bayer.marketing.consumerHealth.aspirin.tests.faqs;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aspirin.tests.faqs.steps.FaqsNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class FaqsNavRun extends AbstractTest {

	public String url = "https://www.bayeraspirin.com/faqs/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Aspirin FAQS Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateFaqs(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new FaqsNavStep()});
	}

	@TestDescriptor(testName = "Aspirin FAQS Timed Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void timedNavigation(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate(url, 6000) });
	}

	@TestDescriptor(testName = "Aspirin FAQS Structure Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void faqsStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url),
				new StructureValidator("H1Tag",
						"/com/bayer/marketing/consumerHealth/aspirin/tests/faqs/FaqsValidation.xml"),
				});
	}

	@TestDescriptor(testName = "Aspirin FAQS Link Validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void linkValidationTest(DeviceContainer dC) {
		executeSteps(new Step[] { new LinkValidator(url, -1)

		});
	}

}
