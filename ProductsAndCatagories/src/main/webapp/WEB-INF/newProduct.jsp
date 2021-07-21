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
    <title>new Product</title>
</head>
<body>
    <h1>Create A Product</h1>
    <form:form action="/products/new" method="post" modelAttribute="product">
    	<form:label path= "name"> Name </form:label>
    	<form:errors path="name"></form:errors>
    	<form:input path="name"></form:input>
    	
    	<br>
    	<form:label path= "description"> Description </form:label>
    	<form:errors path="description"></form:errors>
    	<form:input path="description"></form:input>
    	
    	<br>
    	<form:label path= "price"> Price $:</form:label>
    	<form:errors path="price"></form:errors>
    	<form:input path="price"></form:input>
    	<button> Create a product</button>
    </form:form>
    
    
</body>
</html>