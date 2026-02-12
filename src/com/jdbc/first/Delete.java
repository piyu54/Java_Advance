package com.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		
		Statement s=c.createStatement();
		
		s.executeUpdate("delete from student where id=104 ");
		
		System.out.println("success");
		c.close();
}
}
