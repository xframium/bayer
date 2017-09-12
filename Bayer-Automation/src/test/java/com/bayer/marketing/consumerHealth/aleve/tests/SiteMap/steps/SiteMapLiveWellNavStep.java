package com.bayer.marketing.consumerHealth.aleve.tests.SiteMap.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class SiteMapLiveWellNavStep extends AbstractStep
{

    public SiteMapLiveWellNavStep()
    {
        super( "message", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	String siteMapUrl = webDriver.getCurrentUrl();
    	    	
    	waitForElement( "aleve.sitemap.home", webDriver, 30 );
    	BayerWebElement siteMapHome = getElement( "aleve.sitemap.home", webDriver );
    	siteMapHome.click();
    	
    	waitForElement( "aleve.sitemap.home.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.livewell", webDriver, 	15 );
    	BayerWebElement siteMapLiveWell = getElement( "aleve.sitemap.livewell", webDriver );
    	siteMapLiveWell.click();
    	
    	waitForElement( "aleve.sitemap.livewell.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.8_Tips_to_Restore_You", webDriver, 	15 );
    	BayerWebElement tipsToRestore = getElement( "aleve.sitemap.8_Tips_to_Restore_You", webDriver );
    	tipsToRestore.click();
    	
    	waitForElement( "aleve.sitemap.8_Tips_to_Restore_You.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.whole_Living", webDriver, 	15 );
    	BayerWebElement wholeLiving = getElement( "aleve.sitemap.whole_Living", webDriver );
    	wholeLiving.click();
    	
    	waitForElement( "aleve.sitemap.whole_Living.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.manage_Your_Pain", webDriver, 	15 );
    	BayerWebElement manageYourPain = getElement( "aleve.sitemap.manage_Your_Pain", webDriver );
    	manageYourPain.click();
    	
    	waitForElement( "aleve.sitemap.manage_Your_Pain.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.Take_it_Day_by_Day", webDriver, 	15 );
    	BayerWebElement TakeitDayByDay = getElement( "aleve.sitemap.Take_it_Day_by_Day", webDriver );
    	TakeitDayByDay.click();
    	
    	waitForElement( "aleve.sitemap.Take_it_Day_by_Day.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	
    	waitForElement( "aleve.sitemap.supporting_Therapies", webDriver, 	15 );
    	BayerWebElement supportingTherapies = getElement( "aleve.sitemap.supporting_Therapies", webDriver );
    	supportingTherapies.click();
    	
    	waitForElement( "aleve.sitemap.supporting_Therapies.check", webDriver,30 );
    	
    	this.waitAndRecallBaseURL(webDriver,siteMapUrl);
    	    	    	
    	return true;
    }

	private void waitAndRecallBaseURL(BayerWebDriver webDriver, String siteMapUrl) {
		WebDriverWait wait = new WebDriverWait(webDriver,10);
    	webDriver.get(siteMapUrl);
    	wait = new WebDriverWait(webDriver,10);
	}

}
