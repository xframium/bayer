package com.bayer.exampleTemplate.tests.AppliToolsExample.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.exampleTemplate.tests.Example.ExamplePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;
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
    public ExampleStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep(BayerWebDriver driver1){	
    	ExamplePage page = new ExamplePage();
    	Eyes eyes = new Eyes();

        eyes.setApiKey(applitoolsKey);

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

       RemoteWebDriver driver2 = new RemoteWebDriver(url, driver1.getCapabilities());

        try {
        	eyes.setProxy(new ProxySettings("http://ptb-proxy.na.bayer.cnb/"));
            driver2.get(page.getUrl());

            eyes.setForceFullPageScreenshot(true);
            eyes.setStitchMode(StitchMode.CSS);
            //eyes.setImageCut(new FixedCutProvider(HEADER_SIZE , 0, 0, 0));
            eyes.open(driver2, "TestPage1", "Test1", new RectangleSize(1510,900));
            
            eyes.checkWindow("Main Page");
            
            eyes.close();
            //TestResults results = eyes.close(false);
            //assertEquals(true, results.isPassed());

        } finally {

            eyes.abortIfNotClosed();


}
        return true;
}
}
