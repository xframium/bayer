package com.bayer.utiilty;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.bayer.utiilty.MatrixResult.MatrixValue;


public class MatrixResult implements Iterable<MatrixValue>
{
    private String[] columnNames;
    private List<String[]> elementArray;
    
    private Map<String,Integer> columnMap = new HashMap<String,Integer>( 10 );
    private Log log = LogFactory.getLog( MatrixResult.class );
    
    public class MatrixValue
    {
        private MatrixResult mR;
        private int index;
        public MatrixValue( MatrixResult mR, int index )
        {
            this.mR = mR;
            this.index = index;
        }
        
        public String getValue( String columnName )
        {
            return mR.getValue( index, columnName );
        }
        
        public String[] getValues()
        {
            return mR.getRecord( index );
        }
    }
    
    public MatrixResult( String[] columnNames, List<String[]> elementArray )
    {
        this.columnNames = columnNames;
        this.elementArray = elementArray;
        
        for ( int i=0; i<columnNames.length; i++ )
        {
            if ( log.isInfoEnabled() )
                log.info( "Adding Column " + columnNames[ i ] + " at " + i );
            columnMap.put( columnNames[ i ].toLowerCase(), i );
        }
    }
    
    public String[] getRecord( int recordNumber )
    {
        return elementArray.get( recordNumber );
    }
    
    public String[] getFieldNames()
    {
        return columnNames;
    }
    
    public String getValue( int recordNumber, String columnName )
    {
        String[] currentRecord = getRecord( recordNumber );
        int columnNumber = columnMap.get( columnName.toLowerCase() ).intValue();
        if ( columnNumber >= currentRecord.length )
            return null;
        else
            return currentRecord[ columnNumber ];
        
    }
    
    public int getSize()
    {
        return elementArray.size();
    }

    @Override
    public Iterator<MatrixValue> iterator()
    {
        return new MatrixIterator( this );
    }
    
    private class MatrixIterator implements Iterator<MatrixValue>
    {
        
        private MatrixResult mR;
        private int currentIndex = 0;
        
        public MatrixIterator( MatrixResult mR )
        {
            this.mR = mR;
        }
        
        @Override
        public boolean hasNext()
        {
            return currentIndex < mR.getSize();
        }

        @Override
        public MatrixValue next()
        {
            return new MatrixValue( mR, currentIndex++ );
        }
        
    }
}
