

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
    <!-- 
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
<title>usersdata</title>
</head>

<%@ include file="header.jsp"%>
<body>
<h1>helloo</h1>

<form>
<table align="center">
<tr>

 	<th>Member Id</th>
 	<th>First_Name</th>
 	<th>Last_name</th>
 	<th>Gender</th>
 	
 	
 	
 	
	<th></th></tr>
<c:forEach var="a" items="${List}">
<tr>
	<td>${a.member_id}</td>
	<td>${a.first_Name }</td>
	<td>${a.last_name }</td>
	<td>${a.gender }</td>
	
	


	
	

    <td><a class="ex1" href="/SpringHiberGym/editMembers/${a.member_id}">Edit Members</a></td>
	
	<td><a class="ex1" href="/SpringHiberGym/deleteMembers/${a.member_id}">Delete Members</a></td>
	
</tr>
</c:forEach>

</table>

<br>
<br>
<table align="right">
<tr><td><a class="ex2" href="goToAddForm">Add New Users</a></td></tr>
</table>
</form>
</body>
</html>

-->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="./resources/css/bootstrap.min.css">
  <script src="./resources/js/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="./resources/js/bootstrap.min.js"></script>

<style type="text/css">
    body {
        color: #404E67;
        background: #F5F7FA;
		font-family: 'Open Sans', sans-serif;
	}
	.table-wrapper {
		width: 700px;
		margin: 30px auto;
        background: #fff;
        padding: 20px;	
        box-shadow: 0 1px 1px rgba(0,0,0,.05);
    }
    .table-title {
        padding-bottom: 10px;
        margin: 0 0 10px;
    }
    .table-title h2 {
        margin: 6px 0 0;
        font-size: 22px;
    }
    .table-title .add-new {
        float: right;
		height: 30px;
		font-weight: bold;
		font-size: 12px;
		text-shadow: none;
		min-width: 100px;
		border-radius: 50px;
		line-height: 13px;
    }
	.table-title .add-new i {
		margin-right: 4px;
	}
    table.table {
        table-layout: fixed;
    }
    table.table tr th, table.table tr td {
        border-color: #e9e9e9;
    }
    table.table th i {
        font-size: 13px;
        margin: 0 5px;
        cursor: pointer;
    }
    table.table th:last-child {
        width: 100px;
    }
    table.table td a {
		cursor: pointer;
        display: inline-block;
        margin: 0 5px;
		min-width: 24px;
    }    
	table.table td a.add {
        color: #27C46B;
    }
    table.table td a.edit {
        color: #FFC107;
    }
    table.table td a.delete {
        color: #E34724;
    }
    table.table td i {
        font-size: 19px;
    }
	table.table td a.add i {
        font-size: 24px;
    	margin-right: -1px;
        position: relative;
        top: 3px;
    }    
    table.table .form-control {
        height: 32px;
        line-height: 32px;
        box-shadow: none;
        border-radius: 2px;
    }
	table.table .form-control.error {
		border-color: #f50000;
	}
	table.table td .add {
		display: none;
	}
</style>


</head>
<body>
    <div class="container">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-8"><h2>Member<b>Details</b></h2></div>
                    <div class="col-sm-4">
                        <button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add New</button>
                    </div>
                </div>
            </div>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        	<th>package Id</th>
 	                    <th>First_Name</th>
 	                   <th>Duration</th>
                          	<th>Amount</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                
               
                <tbody>
                 <c:forEach var="a" items="${List}">
                
                    <tr>
                    
                    <td>${a.package_id}</td>
	               <td>${a.package_name }</td>
	               <td>${a.duration }</td>
	               <td>${a.amount }</td>
	<td>
                        
							<a class="add" title="Add" data-toggle="tooltip">Add</a>
                            <a  href="/SpringHiberGym/editPack/${a.package_id}" class="edit" title="Edit" data-toggle="tooltip">Edit</a>
                            <a href="/SpringHiberGym/deletePack/${a.package_id_id}" class="delete" title="Delete" data-toggle="tooltip">Delete</a>
                        </td>
                    </tr>
                    </c:forEach>
                      
                </tbody>
            </table>
        </div>
    </div>     
</body>
</html>                            