<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all leads</title>
</head>
<body>
	
	<a href="viewleadpage">create new lead</a>

	<h2>Leads | All Leads</h2>
	<hr>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Lead Source</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>


		<c:forEach var="lead" items="${leads}">
			<tr>
				<td>${lead.id}</td>
				<td><a href="getLeadById?id=${lead.id}">${lead.firstName}</a></td>
				<td>${lead.lastName}</td>
				<td>${lead.email}</td>
				<td>${lead.leadSource}</td>
				<td>${lead.mobile}</td>
				<td><a href="delete?id=${lead.id}">delete</a></td>
				<td><a href="getLeadInfo?id=${lead.id}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>