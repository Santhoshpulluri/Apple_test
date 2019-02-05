package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Databaseconnection {
	
	Connection con= null;

	public  Connection dbconnection(String myUserName,String myPassword,String dbURL) throws SQLException, ClassNotFoundException { 
		 
		        String username = myUserName;
		        String password = myPassword;
		        //Load MySQL JDBC Driver
		        Class.forName("com.mysql.jdbc.Driver");
		        //Creating connection to the database
		        Connection con = DriverManager.getConnection(dbURL,username,password);
		        //Creating statement object
		     Statement st = con.createStatement();
		        //Closing DB Connection		     
		     return con;

}
}
