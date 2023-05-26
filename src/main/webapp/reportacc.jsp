<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@taglib prefix="spring" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="background-color:white">
<% int count=1;%>
<div class="container">
<br>
<h1  style="color:green" align="center">Company List</h1>
<hr>
<table class="table table-bordered table-hover">
    <tr style="color:black; background-color:dark">
        <th>Number</th>
        <th>company Id</th>
        <th>company name</th>
        <th>founded</th>
        <th>category</th>
        <th>Country</th>
        <th>number Employees</th>
         <th>Email</th>
        
    </tr>
<spring:forEach items="${list}" var="it">

<tr style="color:green">
<td><%=count++%></td>
<td>${it.companyid}</td>
<td>${it.companyname}</td>
<td>${it.founded}</td>
<td>${it.category}</td>
<td>${it.country}</td>
<td>${it.number_of_employees}</td>
<td>${it.email}</td>
<td><form name="frm" method="post" action="UpdateUserDetailPage"><input type="hidden" value="${it.companyid}" name="companyid"><input type="submit" value="Edit" class="btn btn-primary"></form></td>
<td><form name="frm" method="post" action="DeleteAccount1"><input type="hidden" value="${it.companyid}" name="companyid"><input type="submit" value="Delete" class="btn btn-danger"></form></td>
</tr>
</spring:forEach>
</table>
<a href="./">Home</a>

</div>
</body>
</html>