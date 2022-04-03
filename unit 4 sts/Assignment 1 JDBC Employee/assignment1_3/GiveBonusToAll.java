package com.masai.assignment1_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GiveBonusToAll {

	public void giveBonusToAll(int bonus) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		try(Connection conn = DriverManager.getConnection(url, "root", "shekhar")) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println("Employee Id is: " + rs.getInt("eid"));
				System.out.println("Name is: " + rs.getString("name"));
				System.out.println("Address is: " + rs.getString("address"));
				
				int salary = rs.getInt("salary");
				System.out.println("Salary is " + (salary + bonus));
				
				System.out.println("------------------------------");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		GiveBonusToAll emp = new GiveBonusToAll();
		Scanner sc = new Scanner(System.in);
		
		{
			System.out.println("Enter Bonus Amount");
			int bonus = sc.nextInt();
			
			System.out.println("Salary of All Employee after giving bonus of " + bonus +  " amount is");
			System.out.println("---------------------------");
			emp.giveBonusToAll(bonus);

		}
	}
}
