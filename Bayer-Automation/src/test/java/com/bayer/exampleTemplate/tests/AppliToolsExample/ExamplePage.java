package com.bayer.exampleTemplate.tests.AppliToolsExample;

import com.bayer.exampleTemplate.tests.AppliToolsExample.steps.ArchPatientStep;
import com.bayer.exampleTemplate.tests.AppliToolsExample.steps.AltArchPatientStep;
import com.bayer.exampleTemplate.tests.AppliToolsExample.steps.AleveStep;
import com.bayer.exampleTemplate.tests.AppliToolsExample.steps.CoppertoneStep;
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
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.remote.CapabilityType;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class ExamplePage extends AbstractTest {
	
private String url = "http://test.skyla-us.com/index.php";
private int parentRowNum = 1;  
	public String getUrl(){ 
		return url;
	}
	
    @TestDescriptor( testName="AppliTools Example Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void appliToolsNavigateTest( DeviceContainer dC ) {
    	String [] urlNames = new String[100];
		int numEntries = 0;
		try {
			File file = new File("src/test/java/com/bayer/exampleTemplate/config/TestData/skylaUrlList.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			int i = 0;
			while ((line = bufferedReader.readLine()) != null) {
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
			System.out.println(url);
			executeSteps( new Step[] { new Navigate(url), new ArchPatientStep(url, parentRowNum)});
			parentRowNum++;
			System.out.println("Parent row num is " + parentRowNum);
		}
    }
    @TestDescriptor( testName="Applitools Single Page Example Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void appliToolsExample( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new AltArchPatientStep(url, parentRowNum)} );
    }
    @TestDescriptor( testName="Applitools Aleve Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void appliToolsAleve( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url), new ArchPatientStep(url, parentRowNum)} );
    }
    @TestDescriptor( testName="Applitools Single Page Example Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void navTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new Navigate(url)} );
    }
    @TestDescriptor( testName="Example Timed Navigation Test" )
    @Test ( dataProvider = "deviceList", enabled=false)
    public void timedNavigateTest( DeviceContainer dC ) {
        executeSteps( new Step[] { new TimedNavigate(url, 6000) } );
    }
     
}

// push test 5