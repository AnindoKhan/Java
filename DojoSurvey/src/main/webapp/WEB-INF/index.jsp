<%@ page language = "java" contentType = "text/html; charset= UTF -8"
	pageEncoding= "UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset = "UTF-8">
	<title>What is the code</title>
</head>
<body>
	<h1>Dojo Survey</h1>
	<form action="/result" method = "POST">
		<input type = "text" name ="name" placeholder = "Your Name">
		<br>
		<label for="language"> Favorite Language</label> 
		<select name="language">
    		<option value="1">Python</option>
   	 		<option value="2">Java</option>
    		<option value="3">MERN</option>
  		</select>
  		<br>
		<label for="location"> Location</label> 
		<select name="location">
    		<option value="1">Seattle</option>
   	 		<option value="2">San Jose</option>
    		<option value="3">Dallas</option>
  		</select>
  		<br>
  		<label for="language">Comment </label>
  		<input type = "text" name ="comment" placeholder = "comment">
  		<button>Submit</button>
	</form>
	
</body>
</html>
