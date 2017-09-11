package com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class SiteMapUnderstandPainNavStep extends AbstractStep
{

    public SiteMapUnderstandPainNavStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	String siteMapUrl = webDriver.getCurrentUrl();
    	    	
    	waitForElement( "aleve.sitemap.understandPain", webDriver, 30 );
    	BayerWebElement understandPain = getElement( "aleve.sitemap.understandPain", webDriver );
    	understandPain.click();
    	
    	waitForElement( "aleve.sitemap.understandPain.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.arthritis_Pain", webDriver, 	15 );
    	BayerWebElement arthritisPain = getElement( "aleve.sitemap.arthritis_Pain", webDriver );
    	arthritisPain.click();
    	
    	waitForElement( "aleve.sitemap.arthritis_Pain.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.back_Pain", webDriver, 	15 );
    	BayerWebElement backPain = getElement( "aleve.sitemap.back_Pain", webDriver );
    	backPain.click();
    	
    	waitForElement( "aleve.sitemap.back_Pain.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.cold_Sinus_Symptoms", webDriver, 	15 );
    	BayerWebElement coldSinus = getElement( "aleve.sitemap.cold_Sinus_Symptoms", webDriver );
    	coldSinus.click();
    	
    	waitForElement( "aleve.sitemap.cold_Sinus_Symptoms.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.headache_Pain", webDriver, 	15 );
    	BayerWebElement headAchePain = getElement( "aleve.sitemap.headache_Pain", webDriver );
    	headAchePain.click();
    	
    	waitForElement( "aleve.sitemap.headache_Pain.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.knee_Pain", webDriver, 	15 );
    	BayerWebElement kneepain = getElement( "aleve.sitemap.knee_Pain", webDriver );
    	kneepain.click();
    	
    	waitForElement( "aleve.sitemap.knee_Pain.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.shoulder_Pain", webDriver, 	15 );
    	BayerWebElement shoulderPlan = getElement( "aleve.sitemap.shoulder_Pain", webDriver );
    	shoulderPlan.click();
    	
    	waitForElement( "aleve.sitemap.shoulder_Pain.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	    	    	
    	return true;
    }

	private void waitAndRecallBaseURL(BayerWebDriver webDriver, String siteMapUrl) {
		WebDriverWait wait = new WebDriverWait(webDriver,10);
    	webDriver.get(siteMapUrl);
    	wait = new WebDriverWait(webDriver,10);
	}

}
