package com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class SiteMapAleveAndPMAndPMD extends AbstractStep
{

    public SiteMapAleveAndPMAndPMD()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	String siteMapUrl = webDriver.getCurrentUrl();
    	
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,500);");
    	    
    	waitForElement( "aleve.sitemap.aleveCaplets", webDriver, 30 );
    	BayerWebElement aleveCaplets = getElement( "aleve.sitemap.aleveCaplets", webDriver );
    	aleveCaplets.click();
    	
    	waitForElement( "aleve.sitemap.aleveCaplets.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.aleveTablets", webDriver, 	15 );
    	BayerWebElement aleveTablets = getElement( "aleve.sitemap.aleveTablets", webDriver );
    	aleveTablets.click();
    	
    	waitForElement( "aleve.sitemap.aleveTablets.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.aleveGelCaps", webDriver, 	15 );
    	BayerWebElement aleveGelCaps = getElement( "aleve.sitemap.aleveGelCaps", webDriver );
    	aleveGelCaps.click();
    	
    	waitForElement( "aleve.sitemap.aleveGelCaps.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.aleveLiquidGels", webDriver, 	15 );
    	BayerWebElement aleveLiquidGels = getElement( "aleve.sitemap.aleveLiquidGels", webDriver );
    	aleveLiquidGels.click();
    	
    	waitForElement( "aleve.sitemap.aleveLiquidGels.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.aleveArthritisCap", webDriver, 	15 );
    	BayerWebElement aleveArthritisCap = getElement( "aleve.sitemap.aleveArthritisCap", webDriver );
    	aleveArthritisCap.click();
    	
    	waitForElement( "aleve.sitemap.aleveArthritisCap.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.alevePM", webDriver, 	15 );
    	BayerWebElement alevePM = getElement( "aleve.sitemap.alevePM", webDriver );
    	alevePM.click();
    	
    	waitForElement( "aleve.sitemap.alevePM.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.aleveD.sinusAndCold", webDriver, 	15 );
    	BayerWebElement aleveDsinusAndCold = getElement( "aleve.sitemap.aleveD.sinusAndCold", webDriver );
    	aleveDsinusAndCold.click();
    	
    	waitForElement( "aleve.sitemap.aleveD.sinusAndCold.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.aleveD.sinusAndHeadache", webDriver, 	15 );
    	BayerWebElement aleveDsinusAndHeadache = getElement( "aleve.sitemap.aleveD.sinusAndHeadache", webDriver );
    	aleveDsinusAndHeadache.click();
    	
    	waitForElement( "aleve.sitemap.aleveD.sinusAndHeadache.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.aleveDifference", webDriver, 	15 );
    	BayerWebElement aleveDifference = getElement( "aleve.sitemap.aleveDifference", webDriver );
    	aleveDifference.click();
    	
    	waitForElement( "aleve.sitemap.aleveDifference.check", webDriver,30 );
    	
    	this.recallAndScrollBaseURL(webDriver,siteMapUrl);
    	
    	
    	return true;
    	
    }

	private void recallAndScrollBaseURL(BayerWebDriver webDriver, String siteMapUrl) {
		WebDriverWait wait = new WebDriverWait(webDriver,10);
    	webDriver.get(siteMapUrl);
    	wait = new WebDriverWait(webDriver,10);
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,500);");
	}

}
