<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- BOOTSTRAP -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
		rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
		crossorigin="anonymous">
	<!-- CSS -->
	<link rel="stylesheet" href="#" />
	<!-- SCRIPT -->
	<script type="text/javascript" src="#"></script>
    <title>Document</title>
</head>
<body>
    <h1>List of Dojo's and Ninja's</h1>
    <a href="/createDojo">Create a new Dojo</a>
    <a href="/createNinja">Create a new Ninja</a>
    <c:forEach items = "${dojos}" var ="dojo">
    	<h3><c:out value ="${dojo.name}"></c:out></h3>
    	<c:forEach items="${dojo.ninjas}" var="ninja">
    		<p><c:out value="${ninja.firstName}"></c:out><p>
    </c:forEach>
    </c:forEach>
    
</body>
</html>