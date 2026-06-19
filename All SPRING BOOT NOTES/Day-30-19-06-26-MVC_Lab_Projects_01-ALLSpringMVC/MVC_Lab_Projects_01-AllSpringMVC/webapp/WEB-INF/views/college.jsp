<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>College Information</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

body {
	min-height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(135deg, #ff9966, #ff5e62);
}

.container {
	width: 700px;
	background: white;
	border-radius: 25px;
	overflow: hidden;
	box-shadow: 0 15px 40px rgba(0, 0, 0, 0.2);
	animation: zoomIn 1s ease;
}

@
keyframes zoomIn {from { transform:scale(0.8);
	opacity: 0;
}

to {
	transform: scale(1);
	opacity: 1;
}

}
.header {
	background: #1e293b;
	color: white;
	padding: 30px;
	text-align: center;
}

.header h1 {
	font-size: 32px;
	margin-bottom: 10px;
}

.header p {
	opacity: 0.8;
}

.content {
	padding: 35px;
}

.info-box {
	background: #f8fafc;
	padding: 18px;
	margin-bottom: 18px;
	border-left: 6px solid #ff5e62;
	border-radius: 10px;
	transition: 0.4s;
}

.info-box:hover {
	transform: translateX(10px);
	background: #eef2ff;
}

.label {
	font-weight: bold;
	color: #1e293b;
	font-size: 18px;
}

.value {
	float: right;
	color: #ff5e62;
	font-weight: 600;
}

.footer {
	text-align: center;
	padding: 20px;
	background: #f1f5f9;
}

.btn {
	text-decoration: none;
	background: #ff5e62;
	color: white;
	padding: 12px 25px;
	border-radius: 8px;
	font-weight: bold;
	transition: 0.3s;
}

.btn:hover {
	background: #e11d48;
}
</style>

</head>
<body>

	<div class="container">

		<div class="header">
			<h1>🏫 College Information</h1>
			<p>Student Academic Information Portal</p>
		</div>

		<div class="content">

			<div class="info-box">
				<span class="label">College Name</span> <span class="value">${collegeName}</span>
			</div>

			<div class="info-box">
				<span class="label">Location</span> <span class="value">${location}</span>
			</div>

			<div class="info-box">
				<span class="label">Course</span> <span class="value">${course}</span>
			</div>

		</div>

		<div class="footer">
			<a href="index.jsp" class="btn">Back to Dashboard</a>
		</div>

	</div>

</body>
</html>
