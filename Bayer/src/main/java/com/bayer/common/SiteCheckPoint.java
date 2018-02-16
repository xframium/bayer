package com.bayer.common;

import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.test.step.factory.Step;
import com.bayer.utiilty.HTTPLinkCheck;
import com.deque.axe.AXE;

public class SiteCheckPoint extends AbstractStep implements Step
{
    private URL baseUrl = null;
    public SiteCheckPoint()
    {
        super( "Site CheckPoint", "Site CheckPoint" );
    }
    
    public SiteCheckPoint( String baseUrl )
    {
        super( "CheckPoint Test for " + baseUrl , "CheckPoint Test for " + baseUrl );
        try
        {
            this.baseUrl = new URL( baseUrl );
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
   

    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        if ( baseUrl != null )
        {
            boolean returnValue = true;
            HTTPLinkCheck linkCheck = new HTTPLinkCheck();
            linkCheck.process( baseUrl, baseUrl );
            
            for ( String currentUrl : linkCheck.getLinkMap().keySet() )
            {
                log.info( "Analyzing: " + currentUrl );
                
                webDriver.get( currentUrl );

            	String checkPointName = currentUrl.replace( "/", "_" ).replace( "\\", "_" ).replace( ".", "_" ).replace( ":", "_" ).replace( "?", "_" ).replace( "#", "_" );
            	try
            	{
            		dumpState( webDriver, checkPointName, 0, 0 );
            	}
            	catch( Exception e )
            	{
            		e.printStackTrace();
            	}

                
            }
            
            return returnValue;
        }
        
        
       
        return true;
    }

    

}
