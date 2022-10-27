package com.company.taxicorporation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class BaseClass 
{
	private static Connection connection;
	public static Properties prop;
    
    public static void dbConnect() {
    	String databaseURL = "jdbc:mysql://host:port/dburl";
    	String userName = prop.getProperty("UserName");
    	String password = prop.getProperty("Password");
    	
        try {
        	connection = null;
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Database...");
            connection = DriverManager.getConnection(databaseURL, userName, password);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }   	
}
    
    
    public void dbDisconnect() {
    	if (connection != null) {
            try {
                System.out.println("Closing Database Connection...");
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
  }
}
