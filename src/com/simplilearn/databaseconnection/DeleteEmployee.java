package com.simplilearn.databaseconnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {

	public static void main(String[] args) throws SQLException {
		// Statement : Delete record
		Connection conn = null;
		Statement stm = null;
		
		try {
			
			//getConnection
			conn = DBConnection.initConnection();
			
			//create statement
			stm = conn.createStatement();
			
			//create & Execute query
			
			String query = "DELETE FROM employees where id = 1196446";
			int rowsAfftected = stm.executeUpdate(query);
			
			System.out.println(+rowsAfftected+ " Rows Affected");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				conn.close();
			}if(stm != null) {
				stm.close();
			}
		}

	}

}
