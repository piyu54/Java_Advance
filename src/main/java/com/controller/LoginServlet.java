package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
//
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
                          throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/devconnect",
                "root",
                "root"
            );

            PreparedStatement ps = con.prepareStatement(
                "select * from users WHERE email=? AND password=?"
            );

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                // Login Success
                HttpSession session = req.getSession();
                session.setAttribute("user", email);

                resp.sendRedirect("dashboard.html");

            } else {

                // Login Failed
                resp.getWriter().println("Invalid Email or Password");

            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}