<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="hederTwo">

		<a href="showAllPersons"><button type="button" >Show Persons </button></a>
		<a href="showAllTariff"><button type="button" >Show Tariff</button></a>
		<sec:authorize access="hasRole('ADMIN')">
		<a href="showAllWorkers"><button type="button" >Admin page</button></a>
		</sec:authorize>
		
	</div>
	<div class="hederOne">
		<sec:authorize access="isAnonymous()">
			<a href="login">Login</a>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
			<!-- authentication тег дає можливість отримати дані (ім'я, пароль та роль) залогіненого користувача -->
		Hello, <sec:authentication property="name" />
			<a href="logout">LogOut</a>
		</sec:authorize>
	</div>




</body>
</html>