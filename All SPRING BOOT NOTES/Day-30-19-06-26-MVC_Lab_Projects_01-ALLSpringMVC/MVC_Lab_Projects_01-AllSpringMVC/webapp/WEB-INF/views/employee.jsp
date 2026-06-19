<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Information</title>

<style>
*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	font-family:'Segoe UI',sans-serif;
}

body{
	height:100vh;
	display:flex;
	justify-content:center;
	align-items:center;
	background:linear-gradient(135deg,#141e30,#243b55);
}

.employee-card{
	width:500px;
	background:white;
	border-radius:20px;
	overflow:hidden;
	box-shadow:0 15px 40px rgba(0,0,0,0.3);
	animation:slideIn 1s ease;
}

@keyframes slideIn{
	from{
		opacity:0;
		transform:translateY(50px);
	}
	to{
		opacity:1;
		transform:translateY(0);
	}
}

.header{
	background:#1e3a8a;
	color:white;
	text-align:center;
	padding:30px;
}

.avatar{
	width:100px;
	height:100px;
	background:white;
	color:#1e3a8a;
	border-radius:50%;
	margin:0 auto 15px;
	display:flex;
	align-items:center;
	justify-content:center;
	font-size:40px;
	font-weight:bold;
	box-shadow:0 5px 15px rgba(0,0,0,0.2);
}

.header h2{
	font-size:28px;
}

.content{
	padding:30px;
}

.info{
	display:flex;
	justify-content:space-between;
	padding:15px;
	margin-bottom:15px;
	background:#f4f6f9;
	border-radius:10px;
	transition:0.3s;
}

.info:hover{
	transform:translateX(8px);
	background:#e8f0ff;
}

.label{
	font-weight:bold;
	color:#333;
}

.value{
	color:#1e3a8a;
	font-weight:600;
}

.salary{
	color:#16a34a;
	font-size:18px;
	font-weight:bold;
}

.footer{
	text-align:center;
	padding:20px;
	background:#f8fafc;
}

.btn{
	text-decoration:none;
	background:#1e3a8a;
	color:white;
	padding:12px 25px;
	border-radius:8px;
	font-weight:bold;
	transition:0.3s;
}

.btn:hover{
	background:#2563eb;
}
</style>

</head>
<body>

<div class="employee-card">

	<div class="header">
		<div class="avatar">
			${name.charAt(0)}
		</div>

		<h2>Employee Profile</h2>
	</div>

	<div class="content">

		<div class="info">
			<span class="label">Employee ID</span>
			<span class="value">${id}</span>
		</div>

		<div class="info">
			<span class="label">Employee Name</span>
			<span class="value">${name}</span>
		</div>

		<div class="info">
			<span class="label">Salary</span>
			<span class="salary">₹ ${salary}</span>
		</div>

	</div>

	<div class="footer">
		<a href="index.jsp" class="btn">Back to Dashboard</a>
	</div>

</div>

</body>
</html>
