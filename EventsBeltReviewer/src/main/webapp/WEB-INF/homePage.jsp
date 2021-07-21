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
    <h1>Welcome, <c:out value="${user.firstName}" /></h1>
    <div>
    <h4>Here are some events in your state!</h4>
    	<table>
    	<tr>
    		<th> Name</th>
    		<th> Date</th>
    		<th> Location</th>
    		<th> host </th>
  			<th> Action</th>
    	</tr>
    	<c:forEach items= "${inStateEvents}" var="event">
    	<tr>
    	
    		<td> <a href="event/${event.id}">${event.name}</a> </td>
    		<td> ${event.date} </td>
    		<td> ${event.location} </td>
    		<td> ${event.host.firstName} </td>
    		<td><a href="event/${event.id}/edit"> Edit </a> |<a href="event/${event.id}/delete"> Delete </a></td>
    	</tr>
    	</c:forEach>
    	</table>
    </div>
    <h4>Here are some events  not in your state!</h4>
    	<table>
    	<tr>
    		<th> Name</th>
    		<th> Date</th>
    		<th> Location</th>
    		<th> State</th>
    		<th> host </th>
  			<th> Action</th>
    	</tr>
    	
    	<c:forEach items= "${notInStateEvents}" var="event">
    		<tr>
    			<td><a href="event/${event.id}"> ${event.name}</a> </td>
	    		<td> ${event.date} </td>
	    		<td> ${event.location} </td>
	    		<td> ${event.state} </td>
	    		<td> ${event.host.firstName} </td>
	    		<td><a href="event/${event.id}/edit"> Edit </a> |<a href="event/${event.id}/delete"> Delete </a></td>
    	</tr>
    	</c:forEach>
    	</table>
    </div>
    <h1>Create an Event</h1>
    
    <form:form action="/createEvent" method="post" modelAttribute="events">
    <form:input type="hidden" name="host_id" path="host" value="${user.id}"></form:input>
          <p>  
            <form:label path="name"> Name </form:label>
            <form:input  path="name"/>
            <form:errors path="name"/>
        </p>
        <p>
            <form:label path="date"> Date </form:label>
            <form:input type="date" path="date"/>
            <form:errors path="date"/> 
        </p>
         <p>
        	<form:label path="location"> Location:</form:label>
        	<form:input path="location"/>
        	<form:errors path="location"/>
        <p>	
        <p>
			<form:select path="state">
				<option value="please select" disabled selected></option>
					<option value="AL">AL</option>
					<option value="AK">AK</option>
					<option value="AZ">AZ</option>
					<option value="AR">AR</option>
					<option value="CA">CA</option>
					<option value="CO">CO</option>
					<option value="CT">CT</option>
					<option value="DE">DE</option>
					<option value="FL">FL</option>
					<option value="GA">GA</option>
					<option value="HI">HI</option>
					<option value="ID">ID</option>
					<option value="IL">IL</option>
					<option value="IN">IN</option>
					<option value="IA">IA</option>
					<option value="KS">KS</option>
					<option value="KY">KY</option>
					<option value="LA">LA</option>
					<option value="ME">ME</option>
					<option value="MD">MD</option>
					<option value="MA">MA</option>
					<option value="MI">MI</option>
					<option value="MN">MN</option>
					<option value="MS">MS</option>
					<option value="MO">MO</option>
					<option value="MT">MT</option>
					<option value="NE">NE</option>
					<option value="NV">NV</option>
					<option value="NH">NH</option>
					<option value="NJ">NJ</option>
					<option value="NM">NM</option>
					<option value="NY">NY</option>
					<option value="NC">NC</option>
					<option value="ND">ND</option>
					<option value="OH">OH</option>
					<option value="OK">OK</option>
					<option value="OR">OR</option>
					<option value="PA">PA</option>
					<option value="RI">RI</option>
					<option value="SC">SC</option>
					<option value="SD">SD</option>
					<option value="TN">TN</option>
					<option value="TX">TX</option>
					<option value="UT">UT</option>
					<option value="VT">VT</option>
					<option value="VA">VA</option>
					<option value="WA">WA</option>
					<option value="WV">WV</option>
					<option value="WI">WI</option>
					<option value="WY">WY</option>
					<option value="DC">DC</option>
					<option value="PR">PR</option>
					<option value="VI">VI</option>
					<option value="GU">GU</option>
					<option value="AS">AS</option>
					
			</form:select>       	
        <p>	
        <button>Submit</button>   
    </form:form>
</body>
</html>