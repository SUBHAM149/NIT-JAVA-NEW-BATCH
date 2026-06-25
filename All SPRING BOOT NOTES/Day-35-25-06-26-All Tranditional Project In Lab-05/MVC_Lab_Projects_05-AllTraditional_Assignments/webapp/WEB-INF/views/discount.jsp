<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Discount Details</title>
</head>
<body>

	<h2>Product Discount Details</h2>

	Product Name : ${productName}
	<br>
	<br> Price : ${price}
	<br>
	<br> Discount Percentage : ${discountPercentage}
	<br>
	<br> Discount Amount : ${discountAmount}
	<br>
	<br> Final Price : ${finalPrice}

	<br>
	<br>

	<a href="${pageContext.request.contextPath}/">Home</a>

</body>
</html>
