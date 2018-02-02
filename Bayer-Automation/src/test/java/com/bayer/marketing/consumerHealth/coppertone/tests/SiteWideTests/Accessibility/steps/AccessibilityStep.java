package com.bayer.marketing.consumerHealth.coppertone.tests.SiteWideTests.Accessibility.steps;

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

public class AccessibilityStep extends AbstractStep
{

    public AccessibilityStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	ExamplePage urlVar = new ExamplePage();
    	String url = urlVar.getUrl();
    	
    	waitForElement( "bayer.home.about", webDriver, 15 );
        BayerWebElement exampleImage = getElement("bayer.home.about", webDriver);
        exampleImage.click();
        waitForElement( "bayer.key", webDriver, 15 );
       
        //new Accessibility();
        
        webDriver.navigate().to(url);
        
        waitForElement( "bayer.home.search", webDriver, 15 );
        BayerWebElement exampleSearch = getElement("bayer.home.search", webDriver);
        exampleSearch.click();
        exampleSearch.sendKeys("Bayer 04");
        BayerWebElement exampleSearchBTN = getElement("bayer.home.searchBtn", webDriver);
        exampleSearchBTN.click();
        //new Accessibility();
        waitForElement( "bayer.key", webDriver, 15 );
        webDriver.navigate().to(url);
        
        ///////////////Example Code Structure///////////////////
        /*BayerWebElement emailAddress = getElement( "login.emailAddress", webDriver );
        emailAddress.sendKeys( "test@bayer.com" );
        
        BayerWebElement confirmEmailAddress = getElement( "login.confirmEmailAddress", webDriver );
        confirmEmailAddress.sendKeys( "test@bayer.com" );
        
        BayerWebElement password = getElement( "login.password", webDriver );
        password.sendKeys( "password" );
        
        
        String bImage = password.getCssValue( "color" );
        */
        
        
        /*String csvFile = "src/test/java/com/bayer/exampleTemplate/config/TestData.csv";
        String line = "";
        String cvsSplitBy = ",";
        int x = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while (((line = br.readLine()) != null) && (x <=2) ) {
        		
                // use comma as separator
                String[] userData = line.split(cvsSplitBy);

                System.out.println(userData[1] + " " + userData[2]);
                x++; 	
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        //new Accessibility();
        return true;
        
    }

}
