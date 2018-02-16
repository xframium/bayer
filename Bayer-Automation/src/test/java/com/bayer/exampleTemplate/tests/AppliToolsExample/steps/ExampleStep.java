package com.bayer.exampleTemplate.tests.AppliToolsExample.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.exampleTemplate.tests.AppliToolsExample.ExamplePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

import io.appium.java_client.pagefactory.WindowsBy;
import io.appium.java_client.remote.MobileCapabilityType;

import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResults;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.reporters.jq.ResultsByClass;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

public class ExampleStep extends AbstractStep
{
	private static final int HEADER_SIZE = 65; // Should be adopted according to device
    private static final String USER_NAME = "colin.ebneth@bayer.com";
    private static final String PASSWORD = "CPowell18!";
    //private static final String MANUFACTURER = "Samsung";
    //private static final String MODEL = "Galaxy S7";
    private static final String applitoolsKey = "x836lZBCjnk0zlODvlQFDN906107j109S9nD0d101j5I8OX9o110";
    public static int rowNumber  = 0;
	public static String newUrl = "";
    public ExampleStep(String url, int parentRowNum)
    {
        super( "message", "error message" );
        this.newUrl = url;
        this.rowNumber = parentRowNum;
    }
    
    @Override
    protected boolean _executeStep(BayerWebDriver webDriver){	
    	/*try
      	{	
    		BayerWebElement loginConf1 = waitForVisible("bayer.loginPopup", driver1, 15);
  	    	if(loginConf1.isDisplayed()){
  	    		waitForElement( "bayer.loginUsername", driver1, 15 );
  	    		BayerWebElement login = getElement("bayer.loginUsername", driver1);
  	    		login.sendKeys("NAPilot");
  	    		waitForElement( "bayer.loginPassword", driver1, 15 );
  	    		BayerWebElement password = getElement("bayer.loginPassword", driver1);
  	    		login.sendKeys("xa=Ym52h");
  	    	}

      	}
      	catch( Exception e )
      	{
      	}
    	*/
    	ExamplePage page = new ExamplePage();
    	Eyes eyes = new Eyes();

        eyes.setApiKey(applitoolsKey);
		/*
        String user = null;
		try {
			user = URLEncoder.encode(USER_NAME, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String password = null;
		try {
			password = URLEncoder.encode(PASSWORD, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        URL url = null;
		try {
			url = new URL("https://" + user + ":" + password + "@bayer.perfectomobile.com/nexperience/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
       RemoteWebDriver driver2 = new RemoteWebDriver(url, webDriver.getCapabilities());
	   */
        try {
        	eyes.setProxy(new ProxySettings("http://ptb-proxy.na.bayer.cnb/"));
            webDriver.asRemote().get(page.getUrl());

            eyes.setForceFullPageScreenshot(true);
            eyes.setStitchMode(StitchMode.CSS);
            //eyes.setImageCut(new FixedCutProvider(HEADER_SIZE , 0, 0, 0));
            //eyes.setBatch(DrScholls);
            eyes.open(webDriver.asRemote(), "Dr.Scholl's", "Dr.Scholl's" + rowNumber, new RectangleSize(1510,900));
            eyes.checkWindow("Dr.Scholl's Page #" + rowNumber);
            
            eyes.close();
            //TestResults results = eyes.close(false);
            //assertEquals(true, results.isPassed());
        } finally {

            eyes.abortIfNotClosed();
            //driver1.quit();

}
        return true;
}
}
