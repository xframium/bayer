package com.bayer.marketing.consumerHealth.betaseron.tests.FAQ;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronAndHeritage.steps.BetaseronAndHeritageNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronEfficacy.steps.BetaseronEfficacyNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronSafety.steps.BetaseronSafetyNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.FAQ.steps.FaqNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.LoginORRegister.steps.LoginOrRegisterNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class FaqNavRun extends AbstractTest {

	@TestDescriptor(testName = "Betaseron Frequently Asked Questions Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void betaseronFAQTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate("https://www.betaseron.com/resources/frequently-asked-questions/"),
				new FaqNavStep() });
	}

	@TestDescriptor(testName = "Betaseron Frequently Asked Questions Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void betaseronFAQStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate("https://www.betaseron.com/resources/frequently-asked-questions/", 3000),
				new StructureValidator("ISI"), new StructureValidator("Text Verification") });
	}
	
	
}
