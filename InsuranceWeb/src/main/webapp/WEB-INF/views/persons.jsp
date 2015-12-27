<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Authors: </h2>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Country</th>
				<th>Country</th>
				<th>Country</th>
				<th>Country</th>
				<th>Country</th>
				<th>Country</th>
				<th>Country</th>
				<th>Country</th>
			</tr>
		</thead>
		<tbody>
		<!-- This is JSTL foreach cycle that allows web page to pass through collection. Items - attribute name, which was given at controller method -->
			<c:forEach var="person" items="${persons}">
				<tr>
					<td>${person.id}</td>
					<td>${person.fNamelName}</td>
					<td>${person.number}</td>
					<td>${person.passportSeries}</td>
					<td>${person.passportNumber}</td>
					<td>${person.identification}</td>
					<td>${person.addres}</td>
					<td>${person.dateOfRegistration}</td>
					<td>${person.dateOfBirsthday}</td>
					
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="createNewPersons">Create Person</a>
	<a href="removePerson">Remove Person</a>
</body>
</html>