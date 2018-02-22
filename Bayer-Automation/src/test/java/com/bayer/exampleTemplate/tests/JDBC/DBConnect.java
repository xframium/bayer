package com.bayer.exampleTemplate.tests.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.*;
 
public class DBConnect {
    public static void main(String[] args) {
    	String connectionString =  
                "jdbc:sqlserver://HUSHNVC039Q:1433;"
                		+ "databaseName=GDPR;"
                + "trustServerCertificate=true;"
                + "user=TestUser;"  
                + "password=Bayer@1234;";  
            // Declare the JDBC objects.  
            Connection connection = null;  
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("Class found ");
            }
            catch(java.lang.ClassNotFoundException e)
            {
                System.out.println("ClassNotFoundException: ");
                System.out.println(e.getMessage());
            }
            try {  
            	System.out.println("Establishing connection");
                connection = DriverManager.getConnection(connectionString);  
                System.out.println("Connected to database");
                Statement statement = connection.createStatement();
                ResultSet rSet = statement.executeQuery("SELECT * From DE");
                while (rSet.next()) {
                         	  
                	  String urlName = rSet.getString("URL");
                      //String last = rSet.getString("last");

                      System.out.println("URL Name: " + urlName);
                      //System.out.println(", Last: " + last);
                	}
            }  
            catch (Exception e) {  
                e.printStackTrace();  
            }  
            
            finally {  
                if (connection != null) 
                	try { 
                		connection.close(); 
                		} 
                catch(Exception e) {}  
            }  
    }
}
