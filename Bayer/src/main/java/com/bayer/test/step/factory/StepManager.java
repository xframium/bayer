package com.bayer.test.step.factory;

import java.util.ArrayList;
import java.util.List;
import com.bayer.BayerWebDriver;

public class StepManager
{
    private static StepManager singleton = new StepManager();
    
    private StepManager()
    {
        
    }
    
    public static StepManager instance()
    {
        return singleton;
    }
    
    private List<StepListener> listenerList = new ArrayList<StepListener>( 20 );
    
    public void addListener( StepListener stepListener )
    {
        listenerList.add( stepListener );
    }
    
    public void removeListener( StepListener stepListener )
    {
        listenerList.remove( stepListener );
    }
    
    public void beforeStep( BayerWebDriver webDriver )
    {
        for ( StepListener sL : listenerList )
            sL.beforeStep( webDriver );
        
    }

    public void afterStep( BayerWebDriver webDriver, boolean testPassed )
    {
        for ( StepListener sL : listenerList )
            sL.afterStep( webDriver, testPassed );
    }
}
