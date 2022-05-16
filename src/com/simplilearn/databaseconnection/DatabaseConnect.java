package com.simplilearn.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {

	public static void main(String[] args) {
		// Database Connection
		String url = "jdbc:mysql://localhost:3306/ecomsystem";
		String userName = "root";
		String password = "Nkavya@20";
		try {
//			1. Register Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. Get Connection
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			System.out.println("DB Connection is successful !!!!!");
			
//			3. Create statement
//			4. Excecute Statement
//			5. Store it in Resultset
//			6. Close connection
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			// TODO: handle finally clause
		}


	}

}
