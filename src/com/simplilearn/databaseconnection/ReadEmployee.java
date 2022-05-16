package com.simplilearn.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadEmployee {
	
	public static void main(String[] args) {
		// Statement: READ data from table
		String url = "jdbc:mysql://localhost:3306/ecomsystem";
		String userName = "root";
		String password = "Nkavya@20";
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		try {
//			1. Register Driver
			Class.forName(JDBC_DRIVER);
			
//			2. Get Connection
			Connection conn = DriverManager.getConnection(url, userName, password);
			System.out.println("DB Connection is successful !!!!!");
//			3. Create statement
			Statement stm = conn.createStatement();
			
//			4. Create and execute query
			String query = "SELECT * FROM employees";
			ResultSet re_set = stm.executeQuery(query);
			
//			5. print the results
			
			while(re_set.next()) {
				System.out.println(re_set.getInt("id")+ "   |   "+re_set.getString("First_name")+"   |   "+
			re_set.getString("Last_name")+"   |   "+re_set.getString("Email")+"   |   "+re_set.getString("Department")+"   |   "+
						re_set.getDouble("Salary"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
		}


	}

}
