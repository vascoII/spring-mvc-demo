<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Customer Confirmation</title>
	</head>
<body>
	The customer is confirmed : ${customer.firstName} ${customer.lastName} 
	<br><br>
	The customer is adult as he is ${customer.age} old 
	<br><br>
</body>
</html>