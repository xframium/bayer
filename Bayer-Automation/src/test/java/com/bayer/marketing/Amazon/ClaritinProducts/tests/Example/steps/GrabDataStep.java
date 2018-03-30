package com.bayer.marketing.Amazon.ClaritinProducts.tests.Example.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.bayer.validation.structure.RepeatedWordInFile;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.exampleTemplate.tests.Example.ExamplePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GrabDataStep extends AbstractStep {

    public GrabDataStep()
    {
        super( "message", "error message" );
    }
    private static String dateInserted = null;
    private static String urlName = null;
    private static String primeStatus = null;
    private static String productName = null;
    private static String reviewScale = null;
    private static String reviewKeywords = null;
    private static String numReviews = null;
    private static String questions = null;
    private static String prodDesc = null;
    private static String aboutProd = null;
    private static String prodKeywords = null;
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	
    	Date date = new Date();
    	Object currentDate = new java.sql.Timestamp(date.getTime());
    	
    	String connectionString =  
                "jdbc:sqlserver://HUSHNVC039Q:1433;"
                		+ "databaseName=AmazonData;"
                + "trustServerCertificate=true;"
                + "user=TestUser;"  
                + "password=Bayer@1234;";  
            // Declare the JDBC objects.  
            Connection connection = null;  
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("Class found ");
            }
            catch(java.lang.ClassNotFoundException e)
            {
                System.out.println("ClassNotFoundException: ");
                System.out.println(e.getMessage());
            }
            
    	ExamplePage urlVar = new ExamplePage();
    	String url = urlVar.getUrl();
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
    	
    	BayerWebElement signIn = waitForVisible("amazon.signIn", webDriver, 15);
        signIn.click();
        try {
        	BayerWebElement email = waitForVisible("amazon.email", webDriver, 15);
            email.sendKeys("ebneth@optonline.net");
            BayerWebElement emailConfirm = waitForVisible("amazon.emailSubmit", webDriver, 15);
            emailConfirm.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
        try {
        	BayerWebElement password = waitForVisible("amazon.passowrd", webDriver, 15);
            password.sendKeys("Astoria19");
            BayerWebElement passwordEmail = waitForVisible("amazon.passowrdSubmit", webDriver, 15);
            passwordEmail.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waitForElement( "amazon.search", webDriver, 15 );
        BayerWebElement search = getElement("amazon.search", webDriver);
        search.click();
        search.sendKeys("Claritin");
        BayerWebElement searchBtn = getElement("amazon.search.button", webDriver);
        searchBtn.click();
        waitForElement( "amazon.key", webDriver, 15 );
        
        for(int i=0;i<1;i++){
        	System.out.println("Counter is at " + i);
        	waitForElement( "amazon.result"+i, webDriver, 15 );
            BayerWebElement result = getElement("amazon.result"+i, webDriver);
            Util.scrollToElement(webDriver, result, wait);
            
            result.click();
            
            waitForElement( "amazon.key", webDriver, 15 );
            
            ///////////////retrieve data section/////////////////////
            urlName = webDriver.getCurrentUrl();
            System.out.println("Current url: "+urlName);
            try {
	            BayerWebElement prodName = waitForVisible("amazon.productTitle", webDriver, 15);
	            productName = prodName.getText();
	  	    	System.out.println("Product name: "+ productName);
            }
            catch (Exception e) {
				// TODO: handle exception
			}
            /*try {
            	BayerWebElement prime1 = waitForElement("amazon.primeBadge", webDriver, 15);
            	if(prime1.isDisplayed() == true){
            		System.out.println("Prime displayed");
            		primeStatus = "Amazon Prime";
            	}
            }
            catch (Exception e) {
				System.out.println("Prime badge not displayed");
			}
            try {
            	BayerWebElement prime2 = waitForElement("amazon.pantryBadge", webDriver, 15);
            	if(prime2.isDisplayed() == true){
            		System.out.println("Pantry displayed");
            		primeStatus = "Amazon Pantry";
            	}
            }
            catch (Exception e) {
				System.out.println("Pantry badge not displayed");
			}
			*/
  	    	try {
	  	    	BayerWebElement ratingScale = waitForElement("amazon.ratingPopover", webDriver, 15);
	            
				reviewScale = ratingScale.getText();
	  	    	System.out.println("Review Scale: "+ reviewScale);
  	    	}
  	    	catch (Exception e) {
				// TODO: handle exception
			}
  	    	try{
	  	    	BayerWebElement reviews = waitForElement("amazon.numReviews", webDriver, 15);
	            numReviews= reviews.getText();
	  	    	System.out.println("Number of reviews: "+ numReviews);
  	    	}
  	    	catch (Exception e) {
				numReviews="No reviews posted";
			}
  	    	try{
	  	    	BayerWebElement reviewsAll = waitForVisible("amazon.allReviews", webDriver, 15);
	  	    	Util.scrollToElement(webDriver, reviewsAll, wait);
	  	    	reviewsAll.click(); 
	  	    	reviewKeywords=""; //clear data from variable
	  	    	String temp ="";
	  	    	try {
	  	    		BayerWebElement topPositive = waitForVisible("amazon.topPositive", webDriver, 15);
	  	    		
	  	    		temp+=topPositive.getText();
	  	    		System.out.println(temp);
	  	    		
				} catch (Exception e) {
					System.out.println("Unable to grab top positive review");
				}
	  	    	try {
	  	    		BayerWebElement topCritical = waitForVisible("amazon.topCritical", webDriver, 15);
	  	    		temp+=topCritical.getText();
				} catch (Exception e) {
					System.out.println("Unable to grab top critical review");
				}
	            if(temp!=""){
	            	RepeatedWordInFile words = new RepeatedWordInFile(temp);
	  	    		reviewKeywords+=words.getOutput();
	            }
	  	    	System.out.println("Keyword string: "+ reviewKeywords);
	  	    	Util.scrollToElement(webDriver, reviewsAll, wait);
	  	    	webDriver.navigate().back();
  	    	}
  	    	catch (Exception e) {
				numReviews="No reviews posted";
				//webDriver.navigate().back();
			}
  	    	try {
	  	    	BayerWebElement numQuestions = waitForVisible("amazon.numQuestions", webDriver, 15);
	            questions= numQuestions.getText();
	  	    	System.out.println("Number of questions answered: "+ questions);
  	    	} 
  	    	catch (Exception e) {
				questions = "No questions answered";
			}
  	    	try {
	  	    	BayerWebElement productDesc = waitForVisible("amazon.prodDesc", webDriver, 15);
	            prodDesc= productDesc.getText();
	  	    	System.out.println("Product Description: "+ prodDesc);
  	    	} 
  	    	catch (Exception e) {
				prodDesc = "No product Description";
			}
  	    	try {
	  	    	BayerWebElement productDesc = waitForVisible("amazon.aboutProd", webDriver, 15);
	            aboutProd= productDesc.getText();
	  	    	System.out.println("About the Product Description: "+ aboutProd);
  	    	} 
  	    	catch (Exception e) {
				aboutProd = "No about the product information";
			}
  	    	
  	    	///////////////retrieve data section/////////////////////
            try {
            	String prodKeys = "";
            	prodKeys = aboutProd + prodDesc;
				RepeatedWordInFile prod = new RepeatedWordInFile(prodKeys);
				prodKeywords = prod.getOutput();
			} catch (Exception e) {
				// TODO: handle exception
			}
  	    	
  	    	
  	    	try {  
            	System.out.println("Establishing connection");
                connection = DriverManager.getConnection(connectionString);  
                System.out.println("Connected to database");
                //Statement statement = connection.createStatement();
                //ResultSet rSet = statement.executeQuery("Insert into users (URL, PrivacyFound, PrivacyName, Phase1, Phase2, Phase3, Phase4, Phase5, Cookie_Acceptance_Phrase, MIRA_ID) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?"); 
                String rSet = "Insert into ClaritinData (Date, ProductName, PrimeStatus, ReviewScale, NumReviews, ReviewKeywords, Questions, ProductDescription, AboutTheProduct, ProductKeywords, URL) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                
                PreparedStatement pStatement = connection.prepareStatement(rSet);
               
                pStatement.setObject(1, currentDate);
                pStatement.setString(2, productName);
                pStatement.setString(3, primeStatus);
                pStatement.setString(4, reviewScale);
                pStatement.setString(5, numReviews);
                pStatement.setObject(6, reviewKeywords);
                pStatement.setString(7, questions);
                pStatement.setString(8, prodDesc);
                pStatement.setString(9, aboutProd);
                pStatement.setString(10, prodKeywords);
                pStatement.setString(11, urlName);   
                
                int rowsInserted = pStatement.executeUpdate();
                if (rowsInserted > 0) {
                	System.out.println("Data uploaded");
                }
                
            }  
            catch (Exception e) {  
                e.printStackTrace();  
            } 
            //Util.scrollToElement(webDriver, key, wait);
            webDriver.navigate().back();
        }//end loop
        try {
        	Actions actions = new Actions(webDriver);
        	BayerWebElement signOut = waitForVisible("amazon.signIn", webDriver, 15);
            actions.moveToElement(signOut);
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        try {  
        	System.out.println("Establishing connection");
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
			e.printStackTrace();
		} 
            finally {  
                if (connection != null) 
                	try { 
                		connection.close(); 
                		} 
                catch(Exception e) {}  
            } 
        
        
        return true;
        
    }

}
