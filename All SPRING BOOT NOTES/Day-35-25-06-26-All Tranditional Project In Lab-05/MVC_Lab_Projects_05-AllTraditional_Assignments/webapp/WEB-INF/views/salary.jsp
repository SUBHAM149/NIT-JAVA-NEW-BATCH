<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Salary Details</title>
</head>
<body>

<h2>Employee Salary Details</h2>

Employee Name : ${name}
<br><br>

Basic Salary : ${basic}
<br><br>

Bonus : ${bonus}
<br><br>

Total Salary : ${total}

<br><br>

<a href="${pageContext.request.contextPath}/">Home</a>

</body>
</html>
