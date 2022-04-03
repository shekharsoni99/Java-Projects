package com.masai.assignment1_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class GetSalaryById {
	
	public int getSalaryById(int eid) {
		
		int salary = 0;
		
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
			
			if(rs.next()) {
				salary = rs.getInt("salary");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return salary;
	}

	public static void main(String[] args) {
		
		GetSalaryById emp = new GetSalaryById();
		Scanner sc = new Scanner(System.in);
		
		{
			System.out.println("Enter Employee Id to get salary deatails");
			int eid = sc.nextInt();
			
			int result = emp.getSalaryById(eid);
			
			System.out.println(result);
		}
	}
}
