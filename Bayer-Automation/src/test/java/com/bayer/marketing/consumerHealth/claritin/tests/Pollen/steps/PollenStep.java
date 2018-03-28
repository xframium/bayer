package com.bayer.marketing.consumerHealth.claritin.tests.Pollen.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class PollenStep extends AbstractStep
{

    public PollenStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        
    	waitForElement( "claritin.pollenHead", webDriver, 15 );
    	BayerWebElement pollenHead = getElement( "claritin.pollenHead", webDriver );
    	
    	if(pollenHead.isDisplayed()){
    		//Mobile and desktop Test
           
    		// bypass browser location question
            BayerWebElement engage = getElement( "claritin.pollenHead", webDriver );
            engage.click();
            
            BayerWebElement launch = getElement( "claritin.pollenArrow", webDriver );
            launch.click();
            
            BayerWebElement zipsearch = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch.click();
            
            BayerWebElement zipinsert = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert.click(); 
            zipinsert.clear();
			zipinsert.sendKeys("66216");
            
            BayerWebElement find = getElement( "claritin.pollenModalZipBtn", webDriver );
            find.click();
            
            BayerWebElement close = getElement( "claritin.pollenModalClose", webDriver );
            close.click();
    		
    	}
    	
    	String csvFile = "src/test/java/com/bayer/exampleTemplate/config/TestData.csv";
        String line = "";
        String cvsSplitBy = ",";
        int x = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while (((line = br.readLine()) != null) && (x <=2) ) {
        		
                // use comma as separator
                String[] userData = line.split(cvsSplitBy);

                System.out.println(userData[7]);
                x++; 	
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return true;
    }

}
