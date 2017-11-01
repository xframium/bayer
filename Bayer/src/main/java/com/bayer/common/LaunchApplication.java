package com.bayer.common;

import java.util.HashMap;
import java.util.Map;
import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.test.step.factory.Step;

public class LaunchApplication extends AbstractStep implements Step
{
    private String bundleId;
    private String appPackage;
    private String name;
    public LaunchApplication ( String name, String bundleId, String appPackage )
    {
        super( "Open an application", "Failed to open application" );
        this.bundleId = bundleId;
        this.appPackage = appPackage;
        this.name = name;
    }
    
    @Override 
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        Map<String, Object> parameterMap = new HashMap<String, Object>();
        parameterMap.put( "name", name );
        if ( webDriver.getOsType().equals( "IOS" ) )
            parameterMap.put( "identifier", bundleId );
        else if ( webDriver.getOsType().equals( "ANDROID" ) )
            parameterMap.put( "identifier", appPackage );
        else
            return false;

        try
        {
            webDriver.executeScript( "mobile:application:close", parameterMap );
        }
        catch( Exception e )
        {
            
        }
        
        webDriver.executeScript( "mobile:application:open", parameterMap );
        
        return true;
    }

}
