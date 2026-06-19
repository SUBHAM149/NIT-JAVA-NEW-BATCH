<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Company Information</title>

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
	background:linear-gradient(135deg,#0f172a,#1e293b,#334155);
}

.company-card{
	width:550px;
	background:white;
	border-radius:25px;
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
	background:linear-gradient(135deg,#2563eb,#1d4ed8);
	color:white;
	text-align:center;
	padding:35px;
}

.company-icon{
	font-size:80px;
	animation:float 3s ease-in-out infinite;
}

@keyframes float{
	0%,100%{
		transform:translateY(0);
	}
	50%{
		transform:translateY(-12px);
	}
}

.header h2{
	margin-top:10px;
	font-size:32px;
}

.header p{
	margin-top:5px;
	opacity:0.9;
}

.content{
	padding:30px;
}

.info{
	display:flex;
	justify-content:space-between;
	align-items:center;
	padding:18px;
	margin-bottom:15px;
	background:#f8fafc;
	border-radius:12px;
	border-left:5px solid #2563eb;
	transition:0.3s;
}

.info:hover{
	transform:translateX(10px);
	background:#eff6ff;
}

.label{
	font-weight:bold;
	color:#1f2937;
}

.value{
	color:#2563eb;
	font-weight:600;
}

.employee-count{
	color:#16a34a;
	font-size:20px;
	font-weight:bold;
}

.footer{
	text-align:center;
	padding:20px;
	background:#f1f5f9;
}

.btn{
	text-decoration:none;
	background:#2563eb;
	color:white;
	padding:12px 25px;
	border-radius:8px;
	font-weight:bold;
	transition:0.3s;
}

.btn:hover{
	background:#1d4ed8;
	transform:translateY(-3px);
}
</style>

</head>
<body>

<div class="company-card">

	<div class="header">
		<div class="company-icon">🏢</div>
		<h2>Company Information</h2>
		<p>Corporate Management Dashboard</p>
	</div>

	<div class="content">

		<div class="info">
			<span class="label">Company Name</span>
			<span class="value">${companyName}</span>
		</div>

		<div class="info">
			<span class="label">Location</span>
			<span class="value">${location}</span>
		</div>

		<div class="info">
			<span class="label">Employees</span>
			<span class="employee-count">${employees}</span>
		</div>

	</div>

	<div class="footer">
		<a href="index.jsp" class="btn">Back to Dashboard</a>
	</div>

</div>

</body>
</html>
