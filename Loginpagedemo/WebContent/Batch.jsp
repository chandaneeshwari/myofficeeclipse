<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

 

.hero-image {
  background-color:white;
  height: 600px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

 

.hero-text {
  text-align: center;
  position: absolute;
  top: 25%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: black;
}
div.solid {
border-style: solid;
border-width: 1px;
box-sizing: content-box;  
  width: 300px;
  height: 150px;
  padding: 30px;  
border-radius: 5px;
}
div.a {
  text-indent: 15%;
}
div.b {
  text-indent: 10%;
}
div.c {
  text-indent: 6%;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="navbar-header">
      <a class="navbar-brand" href="login.jsp">batch</a>
    </div>

 

    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
</nav>
<div class="hero-image">
  <div class="hero-text">
  <div class="solid">
    <div class="a">
    <form action="BatchServlet">
     Batch ID:
       <input type="text" name="id" required><br><br></div>
    <div class="b">
     Batch Name:
     <input type="text" name="name" required><br><br></div>
     <div class="c">
      Batch Size:
       <input type="text" name="size" required><br><br></div>
    <input type="submit"style="position:absolute;top:70%;right:66%;background-color:#32CD32;color:white;
width:100px;height:40px;border:none;cursor:pointer;border-radius: 5px;" value="Sumbit"></form>
    <div>
    <form action="LpDetails.jsp">
     <input type="submit"style="position:absolute;top:70%;right:06%;background-color:#32CD32;color:white;
width:100px;height:40px;border:none;cursor:pointer;border-radius: 5px;" value="updateLp">
    </form></div>
    
    </div>
    <a href="MentorFunction.jsp">
          <span class="glyphicon glyphicon-arrow-left"></span>
        </a>
  </div>
</div>
</body>