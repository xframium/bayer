package com.bayer.validation.structure;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

public class ValidationManager
{
    private static ValidationManager singleton = new ValidationManager();
    
    public static ValidationManager instance()
    {
        return singleton;
    }
    
    private Map<String,Validation> validationMap = new HashMap<String,Validation>( 10 );
    
    @SuppressWarnings ( "restriction")
    private ValidationManager()
    {
        try
        {
            JAXBContext jc = JAXBContext.newInstance( ObjectFactory.class );
            Unmarshaller u = jc.createUnmarshaller();
            
            String validationLocation = System.getProperty( "validationDefinition" );
            JAXBElement<?> rootElement = null;
            
            if ( validationLocation != null )
                rootElement = (JAXBElement<?>) u.unmarshal( getClass().getResourceAsStream( validationLocation ) );
            else
                rootElement = (JAXBElement<?>) u.unmarshal( getClass().getResourceAsStream( "/com/bayer/marketing/consumerHealth/betaseron/config/structureValidation.xml" ) );
    
            ValidationCollection rRoot = (ValidationCollection) rootElement.getValue();
            
            for ( Validation v : rRoot.validation )
                validationMap.put( v.name, v );
            
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
    
    public Validation getValidation( String validationName )
    {
        return validationMap.get(  validationName );
    }

}
