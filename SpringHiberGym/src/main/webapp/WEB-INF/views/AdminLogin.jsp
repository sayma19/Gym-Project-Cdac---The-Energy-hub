<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="./resources/css/bootstrap.min.css">
  <script src="./resources/js/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="./resources/js/bootstrap.min.js"></script>
  
</head>
<%@ include file="header.jsp"%>
<!--  #log{
border:2px solid white;
padding:60px 40px;
margin:top:80px;
}
img{
width:150px;
margin:auto;
}
<body style="background-image:url('./resources/images/gallery-4.jpg');">-->
</head>
<body>

<div class="container">
<div class="row">

<form id="log" method="post" action="AloginDone">
<h1>User Login</h1>
<!--  <div class="form-group">
   
  <div class="col-md-4 inputGroupContainer">
   <label class="col-md-4 control-label">Username</label>  
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="user_name" placeholder="Username" class="form-control"  type="text">
    </div>
  </div>
</div>-->

<!-- Text input-->

<!--  <div class="form-group">
  
    <div class="col-md-4 inputGroupContainer">
 <label class="col-md-4 control-label">Password</label>  
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="user_password" placeholder="Password" class="form-control"  type="password">
    </div>
  </div>
</div>-->
<!--  <img class="img img-responsive img circle" src="./resources/images/login.png">-->
 <div class="form-group">
  
<label>Username</label>
<div class="input-group">
<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
<input type="text" name="uname" id="un" class="form-control" placeholder="Usernmame">
</div>

</div>
<div class="form-group">
 
<label>Password</label>

<div class="input-group">
<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
<input type="password" name="pass" id="pw" class="form-control"placeholder="Password">
</div>

</div>

<button type="submit" class="btn btn-success">Login</button>

</form>

</div>
</div>


</body>
</html>







