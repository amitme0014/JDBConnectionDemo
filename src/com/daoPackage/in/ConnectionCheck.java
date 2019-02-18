package com.daoPackage.in;

import java.sql.Connection;

import com.dbconnection.util.DBConnection;

public class ConnectionCheck {

	public static void main(String[] args) {
		
		DBConnection dbConn=new DBConnection();
		
		Connection conn=dbConn.getConnection();
		
		if(conn!=null) {
			
			System.out.println("Connection taken");
			
		}
		else
		{
			System.out.println("Connection failed due to some reason");
		}
		
	}
	
	
}
