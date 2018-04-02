package com.bayer.corp.Regions.NorthAmerica.FontCheck.tests.AllSites.steps;

import static org.testng.Assert.assertNotNull;

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

public class FontCheckStep extends AbstractStep
{
	public static int rowNumber  = 0;
	public static String newUrl = "";
    public FontCheckStep(String url, int parentRowNum)
    {
        super( "message", "error message" );
        this.newUrl = url;
        this.rowNumber = parentRowNum;
    }
    
	private static final String FILE_NAME = "src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/DataFiles/MIRA_Websites_Germany.xlsx";
    private static String[] columns = {"URL", "Prviacy Found(T/F)", "Privacy Name", "Phrase 1 Found", "Phrase 2 Found", "Phrase 3 Found", "Phrase 4 Found", "Phrase 5 Found", "Cookie Acceptance Phrase" };
    //private static String[] privacyArray =  new String[8];
    public static List<FontInfo> fontData = new ArrayList<>();
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )  {
    	
    	PrivacyTest pt = new PrivacyTest();
    	boolean privacyFound = false; 
	    String privacyName = ""; 
	    boolean phrase1 = false; 
	    boolean phrase2 = false; 
	    boolean phrase3 = false; 	    boolean phrase4 = false;
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
  	    	BayerWebElement cookiesConf1 = waitForVisible("bayer.cookiesConfirm", webDriver, 15);
  	    	cookieName = cookiesConf1.getText();
  	    	cookiesConf1.click();

      	}
      	catch( Exception e )
      	{
      	}
      	
      	webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	String urlList = webDriver.getPageSource();
    	
    	if(urlList.contains("fonts.google")) {
        	
    		 try {
		    	   waitForElement( "gdpr.privacyV2Footer", webDriver, 15 );
			       BayerWebElement privacy2Footer = getElement("gdpr.privacyV2Footer", webDriver);
			       Util.scrollToElement(webDriver, privacy2Footer, wait);
    		 } 
    		 catch (Exception e) {
				System.out.println("No google font found");
			}
    	}
    	if(urlList.contains("fonts.adobe")) {
        	
   		 try {
		    	   waitForElement( "gdpr.privacyV2Footer", webDriver, 15 );
			       BayerWebElement privacy2Footer = getElement("gdpr.privacyV2Footer", webDriver);
			       Util.scrollToElement(webDriver, privacy2Footer, wait);
   		 } 
   		 catch (Exception e) {
				System.out.println("No google font found");
			}
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
       FontInfo pvinf = new FontInfo(privacyFound, privacyName, phrase1, phrase2, phrase3, phrase4, phrase5, cookieName);
        fontData.add(pvinf);
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
		if(rowNumber == 1) { //Adds legend on first execution
			//Sheet legend = workbook.getSheetAt(1);
			Sheet legend = null;
			if(workbook.getNumberOfSheets() == 1) {
				legend = workbook.createSheet("Legend");
			}
			else { 
				legend = workbook.getSheetAt(1);
			}
	        // Create Cell Style for formatting DatA
	        CellStyle dateCellStyle = workbook.createCellStyle();
	        Object[][] legendInfo = {
	                {"", "Legend"},
	                {"Country:", "Deutschland"},
	                {" ", " "},
	                {"Phrase #", "Phrase Name"},
	                {"Phrase 1:", "Nutzung der Website"},
	                {"Phrase 2:", "Informationen über Ihre Rechte"},
	                {"Phrase 3:", "Profiling"},
	                {"Phrase 4:", "Datenübertragbarkeit"}, 
	                {"Phrase 5:", "Aufsichtsbehörde"}
	        };
	        int legendRowNum = 0;
	        System.out.println("Creating excel");
	
	        for (Object[] datatype : legendInfo) {
	            Row legendRow= legend.createRow(legendRowNum++);
	            int colNum = 0;
	            for (Object field : datatype) {
	                Cell cell = legendRow.createCell(colNum++);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	        }
	        for(int i = 0; i < columns.length; i++) {
	            legend.autoSizeColumn(i);
	        }
		}
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
