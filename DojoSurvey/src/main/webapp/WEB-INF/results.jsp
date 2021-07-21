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
	<h1>Dojo Survey</h1>
	<h1><c:out value="${name}"/></h1>
	<h1><c:out value="${languge}"/></h1>
	<h1><c:out value="${location}"/></h1>
	<h1><c:out value="${comment}"/></h1>
</body>
</html>
