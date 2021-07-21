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
    <h1>Home</h1>
    <a href="/products/new"> Create a new Product</a>
    <a href="/categories/new"> Create a new Categories</a>
    <h1> List of Products</h1>
    <table>
    	<tr>
    		<th> Name </th>
    		<th> Description </th>
    		<th> Price </th>
 			<th> Categories </th>
    	</tr>
    	<c:forEach items="${products}" var="p">
    		<tr>
    			<td><a href ="/products/${p.id}">${p.name}</a></td>
    			<td>${p.description}</td>
    			<td>$${p.price}</td>
    			<td></td>
    			
    		</tr>
    	</c:forEach>
    </table>
    <h1> List of Categories</h1>
    	<table>
    		<tr>
    			<th> Name </th>
    		</tr>
    		<c:forEach items ="${categories}" var ="c">
    			<tr>
    			<td><a href ="/categories/${c.id}">${c.name}</a></td>
    			</tr>
    		</c:forEach>
    	</table>
</body>
</html>