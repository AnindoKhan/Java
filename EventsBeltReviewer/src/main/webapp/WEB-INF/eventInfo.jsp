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
    <h1>${event.name}</h1>
    <p> Host: ${event.host.firstName}</p>
    <p> Date: ${event.date}</p>
    <p> Location: ${event.host.location}, ${event.state}</p>
    <p> People who attended this event:</p>
    
    <div>
    	<table>
    		<tr>
    			<th> Name</th>
    			<th> Location</th>
    		</tr>
    		<tr>
    			<td> Placeholder</td>
    			<td> Placeholder</td>
    		</tr>
    	</table>
    </div>
    <div>
    	<h3> Message Wall</h3>
    </div>
</body>
</html>