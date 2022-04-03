package com.masai.assignment1_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeById {

	public void getEmployeeById(int eid) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		try(Connection conn = DriverManager.getConnection(url, "root", "shekhar")) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where eid = ?");
			ps.setInt(1, eid);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("Employee Id is: " + rs.getInt("eid"));
				System.out.println("Name is: " + rs.getString("name"));
				System.out.println("Address is: " + rs.getString("address"));
				System.out.println("Salary is " + rs.getInt("salary"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		EmployeeById emp = new EmployeeById();
		Scanner sc = new Scanner(System.in);
		
		{
			System.out.println("All Employee Id to get details: ");
			int eid = sc.nextInt();
			
			emp.getEmployeeById(eid);
		}

	}
}
