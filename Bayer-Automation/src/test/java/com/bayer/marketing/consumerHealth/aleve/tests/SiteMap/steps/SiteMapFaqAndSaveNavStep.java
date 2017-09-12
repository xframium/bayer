package com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class SiteMapFaqAndSaveNavStep extends AbstractStep
{

    public SiteMapFaqAndSaveNavStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	String siteMapUrl = webDriver.getCurrentUrl();
    	
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,250);");
    	    
    	waitForElement( "aleve.sitemap.aleve.celebrate", webDriver, 30 );
    	BayerWebElement celebrate = getElement( "aleve.sitemap.aleve.celebrate", webDriver );
    	celebrate.click();
    	
    	waitForElement( "aleve.sitemap.aleve.celebrate.strength.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.save", webDriver, 	15 );
    	BayerWebElement save = getElement( "aleve.sitemap.save", webDriver );
    	save.click();
    	
    	waitForElement( "aleve.sitemap.save.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.alevefaq", webDriver, 	15 );
    	BayerWebElement aleveFaq = getElement( "aleve.sitemap.alevefaq", webDriver );
    	aleveFaq.click();
    	
    	waitForElement( "aleve.sitemap.alevefaq.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.aleveDirectTherapy", webDriver, 	15 );
    	BayerWebElement aleveDirectTherapy = getElement( "aleve.sitemap.aleveDirectTherapy", webDriver );
    	aleveDirectTherapy.click();
    	
    	waitForElement( "aleve.sitemap.aleveDirectTherapy.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	return true;
    	
    }

	private void recallAndScrollBaseURL(BayerWebDriver webDriver, String siteMapUrl) {
		WebDriverWait wait = new WebDriverWait(webDriver,10);
    	webDriver.get(siteMapUrl);
    	wait = new WebDriverWait(webDriver,10);
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,250);");
	}

}
