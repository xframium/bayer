package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.io.File;
import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.utility.StructureValidator;
import com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.*;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class PrivacyPolicy extends AbstractStep
{

    public PrivacyPolicy()
    {
        super( "message", "error message" );
    }
    private static final String FILE_NAME = "src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/MIRA_Websites_Germany.xlsx";
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	/*PrivacyTest urlVar = new PrivacyTest();
    	String url = urlVar.getUrl();
    	XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        Object[][] datatypes = {
               
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 1;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    	*/
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
        
    	waitForElement( "bayer.key", webDriver, 15 );
    	BayerWebElement logo = getElement("bayer.key", webDriver);
    	String urlList = webDriver.getPageSource();
        if(urlList.contains("Datenschutzerklärung")) {
           waitForElement( "gdpr.privacyV1", webDriver, 15 );
           BayerWebElement privacy1 = getElement("gdpr.privacyV1", webDriver);
           Util.scrollToElement(webDriver, privacy1, wait);
           privacy1.click();
           waitForElement( "bayer.key", webDriver, 15 );
           webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        	//verify 5 elements on privacy page
           if(webDriver.getPageSource().contains("Nutzung der Website")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
           
           if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
           
           if(webDriver.getPageSource().contains("Profiling")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
           
           if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
           
           if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
        	   System.out.println("Test Successful");
           }
           else { 
        	   System.out.println("Text not found");
           }
            
        }
        else if(urlList.contains("Datenschutzinformation")) {
        	waitForElement( "gdpr.privacyV2", webDriver, 15 );
            BayerWebElement privacy2 = getElement("gdpr.privacyV2", webDriver);
            Util.scrollToElement(webDriver, privacy2, wait);
            privacy2.click();
            waitForElement( "bayer.key", webDriver, 15 );
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         	//verify 5 elements on privacy page
            if(webDriver.getPageSource().contains("Nutzung der Website")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Profiling")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
        	//click privacy
        	//verify 5 elements on privacy page
        }
        else if(urlList.contains("Datenschutz")) {
        	waitForElement( "gdpr.privacyV3", webDriver, 15 );
            BayerWebElement privacy3 = getElement("gdpr.privacyV3", webDriver);
            Util.scrollToElement(webDriver, privacy3, wait);
            privacy3.click();
            waitForElement( "bayer.key", webDriver, 15 );
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         	//verify 5 elements on privacy page
            if(webDriver.getPageSource().contains("Nutzung der Website")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Profiling")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
        }
        else if(urlList.contains("Datenschutzpolicy")) {
        	waitForElement( "gdpr.privacyV4", webDriver, 15 );
            BayerWebElement privacy4 = getElement("gdpr.privacyV4", webDriver);
            Util.scrollToElement(webDriver, privacy4, wait);
            privacy4.click();
            waitForElement( "bayer.key", webDriver, 15 );
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         	//verify 5 elements on privacy page
            if(webDriver.getPageSource().contains("Nutzung der Website")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Informationen über Ihre Rechte")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Profiling")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Datenübertragbarkeit")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
            
            if(webDriver.getPageSource().contains("Aufsichtsbehörde")) {
         	   System.out.println("Test Successful");
            }
            else { 
         	   System.out.println("Text not found");
            }
        }	
        else {
        	System.out.println("Nothing found.");
        }
        
        
        /*new StructureValidator("Privacy", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        new StructureValidator("Data", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        new StructureValidator("PersonalData", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        new StructureValidator("Use", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        new StructureValidator("Access Rights", "/com/bayer/exampleTemplate/config/legal/ConditionsValidation.xml");
        
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
