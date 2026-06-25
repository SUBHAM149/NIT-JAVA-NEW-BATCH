<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Discount Calculator</title>
</head>
<body>

	<h2>Product Discount Calculator</h2>

	<form action="discount" method="post">

		Product Name : <input type="text" name="productName"> <br>
		<br> Price : <input type="text" name="price"> <br>
		<br> Discount Percentage : <input type="text"
			name="discountPercentage"> <br>
		<br> <input type="submit" value="Calculate">

	</form>

	<br>
	<br>

	<a href="${pageContext.request.contextPath}/">Home</a>

</body>
</html>
