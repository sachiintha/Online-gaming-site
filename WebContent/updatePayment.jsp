<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/styles.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	

<form action="update" method="post">

	Account No <input type="text" name="acc" value="<%= accountNo %>"readonly><br>
	User Name <input type="text" name="user" value="<%= userName %>"><br>
	Card No<input type="text" name="cards" value="<%= cardNo %>"><br>
	CVV <input type="text" name="cvvv" value="<%= cVV %>"><br>
	Exp Year <input type="text" name="expy" value="<%= expYear %>"><br>
 
	
	<br>
	<input type="submit" name="submit" value="Update Payment Details">
	</form>

</body>
</html>