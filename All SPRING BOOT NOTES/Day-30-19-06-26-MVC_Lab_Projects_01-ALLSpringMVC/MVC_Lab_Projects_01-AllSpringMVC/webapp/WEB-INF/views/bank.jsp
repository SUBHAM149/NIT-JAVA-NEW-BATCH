<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Account Details</title>

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
	background:linear-gradient(-45deg,#0f172a,#1e3a8a,#2563eb,#38bdf8);
	background-size:400% 400%;
	animation:gradientBG 10s ease infinite;
}

@keyframes gradientBG{
	0%{
		background-position:0% 50%;
	}
	50%{
		background-position:100% 50%;
	}
	100%{
		background-position:0% 50%;
	}
}

.card{
	width:450px;
	background:rgba(255,255,255,0.12);
	backdrop-filter:blur(15px);
	border:1px solid rgba(255,255,255,0.2);
	border-radius:25px;
	padding:35px;
	color:white;
	text-align:center;
	box-shadow:0 15px 35px rgba(0,0,0,0.3);
	animation:slideUp 1s ease;
}

@keyframes slideUp{
	from{
		opacity:0;
		transform:translateY(50px);
	}
	to{
		opacity:1;
		transform:translateY(0);
	}
}

.bank-icon{
	font-size:60px;
	margin-bottom:15px;
	animation:float 3s ease-in-out infinite;
}

@keyframes float{
	0%,100%{
		transform:translateY(0);
	}
	50%{
		transform:translateY(-10px);
	}
}

h2{
	margin-bottom:25px;
	font-size:30px;
}

.info{
	background:rgba(255,255,255,0.15);
	padding:15px;
	margin:12px 0;
	border-radius:12px;
	text-align:left;
	transition:0.4s;
}

.info:hover{
	transform:scale(1.05);
	background:rgba(255,255,255,0.25);
}

.label{
	font-weight:bold;
	color:#ffd700;
}

.value{
	float:right;
}

.btn{
	display:inline-block;
	margin-top:20px;
	padding:12px 25px;
	text-decoration:none;
	color:white;
	border-radius:10px;
	background:#2563eb;
	transition:0.4s;
	font-weight:bold;
}

.btn:hover{
	background:#1d4ed8;
	transform:translateY(-3px);
}
</style>

</head>
<body>

<div class="card">

	<div class="bank-icon">🏦</div>

	<h2>Bank Account Details</h2>

	<div class="info">
		<span class="label">Account Number</span>
		<span class="value">${accountNo}</span>
	</div>

	<div class="info">
		<span class="label">Account Holder</span>
		<span class="value">${holder}</span>
	</div>

	<div class="info">
		<span class="label">Balance</span>
		<span class="value">₹ ${balance}</span>
	</div>

	<a href="index.jsp" class="btn">⬅ Back to Dashboard</a>

</div>

</body>
</html>
