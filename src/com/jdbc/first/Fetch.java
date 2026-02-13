package com.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetch {
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		
		Statement s=c.createStatement();
		
		ResultSet check=s.executeQuery("select*from student");
		
//		System.out.println("succeess");
		
		while(check.next())
		{
			System.out.println(check.getInt(1)+" "+check.getString(2)+" "+check.getString(3)+" "+check.getLong(4)+" "+check.getString(5));
		}
		c.close();
}
}
