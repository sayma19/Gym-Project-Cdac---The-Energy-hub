<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<style>
table {
  border-collapse: collapse;
  width: 75%;
  align:center
}

th, td {
  text-align: left;
  padding: 8px
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: red;
  color: white
}
input[type=submit] {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
a.ex1:link, a.ex1:visited {
  background-color: #f44336;
  color: white;
  padding: 4px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a.ex1:hover, a.ex1:active {
  background-color: green;
}
a.ex2:link, a.ex2:visited {
  background-color: green;
  color: white;
  padding: 10px 15px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a.ex2:hover, a.ex2:active {
  background-color: blue;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<table align="center">
<tr>

	
 	<th>Member Id</th>
 	<th>Trainer Name</th>
 	<th>Gender</th>
 	<th>Email</th>
 	<th>Experience</th>
 	<th>Time</th>
 	
 	
	<th></th></tr>
<c:forEach var="a" items="${List}">
<tr>
	<td><a href="customerdata/${a.trainer_id}">${a.trainer_id}</a></td>
	<td>${a.trainer_name }</td>
	<td>${a.gender }</td>
	<td>${a.email_id }</td>
	<td>${a.experience }</td>
	<td>${a.batch_time }</td>
	
	
	
	
	


	<td><a class="ex1" href="/SpringHiberGym/deleteTrainers/${a.trainer_id}">Delete Trainer</a></td>
</tr>
</c:forEach>

</table>
<table align="right">
<tr><td><a class="ex2" href="goToAddForm">Add New Trainer</a></td></tr>
</table>
</form>
</body>
</html>