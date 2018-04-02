package com.bayer.marketing.consumerHealth.claritin.tests.Pollen.steps;

import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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
    
    @SuppressWarnings("unchecked")
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
            
            //BayerWebElement launch = getElement( "claritin.pollenArrow", webDriver );
            //launch.click();
            
            BayerWebElement launch = getElement( "claritin.pollenPod", webDriver );
            launch.click();
            
            waitForVisible( "claritin.pollenModalZip", webDriver, 15 );
            
            BayerWebElement zipsearch1 = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch1.click();
            
            BayerWebElement zipinsert1 = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert1.click(); 
            zipinsert1.clear();
			zipinsert1.sendKeys("66216");
			            
            BayerWebElement find1 = getElement( "claritin.pollenModalZipBtn", webDriver );
            find1.click();
            waitForElement("claritin.pollenModalInput.validate1", webDriver, 30);
            
            BayerWebElement zipsearch2 = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch2.click();
            
            BayerWebElement zipinsert2 = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert2.click(); 
            zipinsert2.clear();
			zipinsert2.sendKeys("07981");
			            
            BayerWebElement find2 = getElement( "claritin.pollenModalZipBtn", webDriver );
            find2.click();
            waitForElement("claritin.pollenModalInput.validate2", webDriver, 30);
            
            BayerWebElement zipsearch3 = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch3.click();
            
            BayerWebElement zipinsert3 = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert3.click(); 
            zipinsert3.clear();
			zipinsert3.sendKeys("75001");
			            
            BayerWebElement find3 = getElement( "claritin.pollenModalZipBtn", webDriver );
            find3.click();
            waitForElement("claritin.pollenModalInput.validate3", webDriver, 30);
            
            BayerWebElement zipsearch4 = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch4.click();
            
            BayerWebElement zipinsert4 = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert4.click(); 
            zipinsert4.clear();
			zipinsert4.sendKeys("15106");
			            
            BayerWebElement find4 = getElement( "claritin.pollenModalZipBtn", webDriver );
            find4.click();
            waitForElement("claritin.pollenModalInput.validate4", webDriver, 30);
            
            BayerWebElement zipsearch5 = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch5.click();
            
            BayerWebElement zipinsert5 = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert5.click(); 
            zipinsert5.clear();
			zipinsert5.sendKeys("00000");
			            
            BayerWebElement find5 = getElement( "claritin.pollenModalZipBtn", webDriver );
            find5.click();
            waitForElement("claritin.pollenModalInput.validate5", webDriver, 30);
            
            BayerWebElement close = getElement( "claritin.pollenModalClose", webDriver );
            close.click();
            
            
            /*
            for(int i=1;i<6;i++) {
            BayerWebElement zipsearch5 = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch5.click();
            
            BayerWebElement zipinsert5 = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert5.click(); 
            zipinsert5.clear();
			zipinsert5.sendKeys("00000");
			            
            BayerWebElement find5 = getElement( "claritin.pollenModalZipBtn", webDriver );
            find5.click();
            waitForElement("claritin.pollenModalInput.validate5", webDriver, 30);
            */
            //BayerWebElement close = getElement( "claritin.pollenModalClose", webDriver );
            //close.click();
            //}
    	}
/*    	
    	String csvFile = "src/test/java/com/bayer/exampleTemplate/config/TestData.csv";
        String line = "";
        String cvsSplitBy = ",";
        int x = 0;
        int i =1;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while (((line = br.readLine()) != null) && (x <=2) ) {
        		
                // use comma as separator
                String[] userData = line.split(cvsSplitBy);

                System.out.println(userData[7]);
                //for(int i=1;i<6;i++) {
            BayerWebElement zipsearch = getElement( "claritin.pollenModalZip", webDriver );
            zipsearch.click();
            
            BayerWebElement zipinsert = getElement( "claritin.pollenModalInput", webDriver );
            zipinsert.click(); 
            zipinsert.clear();
			zipinsert.sendKeys(userData[7]);
			            
            BayerWebElement find = getElement( "claritin.pollenModalZipBtn", webDriver );
            find.click();
            //waitForElement("claritin.pollenModalInput.validate"+i, webDriver, 30); 
            //webDriver.wait.until(ExpectedConditions.visibilityOfAllElements(By.xpath(".//[text()="+userData[7])));          
            ((FluentWait<WebDriver>) webDriver.wait).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//[text()="+userData[7])));
            }
                x++; 
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
*/        
        return true;
    }

}
