package com.bayer.corp.Radiology.tests.AppliToolsTest.steps;

import java.util.List;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.FixedCutProvider;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResults;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import com.bayer.BayerWebDriver;
import com.bayer.corp.Radiology.tests.AppliToolsTest.RadiologyNavRun;
import com.bayer.test.step.AbstractStep;
import com.bayer.validation.visual.ApplitoolsTestResultsHandler;

public class RadiologyNavStep extends AbstractStep {
	private static final String applitoolsKey = "x836lZBCjnk0zlODvlQFDN906107j109S9nD0d101j5I8OX9o110";
	private static List<String> urlList;
	public static int rowNumber = 0;
	public static String newUrl = "";

	public RadiologyNavStep(List<String> urlNames) {
		super("message", "error message");
		this.urlList = urlNames;
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		Eyes eyes = null;
		BatchInfo batchName = new BatchInfo("RadiologyStep");
		String platformName = webDriver.getCapabilities().getCapability("platformName").toString();
		TestResults testResult = null;
		ApplitoolsTestResultsHandler testResultHandler = null;
		String viewKey = "KL99zxdo4peUIDFNMwyVe7F104Lf2F5b2l57PghSmU106vVA110";
		RectangleSize rectangleSize=new RectangleSize(1510, 900);
		int urlCount = 1;
		for (String url : urlList) {
			eyes = new Eyes();
			eyes.setApiKey(applitoolsKey);
			try {
				// eyes.setProxy(new ProxySettings("http://ptb-proxy.na.bayer.cnb/"));
				webDriver.asRemote().get(url);
				eyes.setBatch(batchName);
				eyes.setForceFullPageScreenshot(true);
				eyes.setStitchMode(StitchMode.CSS);
				System.out.println("URL : "+url);
				if ((platformName.equals("IOS")) || (platformName.equals("Android"))) {
					System.out.println("Verfication on either IOS or Android mobile device");
					eyes.open(webDriver.asRemote(), "RadiologyStep",
							"RadiologyStep: " + webDriver.getCapabilities().getCapability("platformName"));

				} else {
					System.out.println("Verfication on system browser");
					eyes.open(webDriver.asRemote(), "Radiology Web", "RadiologyStep"
							+ webDriver.getCapabilities().getCapability("platformName") + " Pagenumber:" + urlCount,
							rectangleSize);

				}
				if (webDriver.getCapabilities().getCapability("platformName").equals("IOS")) {
					eyes.setImageCut(new FixedCutProvider(34, 21, 0, 0)); // remove URL and footer. values = (header,
																			// footer, left, right)
				}
				eyes.checkWindow();
				testResult = eyes.close(false);
				try {
					testResultHandler = new ApplitoolsTestResultsHandler(testResult, viewKey);
					testResultHandler.downloadDiffs("C:/Bayer/Radiology");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} finally {
				eyes.abortIfNotClosed();
			}
			urlCount++;
		}
		return true;

	}
}
