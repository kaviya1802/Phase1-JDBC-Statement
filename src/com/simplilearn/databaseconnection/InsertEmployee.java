package com.simplilearn.databaseconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployee {

	public static void main(String[] args) throws SQLException {
		//Statement : Insert Employee record
		Connection conn = null;
		Statement stm = null;
		try {
			
			// Get connection
			conn = DBConnection.initConnection();
			System.out.println("*******DB Connection is successful******");
			
			//create statement
			stm = conn.createStatement();
			
			//write query
			String query = "INSERT INTO employees( id, first_name, last_name, email, department, salary)" +
					 "VALUES ( 1196446, 'Kalaiselvi', 'Ramasamy' , 'selvi158@gmail.com', 'Homemaker', 150000.50)";
			
			//execute query 
			int rowsAffected = stm.executeUpdate(query);
			System.out.println(+rowsAffected+ " Rows affected !!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stm != null) {
				stm.close();
			}if(conn != null) {
				conn.close();
			}
		}

	}

}
