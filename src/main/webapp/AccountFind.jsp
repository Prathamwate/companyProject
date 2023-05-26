<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  <%@taglib prefix="spring" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="background-color:#2EFEF7">
<div class="container">
<br><br>
<h2 >Search Account</h2>
<hr>
<p>CompanyId       :<b> ${list.companyid}</b></p>
<p>Company Name    :<b>${list.companyname}</b></p>
<p>Founded         :<b> ${list.founded}</b></p>
<p>category        :<b> ${list.category}</b></p>
<p>country         :<b> ${list.country}</b></p>
<p>Number Of Emplyee :<b> ${list.number_of_employees}</b></p>
 
<br>
<a href="./">Home</a>
</div>
</body>
</html>