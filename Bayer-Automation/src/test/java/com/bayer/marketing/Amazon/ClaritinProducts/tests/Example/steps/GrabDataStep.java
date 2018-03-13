package com.bayer.marketing.Amazon.ClaritinProducts.tests.Example.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import com.bayer.common.Accessibility;
import com.bayer.common.utility.*;
import com.bayer.exampleTemplate.tests.Example.ExamplePage;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.sun.jna.platform.unix.X11;

public class GrabDataStep extends AbstractStep {

    public GrabDataStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {	
    	ExamplePage urlVar = new ExamplePage();
    	String url = urlVar.getUrl();
    	WebDriverWait wait = new WebDriverWait(webDriver, 20);
    	waitForElement( "amazon.search", webDriver, 15 );
        BayerWebElement search = getElement("amazon.search", webDriver);
        search.click();
        search.sendKeys("Claritin");
        BayerWebElement searchBtn = getElement("amazon.search.button", webDriver);
        searchBtn.click();
        waitForElement( "amazon.key", webDriver, 15 );
        for(int i=0;i<12;i++){
        	waitForElement( "amazon.result"+i, webDriver, 15 );
            BayerWebElement result = getElement("amazon.result"+i, webDriver);
            Util.scrollToElement(webDriver, result, wait);
            
            result.click();
            waitForElement( "amazon.key", webDriver, 15 );
            
            webDriver.navigate().back();
        }
        
        
        
        
        return true;
        
    }

}
