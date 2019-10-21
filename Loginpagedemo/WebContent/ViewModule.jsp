<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.virtusa.lp.model.Module"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>View module</title>
</head>
<body>
<div>
<nav class="navbar navbar-inverse">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">View Foundation Level</a>
    </div>

 

    <ul class="nav navbar-nav navbar-right">
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
</nav>
</div>
<br>
<div align="center">
        <table border="1" cellpadding="5">
            <!-- <caption><h2>List of Books</h2></caption> -->
            <thead>
            <tr>
            	<th>Module Id</th>
                <th>Start Date</th>
                <th>End Date</th>
                <th>topic</th>
            </tr>
            </thead>
            <tbody>
            <%List<Module> module = (ArrayList<Module>)request.getAttribute("module");
            for(Module v:module)
            {
                out.println("<tr>");
                out.print("<td>" + v.getModuleId() + "</td>");
                out.print("<td>" + v.getStartDate() + "</td>");
                out.print("<td>" + v.getEndDate() + "</td>");
                out.print("<td>" + v.getTopic() + "</td>");
                out.println("</tr>");
            }
            %>
            </tbody>
        </table>
        <div>
       
	</div>
	 <a href="LpFunction.jsp">
          <span class="glyphicon glyphicon-arrow-left"></span>
        </a>
	<div>
</div>
</body>
</html>