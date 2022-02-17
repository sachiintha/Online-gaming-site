<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="css/styles.css">
<meta charset="ISO-8859-1">
<head>
<style>
body {
  color: red;
}

h1 {
  color: red;
  
div {
   border: 4px dotted blue;
}
 
</style>
<title>Insert Account Details here</title>
</head>
<h1>Login</h1>
<body>

 
<form action="log" method="post">
		<br><br><br>
		Account No <input type="text" name="uid" placeholder="Enter Account No" required><br><br><br>
		User Name <input type="text" name="pass" placeholder="Enter User Name"><br><br><br>
		<input type="submit" name="submit" value="Login">
	</form>
 
</body>
</html>