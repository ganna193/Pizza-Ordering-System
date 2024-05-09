package com.Servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (isValidCredentials(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("pizzaOrder");
        } else {
            response.sendRedirect("loginFailed.jsp");//page.jsp
        }
    }
	 private boolean isValidCredentials(String username, String password) {
	        String predefinedUsername = "admin";
	        String predefinedPassword = "password";

	        return predefinedUsername.equals(username) && predefinedPassword.equals(password);
	    }
}
