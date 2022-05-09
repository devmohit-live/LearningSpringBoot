<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- Importing the spring form tags from the uri and name it form -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<html>
<head>
<title> Student Form </title>
</head>
<body>


The student is confirmed : ${student.firstName}   ${student.lastName}  
<br><br>
Country :  ${student.country} 

<br><br>
Fav Language :  ${student.favouriteLanguage} 


<br><br>
OS Worked On  : <ul>
	<c:forEach var="tmp" items="${student.operatingSystems}">
		<li> ${tmp} </li>
	</c:forEach>

</ul>


</body>
</html>