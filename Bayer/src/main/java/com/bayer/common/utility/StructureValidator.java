package com.bayer.common.utility;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import com.bayer.BayerWebDriver;
import com.bayer.test.step.AbstractStep;
import com.bayer.validation.structure.Attribute;
import com.bayer.validation.structure.Tag;
import com.bayer.validation.structure.Validation;
import com.bayer.validation.structure.ValidationManager;

public class StructureValidator extends AbstractStep
{
    private XPathFactory xPathFactory = XPathFactory.newInstance();
    private Validation v;

    public StructureValidator( String validationName )
    {
        super( "Generic structure validation", null );

        v = ValidationManager.instance().getValidation( validationName );

        this.setDescription( v.getDescription() );
    }

    @Override
    protected boolean _executeStep( BayerWebDriver webDriver )
    {
        Document cachedDocument = null;
        if ( v != null )
        {
            try
            {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

                InputStreamReader streamReader = new InputStreamReader( new ByteArrayInputStream( webDriver.getPageSource().getBytes() ), "UTF-8" );
                InputSource inputSource = new InputSource( streamReader );
                inputSource.setEncoding( "UTF-8" );

                cachedDocument = dBuilder.parse( inputSource );
                
                
                
            }
            catch ( Exception e )
            {
                e.printStackTrace();
            }
            
            for ( Tag t : v.getTag() )
            {
                validateTag( "", cachedDocument, t );
            }
            
        }
        return true;
    }
    
    private List<Element> getNodes( Document xmlDocument, String xPathExpression )
    {
        List<Element> elementList = new ArrayList<Element>( 10 );
        try
        {
            XPath xPath = xPathFactory.newXPath();
            NodeList nodeList = (NodeList) xPath.evaluate( xPathExpression, xmlDocument, XPathConstants.NODESET );
            
            
            
            for ( int i=0; i<nodeList.getLength(); i++ )
                elementList.add( (Element) nodeList.item( i ) ); 
            
            return elementList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return elementList;
        }
    }

    private void validateTag( String context, Document cachedDocument, Tag t )
    {
        log.info( "Searching for " + context + t.getName() );
        
        
        
        List<Element> elementList = getNodes( cachedDocument, context + t.getName() );

        List<Element> filteredList = new ArrayList<Element>( 10 );

        //
        // Validate any attributes
        //
        if ( t.getAttribute() != null && !t.getAttribute().isEmpty() )
        {
            log.info( "Validating attributes for " + context + t.getName() );
            for ( Element e : elementList )
            {
                boolean attributeFound = true;
                for ( Attribute a : t.getAttribute() )
                {
                    String attributeValue = e.getAttribute( a.getName() );

                    //
                    // Check for required attributes
                    //
                    if ( attributeValue == null && a.isRequired() )
                    {
                        attributeFound = false;
                        continue;
                    }

                    if ( attributeValue != null && !validate( a.getType(), a.getValue(), attributeValue ) )
                    {
                        attributeFound = false;
                        continue;
                    }
                }
                
                if ( !attributeFound )
                    continue;
                
                filteredList.add( e );
            }
        }
        else
            filteredList.addAll( elementList );
        
        if ( filteredList.isEmpty() )
        {
            setFailureMessage( "Could not validate " + context + t.getName() + " as " + t.getText().getValue() + " due to attribute violation" );
            throw new IllegalArgumentException( "Could not validate " + context + t.getName() + " as " + t.getText() + " due to attribute violation" );
        }
        
        List<Element> finalList = new ArrayList<Element>( 5 );
        
        //
        // Validate any text
        //
        if ( t.getText() != null )
        {
            log.info( "Validating text for " + context + t.getName() );
            for ( Element e : filteredList )
            {
                StringBuilder textBuilder = new StringBuilder();
                NodeList childNodes = e.getChildNodes();
                for ( int i=0; i<childNodes.getLength(); i++ )
                {
                    if ( childNodes.item( i ).getNodeType() == Node.TEXT_NODE )
                    {
                        textBuilder.append( childNodes.item( i ).getTextContent() );
                    }
                }
                
                String textValue = textBuilder.toString();

                //
                // Check for required attributes
                //
                if ( textValue == null )
                    continue;

                if ( textValue != null && !validate( t.getText().getType(), t.getText().getValue(), textValue ) )
                    continue;
                
                finalList.add( e );
                break;
            }
        }
        
        if ( finalList.isEmpty() )
        {
            setFailureMessage( "Could not validate " + context + t.getName() + " as " + t.getText().getValue() + " due to text violation" );
            throw new IllegalArgumentException( "Could not validate " + context + t.getName() + " as " + t.getText().getValue() + " due to text violation" );
        }
        
        if ( t.getTag() != null )
        {
            for ( Tag t2 : t.getTag() )
                validateTag( context + t.getName(), cachedDocument, t2 );
        }
    }

    private boolean validate( String validationType, String validationData, String value )
    {
        switch ( validationType.toLowerCase() )
        {
            case "is":
                return value.equals( validationData );
                
            case "contains":
                return value.contains( validationData );
                        
            case "starts-with":
                return value.startsWith( validationData );
                
            case "ends-with":
                return value.endsWith( validationData );
                
            case "exists":
                return true;
                
            case "regex":
                return Pattern.matches( validationData, value );
                
            default:
                return false;
        }
    }
    
    public static void main( String[] args )
    {
        String xs = "\n      \nBETASERON\n      $#174;\n       (interferon beta-1b)\n           \n";
        System.out.println( xs );
        System.out.println( Pattern.matches( "(?s).*BETASERON.*\\(interferon beta-1b\\).*", xs ) );
        System.out.println( Pattern.matches( "BETASERON", xs ) );
    }
    
}
