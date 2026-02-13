package com.jdbc.second;

public class StudentController {

	public static void main(String[] args) throws Exception {
		
		StudentService s = new StudentService();
		s.fetchAllData();
//		s.insertData();
//		s.updateData();
//		s.deleteData();
	}
}
