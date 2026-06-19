<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hospital Information</title>

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

.hospital-card{
	width:550px;
	background:white;
	border-radius:25px;
	overflow:hidden;
	box-shadow:0 15px 40px rgba(0,0,0,0.25);
	animation:fadeIn 1s ease;
}

@keyframes fadeIn{
	from{
		opacity:0;
		transform:scale(0.8);
	}
	to{
		opacity:1;
		transform:scale(1);
	}
}

.header{
	background:linear-gradient(135deg,#10b981,#059669);
	color:white;
	text-align:center;
	padding:30px;
}

.hospital-icon{
	font-size:75px;
	animation:pulse 2s infinite;
}

@keyframes pulse{
	0%{
		transform:scale(1);
	}
	50%{
		transform:scale(1.1);
	}
	100%{
		transform:scale(1);
	}
}

.header h2{
	margin-top:10px;
	font-size:30px;
}

.header p{
	opacity:0.9;
	margin-top:5px;
}

.content{
	padding:30px;
}

.info{
	display:flex;
	justify-content:space-between;
	align-items:center;
	background:#f0fdf4;
	padding:18px;
	margin-bottom:15px;
	border-radius:12px;
	border-left:5px solid #10b981;
	transition:0.3s;
}

.info:hover{
	transform:translateX(8px);
	background:#dcfce7;
}

.label{
	font-weight:bold;
	color:#1f2937;
}

.value{
	color:#059669;
	font-weight:600;
}

.footer{
	text-align:center;
	padding:20px;
	background:#f8fafc;
}

.btn{
	text-decoration:none;
	background:#10b981;
	color:white;
	padding:12px 25px;
	border-radius:8px;
	font-weight:bold;
	transition:0.3s;
}

.btn:hover{
	background:#059669;
	transform:translateY(-3px);
}
</style>

</head>
<body>

<div class="hospital-card">

	<div class="header">
		<div class="hospital-icon">🏥</div>
		<h2>Hospital Information</h2>
		<p>Healthcare Management System</p>
	</div>

	<div class="content">

		<div class="info">
			<span class="label">Hospital Name</span>
			<span class="value">${hospital}</span>
		</div>

		<div class="info">
			<span class="label">Doctor Name</span>
			<span class="value">${doctor}</span>
		</div>

		<div class="info">
			<span class="label">Department</span>
			<span class="value">${department}</span>
		</div>

	</div>

	<div class="footer">
		<a href="index.jsp" class="btn">Back to Dashboard</a>
	</div>

</div>

</body>
</html>
