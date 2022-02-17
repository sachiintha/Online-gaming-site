<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/styles.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
color: red;
}
 input[type=text] {
  width: 15%;
  padding: 12px 20px;
  margin: 5px 0;
  box-sizing: border-box;
  border: 2px solid red;
  
}
 
</style>
</head>
<body>
<%
		String accountNo = request.getParameter("accountNoo");
        String userName = request.getParameter("userNamee");
        String cardNo = request.getParameter("cardNo");
        String cVV = request.getParameter("cvV");
        String expYear = request.getParameter("expYear");
        String cardType = request.getParameter("cardType ");

	%> 
	<h1>Delete Payment Details </h1>
	 
	<form action="delete" method="post">
	  Account No <input type="text" name="acc" value="<%= accountNo %>"readonly> <br>
	 
	 User Name <input type="text" name="user" value="<%= userName %>"readonly> 
	<br> 
     Card No<input type="text" name="cards" value="<%= cardNo %>"readonly> <br> 
	 
	 CVV <input type="text" name="cvvv" value="<%= cVV %>"readonly> <br> 
	 
	 Exp Year <input type="text" name="expy" value="<%= expYear %>"readonly> <br> 
 
	 	
	<br>
 <input type="submit" name="submit" value="Delete Payment Details"> 
 
	</form>
	 
</body>
</html>