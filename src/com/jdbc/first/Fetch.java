package com.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Fetch {
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		
		Statement s=c.createStatement();
		
		s.executeQuery("select*from student");
		
		System.out.println("not succeess");
		c.close();
}
}
