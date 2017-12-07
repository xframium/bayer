package com.bayer.marketing.animalHealth.petBasics.tests.All.OffersPage.steps;


import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.marketing.animalHealth.petBasics.tests.All.OffersPage.OffersPage;
import com.bayer.test.step.AbstractStep;
public class OffersPageNavSteps extends AbstractStep  {
	
	//protected String url = "https://www.petbasics.com/about-bayer";
    public OffersPageNavSteps() {
        super( "Successful", "error message" );
    }
    
    private BayerWebElement findElement(By className) {
		// TODO Auto-generated method stub
		return null;
	}
    
    public void configItemCount()
    {
    	BayerWebElement brands = findElement(By.className("brands-section"));
    	List<WebElement> itemCount = brands.findElements(By.xpath("//li"));
    }      

	@Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	OffersPage urlVar = new OffersPage();
    	String url = urlVar.getUrl();
    	System.out.println("Page url: " + url);
    	
    	
    	BayerWebElement window = getElement( "modal.window", webDriver );
    	if (window.isDisplayed()) {
    		waitForElement( "modal.skip", webDriver, 15 );
        	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    		skipButton.click();	
		}
    	
    	//for (int i = 0; i < configItemCount(); i++) {
    	    // get the data from the dataProvider
    		//String filteritem = "filteritem"+i;
    	    // create the instance of the dataRecord class with the data record for this
    	    //FlightData tripInfo = new FlightData(trip);
    	    //rest of the test script

    	    //}
    	
    	// confirm offers page header image
    	waitForElement("petbasics.offers.image", webDriver, 15 ); 
    	// confirm no offers on initial page
    	waitForElement("petbasics.offers.nocoupon", webDriver, 15 );
    	// open filter menu in mobile
    	BayerWebElement filtermenu = getElement( "petbasics.offers.filtermenu", webDriver );
    	waitForElement("petbasics.offers.filtermenu", webDriver, 15 );    	
    	filtermenu.click();
    	waitForElement("petbasics.offers.menuopen", webDriver, 15 );
    	
    	// select item 1, confirm offer, clear screen
    	BayerWebElement filteritem1 = getElement( "petbasics.offers.filteritem1", webDriver );
    	waitForElement("petbasics.offers.filteritem1", webDriver, 15 );  
    	filteritem1.click();
    	applyFilters( webDriver );
    	clearFilters( webDriver );

    	// select item 2, confirm offer, clear screen
    	BayerWebElement filteritem2 = getElement( "petbasics.offers.filteritem2", webDriver );
    	waitForElement("petbasics.offers.filteritem2", webDriver, 15 );  
    	filteritem2.click();
    	applyFilters( webDriver );
    	clearFilters( webDriver );  
    	
    	// select item 3, confirm offer, clear screen
    	BayerWebElement filteritem3 = getElement( "petbasics.offers.filteritem3", webDriver );
    	waitForElement("petbasics.offers.filteritem3", webDriver, 15 );  
    	filteritem3.click();
    	applyFilters( webDriver );
    	clearFilters( webDriver );  
    	
    	// select item 4, confirm offer, clear screen
    	BayerWebElement filteritem4 = getElement( "petbasics.offers.filteritem4", webDriver );
    	waitForElement("petbasics.offers.filteritem4", webDriver, 15 );  
    	filteritem4.click();
    	applyFilters( webDriver );
    	clearFilters( webDriver );  
    	
    	// select item 5, confirm offer, clear screen
    	BayerWebElement filteritem5 = getElement( "petbasics.offers.filteritem5", webDriver );
    	waitForElement("petbasics.offers.filteritem5", webDriver, 15 );  
    	filteritem5.click();
    	applyFilters( webDriver );
    	clearFilters( webDriver );      	
    	
    	// select item 6, confirm offer, clear screen
    	BayerWebElement filteritem6 = getElement( "petbasics.offers.filteritem6", webDriver );
    	waitForElement("petbasics.offers.filteritem6", webDriver, 15 );  
    	filteritem6.click();
    	applyFilters( webDriver );
    	clearFilters( webDriver );  
    	
    	webDriver.navigate().to(url);
    	
        return true;
    }
    

    
    public void applyFilters( BayerWebDriver webDriver ) {
    	// apply selected filter
    	BayerWebElement applyfilter = getElement( "petbasics.offers.applyfilter", webDriver );
    	applyfilter.click();
    	//validate offer
    	waitForElement("petbasics.offers.applyfilter.validate", webDriver, 15 );
    	
    }
    
    public void clearFilters(BayerWebDriver webDriver) {
    	//clear filter and update
    	BayerWebElement clearfilter = getElement( "petbasics.offers.clearfilter", webDriver );
    	clearfilter.click();
    	BayerWebElement cleanscreen = getElement( "petbasics.offers.cleanscreen", webDriver );
    	cleanscreen.click();
    	waitForElement("petbasics.offers.cleanscreen.validate", webDriver, 15 );
    }    

}
