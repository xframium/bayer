package com.bayer.common;

import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.test.step.factory.Step;

public class State extends AbstractStep implements Step
{
    private String checkPointName;
    private int historicalCount;
    private int deviationPercentage;
    public State ( String checkPointName )
    {
        super( "dump state", "dump state" );
        this.checkPointName = checkPointName;
    }
    
    public State ( String checkPointName, int historicalCount, int deviationPercentage )
    {
    	super( "dump state", "dump state" );
    	this.checkPointName = checkPointName;
    	this.historicalCount = historicalCount;
    	this.deviationPercentage = deviationPercentage;
    }
    
    @Override 
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
    	try
    	{
    		dumpState(webDriver, checkPointName, historicalCount, deviationPercentage);
    	}
    	catch( Exception e )
    	{
    		e.printStackTrace();
    	}
    	
        return true;
    }

}
