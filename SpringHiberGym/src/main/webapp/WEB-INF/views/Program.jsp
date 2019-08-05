<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Program</title>
<style>
html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

@media screen and (max-width: 500px) {
  .column {
    width: 100%;
    display: block;
  }
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}



</style>

<%@ include file="header.jsp"%>
</head>
<body>

<h1> Program We Run </h1>


<div class="container">
<div class="row">
  <div class="column">
    <div class="card">
      <img src="./resources/images/yoga3.jpg" alt="Jane" style="width:100%">
      <div class="container">
        
        <p class="title"><h2>YOGA</h2></p>
        
        
      </div>
    </div>
  </div>

 
  <div class="column">
    <div class="card">
      <img src="./resources/images/gymnastics.jpg" alt="John" style="width:100%">
      <div class="container">
        
        <p class="title"><h2>GYMNASTICS</h2></p>
        
        
      </div>
    </div>
  </div>
  
  <div class="column">
    <div class="card">
      <img src="./resources/images/zumba.jpg" alt="John" style="width:100%">
      <div class="container">
        
        <p class="title"><h2>ZUMBA</h2></p>
        
        
      </div>
    </div>
  </div>
  <div class="column">
    <div class="card">
      <img src="./resources/images/pilates.jpg" alt="John" style="width:100%">
      <div class="container">
        
        <p class="title"><h2>PILATES</h2></p>
        
        
      </div>
    </div>
  </div>
  <div class="column">
    <div class="card">
      <img src="./resources/images/meditation.jpg" alt="John" style="width:100%">
      <div class="container">
        
        <p class="title"><h2>MEDITATION</h2></p>
        
        
      </div>
    </div>
  </div>
</div>
</div>

</body>
</html>