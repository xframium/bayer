package com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronAndHeritage;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronAndHeritage.steps.BetaseronAndHeritageNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class BetaseronAndHeritageNavRun extends AbstractTest {

	@TestDescriptor(testName = "Betaseron and Heritage Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void betaseronAndHeritageTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate("https://www.betaseron.com/why-betaseron/your-betaseron-therapy/"),
				new BetaseronAndHeritageNavStep() });
	}

	@TestDescriptor(testName = "Betaseron and Heritage Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void betaseronAndHeritageStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate("https://www.betaseron.com/why-betaseron/your-betaseron-therapy/", 3000),
				new StructureValidator("ISI"), new StructureValidator("Text Verification") });
	}
		
}
