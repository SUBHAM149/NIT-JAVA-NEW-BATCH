<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Form</title>

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
	background:linear-gradient(-45deg,#667eea,#764ba2,#6a11cb,#2575fc);
	background-size:400% 400%;
	animation:gradientBG 10s ease infinite;
}

@keyframes gradientBG{
	0%{background-position:0% 50%;}
	50%{background-position:100% 50%;}
	100%{background-position:0% 50%;}
}

.form-container{
	width:400px;
	padding:40px;
	background:rgba(255,255,255,0.12);
	backdrop-filter:blur(12px);
	border-radius:20px;
	box-shadow:0 8px 30px rgba(0,0,0,0.25);
	animation:slideUp 1s ease;
	text-align:center;
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

h2{
	color:white;
	margin-bottom:25px;
	font-size:30px;
	text-shadow:0 0 15px rgba(255,255,255,0.8);
}

.input-group{
	margin-bottom:20px;
	text-align:left;
}

label{
	color:white;
	font-size:16px;
	font-weight:600;
	display:block;
	margin-bottom:8px;
}

input[type="text"]{
	width:100%;
	padding:14px;
	border:none;
	outline:none;
	border-radius:10px;
	font-size:16px;
	background:rgba(255,255,255,0.9);
	transition:0.3s;
}

input[type="text"]:focus{
	transform:scale(1.03);
	box-shadow:0 0 15px rgba(255,255,255,0.8);
}

.submit-btn{
	width:100%;
	padding:14px;
	border:none;
	border-radius:50px;
	font-size:18px;
	font-weight:bold;
	color:white;
	cursor:pointer;
	background:linear-gradient(135deg,#00c6ff,#0072ff);
	transition:0.4s;
}

.submit-btn:hover{
	transform:translateY(-4px);
	box-shadow:0 10px 25px rgba(0,0,0,0.3);
}

.icon{
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
</style>

</head>
<body>

	<div class="form-container">

		<div class="icon">👤</div>

		<h2>User Form</h2>

		<form action="submit" method="post">

			<div class="input-group">
				<label>Enter User Name</label>
				<input type="text" name="name"
					placeholder="Enter your name" required>
			</div>

			<input type="submit" value="Submit" class="submit-btn">

		</form>

	</div>

</body>
</html>
