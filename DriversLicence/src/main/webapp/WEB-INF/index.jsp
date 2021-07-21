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
    <h1>Information</h1>
    <a href="/persons/new"> Add a new Person</a>
    <a href="/licenses/new"> Add a new License</a>
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>License #</th>
				<th>State</th>
				<th>Expiration Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items = "${persons}" var = "person">
				<tr>
					<td><c:out value = "${person.getFirstName()}"/></td>
					<td><c:out value = "${person.getLastName()}"/></td>
					<td><c:out value = "${person.getLicense().getNumber()}"/></td>
					<td><c:out value = "${person.getLicense().getState()}"/></td>
					<td><c:out value = "${person.getLicense().getExpirationDate()}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>

</html>