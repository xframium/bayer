package com.bayer.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.bayer.common.utility.LinkValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.AbstractTest.TestDescriptor;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.bayer.corp.Regions.Europe.GDPR.*;
import com.bayer.corp.Regions.Europe.GDPR.tests.Privacy.steps.PrivacyPolicy;

public class AccessibilityTests extends AbstractTest
{
	
	@TestDescriptor ( testName = "Claritin Blue Sky General Testing ")
    @Test ( dataProvider = "deviceList", enabled = false, groups = "ci" )
    public void claristinBSLTest( DeviceContainer dC )
    {
        String baseUrl = "http://colin:Bayer123@03342-bslqa.photoninfotech.com:8080/";
        boolean checkPoint = true;
        executeSteps( new Step[] { new Navigate( baseUrl ), new LinkValidator( baseUrl, -1 ), new Accessibility( baseUrl) } );
    }
    @TestDescriptor ( testName = "Pet Basics General Testing ")
    @Test ( dataProvider = "deviceList", enabled = false, groups = "ci" )
    public void petBasicAccessibility( DeviceContainer dC )
    {
        String baseUrl = "https://www.petbasics.com";
        executeSteps( new Step[] { new Navigate( baseUrl ), new LinkValidator( baseUrl, -1 ), new Accessibility( baseUrl ) } );
    }
    
    @TestDescriptor ( testName = "Aleve General Testing ")
    @Test ( dataProvider = "deviceList", enabled = false, groups = "ci" )
    public void aleveAccessibility( DeviceContainer dC )
    {
        String baseUrl = "https://www.aleve.com";
        executeSteps( new Step[] { new Navigate( baseUrl ), new LinkValidator( baseUrl, -1 ), new Accessibility( baseUrl) } );
    }
    
    @TestDescriptor ( testName = "Betaseron General Testing ")
    @Test ( dataProvider = "deviceList", enabled = false, groups = "ci" )
    public void betaseronAccessibility( DeviceContainer dC )
    {
        String baseUrl = "https://www.betaseron.com";
        executeSteps( new Step[] { new Navigate( baseUrl ), new LinkValidator( baseUrl, -1 ), new Accessibility( baseUrl) } );
    }
    
    @TestDescriptor ( testName = "Claritin General Testing ")
    @Test ( dataProvider = "deviceList", enabled = false, groups = "ci" )
    public void claritinAccessibility( DeviceContainer dC )
    {
        String baseUrl = "https://www.claritin.com";
        executeSteps( new Step[] { new Navigate( baseUrl ), new LinkValidator( baseUrl, -1 ), new Accessibility( baseUrl) } );
    }

    @TestDescriptor ( testName = "Aspirin General Testing ")
    @Test ( dataProvider = "deviceList", enabled = false, groups = "ci" )
    public void aspirinAccessibility( DeviceContainer dC )
    {
        String baseUrl = "https://www.aspirin.com";
        executeSteps( new Step[] { new Navigate( baseUrl ), new LinkValidator( baseUrl, -1 ), new Accessibility( baseUrl) } );
    }
    
    @TestDescriptor ( testName = "MSMS General Testing ")
    @Test ( dataProvider = "deviceList", enabled = false, groups = "ci" )
    public void msmsAccessibility( DeviceContainer dC )
    {
        String baseUrl = "http://test.makingsciencemakesense.com";
        executeSteps( new Step[] { new Navigate( baseUrl ), new LinkValidator( baseUrl, -1 ), new Accessibility( baseUrl) } );
    }
   
    	private String url = "https://www.betaferon.de/";
		private String miraID = null;
		private String countryCode = "DE";
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
  		    @Test ( dataProvider = "deviceList", enabled=false, groups ="ci")
  		    public void privacyPolicyTest( DeviceContainer dC ) {
				String [] urlLine = new String[130];
				int numEntries = 0;
				try {
					File file = new File("src/test/java/com/bayer/corp/Regions/Europe/GDPR/config/DataFiles/MasterURLlist.csv");
					FileReader fileReader = new FileReader(file);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					StringBuffer stringBuffer = new StringBuffer();
					String line;
					int i = 0;
					while ((line = bufferedReader.readLine()) != null) {
						//System.out.println(line);
						urlLine[i] = line;
						
						numEntries++;
						i++; }
					fileReader.close();
					//System.out.println("Contents of file:");
					//System.out.println(stringBuffer.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("For loop");
				
				for(int c = 0; c < numEntries; c ++) {
					String line = urlLine[c];
					String[] parts = line.split(",");
					String urlName = parts[0]; // 004
					countryCode = parts[1];
					miraID = parts[2];
					url = "http://"+urlName;
					System.out.println(urlName);
					System.out.println(countryCode);
					System.out.println(miraID);
					try {
						executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy(url, parentRowNum, countryCode, miraID)});
					} 
					catch (Exception e) {
						System.out.println("Unable to reach url: " +url);
					}
						parentRowNum++;
					System.out.println("Parent row num is " + parentRowNum);
				}
			}
			
		    @TestDescriptor( testName="GDPR URL Test" )
		    @Test ( dataProvider = "deviceList", enabled=true, groups = "ci")
		    public void privacyNavigationLoop( DeviceContainer dC ) {
		    	
		    	executeSteps( new Step[] { new Navigate(url), new PrivacyPolicy(url, parentRowNum, countryCode, miraID) } );	
		        
		    }

    
}
