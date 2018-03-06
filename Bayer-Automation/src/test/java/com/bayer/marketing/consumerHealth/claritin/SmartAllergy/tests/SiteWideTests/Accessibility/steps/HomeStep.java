package com.bayer.marketing.consumerHealth.claritin.SmartAllergy.tests.SiteWideTests.Accessibility.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.corp.MSMS.tests.HomePage.HomePage;
import com.bayer.exampleTemplate.tests.Example.ExamplePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class HomeStep extends AbstractStep
{

    public HomeStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	HomePage urlVar = new HomePage();
    	String url = urlVar.getUrl();
    	
    	/*webDriver.switchTo().alert();
    	//Selenium-WebDriver Java Code for entering Username & Password as below:
    	webDriver.findElement(By.id("userID")).sendKeys("CHD102832\bsluser");
    	webDriver.findElement(By.id("password")).sendKeys("Photon@123");
    	webDriver.switchTo().alert().accept();
    	webDriver.switchTo().defaultContent();
    	*/
    	waitForElement( "bayer.home.about", webDriver, 15 );
        BayerWebElement exampleImage = getElement("bayer.home.about", webDriver);
        exampleImage.click();
        waitForElement( "bayer.key", webDriver, 15 );
       
        //new Accessibility();
        
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
