<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Feedback Form</title>
</head>
<body>

	<h2>Customer Feedback Form</h2>

	<form action="saveFeedback" method="post">

		Customer Name : <input type="text" name="customerName"> <br>
		<br> Mobile Number : <input type="text" name="mobileNumber">
		<br>
		<br> Product Name : <input type="text" name="productName">
		<br>
		<br> Rating : <input type="number" name="rating"> <br>
		<br> Feedback :
		<textarea name="feedback"></textarea>
		<br>
		<br> <input type="submit" value="Submit Feedback">

	</form>

	<br>
	<br>

	<a href="${pageContext.request.contextPath}/">Home</a>

</body>
</html>
