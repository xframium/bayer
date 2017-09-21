package com.bayer.marketing.consumerHealth.betaseron.tests.MobileMenu.steps;

import org.openqa.selenium.WebElement;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;
import com.gargoylesoftware.htmlunit.WebClient;

public class MobileMenuSteps extends AbstractStep
{

    public MobileMenuSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	waitForElement( "betaseron.mobile.menu", webDriver, 15 );
    	BayerWebElement menu = getElement("betaseron.mobile.menu", webDriver );

	if(menu.isDisplayed()){	      
        menu.click(); 
        waitForElement( "betaseron.mobile.menu.tab1", webDriver, 15 );
    	BayerWebElement tab1 = getElement("betaseron.mobile.menu.tab1", webDriver );
        tab1.click();
        
    	menu.click();
    	waitForElement( "betaseron.mobile.menu.tab2", webDriver, 15 );
    	BayerWebElement tab2 = getElement("betaseron.mobile.menu.tab2", webDriver );
        tab2.click();
        
    	menu.click();
    	waitForElement( "betaseron.mobile.menu.tab3", webDriver, 15 );
    	BayerWebElement tab3 = getElement("betaseron.mobile.menu.tab3", webDriver );
        tab3.click();
        
    	menu.click();
    	waitForElement( "betaseron.mobile.menu.tab4", webDriver, 15 );
    	BayerWebElement tab4 = getElement("betaseron.mobile.menu.tab4", webDriver );
        tab4.click();
        
    	menu.click();
    	waitForElement( "betaseron.mobile.menu.tab5", webDriver, 15 );
    	BayerWebElement tab5 = getElement("betaseron.mobile.menu.tab5", webDriver );
        tab5.click();           
	}       
         
        return true;
    }

}