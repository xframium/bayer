package com.bayer.utiilty;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.perfectomobile.selenium.util.EclipseConnector;

public class Utility
{
    private static Utility singleton = new Utility();

    private Utility()
    {

    }

    public static Utility instance()
    {
        return singleton;
    }

    public MatrixResult readCSV( String resourceName )
    {
        try
        {

            LineNumberReader fileReader = new LineNumberReader( new InputStreamReader( ClassLoader.getSystemClassLoader().getResourceAsStream( resourceName ) ) );
            String[] columnNames = fileReader.readLine().split( "," );

            List<String[]> elementList = new ArrayList<String[]>( 20 );

            String currentLine = null;

            while ( (currentLine = fileReader.readLine()) != null )
            {
                elementList.add( currentLine.split( "," ) );
            }
            return new MatrixResult( columnNames, elementList );
        }
        catch ( Exception e )
        {
            e.printStackTrace();
            return null;
        }
    }

    public static void setExecutionIdCapability( DesiredCapabilities capabilities, String host ) throws IOException
    {
        EclipseConnector connector = new EclipseConnector();
        String eclipseHost = connector.getHost();
        if ( (eclipseHost == null) || (eclipseHost.contains( host )) )
        {
            String executionId = connector.getExecutionId();
            capabilities.setCapability( EclipseConnector.ECLIPSE_EXECUTION_ID, executionId );
        }
    }

}
