<%@ page language = "java" contentType = "text/html; charset= UTF -8"
	pageEncoding= "UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset = "UTF-8">
	<title>What is the code</title>
</head>
<body>
	<h1>What is the code?</h1>
	<form action="/code" method = "POST">
		<input type = "text" name = "guess">
		<button type = "submit"> Try Code</button>
		<c:out value= "${error}"></c:out>
	</form>
</body>
</html>
