package com.simplilearn.databaseconnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateEmployee {

	public static void main(String[] args) throws SQLException {
		// Statement : Update record
		Connection conn = null;
		Statement stm = null;
		try {
			//get connection
			conn = DBConnection.initConnection();
			
			//create statement
			stm = conn.createStatement();
			
			//create & execute query
			String query = "UPDATE employees SET first_name = 'neminathan', last_name = 'Kuppusamy', email = 'nemikannu@gmail.com',"+
				 "department = 'farmer' ,  salary = 201201.20 where id = 1196446";
			int rowsAffected = stm.executeUpdate(query);
			System.out.println(+rowsAffected +" Rows Affected ");
			
		} catch (Exception e) {
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
