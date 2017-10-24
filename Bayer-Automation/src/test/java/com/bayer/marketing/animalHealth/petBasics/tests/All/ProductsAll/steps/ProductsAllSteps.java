package com.bayer.marketing.animalHealth.petBasics.tests.All.ProductsAll.steps;

//import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.url;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class ProductsAllSteps extends AbstractStep  {
	
	protected String url = "https://www.petbasics.com/";
    public ProductsAllSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    	String url = "https://www.petbasics.com/products/?pref=all";
    	waitForElement( "modal.skip", webDriver, 15 );
    	BayerWebElement skipButton = getElement( "modal.skip", webDriver );
    	
    	if (skipButton.isDisplayed()) {
    		skipButton.click();
		}
    	
    	waitForElement( "home.whywedoit", webDriver, 15 );
    	//scrollAndSearch("betaseron.home.betaAppVid");
    	BayerWebElement whywedo = getElement( "home.whywedoit", webDriver );
    	whywedo.click();
    	waitForElement( "waitForFlag", webDriver, 15 );
    	webDriver.navigate().to(url);
    	
    	
        
         
        
        return true;
    }

}
