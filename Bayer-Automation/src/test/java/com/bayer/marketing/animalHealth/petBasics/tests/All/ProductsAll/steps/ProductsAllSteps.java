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
    
    	BayerWebElement[] applyButton= new  BayerWebElement[20];
    	BayerWebElement[] mobileFilter= new  BayerWebElement[20];
    	BayerWebElement[] product1= new  BayerWebElement[20];
    	BayerWebElement[] seeMore= new  BayerWebElement[20];
 
    	waitForElement( "waittForFlag", webDriver, 15 );
    	
    	openMobile(mobileFilter, webDriver, seeMore);
    	waitForElement( "products.filter.fleas", webDriver, 15 );
    	BayerWebElement fleas = getElement( "products.filter.fleas", webDriver );
    	fleas.click();
    	applyFilter(applyButton, product1, webDriver);
    	
    	openMobile(mobileFilter, webDriver, seeMore);
    	waitForElement( "products.filter.ticks", webDriver, 15 );
    	BayerWebElement ticks = getElement( "products.filter.ticks", webDriver );
    	ticks.click();
    	applyFilter(applyButton, product1, webDriver);
  
    	openMobile(mobileFilter, webDriver, seeMore);
    	waitForElement( "products.filter.heartworms", webDriver, 15 );
    	BayerWebElement heartworms = getElement( "products.filter.heartworms", webDriver );
    	heartworms.click();
    	applyFilter(applyButton, product1, webDriver);
    	
    	openMobile(mobileFilter, webDriver, seeMore);
    	waitForElement( "products.filter.worms", webDriver, 15 );
    	BayerWebElement worms = getElement( "products.filter.worms", webDriver );
    	worms.click();
    	applyFilter(applyButton, product1, webDriver);
    	
    	openMobile(mobileFilter, webDriver, seeMore);
    	waitForElement( "products.filter.bedBugs", webDriver, 15 );
    	BayerWebElement bedBugs = getElement( "products.filter.bedBugs", webDriver );
    	bedBugs.click();
    	applyFilter(applyButton, product1, webDriver);
    	
    	openMobile(mobileFilter, webDriver, seeMore);
    	waitForElement( "products.filter.cat", webDriver, 15 );
    	BayerWebElement cat = getElement( "products.filter.cat", webDriver );
    	cat.click();
    	applyFilter(applyButton, product1, webDriver);
    	
    	openMobile(mobileFilter, webDriver, seeMore);
    	waitForElement( "products.filter.dog", webDriver, 15 );
    	BayerWebElement dog = getElement( "products.filter.dog", webDriver );
    	dog.click();
    	applyFilter(applyButton, product1, webDriver);
    	
    	openMobile(mobileFilter, webDriver, seeMore);
    	waitForElement( "products.filter.dog", webDriver, 15 );
    	BayerWebElement dog1 = getElement( "products.filter.dog", webDriver );
    	dog1.click();
    	
    	waitForElement( "products.filter.clear.mobile", webDriver, 15 );
    	BayerWebElement mobileClear = getElement( "products.filter.clear.mobile", webDriver );
    	BayerWebElement mobileUpdate = getElement( "products.filter.update.mobile", webDriver );
    	BayerWebElement clear = getElement( "products.filter.clear", webDriver );
    	
    	if(mobileClear.isDisplayed()){
    		mobileClear.click();	
    		mobileUpdate.click();
    	}else{
    		clear.click();
    		}
    	
    	
    	
            
        return true;
    }
int i=0;


public void openMobile(BayerWebElement mobileFilter[], BayerWebDriver webDriver, BayerWebElement seeMore[]){
		 waitForElement( "products.filter.mobile", webDriver, 15 );
		 mobileFilter[i]= getElement( "products.filter.mobile", webDriver );
		 if (mobileFilter[i].isDisplayed()) {
			 mobileFilter[i].click();
		 }
		 seeMore[i]= getElement( "products.filter.seeMore", webDriver );
		 seeMore[i].click();
}
public void applyFilter(BayerWebElement applyButton[],BayerWebElement product1[], BayerWebDriver webDriver){
		
		waitForElement( "products.filter.apply", webDriver, 15 );
		applyButton[i]= getElement( "products.filter.apply", webDriver ); 
		applyButton[i].click();
		waitForElement( "products.product1", webDriver, 15 );
		product1[i]= getElement( "products.product1", webDriver ); 
		product1[i].click();
		waitForElement( "products.verify.signUp", webDriver, 15 );
		webDriver.get(url);
		i++;
		
	 }}
    	
	

