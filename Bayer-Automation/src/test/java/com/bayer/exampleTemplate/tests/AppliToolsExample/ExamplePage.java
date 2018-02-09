package com.bayer.exampleTemplate.tests.AppliToolsExample;

import com.bayer.exampleTemplate.tests.AppliToolsExample.steps.ExampleStep;
import com.bayer.exampleTemplate.tests.Example.steps.PrivacyPolicy;
import com.bayer.exampleTemplate.tests.Example.steps.ConditionsOfUse;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class ExamplePage extends AbstractTest {
	
private String url = "https://www.bayer.com/";
private int parentRowNum = 1;  
	public String getUrl(){ 
		return url;
	}

	
    @TestDescriptor( testName="AppliTools Example Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void navigateTest( DeviceContainer dC ) {
    	String [] urlNames = new String[100];
		int numEntries = 0;
		try {
			File file = new File("src/test/java/com/bayer/exampleTemplate/config/TestData/urlList.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			int i = 0;
			while ((line = bufferedReader.readLine()) != null) {
				//System.out.println(line);
				urlNames[i] = line;
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
			url = "http://"+urlNames[c];
			executeSteps( new Step[] { new Navigate(url), new ExamplePage(url, parentRowNum)});
			parentRowNum++;
			System.out.println("Parent row num is " + parentRowNum);
		}
    }
    
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5