<!DOCTYPE html>
<html>
<head>
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
  text-indent: 23%;
}

 

div.d {
  text-indent: 12%;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="navbar-header">
      <a class="navbar-brand" href="login.jsp">Add Venue</a>
    </div>

 

    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
</nav>
<div class="hero-image">
  <div class="hero-text">
  <div class="solid">
    <form action="addVenue">
     <div class="d">
     Venue Capacity:
       <input type="text" name="capacity" required><br><br></div>
  <div class="c">
    Venue Name: 
    <input type="text" name="name" required><br><br></div> 
    <div class="a">
    Location: 
    <input type="text" name="location" required><br><br></div> 
    <input type="submit"style="position:absolute;top:70%;right:36%;background-color:#32CD32;color:white;
width:100px;height:40px;border:none;cursor:pointer;border-radius: 5px;" value="Sumbit">
</form>
    </div>
    <p>${value}</p><a href="Venue.jsp">
          <span class="glyphicon glyphicon-arrow-left"></span>
        </a>
  </div>
</div>
</body>