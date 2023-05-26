<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.sql.*" %><%@taglib prefix="spring" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="background-color:#2EFEF7">
<div class="container">
<br><br>
<h2 >Update Company Employees</h2>
<hr>

         <form name="frm" method='post' action="UpdatedAccount">
            <table>
                    <tr>
                        <td>Company Id</td>
                        <td><input type="text" name="companyid" value="${list.companyid}" class="form-control" ></td>
                    </tr>
                    
                    <tr>
                        <td>Company Name</td>
                        <td><input type="text" name="companyname" value="${list.companyname}" class="form-control" required></td>
                    </tr>
                      <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" value="${list.email}" class="form-control" required></td>
                    </tr>
                    <tr>
                        <td>Founded</td>
                        <td><input type="text" name="founded" value="${list.founded}"  class="form-control" required></td>
                    </tr>
                       <tr>
                    <td>Category</td>
                    <td>
                        <select name="category" class="form-control"  required>
                          <option  >Select Type</option>
                            <option value="software">Software</option>
                            <option value="marketing">Marketing</option>
                            <option value="infrastructure">Infrastructure</option>
                            <option value="contruction">Contruction</option>
                            <option value="automobile">Automobile</option>
                        </select>
                    </td>
                </tr>
                    <tr>
                        <td>Country</td>
                        <td><input type="text" name="country" value="${list.country}" class="form-control" required></td>
                    </tr>
                     <tr>
                        <td>Number Of Employees</td>
                        <td><input type="text" name="number_of_employees" value="${list.number_of_employees}" class="form-control" required></td>
                    </tr>
                    <tr>
                         <td></td>
                         <td>
                            <br>
                         <input type="submit" value="submit" class="btn btn-danger">
                        </td>
				</tr>
            </table>
        </form>
      
<a href="./">Home</a>
</div>
</body>
</html>