package com.bayer.objectRepository;

public class ORLookup
{
    private String orType;
    private String orContext;
    private String orValue;
    
    public ORLookup( String orData )
    {
        this( orData.substring( 0, orData.indexOf( ":" ) ), orData.substring( orData.indexOf( ":" ) + 1 ) );
    }
    
    public ORLookup( String orType, String orValue )
    {

        String[] orSplit = orType.split( "\\." );
        if ( orSplit.length == 2 )
        {
            orContext = orSplit[ 0 ];
            this.orType = orSplit[ 1 ];
        }
        else
            this.orType = orType;
        
        this.orValue = orValue;
    }
    public String getOrType()
    {
        return orType;
    }
    public void setOrType( String orType )
    {
        this.orType = orType;
    }
    public String getOrValue()
    {
        return orValue;
    }
    public void setOrValue( String orValue )
    {
        this.orValue = orValue;
    }

    public String getOrContext()
    {
        return orContext;
    }
    
    public void setOrContext( String orContext )
    {
        this.orContext = orContext;
    }

    @Override
    public String toString()
    {
        return "ORLookup [orType=" + orType + ", orContext=" + orContext + ", orValue=" + orValue + "]";
    }


}
