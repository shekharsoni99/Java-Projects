package com.masai.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.app.EmployeeBean.Employee;
import com.masai.app.EmployeeExceptions.EmployeeException;
import com.masai.util.DBUtility;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee employee = null;
		
		try(Connection conn = DBUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where empId = ?");
			
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int eid = rs.getInt("empId");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				employee = new Employee(eid, name, address, salary);
				
			}else {
				EmployeeException exp = new EmployeeException("Employee does not exist..");
				throw exp;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = null;
				
		try(Connection conn = DBUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee");

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int eid = rs.getInt("empId");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				Employee emp = new Employee(eid, name, address, salary);
				
				employeeList.add(emp);
				
			}
			
		} catch (SQLException e) {
			e.getMessage();
		}
		
		return employeeList;
	}

	@Override
	public String saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
