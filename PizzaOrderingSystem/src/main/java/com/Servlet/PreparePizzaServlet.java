package com.Servlet;

import java.io.IOException;
import java.util.Arrays;

import com.Pizza;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PreparePizzaServlet {
	protected void dopost(HttpServletRequest request , HttpServletResponse response)
	throws ServletException , IOException{
		String size = request.getParameter("Size");
		String[] toppings = request.getParameterValues("toppings");
		Pizza pizza = new Pizza (size, Arrays.asList(toppings));
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		request.setAttribute("pizza", pizza);
		//page.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);
	}
0.
}
