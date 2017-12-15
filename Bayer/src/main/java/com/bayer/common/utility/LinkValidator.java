package com.bayer.common.utility;

import static org.testng.Assert.assertTrue;
import java.net.URL;
import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.utiilty.HTTPLinkCheck;

public class LinkValidator extends AbstractStep
{
    private String initialUrl;
    private int pageCount;
    
    public LinkValidator( String initialUrl, int pageCount )
    {
        super( "Generic Link Validator", "Generic Link Validator" );
        this.initialUrl = initialUrl;
        this.pageCount = pageCount;
    }

    

    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        HTTPLinkCheck linkCheck = new HTTPLinkCheck();
        try
        {
            linkCheck.process( new URL( initialUrl ), new URL( initialUrl ) );
            
            if ( pageCount >= 0 )
                assertTrue( pageCount == linkCheck.getLinkMap().size() );
            
            assertTrue( linkCheck.getBrokenLinks().isEmpty() );
            
        }
        catch( Exception e )
        {
            log.error( "Error processing URL", e );
            return false;
        }

        
        return true;
    }

}
