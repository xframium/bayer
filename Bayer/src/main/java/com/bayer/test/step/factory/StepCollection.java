package com.bayer.test.step.factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;

public class StepCollection extends AbstractStep implements Iterable<Step>, Step
{
    private List<Step> stepList = new ArrayList<Step>( 10 );

    protected Log log = LogFactory.getLog( StepCollection.class );
    
    public StepCollection( String description, String failureMessage, Step[] stepArray )
    {
        super( description, failureMessage );
        for ( Step step : stepArray )
            add( step );
    }
    
    public void add( Step currentStep )
    {
        stepList.add( currentStep );
    }
    
    @Override
    public Iterator<Step> iterator()
    {
        return stepList.iterator();
    }

    public void executeSteps( BayerWebDriver webDriver )
    {
        for ( Step currentStep : stepList )
        {
            if ( !currentStep.executeStep( webDriver ) )
            {
                throw new IllegalStateException( currentStep.getFailureMessage() );
            }
        }
    }

    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        executeSteps( webDriver );
        return true;
    }

    
    
    
    
}
