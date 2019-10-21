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
  width: 350px;
  height: 200px;
  padding: 30px;  
border-radius: 5px;
}
div.c {
  text-indent: 15%;
}
div.a {
  text-indent: 7%;
}
div.b {
  text-indent: -1%;
}
div.d {
  text-indent: 14%;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Foundation Level</a>
    </div>

 

    <ul class="nav navbar-nav navbar-right">
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
</nav>
<div class="hero-image">
  <div class="hero-text">
  <div class="solid">
    <form action="Module">
     <div class="d">
     Module Id:
       <input type="text" name="id" value="01" readonly><br><br></div>
     <div class="d">
     Start Date:
       <input type="date" name="sDate" required><br><br></div>
  <div class="c">
    End Date: 
    <input type="date" name="eDate" required><br><br></div> 
    <div class="a">
    Subject Name: 
    <input type="text" name="name" required><br><br></div> 
    
    <input type="submit"style="position:absolute;top:80%;right:36%;background-color:#32CD32;color:white;
width:100px;height:40px;border:none;cursor:pointer;border-radius: 5px;" value="Sumbit">

 </form>

    </div>
    <a href="MentorFunction.jsp">
          <span class="glyphicon glyphicon-arrow-left"></span>
        </a>
  </div>
</div>
</body>
</html>