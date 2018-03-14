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

import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.exampleTemplate.tests.Example.ExamplePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class GrabDataStep extends AbstractStep {

    public GrabDataStep()
    {
        super( "message", "error message" );
    }
    private static String urlName = null;
    private static String productName = null;
    private static String reviewScale = null;
    private static String numReviews = null;
    private static String questions = null;
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	
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
        
        for(int i=0;i<12;i++){
        	waitForElement( "amazon.result"+i, webDriver, 15 );
            BayerWebElement result = getElement("amazon.result"+i, webDriver);
            Util.scrollToElement(webDriver, result, wait);
            
            result.click();
            waitForElement( "amazon.key", webDriver, 15 );
            
            ///////////////retrieve data section/////////////////////
            urlName = webDriver.getCurrentUrl();
            System.out.println("Current url: "+urlName);
            
            BayerWebElement prodName = waitForVisible("amazon.productTitle", webDriver, 15);
            productName = prodName.getText();
  	    	System.out.println("Product name: "+ productName);
  	    	
  	    	BayerWebElement ratingScale = waitForElement("amazon.rating", webDriver, 15);
            reviewScale = ratingScale.getText();
  	    	System.out.println("Review Scale: "+ reviewScale);
  	    	
  	    	BayerWebElement reviews = waitForElement("amazon.numReviews", webDriver, 15);
            numReviews= reviews.getText();
  	    	System.out.println("Number of reviews: "+ numReviews);
  	    	
  	    	BayerWebElement numQuestions = waitForVisible("amazon.numQuestions", webDriver, 15);
            questions= numQuestions.getText();
  	    	System.out.println("Number of questions answered: "+ questions);
  	    	
  	    	///////////////retrieve data section/////////////////////
            try {  
            	System.out.println("Establishing connection");
                connection = DriverManager.getConnection(connectionString);  
                System.out.println("Connected to database");
                //Statement statement = connection.createStatement();
                //ResultSet rSet = statement.executeQuery("Insert into users (URL, PrivacyFound, PrivacyName, Phase1, Phase2, Phase3, Phase4, Phase5, Cookie_Acceptance_Phrase, MIRA_ID) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?"); 
                String rSet = "Insert into ClaritinData (URL, ProductName, ReviewScale, NumReviews, Questions) values (?, ?, ?, ?, ?)";
                
                PreparedStatement pStatement = connection.prepareStatement(rSet);
                pStatement.setString(1, urlName);
                pStatement.setString(2, productName);
                pStatement.setString(3, reviewScale);
                pStatement.setString(4, numReviews);
                pStatement.setString(5, questions);
                
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
