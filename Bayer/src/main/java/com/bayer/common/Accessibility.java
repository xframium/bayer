package com.bayer.common;

import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.test.step.factory.Step;
import com.bayer.utiilty.HTTPLinkCheck;
import com.deque.axe.AXE;

public class Accessibility extends AbstractStep implements Step
{
    private static final URL AXE_URL = Accessibility.class.getResource( "/com/bayer/common/axe.min.js" );
    private static final String lineSeparator = System.getProperty("line.separator");
    private URL baseUrl = null;
    public Accessibility()
    {
        super( "Accessibility Test", "Accessibility Test" );
    }
    
    public Accessibility( String baseUrl )
    {
        super( "Accessibility Test for " + baseUrl , "Accessibility Test for " + baseUrl );
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

                JSONObject responseJSON = new AXE.Builder( webDriver.getNative(), AXE_URL ).analyze();

                JSONArray vA = responseJSON.getJSONArray( "violations" );
                if ( vA != null && vA.length() > 0 )
                {
                    log.error( report( vA ) );
                    returnValue = false;
                }
            }
            
            return returnValue;
        }
        
        
        JSONObject responseJSON = new AXE.Builder( webDriver.getNative(), AXE_URL ).analyze();

        JSONArray vA = responseJSON.getJSONArray( "violations" );
        if ( vA != null && vA.length() > 0 )
        {
            log.error( report( vA ) );
            return false;
        }
        else
            return true;
    }

    public static String report( final JSONArray violations )
    {
        final StringBuilder sb = new StringBuilder();
        sb.append( "Found " ).append( violations.length() ).append( " accessibility violations:" );

        for ( int i = 0; i < violations.length(); i++ )
        {
            JSONObject violation = violations.getJSONObject( i );
            sb.append( lineSeparator ).append( i + 1 ).append( ") " ).append( violation.getString( "help" ) );

            if ( violation.has( "helpUrl" ) )
            {
                String helpUrl = violation.getString( "helpUrl" );
                sb.append( ": " ).append( helpUrl );
            }

            JSONArray nodes = violation.getJSONArray( "nodes" );

            for ( int j = 0; j < nodes.length(); j++ )
            {
                JSONObject node = nodes.getJSONObject( j );
                sb.append( lineSeparator ).append( "  " ).append( getOrdinal( j + 1 ) ).append( ") " ).append( node.getJSONArray( "target" ) ).append( lineSeparator );

                JSONArray all = node.getJSONArray( "all" );
                JSONArray none = node.getJSONArray( "none" );

                for ( int k = 0; k < none.length(); k++ )
                {
                    all.put( none.getJSONObject( k ) );
                }

                appendFixes( sb, all, "Fix all of the following:" );
                appendFixes( sb, node.getJSONArray( "any" ), "Fix any of the following:" );
            }
        }

        return sb.toString();
    }

    private static void appendFixes( final StringBuilder sb, final JSONArray arr, final String heading )
    {
        if ( arr != null && arr.length() > 0 )
        {
            sb.append( "    " ).append( heading ).append( lineSeparator );

            for ( int i = 0; i < arr.length(); i++ )
            {
                JSONObject fix = arr.getJSONObject( i );

                sb.append( "      " ).append( fix.get( "message" ) ).append( lineSeparator );
            }

            sb.append( lineSeparator );
        }
    }

    private static String getOrdinal( int number )
    {
        String ordinal = "";

        int mod;

        while ( number > 0 )
        {
            mod = (number - 1) % 26;
            ordinal = (char) (mod + 97) + ordinal;
            number = (number - mod) / 26;
        }

        return ordinal;
    }

}
