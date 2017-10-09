package com.bayer.marketing.consumerHealth.betaseron.tests.InjectionTracking;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.InjectionTracking.steps.InjectionTrackingSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class InjectionTracking extends AbstractTest
{
   
    @TestDescriptor( testName="InjectionTracking Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/taking-betaseron/injection-tracking/"),
        							new InjectionTrackingSteps(),
        						   new StructureValidator( "ISI", "/com/bayer/marketing/consumerHealth/betaseron/tests/InjectionTraining/InjectionTrackingValidation.xml" ), 
        						 
    
        } );
    
}}

