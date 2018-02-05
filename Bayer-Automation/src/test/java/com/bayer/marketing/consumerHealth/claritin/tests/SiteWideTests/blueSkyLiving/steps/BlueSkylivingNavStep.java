package com.bayer.marketing.consumerHealth.claritin.tests.SiteWideTests.blueSkyLiving.steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.consumerHealth.betaseron.tests.Utility.Util;
import com.bayer.test.step.AbstractStep;

public class BlueSkylivingNavStep extends AbstractStep {

	private static final String osType = "WINDOWS";
	private static String userName = "";
	private static final String password = "Password@123";
	private static final String zipCode = "07960";

	public BlueSkylivingNavStep() {
		super("message", "error message");
	}

	@Override
	protected boolean _executeStep(BayerWebDriver webDriver) {
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		String blueSkyLivingUrl = webDriver.getCurrentUrl();

		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		// Register to Claritin application
		this.register(webDriver, wait, blueSkyLivingUrl);

		// Login to Claritin application
		this.login(webDriver, wait, blueSkyLivingUrl);

		waitForElement("claritin.bsl.read.articles", webDriver, 30);
		BayerWebElement read = getElement("claritin.bsl.read.articles", webDriver);
		Util.scrollToElement(webDriver, read, wait);
		read.click();

		waitForElement("claritin.bsl.article.header", webDriver, 30);

		// Scroll to ALL articles category and click on it
		waitForElement("claritin.bsl.all.articles", webDriver, 30);
		BayerWebElement allCategory = getElement("claritin.bsl.all.articles", webDriver);
		Util.scrollToElement(webDriver, allCategory, wait);
		allCategory.click();

		waitForElement("claritin.bsl.article.header", webDriver, 30);

		// Scroll to view all articles and click on it
		this.renderAllArticles(webDriver, wait);

		// Verify all the available articles
		this.verifyAllAritcles(webDriver, wait);

		return true;
	}

