package com.bayer.exampleTemplate.tests.AppliToolsExample.steps;


import com.bayer.exampleTemplate.tests.AppliToolsExample.ExamplePage;
import com.bayer.BayerWebDriver;

import com.bayer.test.step.AbstractStep;
import com.bayer.test.step.factory.Step;
import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.FixedCutProvider;
import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import com.bayer.validation.visual.*;

import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;

import com.bayer.BayerWebElement;
import java.io.BufferedReader;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import com.bayer.common.Accessibility;
import com.bayer.common.Navigate;
import com.bayer.common.utility.*;
import com.bayer.corp.Radiology.tests.AppliToolsTest.AppliToolsAllPages;
import com.gargoylesoftware.htmlunit.javascript.host.event.DragEvent;
import com.sun.jna.platform.unix.X11;
import io.appium.java_client.pagefactory.WindowsBy;
import io.appium.java_client.remote.MobileCapabilityType;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.TestResults;
import com.applitools.utils.*;
import com.applitools.eyes.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.reporters.jq.ResultsByClass;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.spec.ECPrivateKeySpec;
import java.util.concurrent.TimeUnit;


public class AltArchPatientStep extends AbstractStep
{
	private static final int HEADER_SIZE = 65; // Should be adopted according to device
    private static final String USER_NAME = "colin.ebneth@bayer.com";
    private static final String PASSWORD = "CPowell18!";
    //private static final String MANUFACTURER = "Samsung";
    //private static final String MODEL = "Galaxy S7";
    private static final String applitoolsKey = "x836lZBCjnk0zlODvlQFDN906107j109S9nD0d101j5I8OX9o110";
    public static int rowNumber  = 0;
	public static String newUrl = "";
    public AltArchPatientStep(String url, int parentRowNum)
    {
        super( "message", "error message" );
        this.newUrl = url;
        this.rowNumber = parentRowNum;
    }
    
    @Override
    protected boolean _executeStep(BayerWebDriver webDriver){	
    	String [] urlNames = new String[100];
		int numEntries = 0;
		try {
			File file = new File("src/test/java/com/bayer/exampleTemplate/config/TestData/urlList.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			int i = 0;
			while ((line = bufferedReader.readLine()) != null) {
				urlNames[i] = line;
				numEntries++;
				i++; }
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("For loop");
		
		
			
	    	ExamplePage page = new ExamplePage();
	    	Eyes eyes = new Eyes();
	
	        eyes.setApiKey(applitoolsKey);
		
	        //webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        try {
	        	for(int c = 0; c < numEntries; c++) { 
	    			String url = urlNames[c];
	    			System.out.println(url);
	    			webDriver.navigate().to(url);
			        	eyes.setProxy(new ProxySettings("http://ptb-proxy.na.bayer.cnb/"));
			        	
			            webDriver.asRemote().get(page.getUrl());
			            BatchInfo batchName = new BatchInfo("ArchStep");
			            eyes.setBatch(batchName);
			            eyes.setForceFullPageScreenshot(true);
			            //eyes.setRegionToCheck(regionToCheck);
			            eyes.setStitchMode(StitchMode.CSS);
			            //eyes.setImageCut(new FixedCutProvider(HEADER_SIZE , 0, 0, 0));
			            //eyes.setBatch(DrScholls);
			            String platformName = webDriver.getCapabilities().getCapability("platformName").toString();
			            System.out.println(platformName);
			           if((platformName.equals("IOS"))||(platformName.equals("Android")))
			           { 
			        	   System.out.println("Pass if statement");
			        	   eyes.open(webDriver.asRemote(), "ArchStep", "ArchPatient: " + webDriver.getCapabilities().getCapability("platformName"));
			        	   
			           }
			           else {
			        	   System.out.println("Pass else statement");
			        	   eyes.open(webDriver.asRemote(), "ArchStep Web", "ArchStep" + webDriver.getCapabilities().getCapability("platformName")+" Pagenumber:"+c, new RectangleSize(1510,900)); 
			        	   
			           }
			           if (webDriver.getCapabilities().getCapability("platformName").equals("IOS")) {
			               eyes.setImageCut(new FixedCutProvider(34,21,0,0)); //remove URL and footer. values = (header, footer, left, right)
			       		}
			           //eyes.open(webDriver.asRemote(), "Dr.Scholl's Mobile", "DrScholls " +webDriver.getCapabilities().getPlatform()+" Test" + 3);
			           //eyes.check("chart", Target.region(By.));
			           eyes.checkWindow();
           
	        	}//end for loop
           TestResults testResult= eyes.close(false);
           String viewKey ="KL99zxdo4peUIDFNMwyVe7F104Lf2F5b2l57PghSmU106vVA110";
           try {
			ApplitoolsTestResultsHandler testResultHandler= new ApplitoolsTestResultsHandler(testResult,viewKey);
			testResultHandler.downloadDiffs("H:/Personal Data/Applitools/ArchPatient");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
           
           // eyes.close();
            //TestResults results = eyes.close(false);
            //assertEquals(true, results.isPassed());
        } finally {
        	
            eyes.abortIfNotClosed();
            //driver1.quit();

}
        return true;
}
}
