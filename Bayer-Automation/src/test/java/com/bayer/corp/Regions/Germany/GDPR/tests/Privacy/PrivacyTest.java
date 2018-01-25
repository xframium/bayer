package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy;

import com.bayer.exampleTemplate.tests.Example.steps.ExampleStep;
import com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps.PrivacyPolicy;
import com.bayer.exampleTemplate.tests.Example.steps.ConditionsOfUse;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.Current;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
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
		
			
	public String url = "https://pallas-versicherung.de/";
	private static final String FILE_NAME = "src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/MIRA_Websites_URLs.xlsx";	    
			public String getUrl(){ 
				return url;
			}
		    
			@TestDescriptor( testName="GDPR Privacy Policy Validation" )
  		    @Test ( dataProvider = "deviceList", enabled=true)
  		    public void privacyPolicyTest( DeviceContainer dC ) {
 		        
		    	try {

		            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
		            Workbook workbook = new XSSFWorkbook(excelFile);
		            Sheet datatypeSheet = workbook.getSheetAt(0);
		            Iterator<Row> iterator = datatypeSheet.iterator();

		            while (iterator.hasNext()) {

		                Row currentRow = iterator.next();
		                Iterator<Cell> cellIterator = currentRow.iterator();

		                while (cellIterator.hasNext()) {

		                    Cell currentCell = cellIterator.next();
		                    //getCellTypeEnum shown as deprecated for version 3.15
		                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
		                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
		                        url=currentCell.getStringCellValue();
		                        executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy() } );
		                        System.out.println("Current url is: "+url);
		                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
		                        System.out.println("Unable to read url.");
		                        
		                    }
		                }
		                System.out.println();
		            }
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

			}
		    
		    @TestDescriptor( testName="GDPR URL Loop" )
		    @Test ( dataProvider = "deviceList", enabled=false)
		    public void privacyNavigationLoop( DeviceContainer dC ) {
		    	
		        executeSteps( new Step[] { new Navigate(url) } );
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