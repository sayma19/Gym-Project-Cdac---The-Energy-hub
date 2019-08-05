<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<title>welcomeadmin</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
  <script src="./resources/js/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="./resources/js/bootstrap.min.js"></script>
  <style>
  .button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
<body>

<nav class="navbar navbar-inverse navbar-static-top">

  <div class="container-fluid">
    <div class="navbar-header">
    
      <a class="navbar-brand navbar-danger" href="Home">THE ENERGY HUB</a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li class="active"><a href="Home">HOME</a></li>
     
      <li><a href="Program">PROGRAM</a></li>
        <li><a href="logout">LOGOUT</a></li>
      
    
      <li><a href="Team">TEAM</a></li>
      <li><a href="Contact">CONTACT</a></li>
      <li><a href="About">ABOUT US</a></li>
      
      
    </ul>
  </div>
</nav>
<div class="container">
<div class="jumbotron">
<div class="panel panel-primary">
<div class="panel-body">
<div>
<a href="ViewAllMemebrs" class="button">Member Record</a>
<a href="ViewAllTrainers" class="button">Trainee Record</a>
<a href="addbatches" class="button">Batches</a>
<a href="addpackages" class="button">Add Packages</a>
<a href="deletepackages" class="button">Delete Packages</a>

<!--  <button class="button">Tranee Record</button>
<input type="button" class="button" value="Input Button">-->

</div>

</div>
</div>
</div>
</div>


</body>
</html>