package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Java Database");
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Roll Number");
//		int roll = sc.nextInt();
//		
//		System.out.println("Enter Name");
//		String name = sc.next();
//		
//		System.out.println("Enter marks");
//		int marks = sc.nextInt();
		
		
//		------------------------------------------------
		
//		System.out.println("Enter student roll number whom you want to give bonus");
//		int roll = sc.nextInt();
//		
//		System.out.println("Enter bonus marks");
//		int bonus = sc.nextInt();
		
//		----------------------------------------------------
		
//		System.out.println("Enter student roll number whom you want to delete");
//		int roll = sc.nextInt();
		
//		-------------------------------
		
		System.out.println("Enter student roll number whom you want to search");
		int rollNumber = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/shekhar";
		
		
		try (Connection conn = DriverManager.getConnection(url, "root", "shekhar")) {
			
//			Method 1;
//			Statement statement = conn.createStatement(); 
			
//			int x = statement.executeUpdate("insert into student values("+roll+", '"
//					+name+"', "+marks+")");
			
//			Method 2;
			
//			PreparedStatement ps = conn.prepareStatement("insert into student values(?, ?, ?)");
//			
//			ps.setInt(1, roll);
//			ps.setString(2, name);
//			ps.setInt(3, marks);
//			
//			int x = ps.executeUpdate();
			
//			-------------------------------------------
			
//			Give bonus marks to student whose roll number is 13;
			
//			PreparedStatement ps = conn.prepareStatement("update student set marks = marks + ? where roll = ?");
//			
//			ps.setInt(1, bonus);
//			ps.setInt(2, roll);
//			
//			int x = ps.executeUpdate();
			
//			--------------------------------------
			
//			delete student having roll number = ?;
			
//			PreparedStatement ps = conn.prepareStatement("delete from student where roll = ?");
//			
//			ps.setInt(1, roll);
//			
//			int x = ps.executeUpdate();
//			
//			if(x > 0) 
//				System.out.println("inserted...");
//			else
//				System.out.println("not inserted...");
//			
//			----------------------------------------------------
			
//			get all the details from database;
			
//			PreparedStatement ps = conn.prepareStatement("select * from student");
			
//			----------------------search any roll-------------------
			
			PreparedStatement ps = conn.prepareStatement("select * from student where roll = ?");
			ps.setInt(1, rollNumber);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
//				int roll = rs.getInt("roll");
//				String name = rs.getString("name");
//				int mark = rs.getInt("marks");
				
//				System.out.println("Roll number is: " + roll);
				System.out.println("Roll number is: " + rs.getInt("roll"));
				System.out.println("Name is: " + rs.getString("name"));
				System.out.println("Marks is: " + rs.getInt("marks"));
				
				System.out.println("============================");
			}
			else {
				System.out.println("record not found");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
