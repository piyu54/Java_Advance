package com.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		
		Statement s=c.createStatement();
		
		s.executeUpdate("update student set name='piyali' where id=101");
		
		System.out.println("success");
		c.close();
		
	}
}
