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
	<h1 align="center">REGISTER HERE</h1>

	<form:form action="registration-sucess" method="GET"
		modelAttribute="userRegister">
		<div align="center">
			<label>User : </label>
			<form:input path="name" />
			<br /> <label>User Name: </label>
			<form:input path="username" />

			<br /> <label>password: </label>
			<form:password path="password" />


			<br /> <label>countryname : </label>
			<form:select path="countryname">
				<form:option value="IND" label="INDIA" />
				<form:option value="RUS" label="RUSSIA" />
				<form:option value="CND" label="CANADA" />
				<form:option value="USA" label="UNITED STATES" />
			</form:select>
			<br /> <label>hobbies: </label> CRICKET:
			<form:checkbox path="hobbies" value="cricket" />

			CODING:
			<form:checkbox path="hobbies" value="coding" />

			TRAVEL:
			<form:checkbox path="hobbies" value="travel" />

			SINGING:
			<form:checkbox path="hobbies" value="singing" />



			<br /> <label>Gender : </label> Male
			<form:radiobutton path="gender" value="male" />

			Female
			<form:radiobutton path="gender" value="female" />

			Others
			<form:radiobutton path="gender" value="others" />
			<br /> 
			<label>Age : </label>
		    <form:input path="age"/>
		
		
		</div>
		
		<div align="center">
		<h3>Communication</h3>
		<label>Email</label>
		<form:input path="communicationDTO.email" />
		
		<label>Phone</label>
		<form:input path="communicationDTO.phone" />
		
		</div>
		
		
		
		
		
		
		
		<div align="center">
		<input type="submit" value="register">
		</div>
	</form:form>

</body>
</html>