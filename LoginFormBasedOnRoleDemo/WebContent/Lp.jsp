<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lp Page</title>
</head>
<% //In case, if Editor session is not set, redirect to Login page
if((request.getSession(false).getAttribute("LP")== null) )
{
%>
<jsp:forward page="Login.jsp"></jsp:forward>
<%} %>
<body>
<center><h2>LP's Home</h2></center>
Welcome <%=request.getAttribute("userName") %>
<div style="text-align: right"><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></div>
</body>
</html>