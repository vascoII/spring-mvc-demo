<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Customer Registration Form</title>
		<style>
			.error {color: red}
		</style>
	</head>
	<body>
	<i>Fill out the form. Asterisk (*) means required.</i>
	<br><br>
	
		<form:form action="processForm" modelAttribute="customer">
			First Name (*): <form:input path="firstName" />
			<form:errors path="firstName" cssClass="error"/>
			<br><br>
			Last Name (*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error"/>
			<br><br>
			Age (*): <form:input path="age" />
			<form:errors path="age" cssClass="error"/>
			<br><br>
			Postal Code (*): <form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error"/>
			<br><br>
			Course Code (*): <form:input path="courseCode" />
			<form:errors path="courseCode" cssClass="error"/>
			<br><br>
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>