package com.bayer.objectRepository;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PropertyReader implements ObjectRepository
{
    private static PropertyReader singleton = new PropertyReader();
    private boolean initialized = false;
    private PropertyReader()
    {
        
    }
    public static PropertyReader instance()
    {
        return singleton;
    }
    
    private Map<String,ORLookup> orMap = new HashMap<String,ORLookup>( 10 );

    public synchronized void load( String FileName )
    {
        if ( initialized )
            return;
        
        initialized = true;
        try
        {
            InputStream inputStream = null;
            Properties prop = new Properties();
            if ( FileName != null )
                inputStream = new FileInputStream( FileName );
            else
            {
                String objectRepo = System.getProperty( "objectRepository.properties" );
                if ( objectRepo != null ) 
                    inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream( objectRepo );
                else
                    inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream( "com/bayer/objectRepository/objectRepository.properties" );
                    
            }
            prop.load( inputStream );
            
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            
            for ( Object keyName : prop.keySet() )
            {
            	
            	
                String propertyName = (String) keyName;
                
                // 	Skip the line separators
                if (propertyName.startsWith("--"))
                	continue;
                
                try
                {
                    Map<String, String> propertyMap = gson.fromJson( prop.getProperty( propertyName ), HashMap.class );
                   
                    for ( String osType : propertyMap.keySet() )
                    {
                        if ( osType.trim().isEmpty() )
                            orMap.put( propertyName, new ORLookup( propertyMap.get( osType ) ) );
                        else
                            orMap.put( propertyName + "." + osType, new ORLookup( propertyMap.get( osType ) ) );
                    }
                }
                catch( Exception e )
                {
                    System.err.println( "Could not parse " + prop.getProperty( propertyName ) );
                    e.printStackTrace();
                }
            }
            
        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }
    }
  
    @Override
    public ORLookup getElement( String elementName, String osType )
    {
        
        if ( !initialized )
        {
            load( null );
        }
        
        ORLookup orLookup = orMap.get( elementName + "." + osType );
        if ( orLookup == null )
        {
            orLookup = orMap.get( elementName );
        }
        
        if ( orLookup == null )
            throw new IllegalArgumentException( "Could not locate or element using " + elementName );
        
        return orLookup;
    }

}
