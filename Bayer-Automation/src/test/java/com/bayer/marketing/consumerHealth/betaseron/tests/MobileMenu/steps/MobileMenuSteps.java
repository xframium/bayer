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
        
        BayerWebElement menu1 = getElement("betaseron.mobile.menu", webDriver );
    	menu1.click();
    	waitForElement( "betaseron.mobile.menu.tab2", webDriver, 15 );
    	BayerWebElement tab2 = getElement("betaseron.mobile.menu.tab2", webDriver );
        tab2.click();
        
        BayerWebElement menu2 = getElement("betaseron.mobile.menu", webDriver );
    	menu2.click();
    	waitForElement( "betaseron.mobile.menu.tab3", webDriver, 15 );
    	BayerWebElement tab3 = getElement("betaseron.mobile.menu.tab3", webDriver );
        tab3.click();
        
        BayerWebElement menu3 = getElement("betaseron.mobile.menu", webDriver );
    	menu3.click();
    	waitForElement( "betaseron.mobile.menu.tab4", webDriver, 15 );
    	BayerWebElement tab4 = getElement("betaseron.mobile.menu.tab4", webDriver );
        tab4.click();
        
        BayerWebElement menu4 = getElement("betaseron.mobile.menu", webDriver );
    	menu4.click();
    	waitForElement( "betaseron.mobile.menu.tab5", webDriver, 15 );
    	BayerWebElement tab5 = getElement("betaseron.mobile.menu.tab5", webDriver );
        tab5.click(); 
        
        BayerWebElement menu5 = getElement("betaseron.mobile.menu", webDriver );
        menu5.click(); 
        waitForElement( "betaseron.mobile.menu.tab1.caret", webDriver, 15 );
    	BayerWebElement tab1caret = getElement("betaseron.mobile.menu.tab1", webDriver );
        tab1caret.click();
        waitForElement( "betaseron.mobile.menu.tab1.caret.drop1", webDriver, 15 );
    	BayerWebElement tab1drop1 = getElement("betaseron.mobile.menu.tab1.caret.drop1", webDriver );
    	tab1drop1.click();

    	BayerWebElement menu6 = getElement("betaseron.mobile.menu", webDriver );
        menu6.click(); 
        waitForElement( "betaseron.mobile.menu.tab1.caret", webDriver, 15 );
        tab1caret.click();
        waitForElement( "betaseron.mobile.menu.tab1.caret.drop2", webDriver, 15 );
    	BayerWebElement tab1drop2 = getElement("betaseron.mobile.menu.tab1.caret.tab2", webDriver );
    	tab1drop2.click();

    	BayerWebElement menu7 = getElement("betaseron.mobile.menu", webDriver );
        menu7.click(); 
        waitForElement( "betaseron.mobile.menu.tab1.caret", webDriver, 15 );
    	tab1caret.click();
        waitForElement( "betaseron.mobile.menu.tab1.caret.drop3", webDriver, 15 );
    	BayerWebElement tab1drop3 = getElement("betaseron.mobile.menu.tab1.caret.tab3", webDriver );
    	tab1drop3.click();        
	}       
         
        return true;
    }

}