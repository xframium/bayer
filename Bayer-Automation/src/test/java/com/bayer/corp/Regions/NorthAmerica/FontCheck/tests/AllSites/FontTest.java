package com.bayer.corp.Regions.NorthAmerica.FontCheck.tests.AllSites;

import com.bayer.exampleTemplate.tests.Example.steps.ExampleStep;
import com.bayer.corp.Regions.NorthAmerica.FontCheck.tests.AllSites.steps.*;
import com.bayer.exampleTemplate.tests.Example.steps.ConditionsOfUse;
import org.testng.annotations.Test;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

public class FontTest extends AbstractTest {
		
			
	private String url = "https://fonts.google.com/";
	private int parentRowNum = 1;
	private static final String FILE_NAME = "src/test/java/com/bayer/corp/Regions/Germany/GDPR/config/DataFiles/urlListBatch4.xlsx";	    
			public String getUrl(){ 
				return url;
			}
			public int getRowNum(){ 
				return parentRowNum;
			}
			public void setRowNum(int newNum){ 
				this.parentRowNum = newNum;
			}
			public void setUrl(String newUrl){ 
				url = newUrl;
			}
			@TestDescriptor( testName="GDPR Privacy Policy Validation" )
  		    @Test ( dataProvider = "deviceList", enabled=true)
  		    public void privacyPolicyTest( DeviceContainer dC ) {
				String [] urlNames = new String[100];
				int numEntries = 0;
				try {
					File file = new File("src/test/java/com/bayer/corp/Regions/NorthAmerica/FontCheck/config/DataFiles/urlList.txt");
					FileReader fileReader = new FileReader(file);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					String line;
					int i = 0;
					while ((line = bufferedReader.readLine()) != null) {
						//System.out.println(line);
						urlNames[i] = line;
						numEntries++;
						i++; }
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("For loop");
				
				for(int c = 0; c < numEntries; c ++) { 
					url = urlNames[c];
					executeSteps( new Step[] { new Navigate(url), new FontCheckStep(url, parentRowNum)});
					parentRowNum++;
					System.out.println("Parent row num is " + parentRowNum);
				}
			}
			
		    @TestDescriptor( testName="GDPR URL Test" )
		    @Test ( dataProvider = "deviceList", enabled=false, groups="ci")
		    public void privacyNavigationLoop( DeviceContainer dC ) {
		    	
		    	executeSteps( new Step[] { new Navigate(url), new FontCheckStep(url, parentRowNum) } );	
		        
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