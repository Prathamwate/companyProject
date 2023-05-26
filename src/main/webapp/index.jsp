<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">
<style>

.vertical-menu {
  width: 250px;
}

.vertical-menu a {
  background-color: #eee;
  color: black;
  display: block;
  padding: 12px;
  margin-left:5px;
  text-decoration: none;
}

.vertical-menu a:hover {
  background-color: yellow;
}

.vertical-menu a.active {
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body class="p-3 mb-2 bg-success text-white">
<div class="container">

	
	<br>
	<h1 style="color:dark">Company Details</h1>
	<hr>
	<br>
	<div class="vertical-menu">
	<a href="AddUser">New Company Registration</a>
	<br>
	<a href="UserReport">Company Report</a>
	<br>
	<a href="FindUser">Search On Type</a>
	<br>
	<a href="DeleteUser">Delete Company</a>
	<br>
	<a href="UpdateUserDetail">Update Company Detail</a>
	<br>
	
</div>
</div>
</body>

</html>