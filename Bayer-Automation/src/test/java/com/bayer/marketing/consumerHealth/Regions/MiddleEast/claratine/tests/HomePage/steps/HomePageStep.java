package com.bayer.marketing.consumerHealth.Regions.MiddleEast.claratine.tests.HomePage.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import com.bayer.common.Accessibility;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class HomePageStep extends AbstractStep
{

    public HomePageStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	HomePage urlVar = new HomePage();
    	String url = urlVar.getUrl();
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
    	waitForElement( "claritin.home.about", webDriver, 15 );
        BayerWebElement exampleImage = getElement("bayer.home.about", webDriver);
        exampleImage.click();
        waitForElement( "claritin.key", webDriver, 15 );
       
        new Accessibility();
        
        webDriver.navigate().to(url);
        
        waitForElement( "claritin.home.search", webDriver, 15 );
        BayerWebElement exampleSearch = getElement("claritin.home.search", webDriver);
        exampleSearch.click();
        exampleSearch.sendKeys("Bayer 04");
        BayerWebElement exampleSearchBTN = getElement("claritin.home.searchBtn", webDriver);
        exampleSearchBTN.click();
        new Accessibility();
        waitForElement( "claritin.key", webDriver, 15 );
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
        
        return true;
        
    }

}
