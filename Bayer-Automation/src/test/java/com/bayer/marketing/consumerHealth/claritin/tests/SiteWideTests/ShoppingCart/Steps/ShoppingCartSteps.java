package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.ShoppingCart.Steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.commons.collections.functors.IfClosure;import org.apache.commons.collections.functors.SwitchTransformer;
import org.apache.tools.ant.filters.LineContains.Contains;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
//import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.exampleTemplate.tests.Example.ExamplePage;
import com.applitools.eyes.selenium.Eyes;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.sun.jna.platform.unix.X11;

import junit.framework.Test;
import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResults;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;

public class ShoppingCartSteps extends AbstractStep
{

	private static final int HEADER_SIZE = 65; // Should be adopted according to device
    private static final String USER_NAME = "michael.ohandley.ext@bayer.com";
    private static final String PASSWORD = "Bayer1234";
    private static final String applitoolsKey = "x836lZBCjnk0zlODvlQFDN906107j109S9nD0d101j5I8OX9o110";
	
    public ShoppingCartSteps()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	
    	/*
    	ExamplePage page = new ExamplePage();
    	Eyes eyes = new Eyes();
    	eyes.setApiKey(applitoolsKey);
    	eyes.setProxy(new ProxySettings("http://ptb-proxy.na.bayer.cnb/"));
    	//eyes.open(webDriver.asRemote(), "Claritin Mobile", "Claritin Contact Us");
    	 
    	String platformName = webDriver.getCapabilities().getCapability("platformName").toString();
    	System.out.println(platformName);
    	if((platformName.equals("IOS"))||(platformName.equals("Android")))
    	{ 
    	   System.out.println("Pass if statement");
    	   eyes.open(webDriver.asRemote(), "Claritin Desktop", "Claritin Contact Test" + webDriver.getCapabilities().getCapability("platformName"));
    	   
    	}
    	else {
    	   System.out.println("Pass else statement");
    	   eyes.open(webDriver.asRemote(), "Claritin Desktop", "Claritin Contact Test" + webDriver.getCapabilities().getCapability("platformName") ); 
    	   
    	} 
    	

    	
    	//BayerWebElement xbutton = getElement( "claritin.policyPopup.button", webDriver );
    	 BatchInfo ClaritinContact = new BatchInfo("ClaritinContact");
    	   eyes.setBatch(ClaritinContact);
           eyes.setForceFullPageScreenshot(true);
           
           eyes.setStitchMode(StitchMode.CSS);
           //eyes.checkWindow(); 
*/
    	
    	
    	
    	
    	(//*[@class='morph-sct-cart-badge-indicator'])[1]
    	
    	
    	
    	//eyes.close();
    	

        return true;
        
    }

}



