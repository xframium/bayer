package com.bayer.marketing.consumerHealth.aleve.tests.HomePage.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class HomePageNavStep extends AbstractStep
{

    public HomePageNavStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	String siteMapUrl = webDriver.getCurrentUrl();
    	
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,250);");
    	    
    	waitForElement( "aleve.homepage.liveWell", webDriver, 30 );
    	BayerWebElement liveWell = getElement( "aleve.homepage.liveWell", webDriver );
    	liveWell.click();
    	
    	waitForElement( "aleve.sitemap.livewell.check", webDriver,30 );
    	
    	this.recallBaseURL(webDriver,siteMapUrl);
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,300);");
    	
    	waitForElement( "aleve.homepage.lowerBackPain", webDriver, 	15 );
    	BayerWebElement lowerBackPain = getElement( "aleve.homepage.lowerBackPain", webDriver );
    	lowerBackPain.click();
    	
    	waitForElement( "aleve.sitemap.directTherapy.check", webDriver,30 );
    	
    	this.recallBaseURL(webDriver,siteMapUrl);
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,400);");
    	
    	waitForElement( "aleve.homepage.alevePM", webDriver, 	15 );
    	BayerWebElement alevePM = getElement( "aleve.homepage.alevePM", webDriver );
    	alevePM.click();
    	
    	waitForElement( "aleve.sitemap.alevePM.check", webDriver,30 );
    	
    	this.recallBaseURL(webDriver,siteMapUrl);
    	((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,700);");
    	
    	waitForElement( "aleve.homepage.findusOnFB", webDriver, 	15 );
    	BayerWebElement findusOnFB = getElement( "aleve.homepage.findusOnFB", webDriver );
    	findusOnFB.click();
    	
    	waitForElement( "aleve.homepage.findusOnFB.check", webDriver,30 );
    	
    	this.recallBaseURL(webDriver,siteMapUrl);
    	
        return true;
    }
    
    private void recallBaseURL(BayerWebDriver webDriver, String siteMapUrl) {
		WebDriverWait wait = new WebDriverWait(webDriver,10);
    	webDriver.get(siteMapUrl);
    	wait = new WebDriverWait(webDriver,10);
    	
	}


}
