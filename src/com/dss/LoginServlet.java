package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
				
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//general settings
				response.setContentType("text/html");
				PrintWriter w = response.getWriter();
				
				w.println("Hi this is my first Servlet post Application");
				w.println("<br>");
				w.println("I have been fixing this application from a day");
				w.println("<br>");
				w.println("this is post request");
				
				//request data gathering
				String un = request.getParameter("uname");
				String up = request.getParameter("upwd");
				
				//business logic
				if (un.equals("durga") && up.equals("ratan")) {
					w.println("Successfully connected");
					w.println("username is "+un+" password is "+up);
				} else {
					w.println("Connection failed");
				}

		 
	}

}
