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
import com.virtusa.lp.dao.LpDAO;
import com.virtusa.lp.dao.MentorDAO;
@WebServlet("/UpdateLp")
public class UpdateLpDetailServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String id1=request.getParameter("id");
        String batch=request.getParameter("batchId");
        int id=Integer.parseInt(id1);
        int batchId=Integer.parseInt(batch);
        String name=request.getParameter("name");
        String phone1=request.getParameter("phone");
        long phone=Long.parseLong(phone1);
        String pass=request.getParameter("password");
        MentorDAO mentor =new MentorDAO();
        int count=0;
		try {
			count = mentor.count(batchId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(count);
        int size=0;
		try {
			size = mentor.batchSize(batchId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(size);
        if(count<size) {
        try {
			mentor.addlp(id,batchId, name, phone, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        request.setAttribute("value", "LP added successfully");
        RequestDispatcher rd=request.getRequestDispatcher("LpDetails.jsp");  
        rd.include(request,response); 
        }
        else
        {
        	request.setAttribute("value", "LP count exceeds batch size, Create new batch");
        	RequestDispatcher rd=request.getRequestDispatcher("LpDetails.jsp");  
        	 rd.include(request,response); 
        }
        
}
}
 
