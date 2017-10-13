package com.bayer.marketing.consumerHealth.betaseron.tests.VideosAndResource;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronAndHeritage.steps.BetaseronAndHeritageNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronEfficacy.steps.BetaseronEfficacyNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronSafety.steps.BetaseronSafetyNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.FAQ.steps.FaqNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.LoginORRegister.steps.LoginOrRegisterNavStep;
import com.bayer.marketing.consumerHealth.betaseron.tests.VideosAndResource.steps.VideosAndResourceNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class VideosAndResourceNavRun extends AbstractTest {

	@TestDescriptor(testName = "Betaseron Videos And Resource Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void betaseronVideosAndResourceTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate("https://www.betaseron.com/resources/videos-resources/"),
				new VideosAndResourceNavStep() });
	}

	@TestDescriptor(testName = "Betaseron Videos And Resource Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void betaseronVideosAndResourceStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate("https://www.betaseron.com/resources/videos-resources/", 3000),
				new StructureValidator("ISI"), new StructureValidator("Text Verification") });
	}
	
	
}
