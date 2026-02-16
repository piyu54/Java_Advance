package com.jdbc.dynamic_approach_using_scannerr;

//admin
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Beauty_store_Dao {
	Scanner sc = new Scanner(System.in);
	public void insertProduct() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Beauty_store", "root", "root");

		PreparedStatement ps = con
				.prepareStatement("insert into beauty_product(id,name,quantity,price)values(?,?,?,?)");

		
		System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price: ");
        int price = sc.nextInt();
        
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, qty);
		ps.setInt(4, price);
//		ps.addBatch();
		
//		ps.setInt(1, id);
//		ps.setString(2, name);
//		ps.setInt(3, qty);
//		ps.setInt(4, price);
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
		System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();
        
		
		ps.setString(1, name);
		ps.setInt(2, id);

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

		System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
		ps.setInt(1, id);
		

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

