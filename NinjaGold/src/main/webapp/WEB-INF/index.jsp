<%@ page language = "java" contentType = "text/html; charset= UTF -8"
	pageEncoding= "UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset = "UTF-8">
	<title>Ninja Gold Game</title>
</head>
<body>
	<h1>Your Gold:</h1>
	<div>
		<h3>Farm</h3>
    	<h4>(earns 10-20 gold)</h4>
		<form action = "/gold" method="POST">
			<label>Farm</label>
			<input type = "hidden" name ="action" value="farm">
			<button>Find Gold</button>
		</form>
	</div>
	<div>
		<h3>House</h3>
    	<h4>(earns 2-5 gold)</h4>
		<form action = "/gold" method="POST">
			<label>Farm</label>
			<input type = "hidden" name ="action" value="house">
			<button>Find Gold</button>
		</form>
	</div>
	<div>
		<h3>Cave</h3>
    	<h4>(earns 5-10 gold)</h4>
		<form action = "/gold" method="POST">
			<label>Farm</label>
			<input type = "hidden" name ="action" value="cave">
			<button>Find Gold</button>
		</form>
	</div>
	<div>
		<h3>Casino</h3>
    	<h4>(earns/takes 0-50 gold)</h4>
		<form action = "/gold" method="POST">
			<label>Farm</label>
			<input type = "hidden" name ="action" value="casino">
			<button>Find Gold</button>
		</form>
	</div>
</body>
</html>
