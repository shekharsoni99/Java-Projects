package com.masai.employee.dao;

import java.util.List;
import com.masai.app.EmployeeBean.Employee;
import com.masai.app.EmployeeExceptions.EmployeeException;

public interface EmployeeDao {
	
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
	public List<Employee> getAllEmployee();
	
	public String saveEmployeeDetails(Employee employee);

	public boolean deleteEmployeeById(int empId)throws EmployeeException;

	public String giveBonusToEmployee(int empId, int amount)throws EmployeeException;

}
