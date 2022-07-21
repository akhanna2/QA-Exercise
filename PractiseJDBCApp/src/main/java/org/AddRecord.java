package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

public class AddRecord {
	public void add(int pid, String name, double price, String brand, int qty) {
		String url="jdbc:mysql://localhost:3306/qa-sample";
		String userName="root";
		String password="1234";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection successful");
			
			//String query = "insert into product values(" + pid + ", " + "'" + name + "'" + ", " + price + ", " + "'" + brand + "'" + ", " + qty +")";
			//Statement stmt = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?, ?, ?, ?, ?)");
			pstmt.setInt(1, pid);
			pstmt.setString(2, name);
			pstmt.setDouble(3, price);
			pstmt.setString(4, brand);
			pstmt.setInt(5, qty);
			
			//stmt.executeUpdate(query);
			pstmt.executeUpdate();
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
