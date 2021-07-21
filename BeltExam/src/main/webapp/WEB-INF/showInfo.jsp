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

    <h1> ${currentShow.title} </h1>
    <h3> Network: ${currentShow.network}</h3>
    
    <form:form path="/addRating/${currentShow.id}" method="post" modelAttribute="rating" >
    	<p>
            <form:label for="rating" path="rating"> Leave a rating:</form:label>
            <form:input type="number"  name="rating" path="rating"/>
        </p>
       <button> Rate</button>
    </form:form>
    <a href="/shows/${currentShow.id}/edit"> Edit</a>
    <a href="/shows/${currentShow.id}/delete"> Delete</a>
</body>
</html>