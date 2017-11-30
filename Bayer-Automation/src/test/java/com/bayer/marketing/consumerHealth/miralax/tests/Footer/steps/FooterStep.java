package com.bayer.marketing.consumerHealth.miralax.tests.Footer.steps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class FooterStep extends AbstractStep
{

    public FooterStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
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
        
    	waitForElement( "bayer.home.img1", webDriver, 15 );
        BayerWebElement exampleImage = getElement("bayer.home.img1", webDriver);
        exampleImage.click();
        waitForElement( "betaseron.key", webDriver, 15 );
        webDriver.navigate().to("https://www.bayer.com/");
        
        waitForElement( "bayer.home.search", webDriver, 15 );
        BayerWebElement exampleSearch = getElement("bayer.home.search", webDriver);
        exampleSearch.click();
        exampleSearch.sendKeys("Bayer 04");
        BayerWebElement exampleSearchBTN = getElement("bayer.home.searchBtn", webDriver);
        exampleSearchBTN.click();
        waitForElement( "bayer.key", webDriver, 15 );
        webDriver.navigate().to("https://www.bayer.com/");
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
