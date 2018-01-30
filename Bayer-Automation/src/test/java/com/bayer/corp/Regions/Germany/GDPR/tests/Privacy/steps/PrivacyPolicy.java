package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
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

public class PrivacyPolicy extends AbstractStep
{

    public PrivacyPolicy()
    {
        super( "message", "error message" );
    }
    private static final String FILE_NAME = "src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/MIRA_Websites_Germany.xlsx";
    private static String[] columns = {"URL", "Prviacy Found(T/F)", "Privacy Name", "Phrase 1 Found", "Phrase 2 Found", "Phrase 3 Found", "Phrase 4 Found", "Phrase 5 Found" };
    private static List<PrivacyInfo> privacyData =  new ArrayList<>();
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
    	
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
    	//Cookie ck = new Cookie("JSESSIONID", "B8F9B794A232D828BDBD291D7FCE0232.node1", "radiologie.bayer.de", );
    	//webDriver.manage().addCookie(ck);
    	waitForElement( "bayer.key", webDriver, 15 );
    	BayerWebElement logo = getElement("bayer.key", webDriver);
    	String urlList = webDriver.getPageSource();
    	
    	////////Cookie Check////////
    	boolean cookieFound = false;
    	try
    	{
    	BayerWebElement cookiesConf = getElement("bayer.cookiesConfirm1", webDriver);
    	Util.scrollToElement(webDriver, cookiesConf, wait);
    	cookiesConf.click();
    	cookieFound = true;
    	}
    	
    	catch( Exception e )
    	{
    	}

    	if(cookieFound == false){
    		System.out.println("Cookie Not Found");
    	}
    	/*BayerWebElement vis1 = getElement("bayer.cookiesVisible", webDriver);
    	if(urlList.contains("Einverstunden")) {
    		BayerWebElement cookiesConf1 = getElement("bayer.cookiesConfirm1", webDriver);
           	cookiesConf1.click();
    	}
    	else  if(urlList.contains("OK")){
           	BayerWebElement cookiesConf2 = getElement("bayer.cookiesConfirm2", webDriver);
           	cookiesConf2.click();
           }
    	else if(urlList.contains("Ok")) {
    		BayerWebElement cookiesConf3 = getElement("bayer.cookiesConfirm3", webDriver);
           	cookiesConf3.click();
    	}
    	else {
    		System.out.println("Cookie not found");
    	}
    	*/
    	
        if(urlList.contains("Datenschutzerklärung")) {
           privacyName="Datenschutzerklärung";
           privacyFound = true;
           /*BayerWebElement popup = getElement("bayer.cookiesVisibleDE", webDriver); */
           
           
           waitForElement( "gdpr.privacyV1", webDriver, 15 );
           BayerWebElement privacy1 = getElement("gdpr.privacyV1", webDriver);
           Util.scrollToElement(webDriver, privacy1, wait);
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
            
        }
        else if(urlList.contains("Datenschutzinformation")) {
        	privacyName="Datenschutzinformation";
        	privacyFound = true;
        	waitForElement( "gdpr.privacyV2", webDriver, 15 );
            BayerWebElement privacy2 = getElement("gdpr.privacyV2", webDriver);
            Util.scrollToElement(webDriver, privacy2, wait);
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
        	
        	System.out.println("Nothing found.");
        }
        
        privacyData.add(new PrivacyInfo(privacyFound, privacyName, phrase1, phrase2, phrase3, phrase4, phrase5));
        
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances for various things like DataFormat, 
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("German Privacy Info");
        
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setColor(IndexedColors.BLUE.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Creating cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        

        // Create Other rows and cells with employees data
        int rowNum = 1;
        for(PrivacyInfo dataRow: privacyData) {
        	rowNum=pt.getRowNum() + 1;
        	System.out.println("Current row number: " +rowNum);
        	Row row = sheet.createRow(rowNum);

            row.createCell(0).setCellValue(pt.getUrl());

            row.createCell(1).setCellValue(dataRow.getPrivacyFound());
            row.createCell(2).setCellValue(dataRow.getPrivacyName());               
            row.createCell(3).setCellValue(dataRow.getPhrase1());
            row.createCell(4).setCellValue(dataRow.getPhrase2());
            row.createCell(5).setCellValue(dataRow.getPhrase3()); 
            row.createCell(6).setCellValue(dataRow.getPhrase4()); 
            row.createCell(7).setCellValue(dataRow.getPhrase5());
            //System.out.println("Current row number: " +rowNum);
        }

		// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream("src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/MIRA_Websites_URLs.xlsx");
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
    
        
        return true;
        
    }

}
