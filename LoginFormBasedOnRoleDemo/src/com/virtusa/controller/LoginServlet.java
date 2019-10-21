package com.virtusa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.dao.LoginDao;
import com.virtusa.model.LoginBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName(userName);
		loginBean.setPassword(password);
		LoginDao loginDao = new LoginDao();
		try
		{
		String userValidate = loginDao.authenticateUser(loginBean);
		if(userValidate.equals("Admin"))
		{
		System.out.println("Admin's Home");
		HttpSession session = request.getSession(); //Creating a session
		session.setAttribute("Admin", userName); //setting session attribute
		request.setAttribute("userName", userName);
		request.getRequestDispatcher("Admin.jsp").forward(request, response);
		}
		else if(userValidate.equals("LP"))
		{
		System.out.println("LP's Home");
		HttpSession session = request.getSession();
		session.setAttribute("LP", userName);
		request.setAttribute("userName", userName);
		request.getRequestDispatcher("LP.jsp").forward(request, response);
		}
		else if(userValidate.equals("Mentor"))
		{
		System.out.println("Mentors's Home");
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10*60);
		session.setAttribute("Mentor", userName);
		request.setAttribute("userName", userName);
		request.getRequestDispatcher("Mentor.jsp").forward(request, response);
		}
		else
		{
		System.out.println("Error message = "+userValidate);
		request.setAttribute("errMessage", userValidate);
		request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		}
		catch (IOException e1)
		{
		e1.printStackTrace();
		}
		catch (Exception e2)
		{
		e2.printStackTrace();
		}
	}

}
