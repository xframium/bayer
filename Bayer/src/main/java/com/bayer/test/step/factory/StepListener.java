package com.bayer.test.step.factory;

import com.bayer.BayerWebDriver;

public interface StepListener
{
    public void beforeStep( BayerWebDriver webDriver );
    public void afterStep( BayerWebDriver webDriver, boolean testPassed );
}
