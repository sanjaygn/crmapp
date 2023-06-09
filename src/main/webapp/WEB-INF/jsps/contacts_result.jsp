<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all contacts</title>
</head>
<body>
	
	<a href="viewleadpage">create new lead</a>

	<h2>Contacts | All Contacts</h2>
	<hr>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Lead Source</th>
			<th>Mobile</th>
			<th>Billing</th>
		</tr>


		<c:forEach var="contact" items="${contacts}">
			<tr>
				<td>${contact.id}</td>
				<td><a href="getContactById?id=${contact.id}">${contact.firstName}</a></td>
				<td>${contact.lastName}</td>
				<td>${contact.email}</td>
				<td>${contact.leadSource}</td>
				<td>${contact.mobile}</td>
				<td><a href="getIdForBilling?id=${contact.id}">Billing</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>