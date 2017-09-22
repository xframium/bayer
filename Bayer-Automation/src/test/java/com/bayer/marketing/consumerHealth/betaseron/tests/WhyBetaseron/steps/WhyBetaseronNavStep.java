package com.bayer.marketing.consumerHealth.betaseron.tests.WhyBetaseron.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Scroll;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class WhyBetaseronNavStep extends AbstractStep {

	public WhyBetaseronNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		String whyBetaseronUrl = webDriver.getCurrentUrl();
    	waitForElement( "betaseron.why.base.check", webDriver, 30 );
    	WebDriverWait wait = new WebDriverWait(webDriver,30);
    	
    	BayerWebElement heritageHeader =getElement( "betaseron.why.heritage.check", webDriver );
    	Util.scrollToElement(webDriver,heritageHeader,wait);
    	waitForElement( "betaseron.why.heritage.check", webDriver, 15 );
    	
    	//Scroll.scrollChecker(webDriver, new String[]{"March", "03","1984"});

    	this.validate("betaseron.why.heritage.betaConnect.system", webDriver, "betaseron.why.heritage.betaConnect.system.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.heritage.learnmore.betaseron", webDriver, "betaseron.why.heritage.learnmore.betaseron.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	 
    	this.validate("betaseron.why.heritage.signup.betaplus", webDriver, "betaseron.why.heritage.signup.betaplus.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.efficacy.learnmore", webDriver, "betaseron.why.efficacy.learnmore.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.safety.learnmore", webDriver, "betaseron.why.safety.learnmore.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.betaConnect.autoinjector", webDriver, "betaseron.why.betaConnect.autoinjector.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.register.betaConnect", webDriver, "betaseron.why.register.betaConnect.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.learnMore.betaConnect", webDriver, "betaseron.why.register.betaConnect.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.mybetaapp.video", webDriver, "betaseron.why.mybetaapp.video.validate", wait);
    	BayerWebElement close = getElement( "betaseron.why.mybetaapp.video.validate", webDriver );
    	close.click();
    	
    	waitForElement( "betaseron.why.mybetaapp.video", webDriver, 30 );
    	
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.learnMore.mybetaapp", webDriver, "betaseron.why.learnMore.mybetaapp.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.betaNurse.support", webDriver, "betaseron.why.betaNurse.support.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.getDiscussion.guide", webDriver, "betaseron.why.getDiscussion.guide.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
    	
    	this.validate("betaseron.why.betaplus", webDriver, "betaseron.why.betaplus.validate", wait);
    	Util.recallBaseURL(webDriver,whyBetaseronUrl);
		
		return true;
	}

	
	public void validate(String objectName,BayerWebDriver webDriver, String objectValidator,WebDriverWait wait) {
		BayerWebElement element =getElement( objectName, webDriver );
    	Util.scrollToElement(webDriver,element,wait);
    	waitForElement(objectName, webDriver, 30 );
    	element.click();
    	
    	waitForElement( objectValidator, webDriver,30 );

	}
	
}
