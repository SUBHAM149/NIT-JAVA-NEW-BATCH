<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>

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
	background:linear-gradient(135deg,#11998e,#38ef7d);
}

.profile-card{
	width:420px;
	background:white;
	border-radius:25px;
	padding:35px;
	text-align:center;
	box-shadow:0 15px 40px rgba(0,0,0,0.2);
	animation:fadeIn 1s ease;
}

@keyframes fadeIn{
	from{
		opacity:0;
		transform:translateY(50px);
	}
	to{
		opacity:1;
		transform:translateY(0);
	}
}

.avatar{
	width:100px;
	height:100px;
	margin:auto;
	border-radius:50%;
	background:#11998e;
	color:white;
	font-size:40px;
	font-weight:bold;
	display:flex;
	align-items:center;
	justify-content:center;
	margin-bottom:20px;
	box-shadow:0 5px 15px rgba(0,0,0,0.2);
}

h2{
	color:#11998e;
	margin-bottom:25px;
}

.info{
	background:#f8f9fa;
	padding:15px;
	margin:12px 0;
	border-radius:12px;
	text-align:left;
	transition:0.3s;
}

.info:hover{
	transform:scale(1.03);
	background:#e8fff7;
}

.label{
	font-weight:bold;
	color:#333;
}

.value{
	float:right;
	color:#11998e;
	font-weight:600;
}

.btn{
	display:inline-block;
	margin-top:25px;
	padding:12px 25px;
	background:#11998e;
	color:white;
	text-decoration:none;
	border-radius:8px;
	font-weight:bold;
	transition:0.3s;
}

.btn:hover{
	background:#0f8a7f;
	transform:translateY(-3px);
}
</style>

</head>
<body>

<div class="profile-card">

	<div class="avatar">
		${name.charAt(0)}
	</div>

	<h2>🎓 Student Profile</h2>

	<div class="info">
		<span class="label">Student ID</span>
		<span class="value">${id}</span>
	</div>

	<div class="info">
		<span class="label">Student Name</span>
		<span class="value">${name}</span>
	</div>

	<div class="info">
		<span class="label">Course</span>
		<span class="value">${course}</span>
	</div>

	<a href="index.jsp" class="btn">Back to Dashboard</a>

</div>

</body>
</html>
