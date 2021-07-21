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
    <title>Create a Ninja</title>
</head>
<body>
    <h1>Create a Ninja</h1>
    <form:form action="createNinja" method="post" modelAttribute="ninja">
    	<div>
    		<p>First Name</p>
    			<form:label path="firstName"></form:label>
    			<form:errors path="firstName"></form:errors>
    			<form:input path="firstName"></form:input>
    	</div>
    	<div>
    		<p>Last Name</p>
    			<form:label path="lastName"></form:label>
    			<form:errors path="lastName"></form:errors>
    			<form:input path="lastName"></form:input>
    	</div>
    	<div>
    		<p>Age</p>
    			<form:label path="age"></form:label>
    			<form:errors path="age"></form:errors>
    			<form:input path="age"></form:input>
    	</div>
    	<div>
    		<form:label path="dojo"></form:label>
    		<form:errors path="dojo"></form:errors>
    		<form:select path="dojo">
    			<c:forEach items="${dojos}" var ="dojo">
    				<form:option value="${dojo}">
    					<c:out value="${dojo.name}"></c:out>
    				</form:option>
    			</c:forEach>
    		</form:select>
    		<button>Create</button>
    	</div>
    	
    </form:form>
</body>
</html>