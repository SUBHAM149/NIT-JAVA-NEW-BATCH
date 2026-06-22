<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<title>Spring MVC Assignments</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Poppins", sans-serif;
}

body {
	min-height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(-45deg, #4b134f, #c94b4b, #2c3e50, #4b134f);
	background-size: 400% 400%;
	animation: gradientBG 12s ease infinite;
	padding: 20px;
}

.container {
	width: 100%;
	max-width: 550px;
	padding: 30px;
	border-radius: 25px;
	background: rgba(255, 255, 255, 0.12);
	backdrop-filter: blur(15px);
	-webkit-backdrop-filter: blur(15px);
	border: 1px solid rgba(255, 255, 255, 0.2);
	box-shadow: 0 15px 40px rgba(0, 0, 0, 0.35);
	animation: floatCard 4s ease-in-out infinite;
}

h1 {
	text-align: center;
	color: white;
	font-size: 28px;
	margin-bottom: 25px;
	text-shadow: 0 0 15px rgba(255,255,255,0.5);
	animation: fadeDown 1s ease;
}

a {
	display: block;
	text-decoration: none;
	color: white;
	font-size: 16px;
	font-weight: 600;
	padding: 14px;
	margin: 10px 0;
	border-radius: 12px;
	background: linear-gradient(135deg, #00c6ff, #0072ff);
	box-shadow: 0 5px 15px rgba(0,114,255,0.4);
	position: relative;
	overflow: hidden;
	transition: all 0.4s ease;
	animation: slideUp 0.8s ease;
}

a::before {
	content: "";
	position: absolute;
	top: 0;
	left: -120%;
	width: 100%;
	height: 100%;
	background: rgba(255,255,255,0.25);
	transform: skewX(-25deg);
	transition: 0.6s;
}

a:hover::before {
	left: 120%;
}

a:hover {
	transform: translateY(-4px) scale(1.03);
	box-shadow: 0 10px 25px rgba(0,114,255,0.6);
}

@keyframes gradientBG {
	0% { background-position: 0% 50%; }
	50% { background-position: 100% 50%; }
	100% { background-position: 0% 50%; }
}

@keyframes floatCard {
	0%,100% {
		transform: translateY(0px);
	}
	50% {
		transform: translateY(-8px);
	}
}

@keyframes fadeDown {
	from {
		opacity: 0;
		transform: translateY(-30px);
	}
	to {
		opacity: 1;
		transform: translateY(0);
	}
}

@keyframes slideUp {
	from {
		opacity: 0;
		transform: translateY(20px);
	}
	to {
		opacity: 1;
		transform: translateY(0);
	}
}

@media (max-width: 600px) {
	.container {
		max-width: 95%;
		padding: 20px;
	}

	h1 {
		font-size: 22px;
	}

	a {
		font-size: 14px;
		padding: 12px;
	}
}
</style>
</head>

<body>

	<div class="container">

<h1>Spring MVC ModelAndView Assignments</h1>

<a href="employee">Employee Information</a>
<a href="student">Student Profile</a>
<a href="course">Course Details</a>
<a href="library">Library Management</a>
<a href="hospital">Hospital Information</a>
<a href="movie">Movie Details</a>
<a href="product">Product Catalog</a>
<a href="college">College Information</a>
<a href="team">Cricket Team Information</a>
<a href="travel">Travel Information</a>
<a href="university">University Information System</a>

</div>

</body>
</html>
