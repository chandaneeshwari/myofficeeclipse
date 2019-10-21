package com.virtusa.lp.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.lp.dao.MentorDAO;
import com.virtusa.lp.dao.VenueDAO;
@WebServlet("/Module")
public class ModuleServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   PrintWriter out = response.getWriter();
           response.setContentType("text/html");
           String mId=request.getParameter("id");
           int id=Integer.parseInt(mId);
           String sDate=request.getParameter("sDate");
           String eDate=request.getParameter("eDate");
           String title=request.getParameter("name");
           MentorDAO mentor =new MentorDAO();
           try {
			mentor.addFoundationModule(id, sDate, eDate, title);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           request.setAttribute("value", "Module added successfully");
           RequestDispatcher rd=request.getRequestDispatcher("MentorFunction.jsp");  
           rd.include(request,response);  
           
    }
   
}