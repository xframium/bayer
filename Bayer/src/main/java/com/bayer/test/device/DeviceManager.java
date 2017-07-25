package com.bayer.test.device;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.bayer.configuration.ConfigurationManager;
import com.bayer.utiilty.MatrixResult;
import com.bayer.utiilty.MatrixResult.MatrixValue;
import com.bayer.utiilty.Utility;

public class DeviceManager
{
    private static DeviceManager singleton = new DeviceManager();

    private List<DeviceContainer> deviceCache = null;

    public String toString()
    {
        if ( deviceCache != null )
            return deviceCache.toString();
        else
            return "";
    }
    
    private void configureContainer()
    {
        
        String deviceSheet = System.getProperty( "deviceSheet" );
        
        
        MatrixResult matrixResult = null;
        if ( deviceSheet == null ) 
            matrixResult = Utility.instance().readCSV( "com/bayer/configuration/deviceSheet.csv" );
        else
            matrixResult = Utility.instance().readCSV( deviceSheet );

        if ( log.isInfoEnabled() )
            log.info( "Read " + matrixResult.getSize() + " device records" );

        String useNames = System.getProperty( "Devices" );
        String[] deviceList = null;
        if ( useNames != null && !useNames.isEmpty() && !useNames.startsWith( "$" ) )
            deviceList = useNames.split( "," );

        for ( MatrixValue mV : matrixResult )
        {
            if ( deviceList != null && deviceList.length > 0 )
            {
                //
                // Allows override of devices from system properties
                //
                for ( String device : deviceList )
                {
                    if ( device.equals( mV.getValue( "deviceName" ) ) )
                    {
                        DesiredCapabilities dC = new DesiredCapabilities();
                        for ( String capabilityName : matrixResult.getFieldNames() )
                        {
                            if ( log.isDebugEnabled() )
                                log.debug( "Analyzing Capability " + capabilityName );
                            if ( !"Active".equalsIgnoreCase( capabilityName ) && !"Type".equalsIgnoreCase( capabilityName ) )
                            {
                                String currentValue = mV.getValue( capabilityName );
                                if ( currentValue != null && !currentValue.trim().isEmpty() )
                                {
                                    if ( log.isDebugEnabled() )
                                        log.debug( "Adding Capability " + capabilityName + " as " + currentValue );
                                    dC.setCapability( capabilityName, currentValue );
                                }
                            }
                            else if ( "Type".equals( capabilityName ) )
                            {
                                dC.setCapability( "_driverType", mV.getValue( capabilityName ) );
                            }
                        }
                        
                        dC.setCapability( "user", ConfigurationManager.instance().getProperty( "UserName" ) );
                        dC.setCapability( "password", ConfigurationManager.instance().getProperty( "Password" ) );

                        DeviceContainer deviceContainer = new DeviceContainer();
                        deviceContainer.setAllowReuse( false );
                        deviceContainer.addDevice( dC );

                        deviceCache.add( deviceContainer );
                    }

                }
            }
            else
            {
                //
                // Checks for YES in the active column
                //
                if ( "Yes".equalsIgnoreCase( mV.getValue( "Active" ) ) )
                {
                    DesiredCapabilities dC = new DesiredCapabilities();
                    for ( String capabilityName : matrixResult.getFieldNames() )
                    {
                        if ( log.isInfoEnabled() )
                            log.info( "Analyzing Capability " + capabilityName );
                        if ( !"Active".equalsIgnoreCase( capabilityName ) && !"Type".equalsIgnoreCase( capabilityName ) )
                        {
                            String currentValue = mV.getValue( capabilityName );
                            if ( currentValue != null && !currentValue.trim().isEmpty() )
                            {
                                if ( log.isInfoEnabled() )
                                    log.info( "Adding Capability " + capabilityName + " as " + currentValue );
                                dC.setCapability( capabilityName, currentValue );
                            }
                        }
                        else if ( "Type".equals( capabilityName ) )
                        {
                            dC.setCapability( "_driverType", mV.getValue( capabilityName ) );
                        }
                    }

                    dC.setCapability( "user", ConfigurationManager.instance().getProperty( "UserName" ) );
                    dC.setCapability( "password", ConfigurationManager.instance().getProperty( "Password" ) );
                    
                    DeviceContainer deviceContainer = new DeviceContainer();
                    deviceContainer.setAllowReuse( false );
                    deviceContainer.addDevice( dC );


                    deviceCache.add( deviceContainer );

                }
            }
        }
    }

    

    private DeviceManager()
    {

    }

    public static DeviceManager instance()
    {
        return singleton;
    }

    public synchronized DeviceContainer[] getDevices()
    {
        if ( deviceCache == null )
        {
            deviceCache = new ArrayList<DeviceContainer>( 20 );
            configureContainer();

        }

        return deviceCache.toArray( new DeviceContainer[0] );
    }

    private Log log = LogFactory.getLog( DeviceManager.class );

}