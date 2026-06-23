<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html>
<head>
<title>Student Registration</title>
</head>

<body>

	<h2>Student Registration Form</h2>

	<form action="saveStudent">

		Student Id : <input type="number" name="sid"> <br>
		<br> Student Name : <input type="text" name="sname"> <br>
		<br> Course : <input type="text" name="course"> <br>
		<br> Fee : <input type="number" name="fee"> <br>
		<br> <input type="submit" value="Register Student">
<br><br>

<a href="index.jsp">
    <button type="button">Back</button>
</a>
	</form>

</body>
</html>
