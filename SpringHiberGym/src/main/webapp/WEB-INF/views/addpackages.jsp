<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
  <script src="./resources/js/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="./resources/js/bootstrap.min.js"></script>
  

<!-- Bootstrap CSS File -->
<link href="resources/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Libraries CSS Files -->
<link href="resources/lib/nivo-slider/css/nivo-slider.css"
	rel="stylesheet">
<link href="resources/lib/owlcarousel/owl.carousel.css" rel="stylesheet">
<link href="resources/lib/owlcarousel/owl.transitions.css"
	rel="stylesheet">
<link href="resources/lib/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<link href="resources/lib/animate/animate.min.css" rel="stylesheet">
<link href="resources/lib/venobox/venobox.css" rel="stylesheet">
<!-- Main Stylesheet File -->
<link href="resources/css/style.css" rel="stylesheet">

<!-- Responsive Stylesheet File -->
<link href="resources/css/responsive.css" rel="stylesheet">
  
  

</head>
<%@ include file="header.jsp"%>
<body>


    

    <form class="well form-horizontal" action="addpackagesdone" method="post"  id="addpackagesdone">
<fieldset>

<!-- Form Name -->
<legend><center><h3><b>Add New Package</b></h3></center></legend><br>

<!-- Text input-->



<div class="form-group">
  <label class="col-md-4 control-label" >PACKAGE NAME</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon "></i></span>
  <input name="PACKAGE" placeholder="PACKAGE NAME" class="form-control"  type="text" required>
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" >PACKAGE AMOUNT</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon "></i></span>
  <input name="AMOUNT" placeholder="PACKAGE AMOUNT" class="form-control"  type="text" required>
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" >DURATION</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon "></i></span>
  <input name="DURATION" placeholder="PACKAGE DURATION" class="form-control"  type="text" required>
    </div>
  </div>
</div>



<!-- Button -->
<div class="form-group">
   <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
    &nbsp&nbsp&nbsp<button type="submit" class="btn btn-success" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
  </div>
   
</div>

</div>
</fieldset>
</form>
</div>

<script src="resources/lib/jquery/jquery.min.js"></script>
	<script src="resources/lib/bootstrap/js/bootstrap.min.js"></script>
    <!-- /.container -->
</body>
</html>