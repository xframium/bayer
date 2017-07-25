package com.bayer.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.bayer.BayerWebDriver;


public class ConfigurationManager
{
    private Properties cP = new Properties();
    
    private Map<String,Map<String,String>> deviceMap = new HashMap<String, Map<String,String>>( 20 );
    
    private static ConfigurationManager singleton = new ConfigurationManager();
    
    private ConfigurationManager()
    {
        try
        {
            String configLocation = System.getProperty( "config.properties" );
            if ( configLocation != null )
                cP.load( ClassLoader.getSystemClassLoader().getResourceAsStream( configLocation ) );
            else
                cP.load( ClassLoader.getSystemClassLoader().getResourceAsStream( "com/bayer/configuration/config.properties" ) );
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
    
    public static ConfigurationManager instance()
    {
        return singleton;
    }
    
    public String getProperty( String propertyName, WebDriver webDriver )
    {
        if ( webDriver instanceof BayerWebDriver )
        {
        
            Map<String,String> localMap = deviceMap.get( ( (BayerWebDriver) webDriver ).getDeviceId() );
            if ( localMap != null )
                return localMap.get( propertyName );
        }
        
        return null;
    }
    
    public boolean deviceDataInitialized( WebDriver webDriver )
    {
        return deviceMap.containsKey( ( (BayerWebDriver) webDriver ).getDeviceId() );
    }
    
    public void setProperty( String propertyName, String propertyValue, WebDriver webDriver )
    {
        if ( webDriver instanceof BayerWebDriver )
        {
        
            Map<String,String> localMap = deviceMap.get( ( (BayerWebDriver) webDriver ).getDeviceId() );
            if ( localMap == null )
            {
                localMap = new HashMap<String,String>( 20 );
                deviceMap.put(  ( (BayerWebDriver) webDriver ).getDeviceId(), localMap );
            }
            
            localMap.put( propertyName, propertyValue );
        }
    }
    
    public String getProperty( String propertyName )
    {
        String systemOverride = System.getProperty( propertyName );
        if ( systemOverride != null && !systemOverride.isEmpty() && !systemOverride.startsWith( "$" ) )
            return systemOverride;
        else
            return cP.getProperty( propertyName );
    }
    
    // Returns if config property is present or returns null
    public String getConfigProperty( String propertyName )
    {
    	return cP.getProperty( propertyName );
    }
    
}
