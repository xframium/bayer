package com.bayer.test.step.factory;

import com.bayer.BayerWebDriver;

public interface Step
{
    public boolean executeStep( BayerWebDriver webDriver );
    
    public StepListener getStepListener();
    public void setStepListener( StepListener stepListener );

    public String getDescription();

    public String getFailureMessage();
}
