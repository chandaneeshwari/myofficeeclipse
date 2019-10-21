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
@WebServlet("/deleteVenue")
public class DeleteVenueServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   PrintWriter out = response.getWriter();
           response.setContentType("text/html");
           String name=request.getParameter("name");
          VenueDAO venue =new VenueDAO();
          try {
			venue.deleteVenue(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           request.setAttribute("value", "venue deleted successfully");
           RequestDispatcher rd=request.getRequestDispatcher("/ViewServlet");  
           rd.include(request,response);  
           
    }
   
}