<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback Details</title>
</head>
<body>

	<h2>Customer Feedback Submitted Successfully</h2>

	Customer Name : ${fb.customerName}
	<br>
	<br> Mobile Number : ${fb.mobileNumber}
	<br>
	<br> Product Name : ${fb.productName}
	<br>
	<br> Rating : ${fb.rating}
	<br>
	<br> Feedback : ${fb.feedback}

	<br>
	<br>

	<a href="${pageContext.request.contextPath}/">Home</a>

</body>
</html>
