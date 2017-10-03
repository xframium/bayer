package com.bayer.marketing.consumerHealth.betaseron.tests.InjectionTraining;

import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.StructureValidator;
import com.bayer.marketing.consumerHealth.betaseron.tests.InjectionTraining.steps.InjectionTrainingSteps;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class InjectionTraining extends AbstractTest
{
   
    @TestDescriptor( testName="InjectionTraining Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void structureTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.betaseron.com/taking-betaseron/injection-training/"),
        							new InjectionTrainingSteps(),
        						   new StructureValidator( "ISI", "/com/bayer/marketing/consumerHealth/betaseron/tests/InjectionTraining/InjectionTrainingValidation.xml" ), 
        						 
    
        } );
    
}}

