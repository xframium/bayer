package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.Facebook.Steps;

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

public class FacebookStep extends AbstractStep
{

    public FacebookStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	
    	
    	
    	waitForElement("claritin.key", webDriver, 15);
    	
    	waitForElement("claritin.facebook.button", webDriver, 15);
    	BayerWebElement fbButton = getElement( "claritin.facebook.button", webDriver );
    	fbButton.click();
    	waitForElement("claritin.facebook.confirm", webDriver, 15);
    	BayerWebElement continueButton = getElement( "claritin.facebook.confirm", webDriver );
    	continueButton.click();
    	
    	
        return true;
        
    }

}
