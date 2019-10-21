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


</style>
</head>
<body>
   <nav class="navbar navbar-inverse">
    <div class="navbar-header">
     
      <a class="navbar-brand" href="#">Mentor Functions</a>
    </div>


    <ul class="nav navbar-nav navbar-right">
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
</nav>
<div class="hero-image">
  <div class="hero-text">
  <div class="solid">
    <form action="Batch.jsp">
   <input type="submit"style="position:absolute;top:15%;right:16%;background-color:#32CD32;color:white;
width:250px;height:40px;border:none;cursor:pointer;border-radius: 5px;" value="Enroll Lp">
</form>
<form action="FoundationLevel.jsp">
 <input type="submit"style="position:absolute;top:37%;right:16%;background-color:#32CD32;color:white;
width:250px;height:40px;border:none;cursor:pointer;border-radius: 5px;" value="Publish Foundation Level">
</form>
<form action="AdvanceLevel.jsp">
<input type="submit"style="position:absolute;top:60%;right:16%;background-color:#32CD32;color:white;
width:250px;height:40px;border:none;cursor:pointer;border-radius: 5px;" value="Publish Advance Level">
</form>
    </div>
    <p>${value}</p><a href="login.jsp">
          <span class="glyphicon glyphicon-arrow-left"></span>
        </a>
  </div>
</div>
</body>
</html>
