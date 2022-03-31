package com.masai.usedcases;

import java.util.Scanner;

import com.masai.dao.app.day1.StudentdaoImpl;

public class InsertStudentUsedCases {

	public static void main(String[] args) {
		
		StudentdaoImpl dao = new StudentdaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll number");
		int roll = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter Marks");
		int marks = sc.nextInt();
		
		
		String result = dao.insertStudentTable(roll, name, marks);
		
		System.out.println(result);

	}

}
