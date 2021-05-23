<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>homepage</title>


<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<script type="text/javascript">
	//CLIENT SIDE VALIDATION
	function validateUserName() {
		var username = document.getElementById("yn").value;
		if (username.length < 3) {
			alert("name should have atleast one character");
			return false;
		} else {
			return true;
		}

	}
</script>






</head>
<body>

	<h1 align="center">LOVE CALCULATOR</h1>
	<hr />

	<form:form action="process" method="get" modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your Name :</label>
				<form:input id="yn" path="username" />
				<form:errors path="username" cssClass="error" />
			</p>

			<p>
				<label for="cn">Crush Name :</label>
				<form:input id="cn" path="crushname" />
				<form:errors path="crushname" cssClass="error" />
			</p>
			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>I am Agreeing that this is for fun</label>
				<form:errors path="termAndCondition" cssClass="error" />

			</p>



			<input type="submit" value="calculate">

		</div>
	</form:form>


</body>
</html>