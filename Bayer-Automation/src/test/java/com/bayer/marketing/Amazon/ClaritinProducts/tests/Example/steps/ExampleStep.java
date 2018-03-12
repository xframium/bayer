package com.bayer.marketing.Amazon.ClaritinProducts.tests.Example.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.exampleTemplate.tests.Example.ExamplePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class ExampleStep extends AbstractStep
{

    public ExampleStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	ExamplePage urlVar = new ExamplePage();
    	String url = urlVar.getUrl();
    	
    	waitForElement( "amazon.search", webDriver, 15 );
        BayerWebElement search = getElement("amazon.search", webDriver);
        search.click();
        search.sendKeys("Claritin");
        BayerWebElement searchBtn = getElement("amazon.search.button", webDriver);
        searchBtn.click();
        waitForElement( "amazon.key", webDriver, 15 );
        webDriver.navigate().to(url);
        
        
        
        return true;
        
    }

}
