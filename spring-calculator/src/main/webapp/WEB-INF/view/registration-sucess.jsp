
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your registration is successful</h1>
	<h2>Details are :</h2>
	User : ${userRegister.name}
	<br /> User Name: ${userRegister.username}
	<br /> Password: ${userRegister.password}
	<br /> CountryName : ${userRegister.countryname}
	<br /> Hobbies :
	

	<c:forEach var="temp" items="${userRegister.hobbies}">
 ${temp}
 
 
 </c:forEach>

	<br /> Gender : ${userRegister.gender}
	<br/> Email : ${userRegister.communicationDTO.email}
	<br/> Phone : ${userRegister.communicationDTO.phone}
	<br/> Age  : ${userRegister.age}



</body>
</html>