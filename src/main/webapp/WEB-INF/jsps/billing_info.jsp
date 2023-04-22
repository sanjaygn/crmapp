<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>
	<h2>Billing | Billing Details</h2>
	<hr>
	
	<form action="generateBill" method="post">
		<pre>
			ID  : <input type="number" name="id" value="${contact.id}" readonly>
			First Name : <input type="text" name="firstName" value="${contact.firstName}" readonly>
			Last Name : <input type="text" name="lastName" value="${contact.lastName}" readonly>
			Email  : <input type="text" name="email" value="${contact.email}" readonly>
			Mobile  : <input type="text" name="mobile" value="${contact.mobile}" readonly>
			
			Product : <input type="text" name="product">
			Amount : <input type="text" name="amount">
			Mode of Payment :
			Cash <input type="radio" name="modeOfPayment" value="cash">
			Online <input type="radio" name="modeOfPayment" value="online">
			
			<input type="submit" value="generate">
		</pre>
	</form>
	
	${msg}
	
</body>
</html>