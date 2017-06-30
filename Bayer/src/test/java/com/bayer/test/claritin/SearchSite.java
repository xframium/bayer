package com.bayer.test.claritin;

import org.testng.annotations.Test;
import com.bayer.test.AbstractTest;
import com.bayer.test.device.DeviceContainer;
import com.bayer.test.step.factory.Step;
import com.bayer.test.step.spi.claritin.search.Search;
import com.bayer.test.step.spi.common.Navigate;

public class SearchSite extends AbstractTest
{
    
    @TestDescriptor( testName="Search Test" )
    @Test ( dataProvider = "deviceList", enabled=true)
    public void searchTest( DeviceContainer dC )
    {
        executeSteps( new Step[] { new Navigate( "https://www.claritin.com" ), new Search() } );
    }

}
