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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
		
			
	public String url = "https://radiologie.bayer.de/home";
	public int parentRowNum = 0;
	private static final String FILE_NAME = "src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/DataFiles/MIRA_Websites_URLs.xlsx";	    
			public String getUrl(){ 
				return url;
			}
			public int getRowNum(){ 
				return parentRowNum;
			}
			public void setUrl(String newUrl){ 
				url = newUrl;;
			}
			@TestDescriptor( testName="GDPR Privacy Policy Validation" )
  		    @Test ( dataProvider = "deviceList", enabled=false)
  		    public void privacyPolicyTest( DeviceContainer dC ) {
				String [] urlNames = new String[116];
				try {
					File file = new File("src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/DataFiles/urlListMod.txt");
					FileReader fileReader = new FileReader(file);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					StringBuffer stringBuffer = new StringBuffer();
					String line;
					int i = 0;
					while ((line = bufferedReader.readLine()) != null) {
						//System.out.println(line);
						urlNames[i] = line;
						i++;
					}
					fileReader.close();
					//System.out.println("Contents of file:");
					//System.out.println(stringBuffer.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
				for(int c = 0; c < urlNames.length; c ++) { 
					url = "http://"+urlNames[c];
					executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy()});
					parentRowNum++;
					System.out.println("Parent row num is " +parentRowNum);
				}
			}
		    
		    @TestDescriptor( testName="GDPR URL Test" )
		    @Test ( dataProvider = "deviceList", enabled=true)
		    public void privacyNavigationLoop( DeviceContainer dC ) {
		    	/*String token1 = "";

		        Scanner inFile1 = null;
				try {
					inFile1 = new Scanner(new File("src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/urlList.txt")).useDelimiter(",\\s*");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

		        List<String> temps = new ArrayList<String>();

		        // while loop
		        while (inFile1.hasNext()) {
		          // find next line
		          token1 = inFile1.next();
		          temps.add(token1);
		        }
		        inFile1.close();

		        String[] tempsArray = temps.toArray(new String[0]);

		        for (String s : tempsArray) {
		          System.out.println(s);
		        	url = s;
		        	
		        }
		        */
		    	executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy() } );	
		        
		    }
		    @TestDescriptor( testName="GDPR Accessibility Test" )
		    @Test ( dataProvider = "deviceList", enabled=false)
		    public void navigateTest( DeviceContainer dC ) {
		        executeSteps( new Step[] { new Navigate(url), new Accessibility(url) } );
		    }
		    
		    @TestDescriptor ( testName = "GDPR Link Checker Test")
		    @Test ( dataProvider = "deviceList", enabled = false)
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