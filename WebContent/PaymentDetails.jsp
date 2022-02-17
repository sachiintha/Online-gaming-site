<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/styles.css">
<meta charset="ISO-8859-1">
<style>
table, td, th {
  border: 2px solid red;
}

table {
  border-collapse: collapse;
  width: 50%;
}

td {
  text-align: center;
  height: 50px;
   
}
</style>
<title>PaymentDetails</title>
	

</head>

<body>

	<table>
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="accountNo" value="${cus.accountNo}"/>
	<c:set var="userName" value="${cus.userName}"/>
	<c:set var="cardNo" value="${cus.cardNo}"/>
	<c:set var="cvV" value="${cus.cVV}"/>
	<c:set var="expYear" value="${cus.expYear}"/>
	<c:set var="cardType" value="${cus.cardType}"/>	 
	
	<tr>
		<td>Account No</td>
		<td>${cus.accountNo}</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td>${cus.userName}</td>
	</tr>
	<tr>
		<td>Card No</td>
		<td>${cus.cardNo}</td>
	</tr>
	<tr>
		<td>CVV</td>
		<td>${cus.cVV}</td>
	</tr>
	<tr>
		<td>Exp Year</td>
		<td>${cus.expYear}</td>
	</tr>
	<tr>
		<td>Card Type</td>
		<td>${cus.cardType}</td>
	</tr>

	</c:forEach>
	</table>
	<c:url value="updatePayment.jsp" var="payupdate">
		<c:param name="accountNoo" value="${accountNo}"/>
		<c:param name="userNamee" value="${userName}"/>
		<c:param name="cardNo" value="${cardNo}"/>
		<c:param name="cvV" value="${cvV}"/>
		<c:param name="expYear" value="${expYear}"/>
		<c:param name="cardType" value="${cardType}"/>
	</c:url>
	<br>
	<a href="${payupdate}">
	<input type="button" name="update" value="Update Payment Details">
	</a>
	
		<br>
	<c:url value="deletePayment.jsp" var="cusdelete">
		<c:param name="accountNoo" value="${accountNo}" />
		<c:param name="userNamee" value="${userName}" />
		<c:param name="cardNo" value="${cardNo}" />
		<c:param name="cvV" value="${cvV}" />
		<c:param name="expYear" value="${expYear}" />
		<c:param name="cardType" value="${cardType}" />
	</c:url>
	<br>
	<a href="${cusdelete}">
	<input type="button" name="delete" value="Delete Payment Details">
	</a>
	
</body>
</html>