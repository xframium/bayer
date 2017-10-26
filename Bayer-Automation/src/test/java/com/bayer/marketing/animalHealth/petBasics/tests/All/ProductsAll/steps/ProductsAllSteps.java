package com.bayer.marketing.animalHealth.petBasics.tests.All.ProductsAll.steps;



import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.bayer.marketing.animalHealth.petBasics.tests.All.HomePage.url;
import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.common.Navigate;
import com.bayer.test.step.AbstractStep;

public class ProductsAllSteps extends AbstractStep  {
	
	protected String url = "https://www.petbasics.com/products/?pref=all";
    public ProductsAllSteps()
    {
        super( "Successful", "error message" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver ) {
    
    	BayerWebElement[] applyButton= new  BayerWebElement[5];
    	BayerWebElement[] mobileFilter= new  BayerWebElement[5];
    	BayerWebElement[] product1= new  BayerWebElement[5];
    
 
    	waitForElement( "waittForFlag", webDriver, 15 );
    	
    	openMobile(mobileFilter, webDriver);
    	waitForElement( "products.filter.fleas", webDriver, 15 );
    	BayerWebElement fleas = getElement( "products.filter.fleas", webDriver );
    	fleas.click();
    	applyFilter(applyButton, product1, webDriver);
    	
    	openMobile(mobileFilter, webDriver);
    	waitForElement( "products.filter.ticks", webDriver, 15 );
    	BayerWebElement ticks = getElement( "products.filter.ticks", webDriver );
    	ticks.click();
    	applyFilter(applyButton, product1, webDriver);
  
    	

    	/*
    	clickClear(mobileClear,clear, mobileUpdate);
    	if (mobileFilter.isDisplayed()) {
    		mobileFilter.click();
		}
    	
    	waitForElement( "products.filter.ticks", webDriver, 15 );
    	BayerWebElement ticks = getElement( "products.filter.ticks", webDriver );
    	ticks.click();
   
    	apply.click();
    	clickClear(mobileClear,clear,mobileUpdate);
    
    	
    	
    	
    	
    	if(mobileClear.isDisplayed()){
    		
    		mobileClear.click();
    		
    	}
    		else{
    		
    		clear.click();
    		
    		}
    	
    	*/
        
    	  
        
        return true;
    }
int i=0;


public void openMobile(BayerWebElement mobileFilter[], BayerWebDriver webDriver){
		 waitForElement( "products.filter.mobile", webDriver, 15 );
		 mobileFilter[i]= getElement( "products.filter.mobile", webDriver );
		 if (mobileFilter[i].isDisplayed()) {
			 mobileFilter[i].click();
		 }
	
}
public void applyFilter(BayerWebElement applyButton[],BayerWebElement product1[], BayerWebDriver webDriver){
		
		waitForElement( "products.filter.apply", webDriver, 15 );
		applyButton[i]= getElement( "products.filter.apply", webDriver ); 
		applyButton[i].click();
		waitForElement( "products.product1", webDriver, 15 );
		product1[i]= getElement( "products.product1", webDriver ); 
		product1[i].click();
		waitForElement( "products.detailsVerify", webDriver, 15 );
		webDriver.get(url);
		i++;
		
	 }

  
    
    public static void clickClear(BayerWebElement mobileClear, BayerWebElement clear, BayerWebElement mobileUpdate) {
    	if(mobileClear.isDisplayed()){
    		mobileClear.click();	
    		mobileUpdate.click();
    	}else{
    		clear.click();
    		}
    	
    	
    class findButtons{
    	private BayerWebElement mobileFilter;
    	private BayerWebElement mobileApply;
    	private BayerWebElement product1;
    }
    	
	}
}
