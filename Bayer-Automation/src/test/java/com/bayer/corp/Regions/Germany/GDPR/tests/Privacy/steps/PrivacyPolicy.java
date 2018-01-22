package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.utility.StructureValidator;
import com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.*;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class PrivacyPolicy extends AbstractStep
{

    public PrivacyPolicy()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	PrivacyTest urlVar = new PrivacyTest();
    	String url = urlVar.getUrl();
    	/*String fileName = "C://urlList.txt";

    	try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			
    		String line;
    		while ((line = br.readLine()) != null) {
    			System.out.println(line);
    		}

    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	*/
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
        
    	waitForElement( "bayer.key", webDriver, 15 );
    	BayerWebElement logo = getElement("bayer.key", webDriver);
    	
        if(webDriver.getPageSource().contains("Datenschutzerklärung")) {
           waitForElement( "gdpr.privacyV1", webDriver, 15 );
           BayerWebElement privacy1 = getElement("gdpr.privacyV1", webDriver);
           privacy1.click();
           waitForElement( "bayer.key", webDriver, 15 );
           webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           //logo.click();
            //System.out.println("Passed if 1");
        	//verify 5 elements on privacy page
           if(webDriver.getPageSource().contains("Nutzung der Website")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
           
           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
           
           if(webDriver.getPageSource().contains("Profiling")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
           
           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
           
           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
            //new StructureValidator("Nutzung der Website", "/Bayer-Automation/src/test/java/com/bayer/corp/Regions/Germany/GDPR/tests/Privacy/PrivacyKeywordValidation.xml");
            //new StructureValidator("Informationen über Ihre Rechte", "/Bayer-Automation/src/test/java/com/bayer/corp/Regions/Germany/GDPR/tests/Privacy/PrivacyKeywordValidation.xml");
            //new StructureValidator("Profiling", "/Bayer-Automation/src/test/java/com/bayer/corp/Regions/Germany/GDPR/tests/Privacy/PrivacyKeywordValidation.xml");
            //new StructureValidator("Datenübertragbarkeit", "/Bayer-Automation/src/test/java/com/bayer/corp/Regions/Germany/GDPR/tests/Privacy/PrivacyKeywordValidation.xml");
            //new StructureValidator("Aufsichtsbehörde", "/Bayer-Automation/src/test/java/com/bayer/corp/Regions/Germany/GDPR/tests/Privacy/PrivacyKeywordValidation.xml");
            
            
            
        }
        else if(webDriver.getPageSource().contains("Datenschutzinformation")) {
        	System.out.println("Passed if 2");
        	//click privacy
        	//verify 5 elements on privacy page
        }
        else if(webDriver.getPageSource().contains("Datenschutz")) {
        	System.out.println("Passed if 3");
        	//click privacy
        	//verify 5 elements on privacy page
        }
        else if(webDriver.getPageSource().contains("Datenschutzpolicy")) {
        	System.out.println("Passed if 4");
        	//click privacy
        	//verify 5 elements on privacy page
        }	
        else {
        	System.out.println("Nothing found.");
        }
        
        
        /*new StructureValidator("Privacy", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        new StructureValidator("Data", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        new StructureValidator("PersonalData", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        new StructureValidator("Use", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        new StructureValidator("Access Rights", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        
        ///////////////Example Code Structure///////////////////
        /*BayerWebElement emailAddress = getElement( "login.emailAddress", webDriver );
        emailAddress.sendKeys( "test@bayer.com" );
        
        BayerWebElement confirmEmailAddress = getElement( "login.confirmEmailAddress", webDriver );
        confirmEmailAddress.sendKeys( "test@bayer.com" );
        
        BayerWebElement password = getElement( "login.password", webDriver );
        password.sendKeys( "password" );
        
        
        String bImage = password.getCssValue( "color" );
        */
        
        return true;
        
    }

}
