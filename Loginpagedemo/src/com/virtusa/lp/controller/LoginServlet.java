package com.virtusa.lp.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.virtusa.lp.dao.AdminDAO;
import com.virtusa.lp.dao.LpDAO;
import com.virtusa.lp.dao.MentorDAO;
@WebServlet("/LoginServlet")
public class LoginServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
                 
        String id1=request.getParameter("username");
        int id=Integer.parseInt(id1);
          String pass=request.getParameter("password");
          AdminDAO admin=new AdminDAO();
          MentorDAO mentor= new MentorDAO();
          LpDAO lp=new LpDAO();
         int adminReturn=0;
         int mentorReturn=0;
         int lpReturn=0;
		
			try {
				adminReturn = admin.checkLogin(id, pass);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
	
			try {
				mentorReturn = mentor.checkLogin(id, pass);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		try {
			lpReturn = lp.checkLogin(id, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(adminReturn!=0){
				    RequestDispatcher rd=request.getRequestDispatcher("Venue.jsp");
				    rd.forward(request,response);}
        else if(mentorReturn!=0){
            RequestDispatcher rd=request.getRequestDispatcher("MentorFunction.jsp");
            rd.forward(request,response);
        }
        else if(lpReturn!=0){
             RequestDispatcher rd=request.getRequestDispatcher("LpFunction.jsp");
             rd.forward(request,response);
         }
	 	else{
			request.setAttribute("value","Sorry username or password wrong");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		    rd.include(request,response);
				 }
				out.close();
			}
			
		}   
          
