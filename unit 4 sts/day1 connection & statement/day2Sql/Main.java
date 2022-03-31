package com.day2Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/shekhar";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "shekhar")) {
			
			PreparedStatement ps = conn.prepareStatement("select * from student");
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
