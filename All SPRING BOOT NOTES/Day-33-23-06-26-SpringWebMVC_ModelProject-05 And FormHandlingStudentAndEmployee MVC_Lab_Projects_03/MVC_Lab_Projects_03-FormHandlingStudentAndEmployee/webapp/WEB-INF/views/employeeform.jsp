<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html>
<head>
<title>Employee Registration</title>
</head>

<body>

	<h2>Employee Registration Form</h2>

	<form action="saveEmployee">

		Employee Id : <input type="number" name="eid"> <br> <br>
		Employee Name : <input type="text" name="ename"> <br> <br>
		Department : <input type="text" name="dept"> <br> <br>
		Salary : <input type="number" name="salary"> <br> <br>
		<input type="submit" value="Register Employee">

	</form>


	<a href="index.jsp">
		<button type="button">Back</button>
	</a>
</body>
</html>
