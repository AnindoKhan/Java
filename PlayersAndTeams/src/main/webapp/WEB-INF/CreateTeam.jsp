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
    <h1>Create a Team</h1>
    <form:form method="post" action="/createTeam" modelAttribute="team">
		<form:label path="name"> Name </form:label>  
		<form:errors path="name"/>
		<form:input path="name"/>
		<button> Create a Team!</button> 
    </form:form>
    
    <div>
    	<h1> List of Teams</h1>
    	<c:forEach items="${teams}" var="t">
    		<li><a href="/editTeam/${t.id}"><c:out value="${t.name}"></c:out></a></li>
    		<p> List of players</p>
    		<c:forEach items="${t.users}" var="player">
    			<li><c:out value="${player.firstName}"></c:out></li>
    		</c:forEach>
    		<form action="/joinTeam/${t.id}" method="POST">
    			<input type="submit" value="Join team!"/>
    		</form>
    		<form action ="/deleteTeam/${t.id}" method ="POST">
    			<button> Delete </button>
    		</form>
    	</c:forEach>
    </div>
</body>
</html>