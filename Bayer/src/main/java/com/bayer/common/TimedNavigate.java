package com.bayer.common;

import java.util.HashMap;
import java.util.Map;
import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.test.step.factory.Step;

public class TimedNavigate extends AbstractStep implements Step
{
    private static final Map<String,String> HASH_CACHE = new HashMap<String,String>(20);
    private static final String[] WEB_PERFORMANCE = new String[] { "navigationStart", "redirectStart", "redirectEnd", "fetchStart", "domainLookupStart", "domainLookupEnd", "connectStart", "connectEnd", "requestStart", "responseStart", "responseEnd", "unloadStart", "unloadEnd", "domLoading", "domInteractive", "domContentLoaded", "domComplete", "loadEventStart", "loadEventEnd" };
    private String url;
    private long waitThreshold;
    
    public TimedNavigate ( String url, long waitThreshold )
    {
        super( "Navigate to the url: " + url, "Failed to navigate to: " + url );
        this.url = url;
        this.waitThreshold = waitThreshold;
    }
    
    @Override 
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        webDriver.get( url );
        
        try
        {
            Map<String,Long> performanceData = (Map<String,Long>)webDriver.executeScript( "var perfData = window.performance.timing; return perfData;", HASH_CACHE );
            
            Long value = performanceData.get( "loadEventEnd" );
            

            if ( value > waitThreshold )
                return false;
                    
 
        }
        catch( Exception e )
        {
            log.warn( "Could not capture WEB performance data " + e.getMessage() );
            return false;
        }
        
        return true;
    }
   
  }

