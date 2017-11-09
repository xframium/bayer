package com.bayer.marketing.consumerHealth.claritin.tests.SmartAllergy;

import org.testng.annotations.Test;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.testng.annotations.Test;
import com.bayer.common.Navigate;
import com.bayer.common.TimedNavigate;
import com.bayer.common.utility.LinkValidator;
import com.bayer.common.utility.StructureValidator;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class SmartAllergyRun extends AbstractTest
{
   
    @TestDescriptor( testName="Claritn Smart Allergy Link Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void faqTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new LinkValidator("http://claritin.cm.ci.bch.inter.fe.claritin.us.build.dev-bbs.sitecore.bayer-ag.com", 12)  } );
    }
    
}