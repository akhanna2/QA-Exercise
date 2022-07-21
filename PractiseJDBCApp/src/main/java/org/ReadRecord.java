package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRecord {
	public void read() {
		String url="jdbc:mysql://localhost:3306/qa-sample";
		String userName="root";
		String password="1234";
	
		
		try (Connection con = DriverManager.getConnection(url, userName, password);
				Statement stmt = con.createStatement();) {
			System.out.println("Connection successful");
			
			String query = "select * from product";
			
			
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int pid = rs.getInt(1);
				String name = rs.getString(2);
				double price = rs.getDouble(3);
				String brand = rs.getString(4);
				int qty = rs.getInt(5);
				
				System.out.println(pid+"--"+name+"--"+"£"+price+"--"+brand+"--"+qty);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}
}
