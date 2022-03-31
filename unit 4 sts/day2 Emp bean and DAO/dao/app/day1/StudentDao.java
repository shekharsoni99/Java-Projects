package com.masai.dao.app.day1;

public interface StudentDao {

	public String insertStudentTable(int roll, String name, int marks);
	
	public int getMarksByRoll(int roll);
}
