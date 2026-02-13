package com.jdbc.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public void fetchAllData() throws Exception {
		Class.forName("com.sql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");

		Statement s = con.createStatement();

		ResultSet c = s.executeQuery("select * from student");

		while (c.next()) {
			System.out.println(c.getInt(1) + " " + c.getString(2) + " " + c.getString(3) + " " + c.getLong(4) + " "
					+ c.getString(5));
		}

		con.close();
	}

	public void insertData() throws Exception {
		Class.forName("com.sql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate(
				"insert into student(id,name,city,mob,gender)values(104,'piyu','pune',1234577,'female')");

		if (c > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

		con.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.sql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate("update student set name='piyali' where id=101");
		if (c > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

		con.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.sql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate("delete from student where id=104 ");
		if (c > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

		con.close();
	}

}
