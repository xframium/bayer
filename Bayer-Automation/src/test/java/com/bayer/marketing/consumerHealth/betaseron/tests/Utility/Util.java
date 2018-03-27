package com.bayer.marketing.consumerHealth.betaseron.tests.Utility;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.FileLogger;
import com.applitools.eyes.FixedCutProvider;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.StdoutLogHandler;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;

public class Util {
	
	private static final String osType="WINDOWS";
	private static final String platFormName="platformName";
	private static final String applitoolsKey = "x836lZBCjnk0zlODvlQFDN906107j109S9nD0d101j5I8OX9o110";
	private static String randomTag="";

	public static void scrollToElement(BayerWebDriver webDriver, BayerWebElement webElment, WebDriverWait wait) {
		if(!osType.equals(webDriver.getOsType())) {
			Point point = webElment.getLocation();
			((JavascriptExecutor) webDriver).executeScript("return window.title;");
			wait = new WebDriverWait(webDriver, 30);
			((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0," + (point.getY() - 200) + ");");
		}
	}
	
	public static void moveToElement(BayerWebDriver webDriver, BayerWebElement webElment, WebDriverWait wait) {
		
		JavascriptExecutor jse = (JavascriptExecutor)webDriver;
		Point point = webElment.getLocation();
		((JavascriptExecutor) webDriver).executeScript("return window.title;");
		 wait = new WebDriverWait(webDriver, 30);
		((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0," + (point.getY()) + ");");
	}

	public static void recallBaseURL(BayerWebDriver webDriver, String url) {
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		webDriver.get(url);
		wait = new WebDriverWait(webDriver, 10);

	}
	
	public static Eyes initilizeEyesServer(BayerWebDriver webDriver,String url,String batchInfo,String appName,String testName) {
		Eyes eyes = new Eyes();
        eyes.setApiKey(applitoolsKey);
        //eyes.setProxy(new ProxySettings("http://ptb-proxy.na.bayer.cnb/"));
        webDriver.asRemote().get(url);
        BatchInfo drScholls = new BatchInfo(batchInfo);
        eyes.setBatch(drScholls);
        eyes.setForceFullPageScreenshot(true);
        eyes.setStitchMode(StitchMode.CSS);
        
        String platformName = webDriver.getCapabilities().getCapability(platFormName).toString();
       if((platformName.equals("IOS"))||(platformName.equals("Android"))){ 
    	   eyes.open(webDriver.asRemote(), appName, testName + webDriver.getCapabilities().getCapability(platFormName));
         }
       else {
    	    eyes.open(webDriver.asRemote(), appName, testName + webDriver.getCapabilities().getCapability(platFormName), new RectangleSize(1440,900)); 
    	   //eyes.open(webDriver.asRemote(), appName, testName + webDriver.getCapabilities().getCapability(platFormName), new RectangleSize(1024,768)); 
       }
       if (platformName.equals("IOS")) {
           eyes.setImageCut(new FixedCutProvider(34,21,0,0)); //remove URL and footer. values = (header, footer, left, right)
   		}
      
        return eyes;
	}
	
	public static void takeScreenShot(Eyes eyes,String testName) {
        eyes.checkWindow(testName);
	}
	
	public static void closeEyes(Eyes eyes) {
		eyes.close();
		eyes.abortIfNotClosed();
	}
	
	public static void initilizeEyesServerAndTakeScreenShot(BayerWebDriver webDriver,String url,String batchInfo,String appName,String testName) {
		Eyes eyes = new Eyes();
        eyes.setApiKey(applitoolsKey);
        eyes.setLogHandler(new StdoutLogHandler(true));
        try {
        eyes.setLogHandler(new FileLogger("C:\\Bayer\\file.log", true, true));	
		webDriver.asRemote().get(url);
        BatchInfo batchName = new BatchInfo(batchInfo);
        eyes.setBatch(batchName);
        eyes.setForceFullPageScreenshot(true);
        eyes.setStitchMode(StitchMode.CSS);
        String platformName = webDriver.getCapabilities().getCapability("platformName").toString();
        System.out.println(platformName);
       if((platformName.equals("IOS"))||(platformName.equals("Android")))
       { 
    	   eyes.open(webDriver.asRemote(), appName, testName + webDriver.getCapabilities().getCapability("platformName"));
    	   
       }
       else {
    	   eyes.open(webDriver.asRemote(), appName, testName + webDriver.getCapabilities().getCapability("platformName")+" Pagenumber:"+0, new RectangleSize(1510,900)); 
    	   
       }
       if (webDriver.getCapabilities().getCapability("platformName").equals("IOS")) {
           eyes.setImageCut(new FixedCutProvider(34,21,0,0)); // 120remove URL and footer. values = (header, footer, left, right)
   		}
        eyes.checkWindow();
        eyes.close();
        }
		finally {
			eyes.abortIfNotClosed();
		}
	}
	
}
