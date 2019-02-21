package com.daoPackage.in;

import java.sql.Connection;

import com.dbconnection.util.DBConnection;

public class ConnectionCheck {

	public static void main(String[] args) {
		
		DBConnection dbConn=new DBConnection();    //To use the method we created an object
		
		Connection conn=dbConn.getConnection();   //Used the method
		
		if(conn!=null) {
			
			System.out.println("Connection taken");
			
		}
		else
		{
			System.out.println("Connection failed due to some reason");
		}
		
	}
	
	
}
