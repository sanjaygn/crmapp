<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all bills</title>
</head>
<body>
	

	<h2>Billings | All Bills</h2>
	<hr>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Product</th>
			<th>Amount</th>
			<th>Mode of Payment</th>
		</tr>


		<c:forEach var="bill" items="${bills}">
			<tr>
				<td>${bill.id}</td>
				<td>${bill.firstName}</td>
				<td>${bill.lastName}</td>
				<td>${bill.email}</td>
				<td>${bill.mobile}</td>
				<td>${bill.product}</td>
				<td>${bill.amount}</td>
				<td>${bill.modeOfPayment}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>