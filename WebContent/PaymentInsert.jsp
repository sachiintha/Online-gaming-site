<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/styles.css">
<meta charset="ISO-8859-1">
<style>
h1{
color:red;
}
 input[type=text] {
  width: 15%;
  padding: 12px 20px;
  margin: 5px 0;
  box-sizing: border-box;
  border: 2px solid red;
  
}
</style>
<title>Insert here</title>
</head>
<body>
<h1>Insert your payment details here</h1>
<form action="insert" method="post">

		User Name <input type="text" name="name"><br><br>
		Card No <input type="text" name="cardnno"><br><br>
		CVV <input type="text" name="cvv"><br><br>
		Exp Year <input type="text" name="exp"><br><br>
		Card Type <input type="text" name="type"><br><br>
		
		
		<input type="submit" name="submit" value="Insert">
	</form>
</body>
</html>