package com.masai.assignment1_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployeeDetailsWithoutAddress {

	public String InsertEmployeeDetailsWithoutAddress(int eid, String name, int salary) {
		
		String message = "Not inserted...";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		try(Connection conn = DriverManager.getConnection(url, "root", "shekhar")) {
			
			PreparedStatement ps = conn.prepareStatement("insert into employee(eid, name, salary) values(?, ?, ?)");
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setInt(3, salary);
		
			int x = ps.executeUpdate();
			
			if (x > 0) {
				message = "Inserted successfully...";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return message;
	}

	public static void main(String[] args) {
		
		InsertEmployeeDetailsWithoutAddress insert = new InsertEmployeeDetailsWithoutAddress();
		Scanner sc = new Scanner(System.in);
		
		{
			System.out.println("Enter Employee Id: ");
			int eid = sc.nextInt();
			
			System.out.println("Enter name: ");
			String name = sc.next();
			
			System.out.println("Enter employee salary: ");
			int salary = sc.nextInt();
			
			String message = insert.InsertEmployeeDetailsWithoutAddress(eid, name, salary);
			System.out.println(message);
		}
	}
	
}
