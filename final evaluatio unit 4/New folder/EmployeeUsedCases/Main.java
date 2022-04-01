package com.masai.app.EmployeeUsedCases;

import java.util.Scanner;

import com.masai.app.EmployeeBean.Employee;
import com.masai.app.EmployeeExceptions.EmployeeException;
import com.masai.app.employee.dao.EmployeeDa0Imp;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDa0Imp dao = new EmployeeDa0Imp();
		
		Scanner sc = new 
		
//		1.save Employee;
		
		Employee employee = new Employee(20, "Ram", "Pune", 50000);
		
		String msg = dao.saveEmployeeDetails(employee);
		System.out.println(msg);
		
//		2. get Employee by Id;
		
		try {
			
			System.out.println("Enter Employee Id to be deleted");
			
			Employee emp = dao.getEmployeeById(29);
			
			System.out.println(emp);
			
		} catch (EmployeeException e1) {
			e1.printStackTrace();
		}
		
//		3.List of Employee
		
		
		
//		4.Delete Employee details;
		

		try {
			dao.deleteEmployee(40);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}

	}

}
