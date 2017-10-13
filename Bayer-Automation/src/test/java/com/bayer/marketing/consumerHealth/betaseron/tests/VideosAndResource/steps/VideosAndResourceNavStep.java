package com.bayer.marketing.consumerHealth.betaseron.tests.VideosAndResource.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class VideosAndResourceNavStep extends AbstractStep {

	public VideosAndResourceNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		
		String betaSeronVideosAndResourceUrl = webDriver.getCurrentUrl();
		
		waitForElement("betaseron.videos.resource.base.icon", webDriver, 30);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
				
		waitForElement("betaseron.videos.resource.videos", webDriver, 15);
		BayerWebElement videos = getElement("betaseron.videos.resource.videos", webDriver);
		Util.scrollToElement(webDriver, videos, wait);
		Assert.assertEquals(videos.getText(), "Videos");
		
		waitForElement("betaseron.videos.resource.injection.training", webDriver, 15);
		BayerWebElement injectionTraining = getElement("betaseron.videos.resource.injection.training", webDriver);
		Util.scrollToElement(webDriver, injectionTraining, wait);
		Assert.assertEquals(injectionTraining.getText(), "Injection training");
		
		waitForElement("betaseron.videos.resource.chapter.one", webDriver, 15);
		BayerWebElement chapterOne= getElement("betaseron.videos.resource.chapter.one", webDriver);
		Util.scrollToElement(webDriver, chapterOne, wait);
		chapterOne.click();
		
		waitForElement("betaseron.videos.resource.videosection", webDriver, 15);
		BayerWebElement videosection = getElement("betaseron.videos.resource.videosection", webDriver);
		
		waitForElement("betaseron.videos.resource.chapter.one.validate", webDriver, 15);
		BayerWebElement videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "Chapter 1 - Introduction");
		
		this.palyVideo("betaseron.videos.resource.chapter.two",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "Chapter 2 - Ongoing personal support from BETAPLUS®");
		
		this.palyVideo("betaseron.videos.resource.chapter.three",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "Chapter 3 - Injecting Your BETASERON Manually");
		
		this.palyVideo("betaseron.videos.resource.chapter.three.one",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "  3.1 - Preparing for BETASERON injection");
	
		this.palyVideo("betaseron.videos.resource.chapter.three.two",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "  3.2 - Mixing BETASERON");
		
		this.palyVideo("betaseron.videos.resource.chapter.three.three",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "  3.3 - Preparing the injection");
		
		this.palyVideo("betaseron.videos.resource.chapter.three.four",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "  3.4 - Choosing an injection site");
		
		this.palyVideo("betaseron.videos.resource.chapter.three.five",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "  3.5 - Injecting BETASERON");
		
		this.palyVideo("betaseron.videos.resource.chapter.three.six",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "  3.6 - Disposing of used syringes, needles, and vials");
	
		this.palyVideo("betaseron.videos.resource.chapter.four",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "Chapter 4 - Injecting BETASERON with BETACONNECT™ electronic autoinjector");
	
		this.palyVideo("betaseron.videos.resource.chapter.five",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "Chapter 5 - myBETAapp™");
	
		this.palyVideo("betaseron.videos.resource.chapter.six",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "Chapter 6 - Answers to common questions");
	
		this.palyVideo("betaseron.videos.resource.chapter.seven",webDriver,wait);
		
		videoValidator= getElement("betaseron.videos.resource.chapter.one.validate", webDriver);
		Util.scrollToElement(webDriver, videosection, wait);
		Assert.assertEquals(videoValidator.getText(), "Chapter 7 - Real-time demo: Injecting BETASERON manually");
	
		injectionTraining = getElement("betaseron.videos.resource.injection.training", webDriver);
		Util.scrollToElement(webDriver, injectionTraining, wait);
		injectionTraining.click();
		
		waitForElement("betaseron.videos.resource.resources", webDriver, 15);
		BayerWebElement resources = getElement("betaseron.videos.resource.resources", webDriver);
		Util.scrollToElement(webDriver, resources, wait);
		
		waitForElement("betaseron.videos.resource.start.discussion", webDriver, 15);
		BayerWebElement discussion = getElement("betaseron.videos.resource.start.discussion", webDriver);
		Util.scrollToElement(webDriver, discussion, wait);
		
		this.validate("betaseron.videos.resource.getDiscussion.guide", webDriver, "betaseron.videos.resource.getDiscussion.guide.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronVideosAndResourceUrl);
		waitForElement("betaseron.videos.resource.base.icon", webDriver, 30);
		
		this.validate("betaseron.videos.resource.signup.betaplus", webDriver, "betaseron.videos.resource.signup.betaplus.validate", wait);
		Util.recallBaseURL(webDriver, betaSeronVideosAndResourceUrl);
		waitForElement("betaseron.videos.resource.base.icon", webDriver, 30);
		
		return true;
	}

	private void palyVideo(String videoPath, BayerWebDriver webDriver, WebDriverWait wait) {
		waitForElement(videoPath, webDriver, 15);
		BayerWebElement video= getElement(videoPath, webDriver);
		Util.scrollToElement(webDriver, video, wait);
		video.click();
		
	}

	public void validate(String objectName, BayerWebDriver webDriver, String objectValidator, WebDriverWait wait) {
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		waitForElement(objectName, webDriver, 30);
		element.click();

		waitForElement(objectValidator, webDriver, 30);
		
	}
	
	
}
