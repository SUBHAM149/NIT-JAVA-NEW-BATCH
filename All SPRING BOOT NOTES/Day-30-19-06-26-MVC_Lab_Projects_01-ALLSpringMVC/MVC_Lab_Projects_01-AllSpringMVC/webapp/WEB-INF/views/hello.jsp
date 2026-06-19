<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Spring MVC</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Segoe UI', sans-serif;
}

body {
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(-45deg, #0f172a, #2563eb, #06b6d4, #38bdf8);
	background-size: 400% 400%;
	animation: gradientBG 10s ease infinite;
}

@
keyframes gradientBG { 0%{
	background-position: 0% 50%;
}

50
%
{
background-position
:
100%
50%;
}
100
%
{
background-position
:
0%
50%;
}
}
.card {
	width: 650px;
	padding: 50px;
	text-align: center;
	background: rgba(255, 255, 255, 0.12);
	backdrop-filter: blur(15px);
	border-radius: 25px;
	border: 1px solid rgba(255, 255, 255, 0.2);
	box-shadow: 0 15px 35px rgba(0, 0, 0, 0.3);
	animation: slideUp 1s ease;
	color: white;
}

@
keyframes slideUp {from { opacity:0;
	transform: translateY(50px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}
.logo {
	font-size: 80px;
	margin-bottom: 20px;
	animation: float 3s ease-in-out infinite;
}

@
keyframes float { 0%,100%{
	transform: translateY(0);
}

50
%
{
transform
:
translateY(
-12px
);
}
}
h1 {
	font-size: 38px;
	margin-bottom: 15px;
}

p {
	font-size: 18px;
	opacity: 0.9;
	margin-bottom: 25px;
}

.btn {
	display: inline-block;
	padding: 12px 25px;
	background: white;
	color: #2563eb;
	text-decoration: none;
	border-radius: 10px;
	font-weight: bold;
	transition: 0.4s;
}

.btn:hover {
	transform: translateY(-3px);
	box-shadow: 0 8px 20px rgba(255, 255, 255, 0.3);
}
</style>

</head>
<body>

	<div class="card">

		<div class="logo">🚀</div>

		<h1>Welcome to Spring MVC Framework</h1>

		<p>Spring MVC is a powerful Java Framework used to build web
			applications using the MVC (Model-View-Controller) architecture.</p>

		<a href="index.jsp" class="btn">Go to Dashboard</a>

	</div>

</body>
</html>
