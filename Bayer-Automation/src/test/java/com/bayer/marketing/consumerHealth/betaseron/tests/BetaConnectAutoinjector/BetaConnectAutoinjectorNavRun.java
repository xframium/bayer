package com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectAutoinjector;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectAutoinjector.steps.BetaConnectAutoinjectorNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class BetaConnectAutoinjectorNavRun extends AbstractTest {

	@TestDescriptor(testName = "Betaseron BetaConnect Autoinjector Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void BetaConnectAutoinjectorTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate("https://www.betaseron.com/betaconnect-system/betaconnect-autoinjector/"),
				new BetaConnectAutoinjectorNavStep() });
	}

	@TestDescriptor(testName = "Betaseron BetaConnect Autoinjecotr Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void BetaConnectAutoinjectorStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate("https://www.betaseron.com/betaconnect-system/betaconnect-autoinjector/", 3000),
				new StructureValidator("ISI"), new StructureValidator("Text Verification") });
	}
	
	
}
