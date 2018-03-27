package com.bayer.corp.Radiology.tests.common;

import java.util.Map;
import java.util.Set;

import com.applitools.eyes.exceptions.DiffsFoundException;
import com.applitools.eyes.selenium.Eyes;
import com.bayer.BayerWebDriver;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class RadiologyNavStep extends AbstractStep {

	private String screenIdentification;
	
	public RadiologyNavStep() {
		super("message", "error message");
	}
	public RadiologyNavStep(String screenIdentification) {
		super("message", "error message");
		this.screenIdentification=screenIdentification;
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		ScreenIdentifier identifier = ScreenIdentifier.valueOf(screenIdentification);
		Map<String, RadiologyScreen> screenMap = null;
		switch (identifier) {
		case SERVICE:
			screenMap = RadiologyScreenUtility.getServiceScreens();
			break;
		case PRODUCTS:
			screenMap = RadiologyScreenUtility.getProductScreens();
			break;
		case LEARNING:
			screenMap = RadiologyScreenUtility.getLearningCenterScreens();
			break;
		case ABOUTUS:
			screenMap = RadiologyScreenUtility.getAboutUsScreens();
			break;
		default:
			break;

		}
		if (screenMap != null && !screenMap.isEmpty()) {
			Set<String> screenKeyset = screenMap.keySet();
			for (String screen : screenKeyset) {
				this.initilizeAndTakeScreenShot(webDriver, screen, screenMap);
			}
		}
		return true;
	}

	private void initilizeAndTakeScreenShot(BayerWebDriver webDriver, String screen,
			Map<String, RadiologyScreen> screenMap) {
		RadiologyScreen ascreen = screenMap.get(screen);
		System.out.println("Visual validation starting for :: "+ ascreen.getBatchName());
		try {
		Eyes eyes = Util.initilizeEyesServer(webDriver, ascreen.getUrl(), ascreen.getBatchName(),
				ascreen.getScreenName(), ascreen.getScreenName());

		Util.takeScreenShot(eyes, ascreen.getXpathKey());

		Util.closeEyes(eyes);
		}catch(DiffsFoundException ex) {
			System.out.println("Detected differences :: "+ ex.getMessage());
		}
		System.out.println("Visual validation completed for :: "+ ascreen.getBatchName());
	}

}
