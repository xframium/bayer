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
import com.bayer.corp.Regions.NorthAmerica.FontCheck.tests.AllSites.*;
import com.bayer.test.step.AbstractStep;
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
    
    private static String[] columns = {"Brand", "URL", "Google Fonts", "Adobe Fonts", "Comments" };
    //private static String[] privacyArray =  new String[8];
    public static List<FontInfo> fontData = new ArrayList<>();
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )  {
	    
	    String Brand = "";
	    String currentUrl = "";
	    Boolean googleConf = false;
	    Boolean adobeConf = false;
	    String comments = "";
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
    	
    	////////Wait for cookie popup///////
    		webDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    	
    	////////Cookie Check////////
    	///////Cookie Check 1////////
    		webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      	
    	currentUrl = webDriver.getCurrentUrl();
    	String urlSource = webDriver.getPageSource();
    	
    	if(urlSource.contains("fonts.google")) {
        	googleConf = true;	
    	}
    	if(urlSource.contains("wwwimages2.adobe")) {
        	adobeConf = true;
    	}
    	
       FontInfo pvinf = new FontInfo(Brand,googleConf,adobeConf,comments);
        fontData.add(pvinf);
        FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("src/test/java/com/bayer/corp/Regions/NorthAmerica/FontCheck/config/DataFiles/Website_FontCheck_List.xlsx"));
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
       
        //for(int k = 0; k < privacyArray.length; k++) {
        	//rowNum=pt.getRowNum() + 1;
        	//pt.setRowNum(rowNum);
        
        	//System.out.println("Current row number: " +rowNumber);
        	Row row = sheet.createRow(rowNumber);

           
            row.createCell(0).setCellValue(pvinf.getBrand());
            row.createCell(1).setCellValue(currentUrl);               
            row.createCell(2).setCellValue(pvinf.getGoogleConf());
            row.createCell(3).setCellValue(pvinf.getAdobeConf());
            row.createCell(4).setCellValue(pvinf.getComments());
            //System.out.println("Current row number: " +rowNum);
        

		// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream("src/test/java/com/bayer/corp/Regions/NorthAmerica/FontCheck/config/DataFiles/Website_FontCheck_List.xlsx");
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
    
        System.out.println("End Font check step.");
        return true;
        
    }

}
