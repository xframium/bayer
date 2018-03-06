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
    	   eyes.open(webDriver.asRemote(), "Claritin Desktop", "Claritin Shopping Cart Test" + webDriver.getCapabilities().getCapability("platformName"));
    	   
    	}
    	else {
    	   System.out.println("Pass else statement");
    	   eyes.open(webDriver.asRemote(), "Claritin Desktop", "Claritin Shopping Cart Test" + webDriver.getCapabilities().getCapability("platformName") ); 
    	   
    	} 
    	

    	
  
    	 BatchInfo ClaritinCart = new BatchInfo("ClaritinCart");
    	   eyes.setBatch(ClaritinCart);
           eyes.setForceFullPageScreenshot(true);
           
           eyes.setStitchMode(StitchMode.CSS);
          
           eyes.checkWindow(); 
    	
    	waitForElement("claritin.shoppingcart.mobileCheck", webDriver, 15);
    	BayerWebElement mobileCheck= getElement("claritin.shoppingcart.mobileCheck", webDriver);
    	
    	if (mobileCheck.isDisplayed()){
    		
    		BayerWebElement cartMobile= getElement("claritin.shoppingcart.button.mobile", webDriver);
    		cartMobile.click();
    		
    		eyes.checkWindow(); 
    		
    		waitForElement("claritin.shoppingcart.empty.continue", webDriver, 15);
    		BayerWebElement cartContinue1= getElement("claritin.shoppingcart.empty.continue", webDriver);
    		BayerWebElement cartX1= getElement("claritin.shoppingcart.X", webDriver);
    		
    		if(cartContinue1.isDisplayed()){
    			cartContinue1.click();
    		}else{
    			cartX1.click();
    		}
    		
    		
        	BayerWebElement product24hr1= getElement("claritin.shoppingcart.product24hr", webDriver);
        	product24hr1.click();
        	
        	waitForElement("claritin.shoppingcart.addtocart.mobile", webDriver, 15);
        	BayerWebElement addMobile= getElement("claritin.shoppingcart.addtocart.mobile", webDriver);
        	addMobile.click();
        	
        	waitForElement("claritin.shoppingcart.gotocart", webDriver, 15);
        	BayerWebElement goToCart1= getElement("claritin.shoppingcart.gotocart", webDriver);
        	goToCart1.click();
        	
        	waitForVisible("claritin.shoppingcart.amazon", webDriver, 15);
        	eyes.checkWindow(); 
        	BayerWebElement amazonTab1= getElement("claritin.shoppingcart.amazon", webDriver);
        	amazonTab1.click();
          	
        	waitForVisible("claritin.shoppingcart.amazon.buyMobile", webDriver, 15);
        	BayerWebElement amazonBuy1= getElement("claritin.shoppingcart.amazon.buyMobile", webDriver);
        	amazonBuy1.click();
        	
        	waitForVisible("claritin.shoppingcart.amazon.proceed", webDriver, 15);
        	BayerWebElement proceed1= getElement("claritin.shoppingcart.amazon.proceed", webDriver);
        	proceed1.click();
        	
        	
      
        	
    		
    	}else{
    		BayerWebElement cartDesktop= getElement("claritin.shoppingcart.button.desktop", webDriver);
    		cartDesktop.click();
    		
    		eyes.checkWindow(); 
    		
    		waitForElement("claritin.shoppingcart.empty.continue", webDriver, 15);
    		BayerWebElement cartContinue2= getElement("claritin.shoppingcart.empty.continue", webDriver);
    		BayerWebElement cartX2= getElement("claritin.shoppingcart.X", webDriver);
    		
    		if(cartContinue2.isDisplayed()){
    			cartContinue2.click();
    		}else{
    			cartX2.click();
    		}
    		
        	BayerWebElement product24hr2= getElement("claritin.shoppingcart.product24hr", webDriver);
        	product24hr2.click();
        	
        	waitForElement("claritin.shoppingcart.addtocart.desktop", webDriver, 15);
        	BayerWebElement addDesktop= getElement("claritin.shoppingcart.addtocart.desktop", webDriver);
        	addDesktop.click();
        	
        	waitForElement("claritin.shoppingcart.gotocart", webDriver, 15);
        	BayerWebElement goToCart2= getElement("claritin.shoppingcart.gotocart", webDriver);
        	goToCart2.click();
        	
        	waitForVisible("claritin.shoppingcart.amazon", webDriver, 15);
        	BayerWebElement amazonTab2= getElement("claritin.shoppingcart.amazon", webDriver);
        	eyes.checkWindow(); 
          	amazonTab2.click();
          	
          	waitForVisible("claritin.shoppingcart.amazon.buyDesktop", webDriver, 15);
        	BayerWebElement amazonBuy2= getElement("claritin.shoppingcart.amazon.buyDesktop", webDriver);
        	amazonBuy2.click();
        	
         	waitForVisible("claritin.shoppingcart.amazon.proceed", webDriver, 15);
        	BayerWebElement proceed2= getElement("claritin.shoppingcart.amazon.proceed", webDriver);
        	proceed2.click();
        	
    	}
    	

    	
    	
    	
    	eyes.close();
    	

        return true;
        
    }

}



