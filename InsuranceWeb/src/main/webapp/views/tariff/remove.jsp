<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- You may use form if you want to send some data to server. Action - URL which will be created when the button in pressed -->
	<form action="insertRemoveTariff" method="post">
		<h2>Input Data</h2>
		number <input type="text" name="Id" required>
		<button type="submit">Submit</button>
	</form>
</body>
</html>