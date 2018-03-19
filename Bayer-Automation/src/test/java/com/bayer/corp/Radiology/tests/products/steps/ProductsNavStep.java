package com.bayer.corp.Radiology.tests.products.steps;

import java.util.Set;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;
import com.bayer.BayerWebDriver;
import com.bayer.corp.Radiology.tests.common.RadiologyScreen;
import com.bayer.corp.Radiology.tests.common.RadiologyScreenUtility;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class ProductsNavStep extends AbstractStep {

	public ProductsNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		Set<String> screenKeyset = RadiologyScreenUtility.getProductScreens().keySet();

		for (String screen : screenKeyset) {
			this.initilizeAndTakeScreenShot(webDriver, screen);
		}

		return true;
	}

	private void initilizeAndTakeScreenShot(BayerWebDriver webDriver, String screen) {
		RadiologyScreen ascreen = RadiologyScreenUtility.getProductScreens().get(screen);

		Eyes eyes = Util.initilizeEyesServer(webDriver, ascreen.getUrl(), ascreen.getBatchName(),
				ascreen.getScreenName(), ascreen.getScreenName());

		Util.takeScreenShot(eyes, ascreen.getXpathKey());

		Util.closeEyes(eyes);
	}

}
