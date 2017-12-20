package com.bayer.marketing.consumerHealth.aspirin.tests.siteMap;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps.SiteMapNavStep;
import com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps.SiteMapProductsAndOthersNavStep;
import com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps.SiteMapStrokeNavStep;
import com.bayer.marketing.consumerHealth.aspirin.tests.siteMap.steps.SiteMapSurvivingAndPainReliefNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class SiteMapNavRun extends AbstractTest {

	public String url = "http://test.bayeraspirin.com/sitemap/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Aspirin SiteMap Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateSiteMap(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new SiteMapNavStep()});
	}
	
	@TestDescriptor(testName = "Aspirin SiteMap Stroke Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void navigateStrokeSiteMap(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new SiteMapStrokeNavStep()});
	}
	
	@TestDescriptor(testName = "Aspirin SiteMap Surviving And Pain Relief Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void navigateSurvivingAndPainReliefSiteMap(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new SiteMapSurvivingAndPainReliefNavStep()});
	}
	
	@TestDescriptor(testName = "Aspirin SiteMap Products And Others Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void navigateProductsAndOthersSiteMap(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url), new SiteMapProductsAndOthersNavStep()});
	}

	@TestDescriptor(testName = "Aspirin SiteMap Timed Navigation Test")
	@Test(dataProvider = "deviceList", enabled = false)
	public void timedNavigation(DeviceContainer dC) {
		executeSteps(new Step[] { new TimedNavigate(url, 6000) });
	}

	@TestDescriptor(testName = "Aspirin SiteMap Structure Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void siteMapStructureTest(DeviceContainer dC) {
		executeSteps(new Step[] { new Navigate(url),
				new StructureValidator("H1Tag",
						"/com/bayer/marketing/consumerHealth/aspirin/tests/siteMap/SiteMapValidation.xml"),
				new StructureValidator("H2Tag",
						"/com/bayer/marketing/consumerHealth/aspirin/tests/siteMap/SiteMapValidation.xml"),
				});
	}

	@TestDescriptor(testName = "Aspirin SiteMap Link Validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void linkValidationTest(DeviceContainer dC) {
		executeSteps(new Step[] { new LinkValidator(url, 1)

		});
	}

}
