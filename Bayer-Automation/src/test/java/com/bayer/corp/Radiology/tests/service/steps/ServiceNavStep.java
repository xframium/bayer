package com.bayer.corp.Radiology.tests.service.steps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.corp.Radiology.tests.common.RadiologyScreen;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class ServiceNavStep extends AbstractStep {

	private static Map<String, RadiologyScreen> screens = null;

	public ServiceNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		//String homePage = webDriver.getCurrentUrl();

		Set<String> screenKeyset = screens.keySet();

		for (String screen : screenKeyset) {
			this.initilizeAndTakeScreenShot(webDriver, screen);
		}

		return true;
	}

	private void initilizeAndTakeScreenShot(BayerWebDriver webDriver, String screen) {
		RadiologyScreen ascreen = screens.get(screen);

		Eyes eyes = Util.initilizeEyesServer(webDriver, ascreen.getUrl(), ascreen.getBatchName(),
				ascreen.getScreenName(), ascreen.getScreenName());

		WebDriverWait wait = new WebDriverWait(webDriver, 30);

		this.scrollAndTakeScreenShot(ascreen.getXpathKey(), eyes, webDriver, wait);

		Util.closeEyes(eyes);
	}

	private void scrollAndTakeScreenShot(String xpathKey, Eyes eyes, BayerWebDriver webDriver, WebDriverWait wait) {
		waitForElement(xpathKey, webDriver, 30);
		BayerWebElement element = getElement(xpathKey, webDriver);
		if (element.isDisplayed()) {
			Util.scrollToElement(webDriver, element, wait);
			element.click();
			Util.takeScreenShot(eyes, xpathKey);
		}
	}

	static {
		screens = new HashMap<String, RadiologyScreen>();
		RadiologyScreen baseScreen = new RadiologyScreen();
		baseScreen.setBatchName("Radiology Service");
		baseScreen.setScreenName("radiology-service");
		baseScreen.setXpathKey("radiology.service");
		baseScreen.setUrl("https://www.radiologysolutions.bayer.com/service/");
		screens.put(baseScreen.getScreenName(), baseScreen);
		
		RadiologyScreen virtualcare = new RadiologyScreen();
		virtualcare.setBatchName("Radiology VirtualCare");
		virtualcare.setScreenName("radiology-virtualcare");
		virtualcare.setXpathKey("radiology.virtualcare");
		virtualcare.setUrl("https://www.radiologysolutions.bayer.com/service/virtualcare/");
		screens.put(virtualcare.getScreenName(), virtualcare);
		
		RadiologyScreen directcare = new RadiologyScreen();
		directcare.setBatchName("Radiology DirectCare");
		directcare.setScreenName("radiology-directcare");
		directcare.setXpathKey("radiology.directcare");
		directcare.setUrl("https://www.radiologysolutions.bayer.com/service/directcare/");
		screens.put(directcare.getScreenName(), directcare);
		
		RadiologyScreen partnercare = new RadiologyScreen();
		partnercare.setBatchName("Radiology PartnerCare");
		partnercare.setScreenName("radiology-partnercare");
		partnercare.setXpathKey("radiology.partnercare");
		partnercare.setUrl("https://www.radiologysolutions.bayer.com/service/partnercare/");
		screens.put(partnercare.getScreenName(), partnercare);
		
		RadiologyScreen selectcare = new RadiologyScreen();
		selectcare.setBatchName("Radiology SelectCare");
		selectcare.setScreenName("radiology-selectcare");
		selectcare.setXpathKey("radiology.selectcare");
		selectcare.setUrl("https://www.radiologysolutions.bayer.com/service/selectcare/");
		screens.put(selectcare.getScreenName(), selectcare);
		
		RadiologyScreen advisory = new RadiologyScreen();
		advisory.setBatchName("Radiology IT Advisory");
		advisory.setScreenName("radiology-advisory");
		advisory.setXpathKey("radiology.advisory");
		advisory.setUrl("https://www.radiologysolutions.bayer.com/service/information-technology-advisory/");
		screens.put(advisory.getScreenName(), advisory);
	}

	
}