	private void verifyAllAritcles(BayerWebDriver webDriver, WebDriverWait wait) {

		this.validateArticle("claritin.bsl.library.allergy.article2", "claritin.bsl.library.allergy.article2.read",
				webDriver, "claritin.bsl.library.allergy.article2.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article3", "claritin.bsl.library.allergy.article3.read",
				webDriver, "claritin.bsl.library.allergy.article3.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article4", "claritin.bsl.library.allergy.article4.read",
				webDriver, "claritin.bsl.library.allergy.article4.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article5", "claritin.bsl.library.allergy.article5.read",
				webDriver, "claritin.bsl.library.allergy.article5.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article6", "claritin.bsl.library.allergy.article6.read",
				webDriver, "claritin.bsl.library.allergy.article6.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article7", "claritin.bsl.library.allergy.article7.read",
				webDriver, "claritin.bsl.library.allergy.article7.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article8", "claritin.bsl.library.allergy.article8.read",
				webDriver, "claritin.bsl.library.allergy.article8.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article9", "claritin.bsl.library.allergy.article9.read",
				webDriver, "claritin.bsl.library.allergy.article9.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article10", "claritin.bsl.library.allergy.article10.read",
				webDriver, "claritin.bsl.library.allergy.article10.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article11", "claritin.bsl.library.allergy.article11.read",
				webDriver, "claritin.bsl.library.allergy.article11.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article12", "claritin.bsl.library.allergy.article12.read",
				webDriver, "claritin.bsl.library.allergy.article12.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article13", "claritin.bsl.library.allergy.article13.read",
				webDriver, "claritin.bsl.library.allergy.article13.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article14", "claritin.bsl.library.allergy.article14.read",
				webDriver, "claritin.bsl.library.allergy.article14.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.allergy.article15", "claritin.bsl.library.allergy.article15.read",
				webDriver, "claritin.bsl.library.allergy.article15.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article1",
				"claritin.bsl.library.did.you.know.article1.read", webDriver,
				"claritin.bsl.library.did.you.know.article1.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article2",
				"claritin.bsl.library.did.you.know.article2.read", webDriver,
				"claritin.bsl.library.did.you.know.article2.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article3",
				"claritin.bsl.library.did.you.know.article3.read", webDriver,
				"claritin.bsl.library.did.you.know.article3.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article4",
				"claritin.bsl.library.did.you.know.article4.read", webDriver,
				"claritin.bsl.library.did.you.know.article4.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article5",
				"claritin.bsl.library.did.you.know.article5.read", webDriver,
				"claritin.bsl.library.did.you.know.article5.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article6",
				"claritin.bsl.library.did.you.know.article6.read", webDriver,
				"claritin.bsl.library.did.you.know.article6.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article16",
				"claritin.bsl.library.did.you.know.article16.read", webDriver,
				"claritin.bsl.library.did.you.know.article16.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article7",
				"claritin.bsl.library.did.you.know.article7.read", webDriver,
				"claritin.bsl.library.did.you.know.article7.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article8",
				"claritin.bsl.library.did.you.know.article8.read", webDriver,
				"claritin.bsl.library.did.you.know.article8.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article9",
				"claritin.bsl.library.did.you.know.article9.read", webDriver,
				"claritin.bsl.library.did.you.know.article9.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article10",
				"claritin.bsl.library.did.you.know.article10.read", webDriver,
				"claritin.bsl.library.did.you.know.article10.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article11",
				"claritin.bsl.library.did.you.know.article11.read", webDriver,
				"claritin.bsl.library.did.you.know.article11.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article12",
				"claritin.bsl.library.did.you.know.article12.read", webDriver,
				"claritin.bsl.library.did.you.know.article12.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article13",
				"claritin.bsl.library.did.you.know.article13.read", webDriver,
				"claritin.bsl.library.did.you.know.article13.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article14",
				"claritin.bsl.library.did.you.know.article14.read", webDriver,
				"claritin.bsl.library.did.you.know.article14.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.did.you.know.article15",
				"claritin.bsl.library.did.you.know.article15.read", webDriver,
				"claritin.bsl.library.did.you.know.article15.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.get.out.there.article1",
				"claritin.bsl.library.get.out.there.article1.read", webDriver,
				"claritin.bsl.library.get.out.there.article1.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.get.out.there.article2",
				"claritin.bsl.library.get.out.there.article2.read", webDriver,
				"claritin.bsl.library.get.out.there.article2.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.get.out.there.article3",
				"claritin.bsl.library.get.out.there.article3.read", webDriver,
				"claritin.bsl.library.get.out.there.article3.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.get.out.there.article4",
				"claritin.bsl.library.get.out.there.article4.read", webDriver,
				"claritin.bsl.library.get.out.there.article4.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.get.out.there.article5",
				"claritin.bsl.library.get.out.there.article5.read", webDriver,
				"claritin.bsl.library.get.out.there.article5.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.get.out.there.article6",
				"claritin.bsl.library.get.out.there.article6.read", webDriver,
				"claritin.bsl.library.get.out.there.article6.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.get.out.there.article7",
				"claritin.bsl.library.get.out.there.article7.read", webDriver,
				"claritin.bsl.library.get.out.there.article7.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.spot.light.on.article1",
				"claritin.bsl.library.spot.light.on.article1.read", webDriver,
				"claritin.bsl.library.spot.light.on.article1.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

		this.validateArticle("claritin.bsl.library.spot.light.on.article2",
				"claritin.bsl.library.spot.light.on.article2.read", webDriver,
				"claritin.bsl.library.spot.light.on.article2.read.validate", wait);
		this.renderAllArticles(webDriver, wait);

	}

	public void renderAllArticles(BayerWebDriver webDriver, WebDriverWait wait) {
		// Scroll to view all articles and click on it
		waitForElement("claritin.bsl.library.all.articles", webDriver, 30);
		BayerWebElement allArticle = getElement("claritin.bsl.library.all.articles", webDriver);
		Util.scrollToElement(webDriver, allArticle, wait);
		allArticle.click();
	}

	public void validateArticleLink(String objectName, BayerWebDriver webDriver, String objectValidator,
			WebDriverWait wait) {
		BayerWebElement element = getElement(objectName, webDriver);
		Util.scrollToElement(webDriver, element, wait);
		waitForElement(objectName, webDriver, 30);
		element.click();
		waitForElement(objectValidator, webDriver, 30);

		// Go back one level
		webDriver.navigate().back();
	}

	public void validateArticle(String articleText, String readMoreLink, BayerWebDriver webDriver,
			String validationText, WebDriverWait wait) {
		waitForElement(articleText, webDriver, 15);
		BayerWebElement text = getElement(articleText, webDriver);
		Util.scrollToElement(webDriver, text, wait);
		this.validateArticleLink(readMoreLink, webDriver, validationText, wait);
	}

	public void login(BayerWebDriver webDriver, WebDriverWait wait, String blueSkyLivingUrl) {
		// Recall base URL
		webDriver.navigate().to(blueSkyLivingUrl);

		// wait for login link to visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='log-in']")));

		// Move to login link and click on it
		BayerWebElement login = getElement("claritin.bsl.login", webDriver);
		Util.scrollToElement(webDriver, login, wait);
		login.click();

		// Enter User name
		waitForElement("claritin.bsl.login.username", webDriver, 30);
		BayerWebElement username = getElement("claritin.bsl.login.username", webDriver);
		username.sendKeys(userName);

		// Enter Password
		waitForElement("claritin.bsl.login.password", webDriver, 30);
		BayerWebElement passwrd = getElement("claritin.bsl.login.password", webDriver);
		passwrd.sendKeys(password);

		// Submit the credentials
		waitForElement("claritin.bsl.login.submit", webDriver, 30);
		BayerWebElement submit = getElement("claritin.bsl.login.submit", webDriver);
		submit.click();

		// wait for login to successful
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-Read']")));

	}

	public void register(BayerWebDriver webDriver, WebDriverWait wait, String blueSkyLivingUrl) {
		// wait for join for free link to visible
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='join-now']")));

		// wait for join for free link to visible
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		waitForElement("claritin.bsl.join", webDriver, 30);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		BayerWebElement join = getElement("claritin.bsl.join", webDriver);
		join.click();
		
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		waitForElement("claritin.bsl.base.join.free.validate", webDriver, 30);

		String firstName = RandomStringUtils.random(5, true, false);
		String lastName = RandomStringUtils.random(5, true, false);
		userName = firstName + "." + lastName + "@bayer.com";
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Enter First Name
		this.enterDetails("claritin.bsl.base.join.firstName", webDriver, firstName, wait, false);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Enter Last Name
		this.enterDetails("claritin.bsl.base.join.lastName", webDriver, lastName, wait, false);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Enter Email
		this.enterDetails("claritin.bsl.base.join.email", webDriver, userName, wait, false);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Enter ConfirmEmail
		this.enterDetails("claritin.bsl.base.join.confirm.email", webDriver, userName, wait, false);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Enter Password
		this.enterDetails("claritin.bsl.base.join.password", webDriver, password, wait, false);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Enter Zipcode
		this.enterDetails("claritin.bsl.base.join.zipcode", webDriver, zipCode, wait, false);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Select Gender
		this.enterDetails("claritin.bsl.base.join.gender", webDriver, null, wait, true);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Select Season
		this.enterDetails("claritin.bsl.base.join.season.allyear", webDriver, null, wait, true);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Select days
		this.enterDetails("claritin.bsl.base.join.days", webDriver, null, wait, true);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		// Select all applicable ages
		this.enterDetails("claritin.bsl.base.join.age45", webDriver, null, wait, true);
		if(isAlertPresents(webDriver)) {   	
	    	webDriver.switchTo().alert().sendKeys("colin"+Keys.TAB+"Bayer123");
	    	webDriver.switchTo().alert().accept();
    	}
		this.enterDetails("claritin.bsl.base.join.age25to44", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.age18to24", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.age12to17", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.age5to11", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.age2to4", webDriver, null, wait, true);
		// Select all applicable brands
		this.enterDetails("claritin.bsl.base.join.brand1", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand2", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand3", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand4", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand5", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand6", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand7", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand8", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand9", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.brand10", webDriver, null, wait, true);
		// select all applicable products
		this.enterDetails("claritin.bsl.base.join.product1", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product2", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product3", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product4", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product5", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product6", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product7", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product8", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product9", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product10", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product11", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product12", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product13", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product14", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product15", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product16", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.product17", webDriver, null, wait, true);
		// select applicable doctor
		this.enterDetails("claritin.bsl.base.join.doctor", webDriver, null, wait, true);
		// select confirmation check box
		this.enterDetails("claritin.bsl.base.join.ConfirmationOverAge18", webDriver, null, wait, true);
		// Opt for updates
		this.enterDetails("claritin.bsl.base.join.latest", webDriver, null, wait, true);
		this.enterDetails("claritin.bsl.base.join.weekly", webDriver, null, wait, true);

		// Click on submit button
		this.enterDetails("claritin.bsl.base.join.submit", webDriver, null, wait, true);

		// wait until registration became successful
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Welcome!']")));

	}

	public void enterDetails(String fieldName, BayerWebDriver webDriver, String fieldData, WebDriverWait wait,
			boolean isOption) {
		BayerWebElement field = getElement(fieldName, webDriver);
		Util.scrollToElement(webDriver, field, wait);
		waitForElement(fieldName, webDriver, 30);
		if (isOption) {
			field.click();
		} else {
			field.clear();
			field.sendKeys(fieldData);
		}
	}

	public boolean isAlertPresents(BayerWebDriver webDriver) {
		try {
			webDriver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
