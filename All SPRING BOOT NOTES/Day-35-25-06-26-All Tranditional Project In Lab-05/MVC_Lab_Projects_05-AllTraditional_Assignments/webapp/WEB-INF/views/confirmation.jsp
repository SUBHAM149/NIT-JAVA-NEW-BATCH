<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admission Confirmation</title>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">

<style>

*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	font-family:'Poppins',sans-serif;
}

body{
	min-height:100vh;
	display:flex;
	justify-content:center;
	align-items:center;
	background:linear-gradient(135deg,#11998e,#38ef7d);
	padding:20px;
}

.container{
	width:700px;
	background:white;
	border-radius:20px;
	padding:40px;
	box-shadow:0 15px 40px rgba(0,0,0,0.2);
	animation:slideUp 0.8s ease;
}

@keyframes slideUp{
	from{
		opacity:0;
		transform:translateY(40px);
	}
	to{
		opacity:1;
		transform:translateY(0);
	}
}

.success{
	text-align:center;
	margin-bottom:30px;
}

.success h2{
	color:#28a745;
	font-size:32px;
	margin-bottom:10px;
}

.success p{
	color:#666;
}

.details{
	display:grid;
	grid-template-columns:1fr 1fr;
	gap:20px;
	margin-top:20px;
}

.card{
	background:#f8f9fa;
	padding:15px;
	border-radius:12px;
	border-left:5px solid #28a745;
}

.label{
	font-weight:600;
	color:#333;
	margin-bottom:5px;
}

.value{
	color:#555;
}

.home-btn{
	display:block;
	width:220px;
	margin:30px auto 0;
	text-align:center;
	text-decoration:none;
	padding:12px;
	border-radius:50px;
	background:#28a745;
	color:white;
	font-weight:600;
	transition:0.3s;
}

.home-btn:hover{
	background:#218838;
	transform:translateY(-2px);
}

@media(max-width:768px){

	.container{
		width:100%;
		padding:25px;
	}

	.details{
		grid-template-columns:1fr;
	}
}

</style>

</head>
<body>

<div class="container">

	<div class="success">
		<h2>✅ Admission Confirmed</h2>
		<p>Your application has been submitted successfully.</p>
	</div>

	<div class="details">

		<div class="card">
			<div class="label">Student Name</div>
			<div class="value">${ad.studentName}</div>
		</div>

		<div class="card">
			<div class="label">Father Name</div>
			<div class="value">${ad.fatherName}</div>
		</div>

		<div class="card">
			<div class="label">Email</div>
			<div class="value">${ad.email}</div>
		</div>

		<div class="card">
			<div class="label">Mobile Number</div>
			<div class="value">${ad.mobileNumber}</div>
		</div>

		<div class="card">
			<div class="label">Course</div>
			<div class="value">${ad.course}</div>
		</div>

		<div class="card">
			<div class="label">City</div>
			<div class="value">${ad.city}</div>
		</div>

	</div>

	<a href="${pageContext.request.contextPath}/" class="home-btn">
		🏠 Back To Home
	</a>

</div>

</body>
</html>
