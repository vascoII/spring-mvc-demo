<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student Confirmation</title>
	</head>
<body>
	The student is confirmed : ${student.firstName} ${student.lastName} 
	<br><br>
	Student country : ${student.country}
	<br><br>
	Student favorite language : ${student.favoriteLanguage}
	<br><br>
	Student operating systems : 
	<ul>
		<c:forEach var="operatingSystem" items="${student.operatingSystems}">
			<li>${operatingSystem}</li>
		</c:forEach>
	</ul>
</body>
</html>