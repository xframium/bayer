package com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectmyBETAapp;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaConnectmyBETAapp.steps.BetaConnectmyBETAappNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class BetaConnectmyBETAappNavRun extends AbstractTest {

	@TestDescriptor(testName = "Betaseron BetaConnect myBETAapp Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void BetaConnectmyBETAappTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate("https://www.betaseron.com/betaconnect-system/mybetaapp/"),
				new BetaConnectmyBETAappNavStep() });
	}

	@TestDescriptor(testName = "Betaseron BetaConnect myBETAapp Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void BetaConnectmyBETAappStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate("https://www.betaseron.com/betaconnect-system/mybetaapp/", 3000),
				new StructureValidator("ISI"), new StructureValidator("Text Verification") });
	}
	
	
}
