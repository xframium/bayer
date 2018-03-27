package com.bayer.corp.Radiology.tests.products;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.corp.Radiology.tests.common.RadiologyNavStep;
import com.bayer.corp.Radiology.tests.common.ScreenIdentifier;
import com.bayer.corp.Radiology.tests.products.steps.ProductsNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class ProductsNavRun extends AbstractTest {
	
	public String url = "https://www.radiologysolutions.bayer.com/products/";

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Radiology Products visual validation")
	@Test(dataProvider = "deviceList", enabled = true)
	public void navigateRadiologyProducts(DeviceContainer dC) {
		//executeSteps(new Step[] { new Navigate(url), new ProductsNavStep()});
		executeSteps(new Step[] { new Navigate(url), new RadiologyNavStep(ScreenIdentifier.PRODUCTS.name())});
	}
}

