<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
  height: 200px;
  padding: 30px;  
border-radius: 5px;
}

 

</style>
</head>
<body>
 <nav class="navbar navbar-inverse">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">LP Batch Management System</a>
    </div>
   
</nav>
<div class="hero-image">
  <div class="hero-text">
  <div class="solid">
  <form method ="post" action="LoginServlet">
    Username:
    <input type="text" name="username" required><br><br>
    Password:
   <input type="password" name="password" required><br><br>
    <input type="submit"style="position:absolute;top:80%;right:34%;background-color:#32CD32;color:white;
width:100px;height:40px;border:none;cursor:pointer;border-radius: 5px;" value="Sumbit">
</form>
    </div>
    <p>${value}</p>
  </div>
</div>
</body>
</html>