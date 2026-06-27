<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Bill Details</title>
</head>

<body>

	<h2>Electricity Bill</h2>

	Consumer Number : ${consumerNo}

	<br>
	<br> Consumer Name : ${consumerName}

	<br>
	<br> Units Consumed : ${units}

	<br>
	<br> Rate Per Unit : ${rate}

	<br>
	<br> Total Bill : ₹${total}

	<br>
	<br>

	<a href="${pageContext.request.contextPath}/index.jsp">Back</a>

</body>

</html>
