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
<a href="/logout">Logout</a>
    <h1>Welcome, <c:out value="${user.name}" /></h1>
    <h3> List of TV shows:</h3>
    <div>
    <table>
    	<tr>
    		<th> Show </th>
    		<th> Network </th>
    	
    	</tr>
    	<c:forEach items ="${theShows}" var="s">
    		<tr>
    			<td><a href="/shows/${s.id}">${s.title}</a></td>
    			<td>${s.network}</td>
    		</tr>
    	</c:forEach>
    	
    </table>
    </div>
 
    
   <a href="/addShow">Add a Show!</a>
</body>
</html>