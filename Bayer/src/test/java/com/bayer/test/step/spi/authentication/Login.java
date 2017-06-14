package com.bayer.test.step.spi.authentication;

import com.bayer.BayerWebDriver;
import com.bayer.BayerWebElement;
import com.bayer.test.step.AbstractStep;

public class Login extends AbstractStep
{
    public Login()
    {
        super( "Log on to the application", "Failed to login to the application" );
    }
    
    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        waitForElement( "login.emailAddress", webDriver, 15 );
        BayerWebElement emailAddress = getElement( "login.emailAddress", webDriver );
        emailAddress.sendKeys( "test@bayer.com" );
        
        BayerWebElement confirmEmailAddress = getElement( "login.confirmEmailAddress", webDriver );
        confirmEmailAddress.sendKeys( "test@bayer.com" );
        
        BayerWebElement password = getElement( "login.password", webDriver );
        password.sendKeys( "password" );
        
        
        
        
        
        return true;
    }

}
