<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>College Admission Form</title>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
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
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 30px;
	background: linear-gradient(-45deg, #0f2027, #203a43, #2c5364, #4e54c8);
	background-size: 400% 400%;
	animation: gradientMove 12s ease infinite;
}

@
keyframes gradientMove { 0%{
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
.container {
	width: 750px;
	background: rgba(255, 255, 255, 0.12);
	backdrop-filter: blur(15px);
	border: 1px solid rgba(255, 255, 255, 0.2);
	border-radius: 25px;
	padding: 40px;
	box-shadow: 0 20px 50px rgba(0, 0, 0, 0.35);
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
.header {
	text-align: center;
	margin-bottom: 30px;
}

.header h2 {
	color: #fff;
	font-size: 34px;
	margin-bottom: 8px;
}

.header p {
	color: #dcdcdc;
	font-size: 14px;
}

.form-grid {
	display: grid;
	grid-template-columns: 1fr 1fr;
	gap: 20px;
}

.form-group {
	display: flex;
	flex-direction: column;
}

label {
	color: #fff;
	font-weight: 500;
	margin-bottom: 8px;
}

input {
	padding: 14px 16px;
	border: none;
	border-radius: 12px;
	background: rgba(255, 255, 255, 0.18);
	color: white;
	font-size: 15px;
	transition: 0.3s;
}

input::placeholder {
	color: #e0e0e0;
}

input:focus {
	outline: none;
	background: rgba(255, 255, 255, 0.28);
	box-shadow: 0 0 15px rgba(255, 255, 255, 0.3);
}

.submit-btn {
	width: 100%;
	margin-top: 25px;
	padding: 15px;
	border: none;
	border-radius: 50px;
	background: linear-gradient(135deg, #00c6ff, #0072ff);
	color: white;
	font-size: 17px;
	font-weight: 600;
	cursor: pointer;
}

.submit-btn:hover {
	transform: translateY(-3px);
	box-shadow: 0 10px 25px rgba(0, 114, 255, 0.5);
}

.home-btn {
	display: block;
	width: 220px;
	margin: 20px auto 0;
	text-align: center;
	text-decoration: none;
	color: white;
	padding: 12px;
	border-radius: 50px;
	border: 1px solid rgba(255, 255, 255, 0.3);
}

.home-btn:hover {
	background: rgba(255, 255, 255, 0.15);
}

.footer {
	text-align: center;
	margin-top: 20px;
	color: #dcdcdc;
	font-size: 13px;
}

.bonus{
    text-align:center;
    margin-top:25px;
}

.bonus a{
    display:inline-block;
    padding:14px 35px;
    text-decoration:none;
    font-size:16px;
    font-weight:600;
    color:#fff;
    border-radius:50px;
    background:linear-gradient(135deg,#ff9966,#ff5e62);
    box-shadow:0 10px 25px rgba(255,94,98,0.4);
    transition:all 0.35s ease;
    position:relative;
    overflow:hidden;
}

.bonus a::before{
    content:'';
    position:absolute;
    top:0;
    left:-100%;
    width:100%;
    height:100%;
    background:rgba(255,255,255,0.25);
    transition:0.5s;
}

.bonus a:hover::before{
    left:100%;
}

.bonus a:hover{
    transform:translateY(-4px) scale(1.03);
    box-shadow:0 15px 35px rgba(255,94,98,0.6);
}

.bonus a:active{
    transform:scale(0.98);
}

@media ( max-width :768px) {
	.container {
		width: 100%;
		padding: 25px;
	}
	.form-grid {
		grid-template-columns: 1fr;
	}
	.header h2 {
		font-size: 28px;
	}
}
</style>

<script>
function validateForm(){

    let mobile = document.getElementById("mobile").value.trim();
    let email = document.getElementById("email").value.trim();

    let mobilePattern = /^[0-9]{10}$/;
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if(!mobilePattern.test(mobile)){
        alert("Please enter a valid 10-digit mobile number");
        return false;
    }

    if(!emailPattern.test(email)){
        alert("Please enter a valid email address");
        return false;
    }

    return true;
}
</script>

</head>
<body>

	<div class="container">

		<div class="header">
			<h2>🎓 College Admission Form</h2>
			<p>Fill in your details to apply for admission</p>
		</div>

		<form action="confirmAdmission" method="post"
			onsubmit="return validateForm()">

			<div class="form-grid">

				<div class="form-group">
					<label>Student Name</label> <input type="text" name="studentName"
						placeholder="Enter Student Name" required>
				</div>

				<div class="form-group">
					<label>Father Name</label> <input type="text" name="fatherName"
						placeholder="Enter Father Name" required>
				</div>

				<div class="form-group">
					<label>Email Address</label> <input type="email" id="email"
						name="email" placeholder="example@gmail.com" required>
				</div>

				<div class="form-group">
					<label>Mobile Number</label> <input type="text" id="mobile"
						name="mobileNumber" placeholder="Enter 10 Digit Number" required>
				</div>

				<div class="form-group">
					<label>Course</label> <input type="text" name="course"
						placeholder="B.Tech / MBA / MCA" required>
				</div>

				<div class="form-group">
					<label>City</label> <input type="text" name="city"
						placeholder="Enter City" required>
				</div>

			</div>

			<button type="submit" class="submit-btn">Submit Admission
				Form</button>

		</form>

		<a href="${pageContext.request.contextPath}/" class="home-btn"> 🏠
			Back To Home </a>

		<div class="bonus">
			<a href="search">🔍 Student Search</a>
		</div>

		<div class="footer">© 2026 College Admission Portal | Designed
			by Subham</div>

	</div>

</body>
</html>
