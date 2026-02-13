package com.jdbc.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public void fetchAllData() throws Exception
	{
		Class.forName("com.sql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		
		Statement s=con.createStatement();
		
		ResultSet c=s.executeQuery("select * from student");
		
		while(c.next())
		{
			System.out.println();
		}
		
		con.close();
	}
}
