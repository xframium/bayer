package com.bayer.marketing.Amazon.ClaritinProducts.tests.Example.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.support.ui.WebDriverWait;

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
    private static String productName = null;
    private static String reviewScale = null;
    private static String numReviews = null;
    private static String questions = null;
    private static String prodDesc = null;
    private static String aboutProd = null;
    
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
    	waitForElement( "amazon.search", webDriver, 15 );
        BayerWebElement search = getElement("amazon.search", webDriver);
        search.click();
        search.sendKeys("Claritin");
        BayerWebElement searchBtn = getElement("amazon.search.button", webDriver);
        searchBtn.click();
        waitForElement( "amazon.key", webDriver, 15 );
        
        for(int i=0;i<5;i++){
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
  	    	String keywordSearch = aboutProd + prodDesc;
  	    	///////////////retrieve data section/////////////////////
            try {  
            	System.out.println("Establishing connection");
                connection = DriverManager.getConnection(connectionString);  
                System.out.println("Connected to database");
                //Statement statement = connection.createStatement();
                //ResultSet rSet = statement.executeQuery("Insert into users (URL, PrivacyFound, PrivacyName, Phase1, Phase2, Phase3, Phase4, Phase5, Cookie_Acceptance_Phrase, MIRA_ID) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?"); 
                String rSet = "Insert into ClaritinData (Date, URL, ProductName, ReviewScale, NumReviews, Questions, ProductDescription, AboutTheProduct) values (?, ?, ?, ?, ?, ?, ?, ?)";
                
                PreparedStatement pStatement = connection.prepareStatement(rSet);
                pStatement.setObject(1, currentDate);
                pStatement.setString(2, urlName);
                pStatement.setString(3, productName);
                pStatement.setString(4, reviewScale);
                pStatement.setString(5, numReviews);
                pStatement.setString(6, questions);
                pStatement.setString(7, prodDesc);
                pStatement.setString(8, aboutProd);
                
                int rowsInserted = pStatement.executeUpdate();
                if (rowsInserted > 0) {
                	System.out.println("Data uploaded");
                }
                
            }  
            catch (Exception e) {  
                e.printStackTrace();  
            } 
            webDriver.navigate().back();
        }//end loop
        
        
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
