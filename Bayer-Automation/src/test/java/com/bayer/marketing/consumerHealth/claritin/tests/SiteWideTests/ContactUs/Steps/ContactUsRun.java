package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.ContactUs.Steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.commons.collections.functors.IfClosure;

import java.io.FileReader;
import java.io.IOException;
//import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.exampleTemplate.tests.Example.ExamplePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class ContactUsRun extends AbstractStep
{

    public ContactUsRun()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	
    	BayerWebElement xbutton = getElement( "claritin.privacy.x", webDriver );
    	
    	if(xbutton.isDisplayed()){
    		xbutton.click();
    	}
    	
    	waitForElement("claritin.contactUs", webDriver, 15);
    	BayerWebElement contactUs = getElement( "claritin.contactUs", webDriver );
    	contactUs.click();
    	
    	/*
    	waitForElement("claritin.contactUs.continue", webDriver, 15);
    	BayerWebElement continueButton = getElement( "claritin.contactUs.continue", webDriver );
    	continueButton.click();
    	*/
    	
    	waitForElement("claritin.contactUs.check", webDriver, 15);
    	
    	String livewellURL ="https://www.livewell.bayer.com/contactus/";
    	String url = webDriver.getCurrentUrl();
    	System.out.println(url);
    	
    	if(url.equals(livewellURL)){
    	System.out.println("Success");	
    	}else{
    		throw new IllegalArgumentException();
    	}
    
        return true;
        
    }

}
