<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Search</title>

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
    background:linear-gradient(-45deg,#0f2027,#203a43,#2c5364,#4e54c8);
    background-size:400% 400%;
    animation:gradientMove 12s ease infinite;
}

@keyframes gradientMove{
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

.container{
    width:500px;
    background:rgba(255,255,255,0.12);
    backdrop-filter:blur(15px);
    border:1px solid rgba(255,255,255,0.2);
    border-radius:25px;
    padding:40px;
    box-shadow:0 20px 50px rgba(0,0,0,0.35);
    animation:fadeIn 1s ease;
}

@keyframes fadeIn{
    from{
        opacity:0;
        transform:translateY(30px);
    }
    to{
        opacity:1;
        transform:translateY(0);
    }
}

h2{
    text-align:center;
    color:white;
    margin-bottom:25px;
    font-size:32px;
}

.form-group{
    margin-bottom:20px;
}

label{
    display:block;
    color:white;
    margin-bottom:8px;
    font-weight:500;
}

input[type="text"]{
    width:100%;
    padding:14px;
    border:none;
    border-radius:12px;
    background:rgba(255,255,255,0.18);
    color:white;
    font-size:15px;
}

input[type="text"]::placeholder{
    color:#e0e0e0;
}

input[type="text"]:focus{
    outline:none;
    background:rgba(255,255,255,0.28);
    box-shadow:0 0 15px rgba(255,255,255,0.3);
}

.search-btn{
    width:100%;
    padding:15px;
    border:none;
    border-radius:50px;
    background:linear-gradient(135deg,#00c6ff,#0072ff);
    color:white;
    font-size:17px;
    font-weight:600;
    cursor:pointer;
    transition:0.3s;
}

.search-btn:hover{
    transform:translateY(-3px);
    box-shadow:0 10px 25px rgba(0,114,255,0.5);
}

.home-btn{
    display:block;
    text-align:center;
    margin-top:20px;
    padding:12px;
    text-decoration:none;
    color:white;
    border-radius:50px;
    border:1px solid rgba(255,255,255,0.3);
    transition:0.3s;
}

.home-btn:hover{
    background:rgba(255,255,255,0.15);
}

.footer{
    text-align:center;
    margin-top:20px;
    color:#dcdcdc;
    font-size:13px;
}

</style>

</head>
<body>

<div class="container">

    <h2>🔍 Student Search</h2>

    <form action="searchStudent" method="get">

        <div class="form-group">
            <label>Admission Number</label>
            <input type="text"
                   name="admissionNo"
                   placeholder="Enter Admission Number">
        </div>

        <div class="form-group">
            <label>Student Name</label>
            <input type="text"
                   name="studentName"
                   placeholder="Enter Student Name">
        </div>

        <input type="submit"
               value="Search Student"
               class="search-btn">

    </form>

    <a href="${pageContext.request.contextPath}/" class="home-btn">
        🏠 Back To Home
    </a>

    <div class="footer">
        © 2026 Student Search Portal | Designed by Subham
    </div>

</div>

</body>
</html>
