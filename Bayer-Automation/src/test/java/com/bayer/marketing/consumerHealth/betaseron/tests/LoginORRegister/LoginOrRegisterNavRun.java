package com.bayer.marketing.consumerHealth.betaseron.tests.LoginORRegister;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronAndHeritage.steps.BetaseronAndHeritageNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronEfficacy.steps.BetaseronEfficacyNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronSafety.steps.BetaseronSafetyNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.LoginORRegister.steps.LoginOrRegisterNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class LoginOrRegisterNavRun extends AbstractTest {

	@TestDescriptor(testName = "Betaseron Login/Register Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void betaseronRegisterTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate("https://www.betaseron.com/registration/"),
				new LoginOrRegisterNavStep() });
	}

	@TestDescriptor(testName = "Betaseron Login/Register Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void betaseronRegisterStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate("https://www.betaseron.com/registration/", 3000),
				new StructureValidator("ISI"), new StructureValidator("Text Verification") });
	}
	
	
}
