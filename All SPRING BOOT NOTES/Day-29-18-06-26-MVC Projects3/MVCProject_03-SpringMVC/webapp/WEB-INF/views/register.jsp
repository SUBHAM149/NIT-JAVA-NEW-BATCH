<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<style>
body {
	font-family: Arial, sans-serif;
	background: #f4f4f4;
}

.container {
	width: 400px;
	margin: 50px auto;
	background: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px gray;
}

h2 {
	text-align: center;
	color: #333;
}

input {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	border: 1px solid #ccc;
	border-radius: 5px;
}

button {
	width: 100%;
	padding: 10px;
	background: #28a745;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background: #218838;
}
</style>

</head>
<body>

	<div class="container">
		<h2>User Registration</h2>

		<form action="saveUser" method="post">

			<input type="text" name="name" placeholder="Enter Name" required>

			<input type="email" name="email" placeholder="Enter Email" required>

			<input type="text" name="mobile" placeholder="Enter Mobile Number"
				required> <input type="password" name="password"
				placeholder="Enter Password" required>

			<button type="submit">Register</button>

		</form>
	</div>

</body>
</html>
