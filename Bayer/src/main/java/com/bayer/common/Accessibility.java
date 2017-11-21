package com.bayer.common;

import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.test.step.factory.Step;
import com.deque.axe.AXE;

public class Accessibility extends AbstractStep implements Step
{
    private static final URL AXE_URL = Accessibility.class.getResource("/com/bayer/common/axe.min.js");
    public Accessibility ( )
    {
        super( "Accessibility Test", "Accessibility Test" );
    }
    
    @Override 
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        JSONObject responseJSON = new AXE.Builder( webDriver, AXE_URL ).analyze();
        
        JSONArray vA = responseJSON.getJSONArray( "violations" );
        if ( vA != null && vA.length() > 0 )
        {
            System.err.println( vA.toString() );
            return false;
        }
        else
            return true;
    }

}
