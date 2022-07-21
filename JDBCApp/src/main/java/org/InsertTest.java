package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/qa-sample";
		String userName="root";
		String password="1234";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection successful");
			
			String query = "update student set address = 'Berlin' where id = 107";
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(query);
			System.out.println("one record inserted");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				con.close();
				System.out.println("Database connection closed");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
