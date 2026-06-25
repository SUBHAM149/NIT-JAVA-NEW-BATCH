<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>

	<h2>Student Registration Form</h2>

	<form action="saveStudent" method="post">

		Student Id : <input type="text" name="studentId"> <br>
		<br> Student Name : <input type="text" name="studentName">
		<br>
		<br> Course : <input type="text" name="course"> <br>
		<br> Email : <input type="email" name="email"> <br>
		<br> <input type="submit" value="Register">

	</form>

	<br>
	<a href="./">Home</a>

</body>
</html>
