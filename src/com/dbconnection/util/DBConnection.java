package com.dbconnection.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String DB_DRIVER_CLASS="com.mysql.jdbc.Driver";
	private static final String DB_URL="jdbc:mysql://localhost:3306/db";
	private static final String DB_USERNAME="amit";
	private static final String DB_PASSWORD="amit";
	private static Connection connection=null;
	
	static {
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Class not found Exception or SQL Exception");
		}
	}
	
	public Connection getConnection() 
	{
		return connection;
	};
	
	
	
}
