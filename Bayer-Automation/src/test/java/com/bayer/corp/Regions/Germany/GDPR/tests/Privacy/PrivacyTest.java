package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy;

import com.bayer.exampleTemplate.tests.Example.steps.ExampleStep;
import com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps.PrivacyPolicy;
import com.bayer.exampleTemplate.tests.Example.steps.ConditionsOfUse;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import com.bayer.common.Accessibility;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class PrivacyTest extends AbstractTest {
		
			
	public String url = "https://www.cropscience.bayer.de/";
		    
			public String getUrl(){ 
				return url;
			}
		    public static void  setURLs() {
		    	String FILE_NAME = "/tmp/MyFirstExcel.xlsx";

		        

		            XSSFWorkbook workbook = new XSSFWorkbook();
		            XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
		            Object[][] datatypes = {
		                    {"Datatype", "Type", "Size(in bytes)"},
		                    {"int", "Primitive", 2},
		                    {"float", "Primitive", 4},
		                    {"double", "Primitive", 8},
		                    {"char", "Primitive", 1},
		                    {"String", "Non-Primitive", "No fixed size"}
		            };

		            int rowNum = 0;
		            System.out.println("Creating excel");

		            for (Object[] datatype : datatypes) {
		                Row row = sheet.createRow(rowNum++);
		                int colNum = 0;
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
		        
		    }

		    @TestDescriptor( testName="GDPR Privacy Policy Validation" )
		    @Test ( dataProvider = "deviceList", enabled=true)
		    public void privacyPolicyTest( DeviceContainer dC ) {
		        executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy() } );
		    }
		    
		    @TestDescriptor( testName="GDPR Navigation Test" )
		    @Test ( dataProvider = "deviceList", enabled=false)
		    public void navigateTest( DeviceContainer dC ) {
		        executeSteps( new Step[] { new Navigate(url), new ExampleStep() } );
		    }
		    
		    @TestDescriptor ( testName = "GDPR Link Checker Test")
		    @Test ( dataProvider = "deviceList", enabled = true)
		    public void gdprLinkChecker( DeviceContainer dC )
		    {
		        executeSteps( new Step[] { new Navigate(url), new LinkValidator(url, -1) } );
		    }
		    @TestDescriptor( testName="GDPR Timed Navigation Test" )
		    @Test ( dataProvider = "deviceList", enabled=false)
		    public void timedNavigateTest( DeviceContainer dC ) {
		        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
		    }
		}//end for loop 


// push test 5