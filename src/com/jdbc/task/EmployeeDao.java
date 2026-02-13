package com.jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {

	public void fetchAllData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		Statement s = con.createStatement();

		ResultSet c = s.executeQuery("select * from employee");

		while (c.next()) {
			System.out.println(c.getInt(1) + " " + c.getString(2) + " " + c.getString(3) + " " + c.getBigDecimal(4) + " "
					+ c.getString(5));
		}

		con.close();
	}

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate("INSERT INTO employee (emp_name, emp_email, emp_phone, emp_salary, emp_department, emp_city, emp_join_date, emp_age, emp_status)VALUES"
				+ "('Priya k', 'priya@gmail.com', 9123456780, 55000.00, 'HR', 'Delhi', '2023-05-15', 28, 'Active'),"
				+ "('Sakshi', 'sakshi@gmail.com', 9988776655, 60000.00, 'Finance', 'Pune', '2022-08-20', 30, 'Active'),"
				+ "('neha', 'neha@gmail.com', 9090909090, 48000.00, 'Marketing', 'Bangalore', '2024-02-01', 24, 'Inactive')");
		
		if (c > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

		con.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate("UPDATE employee SET emp_salary = 60000.00 WHERE emp_id = 1");
		if (c > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

		con.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate("DELETE FROM employee WHERE emp_id = 3");
		if (c > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

		con.close();
	}
}
