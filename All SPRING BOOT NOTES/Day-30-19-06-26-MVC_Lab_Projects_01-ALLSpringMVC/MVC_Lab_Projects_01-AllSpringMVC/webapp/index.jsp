<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Assignments Dashboard</title>

<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

body {
	min-height: 100vh;
	background: linear-gradient(-45deg, #0f172a, #1e293b, #2563eb, #06b6d4);
	background-size: 400% 400%;
	animation: gradientBG 12s ease infinite;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 40px;
}

@keyframes gradientBG {
    0% {
        background-position: 0% 50%;
    }

    50% {
        background-position: 100% 50%;
    }

    100% {
        background-position: 0% 50%;
    }
}
.container {
	width: 100%;
	max-width: 1100px;
	background: rgba(255, 255, 255, 0.1);
	backdrop-filter: blur(15px);
	border: 1px solid rgba(255, 255, 255, 0.2);
	border-radius: 25px;
	padding: 40px;
	box-shadow: 0 15px 40px rgba(0, 0, 0, 0.3);
	animation: fadeIn 1s ease;
}

@
keyframes fadeIn {from { opacity:0;
	transform: translateY(30px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}
h1 {
	text-align: center;
	color: white;
	font-size: 40px;
	margin-bottom: 10px;
	font-weight: 700;
}

.subtitle {
	text-align: center;
	color: #e2e8f0;
	margin-bottom: 35px;
	font-size: 16px;
}

.grid {
	display: grid;
	grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
	gap: 20px;
}

.card {
	text-decoration: none;
	background: rgba(255, 255, 255, 0.15);
	border-radius: 18px;
	padding: 25px;
	color: white;
	transition: all 0.4s ease;
	border: 1px solid rgba(255, 255, 255, 0.15);
	position: relative;
	overflow: hidden;
}

.card::before {
	content: "";
	position: absolute;
	top: 0;
	left: -100%;
	width: 100%;
	height: 100%;
	background: rgba(255, 255, 255, 0.15);
	transition: 0.5s;
}

.card:hover::before {
	left: 100%;
}

.card:hover {
	transform: translateY(-10px) scale(1.03);
	box-shadow: 0 15px 35px rgba(0, 0, 0, 0.35);
}

.icon {
	font-size: 38px;
	margin-bottom: 12px;
	display: block;
}

.title {
	font-size: 18px;
	font-weight: 600;
	margin-bottom: 8px;
}

.desc {
	font-size: 13px;
	color: #e2e8f0;
	line-height: 1.5;
}

.footer {
	text-align: center;
	color: white;
	margin-top: 30px;
	font-size: 14px;
	opacity: 0.9;
}
</style>

</head>
<body>

	<div class="container">

		<h1>🚀 Spring MVC Assignments</h1>
		<p class="subtitle">Professional Dashboard for Spring MVC Lab
			Programs</p>

		<div class="grid">

			<a href="hello" class="card">
				<div class="icon">👋</div>
				<div class="title">Assignment 1</div>
				<div class="desc">Hello Spring MVC Framework</div>
			</a> <a href="college" class="card">
				<div class="icon">🏫</div>
				<div class="title">Assignment 2</div>
				<div class="desc">College Information Display</div>
			</a> <a href="student" class="card">
				<div class="icon">🎓</div>
				<div class="title">Assignment 3</div>
				<div class="desc">Student Details Display</div>
			</a> <a href="employee" class="card">
				<div class="icon">👨‍💼</div>
				<div class="title">Assignment 4</div>
				<div class="desc">Employee Information</div>
			</a> <a href="product" class="card">
				<div class="icon">🛒</div>
				<div class="title">Assignment 5</div>
				<div class="desc">Product Details Display</div>
			</a> <a href="book" class="card">
				<div class="icon">📚</div>
				<div class="title">Assignment 6</div>
				<div class="desc">Book Information Display</div>
			</a> <a href="bank" class="card">
				<div class="icon">🏦</div>
				<div class="title">Assignment 7</div>
				<div class="desc">Bank Account Details</div>
			</a> <a href="hospital" class="card">
				<div class="icon">🏥</div>
				<div class="title">Assignment 8</div>
				<div class="desc">Hospital Information</div>
			</a> <a href="mobile" class="card">
				<div class="icon">📱</div>
				<div class="title">Assignment 9</div>
				<div class="desc">Mobile Details Display</div>
			</a> <a href="company" class="card">
				<div class="icon">🏢</div>
				<div class="title">Assignment 10</div>
				<div class="desc">Company Information Display</div>
			</a>

		</div>

		<div class="footer">✨ Developed using Spring MVC | JSP | EL |
			Model | Controller ✨</div>

	</div>

</body>
</html>
