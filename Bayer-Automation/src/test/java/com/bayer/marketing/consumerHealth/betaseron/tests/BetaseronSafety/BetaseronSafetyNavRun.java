package com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronSafety;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronAndHeritage.steps.BetaseronAndHeritageNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronEfficacy.steps.BetaseronEfficacyNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronSafety.steps.BetaseronSafetyNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class BetaseronSafetyNavRun extends AbstractTest {

	@TestDescriptor(testName = "Betaseron Safety Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void betaseronSafetyTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate("https://www.betaseron.com/why-betaseron/safety/"),
				new BetaseronSafetyNavStep() });
	}

	@TestDescriptor(testName = "Betaseron Safety Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void betaseronSafetyStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate("https://www.betaseron.com/why-betaseron/safety/", 3000),
				new StructureValidator("ISI"), new StructureValidator("Text Verification") });
	}
	
	
}
