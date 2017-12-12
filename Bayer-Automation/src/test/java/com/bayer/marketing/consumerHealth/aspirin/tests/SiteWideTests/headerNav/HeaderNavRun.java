package com.bayer.marketing.consumerHealth.aspirin.tests.SiteWideTests.headerNav;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aspirin.tests.SiteWideTests.headerNav.steps.HeaderNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class HeaderNavRun extends AbstractTest {

	public String url = "http://www.bayeraspirin.com/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Aspirin Header Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateFooter(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new HeaderNavStep()});
	}

	@TestDescriptor(testName = "Aspirin Footer Timed Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void timedNavigation(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate(url, 6000) });
	}

	@TestDescriptor(testName = "Aspirin Footer Structure Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void footerStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url),
		new StructureValidator("H1Tag", "/com/bayer/marketing/consumerHealth/aspirin/tests/footerNav/FooterNavValidation.xml")});
	}
	
	
	
	
	
	
}


