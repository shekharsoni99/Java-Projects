package com.masai.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.app.EmployeeBean.Employee;
import com.masai.app.EmployeeExceptions.EmployeeException;
import com.masai.util.DBUtility;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee employee = null;
		
		try(Connection conn = DBUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where eid = ?");
			
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int eid = rs.getInt("eid");
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
		List<Employee> employeeList = new ArrayList<>();
//		employeeList = null;
				
		try(Connection conn = DBUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee");

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int eid = rs.getInt("eid");
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
		String message = "Not inserted...";

		try(Connection conn = DBUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into employee(eid, name, address, salary) values(?, ?, ?, ?)");
			ps.setInt(1,employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3,employee.getAddress());
			ps.setInt(4, employee.getSalary());
		
			int x = ps.executeUpdate();
			
			if (x > 0) {
				message = "Inserted successfully...";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		
		boolean message = false;

		try(Connection conn = DBUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("delete from employee where eid = ?");
			ps.setInt(1, empId);
		
			int x = ps.executeUpdate();
			
			if (x > 0) {
				message = true;
			}else {
				EmployeeException exp = new EmployeeException("Employee does not exist..");
				throw exp;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		
		String message = "Bonus not given..";
			
			try(Connection conn = DBUtility.provideConnection()) {
				
				PreparedStatement ps = conn.prepareStatement("select * from employee where eid = ?");
				ps.setInt(1, empId);
				
				ResultSet rs = ps.executeQuery();
				
				if (rs.next()) {
					System.out.println("Employee Id is: " + rs.getInt("eid"));
					System.out.println("Name is: " + rs.getString("name"));
					System.out.println("Address is: " + rs.getString("address"));
					
					int salary = rs.getInt("salary");
					System.out.println("Salary after adding bonus amount " + amount +" is " + (salary + amount));
					
					message = "Bonus given..";
					
				}else {
					EmployeeException exp = new EmployeeException("Employee does not exist..");
					throw exp;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return message;
		}
}
