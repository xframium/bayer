package com.bayer.test.device;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Device
{
    private boolean deviceUsed = false;
    private Lock currentLock = new ReentrantLock();
    private DesiredCapabilities dC;
    private long lockTime;
    
    public Device( DesiredCapabilities dC )
    {
        this.dC = dC;
    }
    
    public boolean acquireLock()
    {
        boolean lockAcquired = currentLock.tryLock();
        
        if ( lockAcquired )
            lockTime = System.currentTimeMillis();
        
        return lockAcquired;
    }
    
    public void releaseLock()
    {
        deviceUsed = true;
        currentLock.unlock();
    }

    public DesiredCapabilities getdC()
    {
        return dC;
    }

    public void setdC( DesiredCapabilities dC )
    {
        this.dC = dC;
    }

    public boolean isDeviceUsed()
    {
        return deviceUsed;
    }

    public void setDeviceUsed( boolean deviceUsed )
    {
        this.deviceUsed = deviceUsed;
    }
    
    public String toString()
    {
        return dC.toString();
    }

    public long getLockTime()
    {
        return lockTime;
    }

    public void setLockTime( long lockTime )
    {
        this.lockTime = lockTime;
    }
    
    
    
    

}
