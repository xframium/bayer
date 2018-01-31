package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
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

public class PrivacyPolicy extends AbstractStep
{
	public static int rowNumber  = 0;
	public static String newUrl = "";
    public PrivacyPolicy(String url, int parentRowNum)
    {
        super( "message", "error message" );
        this.newUrl = url;
        this.rowNumber = parentRowNum;
    }
    
	private static final String FILE_NAME = "src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/DataFiles/MIRA_Websites_Germany.xlsx";
    private static String[] columns = {"URL", "Prviacy Found(T/F)", "Privacy Name", "Phrase 1 Found", "Phrase 2 Found", "Phrase 3 Found", "Phrase 4 Found", "Phrase 5 Found", "Cookie Acceptance Phrase" };
    //private static String[] privacyArray =  new String[8];
    public static List<PrivacyInfo> privacyData = new ArrayList<>();
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )  {
    	
    	PrivacyTest pt = new PrivacyTest();
    	boolean privacyFound = false; 
	    String privacyName =""; 
	    boolean phrase1 = false; 
	    boolean phrase2 = false; 
	    boolean phrase3 = false; 
	    boolean phrase4 = false;
	    boolean phrase5 = false;
	    String cookieName ="Not found";
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
    	//Cookie ck = new Cookie("JSESSIONID", "B8F9B794A232D828BDBD291D7FCE0232.node1", "radiologie.bayer.de", );
    	//webDriver.manage().addCookie(ck);
    	waitForElement( "bayer.key", webDriver, 15 );
    	BayerWebElement logo = getElement("bayer.key", webDriver);
    	
    	
    	////////Cookie Check////////
  ///////Cookie Check 1////////
      	try
      	{	waitForElement("bayer.cookiesConfirm1", webDriver, 15);
  	    	BayerWebElement cookiesConf1 = getElement("bayer.cookiesConfirm1", webDriver);
	  	    	if(cookiesConf1.isDisplayed()){
  	    		cookieName = "Einverstanden";
	  	    	cookiesConf1.click();
	  	    	}
      	}
      	catch( Exception e )
      	{
      	}
      	////////Cookie Check 2////////
      	try
      	{	waitForElement("bayer.cookiesConfirm2", webDriver, 15);
  	    	BayerWebElement cookiesConf2 = getElement("bayer.cookiesConfirm2", webDriver);
  	    		if(cookiesConf2.isDisplayed()){
  	    		cookieName = "OK";
  	    		cookiesConf2.click();
  	    		}
      	}
      	catch( Exception e )
      	{
      	}
      	////////Cookie Check 3////////
      	try
      	{	waitForElement("bayer.cookiesConfirm3", webDriver, 15);
  	    	BayerWebElement cookiesConf3 = getElement("bayer.cookiesConfirm3", webDriver);
  	    		if(cookiesConf3.isDisplayed()){
  	    		cookieName = "Ok";
  	    		cookiesConf3.click();
  	    		}
      	}
      	
      	catch( Exception e )
      	{
      	}
      	
      	webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	

    	String urlList = webDriver.getPageSource();
        if(urlList.contains("Datenschutzerklärung")) {
           privacyName="Datenschutzerklärung";
           privacyFound = true;
           /*BayerWebElement popup = getElement("bayer.cookiesVisibleDE", webDriver); */
           System.out.println("Stop 1");
           waitForElement( "gdpr.privacyV1", webDriver, 15 );
           BayerWebElement privacy1 = getElement("gdpr.privacyV1", webDriver);
           System.out.println("Stop 2");
           Util.scrollToElement(webDriver, privacy1, wait);
           wait.until(ExpectedConditions.invisibilityOf(privacy1));
           System.out.println("Stop 3");
           //JavascriptExecutor javascript1 = (JavascriptExecutor) webDriver;
           //javascript1.executeScript("privacy1.click();", privacy1);
           privacy1.click();
           System.out.println("Stop 4");
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
            
        }
        else if(urlList.contains("Datenschutzinformation")) {
        	privacyName="Datenschutzinformation";
        	privacyFound = true;
        	waitForElement( "gdpr.privacyV2", webDriver, 15 );
            BayerWebElement privacy2 = getElement("gdpr.privacyV2", webDriver);
            Util.scrollToElement(webDriver, privacy2, wait);
            wait.until(ExpectedConditions.visibilityOf(privacy2));
            privacy2.click();
            waitForElement( "bayer.key", webDriver, 15 );
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        	//click privacy
        	//verify 5 elements on privacy page
        }
        else if(urlList.contains("Datenschutz")) {
        	privacyName="Datenschutz";
        	privacyFound = true;
        	waitForElement( "gdpr.privacyV3", webDriver, 15 );
            BayerWebElement privacy3 = getElement("gdpr.privacyV3", webDriver);
            Util.scrollToElement(webDriver, privacy3, wait);
            privacy3.click();
            waitForElement( "bayer.key", webDriver, 15 );
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        }
        else if(urlList.contains("Datenschutzpolicy")) {
        	privacyName="Datenschutzpolicy";
        	privacyFound = true;
        	waitForElement( "gdpr.privacyV4", webDriver, 15 );
            BayerWebElement privacy4 = getElement("gdpr.privacyV4", webDriver);
            Util.scrollToElement(webDriver, privacy4, wait);
            privacy4.click();
            waitForElement( "bayer.key", webDriver, 15 );
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        }	
        else {
        	privacyName="German privacy statement name not found";
        	phrase1=false;
        	phrase2=false;
        	phrase3=false;
        	phrase4=false;
        	phrase5=false;
        	cookieName = "Not found";
        	System.out.println("Nothing found.");
        }
       PrivacyInfo pvinf = new PrivacyInfo(privacyFound, privacyName, phrase1, phrase2, phrase3, phrase4, phrase5, cookieName);
        privacyData.add(pvinf);
        FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/DataFiles/MIRA_Websites_URLs.xlsx"));
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(inputStream);
		} catch (EncryptedDocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalidFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

       // CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
		
		Sheet sheet = workbook.getSheetAt(0);
        
        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        
        // Create Other rows and cells with employees data
        int rowNum = 2;
        //for(int k = 0; k < privacyArray.length; k++) {
        	//rowNum=pt.getRowNum() + 1;
        	//pt.setRowNum(rowNum);
        
        	//System.out.println("Current row number: " +rowNumber);
        	Row row = sheet.createRow(rowNumber);

            row.createCell(0).setCellValue(newUrl);

            row.createCell(1).setCellValue(pvinf.getPrivacyFound());
            row.createCell(2).setCellValue(pvinf.getPrivacyName());               
            row.createCell(3).setCellValue(pvinf.getPhrase1());
            row.createCell(4).setCellValue(pvinf.getPhrase2());
            row.createCell(5).setCellValue(pvinf.getPhrase3()); 
            row.createCell(6).setCellValue(pvinf.getPhrase4()); 
            row.createCell(7).setCellValue(pvinf.getPhrase5());
            row.createCell(8).setCellValue(pvinf.getCookiePhrase());
            //System.out.println("Current row number: " +rowNum);
        

		// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream("src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/DataFiles/MIRA_Websites_URLs.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			workbook.write(fileOut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
        System.out.println("End url policy step.");
        return true;
        
    }

}
