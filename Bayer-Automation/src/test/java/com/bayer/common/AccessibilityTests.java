package com.bayer.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
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

    
}
