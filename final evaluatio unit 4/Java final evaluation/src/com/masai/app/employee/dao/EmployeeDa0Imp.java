package com.masai.app.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.app.EmployeeBean.Employee;
import com.masai.app.EmployeeExceptions.EmployeeException;
import com.masai.app.util.DBUtility;

public class EmployeeDa0Imp implements EmployeeDao {

	@Override
	public String saveEmployeeDetails(Employee employee) {

		String message = "Not inserted...";

		try (Connection conn = DBUtility.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into Employee values(?, ?, ?, ?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());

			int x = ps.executeUpdate();

			if (x > 0)
				System.out.println("Details Inserted...");
			else
				System.out.println("Record not found");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {

		
		Employee employee = new Employee();
				
		try (Connection conn = DBUtility.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Employee where empId = ?");
			ps.setInt(1, empId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int eid = rs.getInt("empId");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				employee = new Employee(eid, name, address, salary);
			}
				
			else {
				EmployeeException exp = new EmployeeException("Employee Id not found..");
				throw exp;
			}
				

		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> employeeList = new ArrayList();
		try (Connection conn = DBUtility.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Employee");

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int eid = rs.getInt("empId");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				Employee employee = new Employee(eid, name, address, salary);
				
				employeeList.add(employee);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	

		return employeeList;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		
		String message = "Not deleted...";

		try (Connection conn = DBUtility.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("delete from Employee where empId = ?");
			ps.setInt(1, empId);

			int x = ps.executeUpdate();

			if (x > 0)
				System.out.println("Employee Deleted...");
			else {
				EmployeeException exp = new EmployeeException("Employee Id not found..");
				throw exp;
			}
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return message;
	}

}
