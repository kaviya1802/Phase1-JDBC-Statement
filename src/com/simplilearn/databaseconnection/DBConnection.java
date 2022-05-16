package com.simplilearn.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

	static final String url = "jdbc:mysql://localhost:3306/ecomsystem";
	static final String userName = "root";
	static final String password = "Nkavya@20";
	
	public static Connection initConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection (url, userName, password);
//			System.out.println("****** DB Connection is Successful ********");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;	
		
	}
}
