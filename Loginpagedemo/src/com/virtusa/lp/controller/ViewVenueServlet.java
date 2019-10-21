package com.virtusa.lp.controller;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.virtusa.lp.dao.VenueDAO;
@WebServlet("/ViewServlet")
public class ViewVenueServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
//        response.getWriter().append("Served at: ").append(request.getContextPath());
        VenueDAO venuedao = new VenueDAO();
        try
        {
            request.setAttribute("venues", venuedao.allVenue());
            RequestDispatcher rd = request.getRequestDispatcher("ViewVenue.jsp");
            rd.include(request, response);
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    }






