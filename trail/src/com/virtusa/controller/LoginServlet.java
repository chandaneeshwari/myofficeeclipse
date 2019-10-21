package com.virtusa.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.dao.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String q2 = request.getParameter("type");
String userName=request.getParameter("username");
String userPassword=request.getParameter("password");
String userType=request.getParameter("type");
//if(new UserDAO().validateUser(userName,userPassword)){

	if(new UserDAO().validateUser(userName,userPassword,userType)) {
		if ("LP".equals(q2)) {
	    	request.getRequestDispatcher("LpMenu.jsp").forward(request, response);
		}
		else if ("Admin".equals(q2)) {
	        	request.getRequestDispatcher("AdminMenu.jsp").forward(request, response);
	        }
		else if ("Mentor".equals(q2)) {
	    	request.getRequestDispatcher("MentorMenu.jsp").forward(request, response);
	    }
//request.getRequestDispatcher("Success.jsp").forward(request, response);
		else { 
//			PrintWriter out =response.getWriter();
//			out.println("Please enter valid role");
		request.getRequestDispatcher("error.jsp").forward(request, response);

		}
}
else { 
//	PrintWriter out =response.getWriter();
//	out.println("Please enter valid user name and password");
request.getRequestDispatcher("error.jsp").forward(request, response);

}
	}

}
