package com.jdbc.dynamic_approach_using_scanner;

//admin
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

		ps.setInt(1, 101);
		

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}
	}

}
