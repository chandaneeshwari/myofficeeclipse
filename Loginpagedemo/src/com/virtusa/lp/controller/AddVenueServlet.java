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
import com.virtusa.lp.dao.VenueDAO;
@WebServlet("/addVenue")
public class AddVenueServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   PrintWriter out = response.getWriter();
           response.setContentType("text/html");
           String id1=request.getParameter("capacity");
           int capacity=Integer.parseInt(id1);
           String name=request.getParameter("name");
           String location=request.getParameter("location");
          VenueDAO venue =new VenueDAO();
          try {
			venue.addVenue(capacity, name, location);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           request.setAttribute("value", "venue added successfully");
           RequestDispatcher rd=request.getRequestDispatcher("/ViewServlet");  
           rd.include(request,response);  
           
    }
   
}