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
import com.virtusa.lp.model.Batch;
import com.virtusa.lp.model.Mentor;
@WebServlet("/BatchServlet")
public class BatchServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	MentorDAO mentor=new MentorDAO();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html"); 
        String id=request.getParameter("id");
        int bId=Integer.parseInt(id);
        String name=request.getParameter("name");
        String sSize=request.getParameter("size");
        int size=Integer.parseInt(sSize);
        try {
			mentor.addbatch(bId,name,size);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        RequestDispatcher rd=request.getRequestDispatcher("LpDetails.jsp");  
        rd.forward(request,response);  
    }
}