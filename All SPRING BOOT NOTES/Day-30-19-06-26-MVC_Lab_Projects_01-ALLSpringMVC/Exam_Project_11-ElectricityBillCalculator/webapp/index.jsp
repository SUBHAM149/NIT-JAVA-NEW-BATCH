<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Electricity Bill Calculator</title>
</head>

<body>

	<h2>Electricity Bill Calculator</h2>

	<form action="bill" method="post">

		Consumer Number <input type="number" name="consumerNo"> <br>
		<br> Consumer Name <input type="text" name="consumerName">

		<br>
		<br> Units Consumed <input type="number" name="units"> <br>
		<br> Rate Per Unit <input type="number" name="rate"> <br>
		<br> <input type="submit" value="Calculate Bill">

	</form>

</body>

</html>
