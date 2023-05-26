<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body class="p-3 mb-2 bg-success text-white">
<div class="container">
<br>
<h1 class="display-8" style="color:dark">New User</h1>
<hr>
<br>
<form  action="NewUserAdd" method="POST">
                <table>
                   <tr>
                        <td>Company Id</td>
                        <td><input type="text" name="companyid"  class="form-control" required></td>
                    </tr>
                    <tr>
                        <td>Company Name</td>
                        <td><input type="text" name="companyname" class="form-control" required></td>
                    </tr>
                      <tr>
                        <td>Email</td>
                        <td><input type="email" name="email" class="form-control" required></td>
                    </tr>
                    <tr>
                        <td>Founded</td>
                        <td><input type="text" name="founded" class="form-control" required></td>
                    </tr>
                       <tr>
                    <td>Category</td>
                    <td>
                        <select name="category" class="form-control" required>
                          <option >Select Type</option>
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
                        <td><input type="text" name="country" class="form-control" required></td>
                    </tr>
                     <tr>
                        <td>Number Of Employees</td>
                        <td><input type="text" name="number_of_employees" class="form-control" required></td>
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

</div>
</body>
</html>