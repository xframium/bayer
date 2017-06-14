package com.bayer.test.device;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DeviceContainer
{
    protected Log log = LogFactory.getLog( DeviceContainer.class );
    private List<Device> deviceList = new ArrayList<Device>(10);
    
    private Map<Device,Map<String,Boolean>> executionMap = new HashMap<Device,Map<String,Boolean>>( 10 );
    
    private boolean allowReuse = true;
    
    public void addDevice( DesiredCapabilities dC )
    {
        deviceList.add( new Device( dC ) );
    }
    
    public String toString()
    {
        return deviceList.toString();
    }
    
    private class DeviceComparator implements Comparator<Device>
    {

        @Override
        public int compare( Device o1, Device o2 )
        {
            return Long.compare( o1.getLockTime(), o2.getLockTime() );
            // TODO Auto-generated method stub
        }
        
    }
    
    public synchronized Device getDevice( String methodKey )
    {
        int retryCount = 0;
          
        try
        {
        	Collections.sort( deviceList, new DeviceComparator() );
        }
        catch( Exception e )
        {}
    
        
        while ( retryCount < 600 )
        {
            for ( Device device : deviceList )
            {
                //
                // Checking for reuse of device
                //
                if ( !allowReuse )
                {
                    Map<String,Boolean> methodMap = executionMap.get( device );
                    if ( methodMap == null )
                    {
                        methodMap = new HashMap<String,Boolean>( 5 );
                        executionMap.put( device, methodMap );
                    }
                    
                    if ( methodMap.get( methodKey ) != null && methodMap.get( methodKey ).booleanValue() )
                        continue;
                }
                if ( device.acquireLock() )
                {
                    log.info( Thread.currentThread().getName() + ": Device " + device.getdC() + " acquired" );
                    return device;
                }
            }
            
            try
            {
                Thread.sleep( 5000 );
            }
            catch( Exception e )
            {
                
            }
        }
        
        throw new IllegalStateException( "Could not acquire device" );
    }

    public void markUsed( Device device, String methodKey )
    {
        Map<String,Boolean> methodMap = executionMap.get( device );
        if ( methodMap == null )
        {
            methodMap = new HashMap<String,Boolean>( 5 );
            executionMap.put( device, methodMap );
        }
        
        methodMap.put( methodKey, true );
    }
    
    public boolean isAllowReuse()
    {
        return allowReuse;
    }

    public void setAllowReuse( boolean allowReuse )
    {
        this.allowReuse = allowReuse;
    }
}
