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
	<h1><c:out value="${product.name}"></c:out></h1>
    <h3> Categories for this product:</h3>
    <c:forEach items="${product.categories}" var="c">
    	<p><c:out value ="${c.name}"></c:out></p>
    </c:forEach>
   <form action="/products/${product.getId()}" method="post">
  <select name="category" id="category">
    <c:forEach items="${categories}" var="cat">
      <option value="${cat.id}"><c:out value="${cat.getName()}"/></option>
    </c:forEach>
  </select>
  <button>Add</button>
</form>
</body>
</html>