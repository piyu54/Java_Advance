package com.jdbc.task;

import com.jdbc.second.StudentDao;

public class EmployeeService {

	public void insertData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.insertData();
	}

	public void updateData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.updateData();
	}

	public void deleteData() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.deleteData();
	}

	public void fetchAllData() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.fetchAllData();
}
