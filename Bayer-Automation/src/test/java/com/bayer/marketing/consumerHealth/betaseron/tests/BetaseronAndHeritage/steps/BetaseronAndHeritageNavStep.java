package com.bayer.marketing.consumerHealth.betaseron.tests.BetaseronAndHeritage.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Scroll;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class BetaseronAndHeritageNavStep extends AbstractStep {

	public BetaseronAndHeritageNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {

		String betaSeronAndHeriTageUrl = webDriver.getCurrentUrl();
    	waitForElement( "betaseron.heritage.key.logo", webDriver, 30 );
    	WebDriverWait wait = new WebDriverWait(webDriver,30);
    	
    	BayerWebElement rrmsText =getElement( "betaseron.heritage.rrms.text", webDriver );
    	Util.scrollToElement(webDriver,rrmsText,wait);
    	waitForElement( "betaseron.heritage.rrms.text", webDriver, 15 );
    	Assert.assertEquals(rrmsText.getText(), "How RRMS Happens");

    	BayerWebElement rrmsNext =getElement( "betaseron.heritage.rrms.next", webDriver );
    	Util.scrollToElement(webDriver,rrmsNext,wait);
    	waitForElement( "betaseron.heritage.rrms.next", webDriver, 15 );
    	rrmsNext.click();
    	
    	BayerWebElement image1ML =getElement( "betaseron.heritage.dosage.1ml.image", webDriver );
    	Util.scrollToElement(webDriver,rrmsNext,wait);
    	waitForElement( "betaseron.heritage.dosage.1ml.image", webDriver, 15 );
    	
    	this.validate("betaseron.heritage.learnMore.dosage", webDriver, "betaseron.heritage.learnMore.dosage.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	
    	this.validate("betaseron.heritage.betaplus", webDriver, "betaseron.heritage.betaplus.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	 
    	this.validate("betaseron.heritage.efficacy.learnmore", webDriver, "betaseron.heritage.efficacy.learnmore.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	
    	this.validate("betaseron.heritage.safety.learnmore", webDriver, "betaseron.heritage.safety.learnmore.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	
    	this.validate("betaseron.heritage.moreAbout.betaConnect", webDriver, "betaseron.heritage.moreAbout.betaConnect.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	
    	this.validate("betaseron.heritage.learnMore.betaConnect", webDriver, "betaseron.heritage.learnMore.betaConnect.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	
    	this.validate("betaseron.heritage.learnMore.myBETAapp", webDriver, "betaseron.heritage.learnMore.myBETAapp.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	
    	this.validate("betaseron.heritage.betaNurse.support", webDriver, "betaseron.heritage.betaNurse.support.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	
    	this.validate("betaseron.heritage.getDiscussion.guide", webDriver, "betaseron.heritage.getDiscussion.guide.validate", wait);
    	Util.recallBaseURL(webDriver,betaSeronAndHeriTageUrl);
    	
    	waitForElement( "betaseron.heritage.key.logo", webDriver, 30 );
		
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
