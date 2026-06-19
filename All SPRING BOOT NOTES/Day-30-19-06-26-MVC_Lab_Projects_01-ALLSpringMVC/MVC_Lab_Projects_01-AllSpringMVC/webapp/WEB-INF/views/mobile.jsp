<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mobile Details</title>

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
	background:linear-gradient(135deg,#0f2027,#203a43,#2c5364);
}

.mobile-card{
	width:500px;
	background:white;
	border-radius:25px;
	overflow:hidden;
	box-shadow:0 15px 40px rgba(0,0,0,0.3);
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

.header{
	background:linear-gradient(135deg,#00c6ff,#0072ff);
	padding:30px;
	text-align:center;
	color:white;
}

.mobile-icon{
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
	font-size:30px;
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
	border-radius:12px;
	transition:0.3s;
}

.info:hover{
	transform:scale(1.03);
	background:#e0f2fe;
}

.label{
	font-weight:bold;
	color:#333;
}

.value{
	color:#0072ff;
	font-weight:600;
}

.price{
	color:#16a34a;
	font-size:22px;
	font-weight:bold;
}

.footer{
	text-align:center;
	padding:20px;
	background:#f8fafc;
}

.btn{
	text-decoration:none;
	background:#0072ff;
	color:white;
	padding:12px 25px;
	border-radius:8px;
	font-weight:bold;
	transition:0.3s;
}

.btn:hover{
	background:#0056d6;
	transform:translateY(-3px);
}
</style>

</head>
<body>

<div class="mobile-card">

	<div class="header">
		<div class="mobile-icon">📱</div>
		<h2>Mobile Details</h2>
	</div>

	<div class="content">

		<div class="info">
			<span class="label">Mobile Name</span>
			<span class="value">${mobileName}</span>
		</div>

		<div class="info">
			<span class="label">RAM</span>
			<span class="value">${ram}</span>
		</div>

		<div class="info">
			<span class="label">Price</span>
			<span class="price">₹ ${price}</span>
		</div>

	</div>

	<div class="footer">
		<a href="index.jsp" class="btn">Back to Dashboard</a>
	</div>

</div>

</body>
</html>
