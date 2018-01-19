package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    	
        if(webDriver.getPageSource().contains("Datenschutzerklärung")) {
        	waitForElement( "gdpr.privacyV1", webDriver, 15 );
            BayerWebElement privacy1 = getElement("gdpr.privacyV1", webDriver);
            privacy1.click();
        	//verify 5 elements on privacy page
        }
        else if(webDriver.getPageSource().contains("your Text")) {
        	//click privacy
        	//verify 5 elements on privacy page
        }
        else if(webDriver.getPageSource().contains("your Text")) {
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
