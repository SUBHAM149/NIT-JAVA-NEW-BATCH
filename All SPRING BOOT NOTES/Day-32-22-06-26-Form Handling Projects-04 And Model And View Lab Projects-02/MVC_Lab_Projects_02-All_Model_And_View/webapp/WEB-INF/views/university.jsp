<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>University Information</title>
<style>
table {
	width: 60%;
	margin: auto;
	border-collapse: collapse;
}

th, td {
	border: 1px solid black;
	padding: 10px;
	text-align: center;
}
</style>
</head>

<body>

	<h2 align="center">University Information System</h2>

	<table>

		<tr>
			<th>Property</th>
			<th>Value</th>
		</tr>

		<tr>
			<td>University Name</td>
			<td>${uname}</td>
		</tr>

		<tr>
			<td>Vice Chancellor</td>
			<td>${vc}</td>
		</tr>

		<tr>
			<td>Location</td>
			<td>${location}</td>
		</tr>

		<tr>
			<td>Established Year</td>
			<td>${year}</td>
		</tr>

		<tr>
			<td>Number Of Colleges</td>
			<td>${colleges}</td>
		</tr>

	</table>

</body>
</html>
