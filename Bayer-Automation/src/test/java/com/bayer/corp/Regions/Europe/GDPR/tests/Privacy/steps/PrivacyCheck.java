package com.bayer.corp.Regions.Europe.GDPR.tests.Privacy.steps;

import static org.testng.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.utility.StructureValidator;
import com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.*;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;
import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.gargoylesoftware.htmlunit.util.Cookie;
import com.sun.jna.platform.unix.X11;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrivacyCheck extends AbstractStep
{
	private static int rowNumber  = 0;
	private static String newUrl = "";
	private static String cCode = "";
	private static String mira = "";
    public PrivacyCheck(String url, int parentRowNum, String countryCode, String miraID)
    {
        super( "message", "error message" );
        this.newUrl = url;
        this.rowNumber = parentRowNum;
        this.cCode = countryCode;
        this.mira = miraID;
    }
    
	private static final String FILE_NAME = "src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/DataFiles/MIRA_Websites_Germany.xlsx";
    private static String[] columns = {"URL", "Prviacy Found(T/F)", "Privacy Name", "Phrase 1 Found", "Phrase 2 Found", "Phrase 3 Found", "Phrase 4 Found", "Phrase 5 Found", "Cookie Acceptance Phrase" };
    //private static String[] privacyArray =  new String[8];
    public static List<PrivacyInfo> privacyData = new ArrayList<>();
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )  {
    	
    	PrivacyTest pt = new PrivacyTest();
    	boolean privacyFound = false; 
	    String privacyName = ""; 
	    boolean phrase1 = false; 
	    boolean phrase2 = false; 
	    boolean phrase3 = false; 
	    boolean phrase4 = false;
	    boolean phrase5 = false;
	    String cookieName = "Not found";
	    boolean checkFlag = false;
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
    	//Cookie ck = new Cookie("JSESSIONID", "B8F9B794A232D828BDBD291D7FCE0232.node1", "radiologie.bayer.de", );
    	//webDriver.manage().addCookie(ck);
    	waitForElement( "bayer.key", webDriver, 15 );
    	BayerWebElement logo = getElement("bayer.key", webDriver);
    	
    	////////Wait for cookie popup///////
    		webDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    	
    	////////Cookie Check////////
    	///////Cookie Check 1////////
      	try
      	{	
  	    	BayerWebElement cookiesConf1 = waitForVisible("bayer." +cCode+".cookiesConfirm", webDriver, 15);
  	    	cookieName = cookiesConf1.getText();
  	    	cookiesConf1.click();

      	}
      	catch( Exception e )
      	{
      	}
      	
    	
    	String urlList = webDriver.getPageSource();
    	if(urlList.contains("Datenschutz")) {
        	
    		 try {
		    	   
			       BayerWebElement privacy2Footer = waitForVisible("gdpr."+cCode+".privacyV2Footer", webDriver,15);
			       Util.scrollToElement(webDriver, privacy2Footer, wait);
	           		
	           		if(privacy2Footer.isDisplayed()){
	           			Util.scrollToElement(webDriver, privacy2Footer, wait);
	           		  privacyFound = true;
	           		   privacyName="Datenschutz";
		        	   checkFlag = true;
			           privacy2Footer.click();
			           waitForElement( "bayer.key", webDriver, 15 );
			           
			        	//verify 5 elements on privacy page
			           if(webDriver.getPageSource().contains("Nutzung der Website")) {
			        	   //System.out.println("Test Successful");
			        	   phrase1=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase1=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
			        	   //System.out.println("Test Successful");
			        	   phrase2=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase2=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Profiling")) {
			        	   //System.out.println("Test Successful");
			        	   phrase3=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase3=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
			        	   //System.out.println("Test Successful");
			        	   phrase4=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase4=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
			        	   //System.out.println("Test Successful");
			        	   phrase5=true;
			           }
			           else { 
			        	  //System.out.println("Text not found");
			        	   phrase5=false;
			           }
		           }//end if displayed
		 	           else { 
		 	        	   System.out.println("Datenschutz not displayed");
				 	           }
				 			} catch (Exception e) {
				 				// TODO: handle exception
				 			}
		 		   if(checkFlag == false){
		 		      try {
		    	   waitForElement( "gdpr."+cCode+".privacyV2FooterID", webDriver, 15 );
			       BayerWebElement privacy2 = getElement("gdpr."+cCode+".privacyV2FooterID", webDriver);
			       Util.scrollToElement(webDriver, privacy2, wait);
	           		
	           		if(privacy2.isDisplayed()){
	           			Util.scrollToElement(webDriver, privacy2, wait);
	           		  privacyFound = true;
	           		   privacyName="Datenschutz";
		        	   checkFlag = true;
		        	   
			           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
			           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
			           //javascript1.executeScript("privacy1.click();", privacy1);
			           privacy2.click();
			           waitForElement( "bayer.key", webDriver, 15 );
			           
			        	//verify 5 elements on privacy page
			           if(webDriver.getPageSource().contains("Nutzung der Website")) {
			        	   //System.out.println("Test Successful");
			        	   phrase1=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase1=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
			        	   //System.out.println("Test Successful");
			        	   phrase2=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase2=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Profiling")) {
			        	   //System.out.println("Test Successful");
			        	   phrase3=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase3=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
			        	   //System.out.println("Test Successful");
			        	   phrase4=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase4=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
			        	   //System.out.println("Test Successful");
			        	   phrase5=true;
			           }
			           else { 
			        	  //System.out.println("Text not found");
			        	   phrase5=false;
			           }
		           }//end if displayed
		           else { 
		        	   System.out.println("Datenschutz not displayed");
		           }
					} catch (Exception e) {
						// TODO: handle exception
					}  
		 		   }//end check flag if
		 		  if(checkFlag == false){
		 		      try {
		    	   waitForElement( "gdpr."+cCode+".privacyV2", webDriver, 15 );
			       BayerWebElement privacy2 = getElement("gdpr."+cCode+".privacyV2", webDriver);
			       Util.scrollToElement(webDriver, privacy2, wait);
	           		
	           		if(privacy2.isDisplayed()){
	           			Util.scrollToElement(webDriver, privacy2, wait);
	           		  privacyFound = true;
	           		   privacyName="Datenschutz";
		        	   checkFlag = true;
		        	   
			           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
			           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
			           //javascript1.executeScript("privacy1.click();", privacy1);
			           privacy2.click();
			           waitForElement( "bayer.key", webDriver, 15 );
			           
			        	//verify 5 elements on privacy page
			           if(webDriver.getPageSource().contains("Nutzung der Website")) {
			        	   //System.out.println("Test Successful");
			        	   phrase1=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase1=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
			        	   //System.out.println("Test Successful");
			        	   phrase2=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase2=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Profiling")) {
			        	   //System.out.println("Test Successful");
			        	   phrase3=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase3=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
			        	   //System.out.println("Test Successful");
			        	   phrase4=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase4=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
			        	   //System.out.println("Test Successful");
			        	   phrase5=true;
			           }
			           else { 
			        	  //System.out.println("Text not found");
			        	   phrase5=false;
			           }
		           }//end if displayed
		           else { 
		        	   System.out.println("Datenschutz not displayed");
		           }
				} catch (Exception e) {
					// TODO: handle exception
				}  
		    }//end check flag if
       }//end try
    	if(urlList.contains("Datenschutzerklärung")) {
            /*BayerWebElement popup = getElement("bayer.cookiesVisibleDE", webDriver); */
            //System.out.println("Stop 1");
 		       try {
 		    	   
 			       BayerWebElement privacy1Footer = waitForVisible("gdpr."+cCode+".privacyV1Footer", webDriver,15);
 			       Util.scrollToElement(webDriver, privacy1Footer, wait);
 	           		
 	           		if(privacy1Footer.isDisplayed()){
 	           			Util.scrollToElement(webDriver, privacy1Footer, wait);
 	           		  privacyFound = true;
 	           		   privacyName="Datenschutzerklärung";
 		        	   checkFlag = true;
 		        	   System.out.println("Pass 1");
 			           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
 			           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
 			           //javascript1.executeScript("privacy1.click();", privacy1);
 			           privacy1Footer.click();
 			           waitForElement( "bayer.key", webDriver, 15 );
 			           
 			        	//verify 5 elements on privacy page
 			           if(webDriver.getPageSource().contains("Nutzung der Website")) {
 			        	   //System.out.println("Test Successful");
 			        	   phrase1=true;
 			           }
 			           else { 
 			        	   //System.out.println("Text not found");
 			        	   phrase1=false;
 			           }
 			           
 			           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
 			        	   //System.out.println("Test Successful");
 			        	   phrase2=true;
 			           }
 			           else { 
 			        	   //System.out.println("Text not found");
 			        	   phrase2=false;
 			           }
 			           
 			           if(webDriver.getPageSource().contains("Profiling")) {
 			        	   //System.out.println("Test Successful");
 			        	   phrase3=true;
 			           }
 			           else { 
 			        	   //System.out.println("Text not found");
 			        	   phrase3=false;
 			           }
 			           
 			           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
 			        	   //System.out.println("Test Successful");
 			        	   phrase4=true;
 			           }
 			           else { 
 			        	   //System.out.println("Text not found");
 			        	   phrase4=false;
 			           }
 			           
 			           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
 			        	   //System.out.println("Test Successful");
 			        	   phrase5=true;
 			           }
 			           else { 
 			        	  //System.out.println("Text not found");
 			        	   phrase5=false;
 			           }
	 		           }//end if displayed
			 	           else { 
			 	        	   System.out.println("Datenschutzerklärung not displayed");
					 	           }
					 			} catch (Exception e) {
					 				// TODO: handle exception
					 			}
		 		      if(checkFlag == false){
			 		      try {
			    	   waitForElement( "gdpr."+cCode+".privacyV1FooterID", webDriver, 15 );
				       BayerWebElement privacy2 = getElement("gdpr."+cCode+".privacyV1FooterID", webDriver);
				       Util.scrollToElement(webDriver, privacy2, wait);
		           		
		           		if(privacy2.isDisplayed()){
		           			Util.scrollToElement(webDriver, privacy2, wait);
		           		  privacyFound = true;
		           		   privacyName="Datenschutzerklärung";
			        	   checkFlag = true;
			        	   
				           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
				           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
				           //javascript1.executeScript("privacy1.click();", privacy1);
				           privacy2.click();
				           waitForElement( "bayer.key", webDriver, 15 );
				           
				        	//verify 5 elements on privacy page
				           if(webDriver.getPageSource().contains("Nutzung der Website")) {
				        	   //System.out.println("Test Successful");
				        	   phrase1=true;
				           }
				           else { 
				        	   //System.out.println("Text not found");
				        	   phrase1=false;
				           }
				           
				           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
				        	   //System.out.println("Test Successful");
				        	   phrase2=true;
				           }
				           else { 
				        	   //System.out.println("Text not found");
				        	   phrase2=false;
				           }
				           
				           if(webDriver.getPageSource().contains("Profiling")) {
				        	   //System.out.println("Test Successful");
				        	   phrase3=true;
				           }
				           else { 
				        	   //System.out.println("Text not found");
				        	   phrase3=false;
				           }
				           
				           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
				        	   //System.out.println("Test Successful");
				        	   phrase4=true;
				           }
				           else { 
				        	   //System.out.println("Text not found");
				        	   phrase4=false;
				           }
				           
				           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
				        	   //System.out.println("Test Successful");
				        	   phrase5=true;
				           }
				           else { 
				        	  //System.out.println("Text not found");
				        	   phrase5=false;
					           }
			           }//end if displayed
			           else { 
			        	   System.out.println("Datenschutzerklärung not displayed");
			           }
						} catch (Exception e) {
							// TODO: handle exception
						}  
		 		      }//end check flag if
			 		   if(checkFlag == false){
			 		      try {
			    	   waitForElement( "gdpr."+cCode+".privacyV1", webDriver, 15 );
				       BayerWebElement privacy1 = getElement("gdpr."+cCode+".privacyV1", webDriver);
				       Util.scrollToElement(webDriver, privacy1, wait);
		           		
		           		if(privacy1.isDisplayed()){
		           			Util.scrollToElement(webDriver, privacy1, wait);
		           		  privacyFound = true;
		           		   privacyName="Datenschutzerklärung";
			        	   checkFlag = true;
			        	   
				           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
				           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
				           //javascript1.executeScript("privacy1.click();", privacy1);
				           privacy1.click();
				           waitForElement( "bayer.key", webDriver, 15 );
				           
				        	//verify 5 elements on privacy page
				           if(webDriver.getPageSource().contains("Nutzung der Website")) {
				        	   //System.out.println("Test Successful");
				        	   phrase1=true;
				           }
				           else { 
				        	   //System.out.println("Text not found");
				        	   phrase1=false;
				           }
				           
				           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
				        	   //System.out.println("Test Successful");
				        	   phrase2=true;
				           }
				           else { 
				        	   //System.out.println("Text not found");
				        	   phrase2=false;
				           }
				           
				           if(webDriver.getPageSource().contains("Profiling")) {
				        	   //System.out.println("Test Successful");
				        	   phrase3=true;
				           }
				           else { 
				        	   //System.out.println("Text not found");
				        	   phrase3=false;
				           }
				           
				           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
				        	   //System.out.println("Test Successful");
				        	   phrase4=true;
				           }
				           else { 
				        	   //System.out.println("Text not found");
				        	   phrase4=false;
				           }
				           
				           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
				        	   //System.out.println("Test Successful");
				        	   phrase5=true;
				           }
				           else { 
				        	  //System.out.println("Text not found");
				        	   phrase5=false;
				           }
			           }//end if displayed
		           else { 
		        	   System.out.println("Datenschutzerklärung not displayed");
		           }
				} catch (Exception e) {
					// TODO: handle exception
				}  
 		    }//end check flag if
		 		  
         }//end try 
    	if(urlList.contains("Datenschutzinformation")) {
        	
    		try {
		    	   waitForElement( "gdpr."+cCode+".privacyV3Footer", webDriver, 15 );
			       BayerWebElement privacy3Footer = getElement("gdpr."+cCode+".privacyV3Footer", webDriver);
			       Util.scrollToElement(webDriver, privacy3Footer, wait);
	           		
	           		if(privacy3Footer.isDisplayed()){
	           			Util.scrollToElement(webDriver, privacy3Footer, wait);
	           		  privacyFound = true;
	           		   privacyName="Datenschutzinformation";
		        	   checkFlag = true;
		        	   System.out.println("Pass 3");
			           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
			           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
			           //javascript1.executeScript("privacy1.click();", privacy1);
			           privacy3Footer.click();
			           waitForElement( "bayer.key", webDriver, 15 );
			           
			        	//verify 5 elements on privacy page
			           if(webDriver.getPageSource().contains("Nutzung der Website")) {
			        	   //System.out.println("Test Successful");
			        	   phrase1=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase1=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
			        	   //System.out.println("Test Successful");
			        	   phrase2=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase2=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Profiling")) {
			        	   //System.out.println("Test Successful");
			        	   phrase3=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase3=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
			        	   //System.out.println("Test Successful");
			        	   phrase4=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase4=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
			        	   //System.out.println("Test Successful");
			        	   phrase5=true;
			           }
			           else { 
			        	  //System.out.println("Text not found");
			        	   phrase5=false;
			           }
		           }//end if displayed
		 	           else { 
		 	        	   System.out.println("Datenschutzerklärung not displayed");
				 	           }
				 			} catch (Exception e) {
				 				// TODO: handle exception
				 			}
    			
		 		   if(checkFlag == false){
		 		      try {
		    	   waitForElement( "gdpr."+cCode+".privacyV3", webDriver, 15 );
			       BayerWebElement privacy3 = getElement("gdpr."+cCode+".privacyV3", webDriver);
			       Util.scrollToElement(webDriver, privacy3, wait);
	           		
	           		if(privacy3.isDisplayed()){
	           			Util.scrollToElement(webDriver, privacy3, wait);
	           		  privacyFound = true;
	           		   privacyName="Datenschutzinformation";
		        	   checkFlag = true;
		        	   
			           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
			           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
			           //javascript1.executeScript("privacy1.click();", privacy1);
			           privacy3.click();
			           waitForElement( "bayer.key", webDriver, 15 );
			           
			        	//verify 5 elements on privacy page
			           if(webDriver.getPageSource().contains("Nutzung der Website")) {
			        	   //System.out.println("Test Successful");
			        	   phrase1=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase1=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
			        	   //System.out.println("Test Successful");
			        	   phrase2=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase2=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Profiling")) {
			        	   //System.out.println("Test Successful");
			        	   phrase3=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase3=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
			        	   //System.out.println("Test Successful");
			        	   phrase4=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase4=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
			        	   //System.out.println("Test Successful");
			        	   phrase5=true;
			           }
			           else { 
			        	  //System.out.println("Text not found");
			        	   phrase5=false;
			           }
		           }//end if displayed
		           else { 
		        	   System.out.println("Datenschutzinformation not displayed");
		           }
				} catch (Exception e) {
					// TODO: handle exception
				}  
		    }//end check flag if
        }
        if(urlList.contains("Datenschutzpolicy")) {
        	try {
		    	   waitForElement( "gdpr."+cCode+".privacyV4Footer", webDriver, 15 );
			       BayerWebElement privacy4Footer = getElement("gdpr."+cCode+".privacyV4Footer", webDriver);
			       Util.scrollToElement(webDriver, privacy4Footer, wait);
	           		
	           		if(privacy4Footer.isDisplayed()){
	           			Util.scrollToElement(webDriver, privacy4Footer, wait);
	           		  privacyFound = true;
	           		   privacyName="Datenschutzpolicy";
		        	   checkFlag = true;
		        	   System.out.println("Pass 1");
			           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
			           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
			           //javascript1.executeScript("privacy1.click();", privacy1);
			           privacy4Footer.click();
			           waitForElement( "bayer.key", webDriver, 15 );
			           
			        	//verify 5 elements on privacy page
			           if(webDriver.getPageSource().contains("Nutzung der Website")) {
			        	   //System.out.println("Test Successful");
			        	   phrase1=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase1=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
			        	   //System.out.println("Test Successful");
			        	   phrase2=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase2=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Profiling")) {
			        	   //System.out.println("Test Successful");
			        	   phrase3=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase3=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
			        	   //System.out.println("Test Successful");
			        	   phrase4=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase4=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
			        	   //System.out.println("Test Successful");
			        	   phrase5=true;
			           }
			           else { 
			        	  //System.out.println("Text not found");
			        	   phrase5=false;
			           }
		           }//end if displayed
		 	           else { 
		 	        	   System.out.println("Datenschutzpolicy not displayed");
				 	           }
				 			} catch (Exception e) {
				 				// TODO: handle exception
				 			}
		 		   if(checkFlag == false){
		 		      try {
		    	   waitForElement( "gdpr."+cCode+".privacyV4", webDriver, 15 );
			       BayerWebElement privacy4 = getElement("gdpr."+cCode+".privacyV4", webDriver);
			       Util.scrollToElement(webDriver, privacy4, wait);
	           		
	           		if(privacy4.isDisplayed()){
	           			Util.scrollToElement(webDriver, privacy4, wait);
	           		  privacyFound = true;
	           		   privacyName="Datenschutzpolicy";
		        	   checkFlag = true;
		        	   
			           //wait.until(ExpectedConditions.invisibilityOf(privacy1));
			           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
			           //javascript1.executeScript("privacy1.click();", privacy1);
			           privacy4.click();
			           waitForElement( "bayer.key", webDriver, 15 );
			           
			        	//verify 5 elements on privacy page
			           if(webDriver.getPageSource().contains("Nutzung der Website")) {
			        	   //System.out.println("Test Successful");
			        	   phrase1=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase1=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
			        	   //System.out.println("Test Successful");
			        	   phrase2=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase2=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Profiling")) {
			        	   //System.out.println("Test Successful");
			        	   phrase3=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase3=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
			        	   //System.out.println("Test Successful");
			        	   phrase4=true;
			           }
			           else { 
			        	   //System.out.println("Text not found");
			        	   phrase4=false;
			           }
			           
			           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
			        	   //System.out.println("Test Successful");
			        	   phrase5=true;
			           }
			           else { 
			        	  //System.out.println("Text not found");
			        	   phrase5=false;
			           }
		           }//end if displayed
		           else { 
		        	   System.out.println("Datenschutzpolicy not displayed");
		           }
				} catch (Exception e) {
					// TODO: handle exception
				}  
		    }//end check flag if
        }	
    	
        if(checkFlag == false) {
        	privacyName="German privacy statement name not found";
        	phrase1=false;
        	phrase2=false;
        	phrase3=false;
        	phrase4=false;
        	phrase5=false;
        	//cookieName = "Not found";
        	System.out.println("Nothing found.");
        }
           String connectionString =  
                "jdbc:sqlserver://HUSHNVC039Q:1433;"
                		+ "databaseName=GDPR;"
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
            try {  
            	System.out.println("Establishing connection");
                connection = DriverManager.getConnection(connectionString);  
                System.out.println("Connected to database");
                //Statement statement = connection.createStatement();
                //ResultSet rSet = statement.executeQuery("Insert into users (URL, PrivacyFound, PrivacyName, Phase1, Phase2, Phase3, Phase4, Phase5, Cookie_Acceptance_Phrase, MIRA_ID) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?"); 
                String rSet = "Insert into DE (URL, PrivacyFound, PrivacyName, Phase1, Phase2, Phase3, Phase4, Phase5, Cookie_Acceptance_Phrase, MIRA_ID) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                
                PreparedStatement pStatement = connection.prepareStatement(rSet);
                pStatement.setString(1, newUrl);
                pStatement.setString(2, String.valueOf(privacyFound));
                pStatement.setString(3, privacyName);
                pStatement.setString(4, String.valueOf(phrase1));
                pStatement.setString(5, String.valueOf(phrase2));
                pStatement.setString(6, String.valueOf(phrase3));
                pStatement.setString(7, String.valueOf(phrase4));
                pStatement.setString(8, String.valueOf(phrase5));
                pStatement.setString(9, cookieName);
                pStatement.setString(10, mira);
                 
                int rowsInserted = pStatement.executeUpdate();
                if (rowsInserted > 0) {
                	System.out.println("Data uploaded");
                }
                
                /*while (rSet.next()) {
                         	  
                	  String urlName = rSet.getString("URL");
                      //String last = rSet.getString("last");

                      System.out.println("URL Name: " + urlName);
                      //System.out.println(", Last: " + last);
                	}
                	*/
            }  
            catch (Exception e) {  
                e.printStackTrace();  
            }  
            
            finally {  
                if (connection != null) 
                	try { 
                		connection.close(); 
                		} 
                catch(Exception e) {}  
            }  
    
        System.out.println("End url policy step.");
        return true;
        
    }

}
