package com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class SiteMapDirectTherapyAndContactUs extends AbstractStep
{

    public SiteMapDirectTherapyAndContactUs()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	String siteMapUrl = webDriver.getCurrentUrl();
    	
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,750);");
    	    
    	waitForElement( "aleve.sitemap.directTherapy", webDriver, 30 );
    	BayerWebElement directTherapy = getElement( "aleve.sitemap.directTherapy", webDriver );
    	directTherapy.click();
    	
    	waitForElement( "aleve.sitemap.directTherapy.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.how.directTherapy", webDriver, 	15 );
    	BayerWebElement howDirectTherapy = getElement( "aleve.sitemap.how.directTherapy", webDriver );
    	howDirectTherapy.click();
    	
    	waitForElement( "aleve.sitemap.how.directTherapy.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.contactUs", webDriver, 	15 );
    	BayerWebElement contactUs = getElement( "aleve.sitemap.contactUs", webDriver );
    	contactUs.click();
    	
    	waitForElement( "aleve.sitemap.contactUs.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.bayerGroup", webDriver, 	15 );
    	BayerWebElement bayerGroup = getElement( "aleve.sitemap.bayerGroup", webDriver );
    	bayerGroup.click();
    	
    	waitForElement( "aleve.sitemap.bayerGroup.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	return true;
    	
    }

	private void recallAndScrollBaseURL(BayerWebDriver webDriver, String siteMapUrl) {
		WebDriverWait wait = new WebDriverWait(webDriver,10);
    	webDriver.get(siteMapUrl);
    	wait = new WebDriverWait(webDriver,10);
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,750);");
	}

}
