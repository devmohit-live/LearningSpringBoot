<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- Importing the spring form tags from the uri and name it form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>


<html>
<head>
<title> Student Form </title>
</head>
<body>

<!-- action: method in the controller, modelattribute: type of model handled in the form -->

<form:form action="processForm" modelAttribute="student">
<!-- Will take the path as getter(loading the form) and setters(submitting the form) -->

<br><br>
First Name : <form:input path="firstName" />

<br><br>
Last Name : <form:input path="lastName" />

<br><br>
Country : 
<form:select path="country">

<!-- First way of hardcoding in jsp itself -->

<!--  	<form:option value="Brazil" label="Brazil" />
	<form:option value="India" label="India" />
	<form:option value="Russia" label="Russia" />
	<form:option value="Saudi" label="Saudi" />
-->
	
<!-- Second Option using properties of class/model itself -->

<form:options items="${student.countryOptions}"/>
</form:select>


	Java<form:radiobutton path="favouriteLanguage" value="Java"/>
	Python<form:radiobutton path="favouriteLanguage" value="Python"/>
	Dart<form:radiobutton path="favouriteLanguage" value="Dart"/>
	C<form:radiobutton path="favouriteLanguage" value="C"/>

  <input type="submit" value="Submit"/>
</form:form>


</body>
</html>