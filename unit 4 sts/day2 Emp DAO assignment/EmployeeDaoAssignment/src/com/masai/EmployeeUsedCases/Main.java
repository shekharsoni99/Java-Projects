package com.masai.EmployeeUsedCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.app.EmployeeBean.Employee;
import com.masai.app.EmployeeExceptions.EmployeeException;
import com.masai.employee.dao.EmployeeDao;
import com.masai.employee.dao.EmployeeDaoImpl;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		
//		1. get Employee by Id;
		
		try {
			System.out.println("Enter employee Id to get details");
			int eid = sc.nextInt();
			Employee emp = dao.getEmployeeById(eid);
			
			System.out.println(emp);
			
		} catch (EmployeeException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("-------------------------------");
		
//		2. get all employees
		
		List<Employee> list = new ArrayList();
		list = dao.getAllEmployee();
		System.out.println("List of all employess are");
		System.out.println(list);
		
		System.out.println("-------------------------------");
		
//		3.save Employee;
		
		System.out.println("Insert new employee");
		System.out.println("Enter Employee Id");
		int empId = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter address");
		String address = sc.next();
		
		System.out.println("Enter salary");
		int salary = sc.nextInt();
		
		Employee employee = new Employee(empId, name, address, salary);
		
		String msg = dao.saveEmployeeDetails(employee);
		System.out.println(msg);

		
		System.out.println("-------------------------------");
//		4. Delete Employee details;
		

		try {
			System.out.println("Enter Employee Id which you want to delete");
			int empIdToDelete = sc.nextInt();
			boolean x = dao.deleteEmployeeById(empIdToDelete);
			System.out.println(x);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------");
		
//		5. Give bonus to empId
		
		try {
			System.out.println("Enter Employee Id and amount to give bonus");
			System.out.println("Enter employee Id");
			int emId = sc.nextInt();
			
			System.out.println("Enter bonus amount");
			int amount = sc.nextInt();
			
			String messsage = dao.giveBonusToEmployee(emId, amount);
			System.out.println(messsage);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}

	}

}
