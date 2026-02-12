package com.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoFirst {
//starting
	public static void main(String[] args) throws  Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("connected");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		
		Statement s = con.createStatement();
		
		s.executeUpdate("insert into student(id,name,city,mob,gender)values(101,'piyu','pune',1234577,'female')");
		
		System.out.println("successfully inserted");
		con.close();

	}

}
