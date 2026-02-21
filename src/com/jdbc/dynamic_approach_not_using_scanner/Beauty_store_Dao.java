package com.jdbc.dynamic_approach_not_using_scanner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Beauty_store_Dao {

	public void insertProduct() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Beauty_store", "root", "root");

		PreparedStatement ps = con
				.prepareStatement("insert into beauty_product(id,name,quantity,price)values(?,?,?,?)");

		ps.setInt(1, 101);
		ps.setString(2, "Foundation");
		ps.setInt(3, 7);
		ps.setInt(4, 5000);
		ps.addBatch();
		
		ps.setInt(1, 102);
		ps.setString(2, "Lipstick");
		ps.setInt(3, 10);
		ps.setInt(4, 2000);
//		ps.addBatch();
		
		ps.executeBatch();

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

	}

	public void updateProduct() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Beauty_store", "root", "root");

		PreparedStatement ps = con.prepareStatement("update  beauty_product set name=? where id=?");

		ps.setInt(2, 101);
		ps.setString(1, "Lipstick");

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}
	}

	public void deleteProduct() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Beauty_store", "root", "root");

		PreparedStatement ps = con.prepareStatement("delete from beauty_product where id=?");

		ps.setInt(1, 102);
		

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data deleted");
		} else {
			System.out.println("Data not deleted");
		}
	}

	public void fetchproduct() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Beauty_store", "root", "root");

		PreparedStatement ps = con.prepareStatement("select*from beauty_product");
		ResultSet check=ps.executeQuery();

		while(check.next())
		{
			System.out.println(check.getInt(1) +" "+check.getString(2)+" "+check.getInt(3)+ " "+check.getInt(4));
		}
	}
}

