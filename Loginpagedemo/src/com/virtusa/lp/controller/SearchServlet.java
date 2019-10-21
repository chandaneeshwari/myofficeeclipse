package com.virtusa.lp.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.lp.dao.VenueDAO;
import com.virtusa.lp.model.Venue;
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
//        response.getWriter().append("Served at: ").append(request.getContextPath());
    	 String capacity1=request.getParameter("capacity");
         int id=Integer.parseInt(capacity1);
        VenueDAO venuedao = new VenueDAO();
        try
        {	String venueName=null;
        	ArrayList<Venue> venue = (ArrayList<Venue>) venuedao.allVenue();
            Iterator<Venue> itr =venue.iterator();
            while(itr.hasNext())
            {
                Venue w = itr.next();
                if (w.getCapacity() >= id){
            request.setAttribute("venues",w.getVenueName()+"  blocked");
            venueName=w.getVenueName();
            RequestDispatcher rd = request.getRequestDispatcher("SearchVenue.jsp");
            rd.include(request, response);
                    }
            }
            venuedao.deleteVenue(venueName);
         }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
   
}
