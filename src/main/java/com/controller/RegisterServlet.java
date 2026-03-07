package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fullname = req.getParameter("fullname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String course = req.getParameter("course");
		String agree = req.getParameter("agree");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/devConnect", "root", "root");

			PreparedStatement ps = con
					.prepareStatement("insert into users(fullname,email,password,dob,course,agree)values(?,?,?,?,?,?)");

			ps.setString(1, fullname);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, dob);
			ps.setString(5, course);
			ps.setString(6, agree);

			ps.executeUpdate();
			System.out.println("Data Innserted success");
			con.close();
			resp.sendRedirect("login.html");
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}