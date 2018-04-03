package com.bayer.corp.Radiology.tests.AppliToolsTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.bayer.common.Navigate;
import com.bayer.corp.Radiology.tests.AppliToolsTest.steps.RadiologyNavStep;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

public class RadiologyNavRun extends AbstractTest {

	private String url = "https://www.radiologysolutions.bayer.com/";
	private int parentRowNum = 1;

	public String getUrl() {
		return url;
	}

	@TestDescriptor(testName = "Radiology Solutions Navigation Test")
	@Test(dataProvider = "deviceList", enabled = true)
	public void radiologyNavigateTest(DeviceContainer dC) {
		List<String> urlNames = new ArrayList<String>();
		try {
			File file = new File("src/test/java/com/bayer/corp/Radiology/config/TestData/urlList.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				urlNames.add(line);
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Number of URL's which needs verification : " + urlNames.size());
		executeSteps(new Step[] { new Navigate(url), new RadiologyNavStep(urlNames) });

	}
}
