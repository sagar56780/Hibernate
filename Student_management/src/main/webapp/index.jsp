<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1>Admin login</h1>
		<form action="admin_login" method="post"><br><br>
		ADMIN ID:<input type="text" name="id" ><br><br>
  ADMIN PASSWORD:<input type="text" name="pwd"><br><br>

<select id="admin_name" name="admin_name"><br><br>
    <option value="student">student</option><br><br>
    <option value="admin">admin</option><br><br>

</select>
  
  		
  		<input type="submit">
		</form>


</body>
</html>