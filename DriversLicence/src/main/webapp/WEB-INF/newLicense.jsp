<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <fmt:formatDate value="${yourObject.date}" var="dateString" pattern="dd/MM/yyyy" /> --%>

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
    <h1>New License</h1>
    <form:form action ="/licenses/new" method ="post" modelAttribute="license">
    	<form:label path="person"> Person</form:label>
    	<form:errors path="person"/>
    	<form:select path="person">
    		<c:forEach items="${persons}" var="person">
    			<form:option value="${person}"> ${person.firstName} ${person.lastName} </form:option>
    		</c:forEach>
    	</form:select>
    	<br>
    	<form:label path="state"> State </form:label>
    	<form:errors path="state"/>
    	<form:input path="state"/>
    	<br>
    	<form:label path="expirationDate"> Expiration Date </form:label>
    	<form:errors path="expirationDate"/>
    	<form:input path="expirationDate" type="date"/>
    	<br>
    	<button> Submit</button>
    </form:form>
</body>
</html>