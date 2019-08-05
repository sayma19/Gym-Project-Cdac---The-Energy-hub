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
  
  
  
<script>

	//this function checks whether both pass and confirm password are same or not
	function validate() {
		var pass = document.getElementById("pwd").value;
		var cpass = document.getElementById("cpwd").value;
		var mob = document.getElementById("mob").value;

		
		//if pass not enter
		if (pass == '' )
			alert("please enter Password");

		//if confirm pass not enter
		else if (cpass == '')
			alert("please enter Confirm Password");

		//if not same retun false
		else if (pass != cpass) {
			alert("\nthe password that you entered not match : please try again...");
			return false;
		}

		//if same return true
		else {
			alert("\nPassword Matches ...Thank You!..");
			return true;
		}
		
		
		  var regName = /^[a-zA-Z]+ [a-zA-Z]+$/;
		    var name = document.getElementById('userid').value;
		    if(!regName.test(name)){
		        alert('Please enter your full name (first & last name).');
		        document.getElementById('userid').focus();
		        return false;
		    }else{
		        alert('Valid name given.');
		        return true;
		    }
		
	}
	
	
</script>
</head>
<%@ include file="header.jsp"%>
<body>


    

    <form class="well form-horizontal" action="RegistrationDone" method="post"  id="contact_form">
<fieldset>

<!-- Form Name -->
<legend><center><h3><b>Registration Form</b></h3></center></legend><br>

<!-- Text input-->


<div class="form-group">
  <label class="col-md-4 control-label">First Name</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user" style="color:blue"></i></span>
  <input  name="first_name" placeholder="First Name" class="form-control"  type="text" required>
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Last Name</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user" style="color:blue"></i></span>
  <input name="last_name" placeholder="Last Name" class="form-control"  type="text" required>
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" >Gender</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user" style="color:blue"></i></span>
  <input name="gender" placeholder="Gender" class="form-control"  type="text" required>
    </div>
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" >
  Contact No</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone" style="color:blue"></i></span>
  <input name="contact_no" placeholder="+91" class="form-control" type="text" id="mob" pattern="[7-9]{1}[0-9]{9}" 
  title="Phone number with 7-9 and remaining 9 digit with 0-9" onmouseover="return mob()">
    </div>
  </div>
</div>
<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope" style="color:blue"></i></span>
  <input name="email" placeholder="Email" class="form-control"  type="email" title="Enter valid Email ID"required >
    </div>
  </div>
</div>
<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">Address</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-home" style="color:blue"></i></span>
  <textarea name="add" placeholder="address" class="form-control" required></textarea>
    </div>
  </div>
</div>
 <div class="form-group">
  <label class="col-md-4 control-label">Date of Birth</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-calendar" style="color:blue"></i></span>
  <input name="dob" placeholder="DD/MM/YY" class="form-control"  type="text" required>
    </div>
  </div>
</div>
 <div class="form-group">
  <label class="col-md-4 control-label">Occupation</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-briefcase" style="color:blue"></i></span>
  <input name="occupation" placeholder="Occupation" class="form-control"  type="text" required>
    </div>
  </div>
</div>
  
<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Username</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user" style="color:blue"></i></span>
  <input  name="user_name" placeholder="Username" class="form-control"  type="text" id="userid" required>
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Password</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-lock" style="color:blue"></i></span>
  <input name="user_password" placeholder="Password" class="form-control"  type="password" id="pwd" size="20" title="Must contain at least one number and one uppercase and lowercase letter, 
and at least 8 or more characters" required>
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Confirm Password</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-lock" style="color:blue"></i></span>
  <input name="confirm_password" placeholder="Confirm Password" class="form-control"  type="password" id="cpwd" size="20" title="Password & Confirm Password Must be sam" required>
    </div>
  </div>
</div>




<!-- Button -->
<div class="form-group">
   <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
    &nbsp&nbsp&nbsp<button type="submit" class="btn btn-success" onclick="return validate()">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
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