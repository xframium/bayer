package com.bayer.marketing.animalHealth.petBasics.tests.All.SignIn.steps;


import java.awt.Dialog.ModalExclusionType;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.test.step.AbstractStep;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SignInSteps extends AbstractStep  {
	
	//protected String url = "https://www.petbasics.com/";
    public SignInSteps() {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	HomePage urlVar = new HomePage();
    	String url = urlVar.getUrl();
    	System.out.println(url);
    	
    	waitForElement( "modal.window", webDriver, 15 );
    	BayerWebElement window = getElement( "modal.window", webDriver );
    	
    	if (window.isDisplayed()) {
    		waitForElement( "modal.skip", webDriver, 15 );
        	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    		skipButton.click();
		}
    	
    	
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	waitForElement( "home.whywedoit", webDriver, 15 );
    	BayerWebElement whywedo = getElement( "home.whywedoit", webDriver );
    	whywedo.click();
    	waitForElement( "waitForFlag", webDriver, 15 );
    	webDriver.navigate().to(url);
    	
    	//Read Login Info from CSV file 
    	String csvFile = "com/bayer/exampleTemplate/TestData.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] userData = line.split(cvsSplitBy);

                System.out.println("First Name:" + userData[1] + " , Last Name:" + userData[2] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        return true;
    }

}
