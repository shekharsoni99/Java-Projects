package com.masai.dao.app.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.masai.utility.DBUtility;

public class StudentdaoImpl implements StudentDao{

	@Override
	public String insertStudentTable(int roll, String name, int marks) {
		
		String message = "Not inserted";
		
		try(Connection conn = DBUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?, ?, ?)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
			int x = ps.executeUpdate();
			
			if (x > 0)
				message = "Inserted...";
			
			}catch (SQLException e) {
			e.getMessage();
		}
		
		return message;
	}

	@Override
	public int getMarksByRoll(int roll) {
		// TODO Auto-generated method stub
		return 0;
	}

}
