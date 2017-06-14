package com.bayer.utiilty;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyXmlSerializer;
import org.htmlcleaner.XmlSerializer;
import org.xml.sax.InputSource;

public class XMLEscape
{
    private static int[][] CHAR_LIST = new int[][] { { 0, 9 }, { 11, 13 }, {128, 255 }, {38, 39 } };
    
    /**
     * Replaces the XML escape characters to XML numeric replacement
     * @param xmlIn - String
     * @return String
     */
    public static String escapeXML( String xmlIn )
    {
        String xmlOut = xmlIn;
        for ( int[] currentArray : CHAR_LIST )
        {
           
            for ( int i=currentArray[ 0 ]; i<currentArray[ 1 ]; i++ )
            {
                xmlOut = xmlOut.replace( new String( new byte[] { (byte)i } ), "&#" + i + ";" );
            }
        }
        
        return xmlOut;
    }
    
    /**
     * converts XML to HTML format
     * @param xmlIn - XML String
     * @return String - in HTML format
     */
    public static String toXML( String xmlIn )
    {
        
        //
        // Check if the document is already well formed
        //
        if ( validateDocument( xmlIn ) )
            return xmlIn;
        
        //
        // Try to simply escape some characters
        //
        String escapedString = escapeXML( xmlIn );
        if ( validateDocument( escapedString ) )
            return escapedString;
        
        //
        // We assume HTML at this point
        //

        return toHTML( xmlIn );

        
    }
    
    /**
     * Converts a given xml to HTML String
     * @param htmlIn - xml in String
     * @return String - in HTML format
     */
    public static String toHTML( String htmlIn )
    {
        //System.setProperty( "XML_Tags", "true" );
        try
        {
            HtmlCleaner cleaner = new HtmlCleaner();
            cleaner.getProperties().setNamespacesAware( true ); 
            
            XmlSerializer xmlSerializer = new PrettyXmlSerializer( cleaner.getProperties(), "  " );

            String htmlData = xmlSerializer.getAsString( htmlIn );
            
            htmlData = escapeXML( htmlData.replaceAll("(?m)^[ \t]*\r?\n", "") );
            
            return htmlData;

        }
        catch( Exception e )
        {
            e.printStackTrace();
            return null;
        }
    }

    
    /**
     * Checks if a given xml is a valid format
     * @param inputDocument - String
     * @return boolean
     */
    private static boolean validateDocument( String inputDocument )
    {
        try
        {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            InputStreamReader streamReader = new InputStreamReader( new ByteArrayInputStream( inputDocument.getBytes() ), "UTF-8" );
            InputSource inputSource = new InputSource( streamReader );
            inputSource.setEncoding( "UTF-8" );

            builder.parse( inputSource );
            
            return true;
        }
        catch( Throwable t)
        {
            return false;
        }
    }
    
    
    
    
}
