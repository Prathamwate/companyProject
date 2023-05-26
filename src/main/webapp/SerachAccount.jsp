<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="background-color:">
<div class="container">
<br><br>
<h2 >Search Account</h2>
<hr>

<form name="frm" method="post" action="SerachAccount1">
<table>
                <tr>
                    <td>Category  :</td>
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