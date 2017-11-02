package com.bayer.marketing.animalHealth.petBasics.tests.All.SignIn.steps;


import java.awt.Dialog.ModalExclusionType;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.HomePage;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.win32.Netapi32Util.User;

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
    	
    	BayerWebElement window = getElement( "modal.window", webDriver );
    	
    	if (window.isDisplayed()) {
    		waitForElement( "modal.skip", webDriver, 15 );
        	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    		skipButton.click();
    			
		}
    	
    	//waitForElement( "waitForFlag", webDriver, 15 );
    	
    	BayerWebElement signin = getElement( "signin.button", webDriver );
    	signin.click();
    	//if(signin.isDisplayed()==false){
    		//section for iPhone and Galaxy	
    	//}
    	
    	
    	waitForElement("signin.popup", webDriver, 15);
    	
    	
    	//Read Login Info from CSV file 
    	String csvFile = "src/test/java/com/bayer/exampleTemplate/config/TestData.csv";
        String line = "";
        String cvsSplitBy = ",";
        //String userInfo[][] = new String[30][9];
        int i =0;
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while (((line = br.readLine()) != null) && (i <= 1)) {

                // use comma as separator
                String[] userData = line.split(cvsSplitBy);
                if(i==0) {
                	i++;  //skip test data header info
                }
                else {
                waitForElement("signin.emailInput", webDriver, 15 );
                BayerWebElement emailInput = getElement( "signin.emailInput", webDriver );
                System.out.println("User Email: " + userData[3]);
            	emailInput.sendKeys(userData[3]);
            	BayerWebElement passwordInput = getElement( "signin.passwordInput", webDriver );
            	System.out.println("User password: " + userData[8]);
            	passwordInput.sendKeys(userData[8]);
             	
             	BayerWebElement signIn2 = getElement( "signin.signin.btn", webDriver );
             	signIn2.click();
             	BayerWebElement error = getElement( "signin.errormsg", webDriver );
             	
             	if(error.isDisplayed()) {
                //System.out.println("First Name:" + userData[1] + " , Last Name:" + userData[2] + "]");
             		waitForElement("signin.register.getStarted", webDriver, 15 );
             		BayerWebElement started = getElement( "signin.register.getStarted", webDriver );
                 	started.click();
                 	waitForElement("signin.register.fname", webDriver, 15 );
	                BayerWebElement fname = getElement( "signin.register.fname", webDriver );
	                fname.sendKeys(userData[1]);
	                BayerWebElement lname = getElement( "signin.register.lname", webDriver );
	                lname.sendKeys(userData[2]); 
	                BayerWebElement email = getElement( "signin.register.email", webDriver );
	                email.sendKeys(userData[3]); 
	                BayerWebElement password = getElement( "signin.register.pword", webDriver );
	                password.sendKeys(userData[8]);
	                BayerWebElement password2 = getElement( "signin.register.confpword", webDriver );
	                password2.sendKeys(userData[8]);
	                waitForElement("signin.register.success", webDriver, 15 );
	                BayerWebElement gotoDash = getElement( "signin.register.success", webDriver );
	                gotoDash.click();
             	}
             	i++;
                }//end else
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        return true;
    }

}
