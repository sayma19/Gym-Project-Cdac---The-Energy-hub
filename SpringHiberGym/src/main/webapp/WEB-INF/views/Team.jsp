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
<title>Insert title here</title>
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

@media screen and (max-width: 650px) {
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


.button:hover {
  background-color: #555;
}
h1{
text-align: center;
}
</style>
</head>

<%@ include file="header.jsp"%>
<body>

<h1>Meet Our Team</h1>


<div class="container">
<div class="row">
  <div class="column">
    <div class="card">
      <img src="./resources/images/person_3.jpg" alt="Jane" style="width:100%">
      <div class="container">
        <h2>Sangram shrma</h2>
        <p class="title">CEO & Founder</p>
        <p>Some text that describes me lorem.</p>
        <p>sangram15@gmail.com</p>
        
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="./resources/images/person_1.jpg" alt="Mike" style="width:100%">
      <div class="container">
        <h2>Mike Ross</h2>
        <p class="title">Director</p>
        <p>Some text that describes me lorem.</p>
        <p>mike@gmail.com</p>
        
      </div>
    </div>
  </div>
  <div class="column">
    <div class="card">
      <img src="./resources/images/person_4.jpg" alt="John" style="width:100%">
      <div class="container">
        <h2>John Doe</h2>
        <p class="title">Designer</p>
        <p>Some text that describes me lorem ipsum ipsu.</p>
        <p>john@gmail.com</p>
        
      </div>
    </div>
  </div>
  
  <div class="column">
    <div class="card">
      <img src="./resources/images/trainer-5.jpg" alt="John" style="width:100%">
      <div class="container">
        <h2>vaidehi naik</h2>
        <p class="title">TRAINER</p>
        <p>Some text that describes me lorem.</p>
        <p>vaidehi@gmail.com</p>
        
      </div>
    </div>
  </div>
  <div class="column">
    <div class="card">
      <img src="./resources/images/trainer-3.jpg" alt="John" style="width:100%">
      <div class="container">
        <h2>sam george</h2>
        <p class="title">TRAINER</p>
        <p>Some text that describes me lore.</p>
        <p>samgeorge@gmail.com</p>
        
      </div>
    </div>
  </div>
  
    <div class="column">
    <div class="card">
      <img src="./resources/images/trainer-1.jpg" alt="John" style="width:100%">
      <div class="container">
        <h2>Onkar yadav</h2>
        <p class="title">TRAINER</p>
        <p>Some text that describes me lorem.</p>
        <p>onkaryd@gmail.com</p>
        
      </div>
    </div>
  </div>
  
</div>
</body>
</html>