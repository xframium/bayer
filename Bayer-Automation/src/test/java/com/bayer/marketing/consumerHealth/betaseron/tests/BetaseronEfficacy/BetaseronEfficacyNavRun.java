package com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronEfficacy;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronEfficacy.steps.BetaseronEfficacyNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class BetaseronEfficacyNavRun extends AbstractTest {

	@TestDescriptor(testName = "Betaseron Efficacy Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void betaseronEfficacyTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate("https://www.betaseron.com/why-betaseron/efficacy/"),
				new BetaseronEfficacyNavStep() });
	}

	@TestDescriptor(testName = "Betaseron Efficacy Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void betaseronEfficacyStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate("https://www.betaseron.com/why-betaseron/efficacy/", 3000),
				new StructureValidator("ISI"), new StructureValidator("Text Verification") });
	}
	
	
}
