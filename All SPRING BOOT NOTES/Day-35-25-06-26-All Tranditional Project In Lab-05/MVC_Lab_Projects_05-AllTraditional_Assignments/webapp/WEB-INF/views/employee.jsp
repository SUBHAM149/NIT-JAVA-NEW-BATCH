<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Salary Calculator</title>
</head>
<body>

	<h2>Employee Salary Calculator</h2>

	<form action="salary" method="post">

		Employee Name : <input type="text" name="empName"> <br>
		<br> Basic Salary : <input type="text" name="basicSalary">
		<br>
		<br> Bonus : <input type="text" name="bonus"> <br>
		<br> <input type="submit" value="Calculate Salary">

	</form>

	<br>
	<br>

	<a href="${pageContext.request.contextPath}/">Home</a>

</body>
</html>
