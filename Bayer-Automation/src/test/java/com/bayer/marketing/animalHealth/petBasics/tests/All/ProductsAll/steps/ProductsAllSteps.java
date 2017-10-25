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
    	
    	
    	waitForElement( "products.filter.mobile", webDriver, 15 );
    	BayerWebElement mobileFilter = getElement( "products.filter.mobile", webDriver );
    	
    	if (mobileFilter.isDisplayed()) {
    		mobileFilter.click();
		}
    	
    	waitForElement( "products.filter.fleas", webDriver, 15 );
    	BayerWebElement fleas = getElement( "products.filter.fleas", webDriver );
    	fleas.click();
   
    	waitForElement( "products.filter.apply", webDriver, 15 );
    	BayerWebElement apply = getElement( "products.filter.apply", webDriver );
    	apply.click();
    	
    	BayerWebElement mobileClear = getElement( "products.filter.clear.mobile", webDriver );
    	BayerWebElement clear = getElement( "products.filter.clear", webDriver );
    	
    	
    	
    	
    	
    	
    	if(mobileClear.isDisplayed()){
    		
    		mobileClear.click();
    		
    	}
    		else{
    		
    		clear.click();
    		
    		}
    	
    	
        
         
        
        return true;
    }

}
