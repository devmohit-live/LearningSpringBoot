<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Customer Form Page</title>
		<style >
			.error{
				color : red
			}
		</style>
	</head>
	
	
	<body>
		<form:form action="processForm" modelAttribute="customer">
			
			First Name : <form:input path="firstName" />
			<br><br>
			
			Last Name : <form:input path="lastName" />
			<!-- Providing error/validator method to this lastname property with cssClass -->
			
			<form:errors path="lastName" cssClass="error"/> 
			<br>
			
			<input type="submit" value="submit">
			<br>
			
		</form:form>
	</body>
</html>