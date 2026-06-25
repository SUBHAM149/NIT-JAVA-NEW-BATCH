<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Result</title>

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
    width:600px;
    background:rgba(255,255,255,0.12);
    backdrop-filter:blur(15px);
    border:1px solid rgba(255,255,255,0.2);
    border-radius:25px;
    padding:40px;
    box-shadow:0 20px 50px rgba(0,0,0,0.35);
    text-align:center;
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
    color:#ffffff;
    margin-bottom:30px;
    font-size:34px;
}

.result-box{
    background:rgba(255,255,255,0.12);
    padding:25px;
    border-radius:20px;
    text-align:left;
}

.result-item{
    color:white;
    font-size:18px;
    margin:15px 0;
}

.result-item span{
    color:#00e5ff;
    font-weight:600;
}

.home-btn{
    display:inline-block;
    margin-top:25px;
    padding:12px 30px;
    text-decoration:none;
    color:white;
    border-radius:50px;
    background:linear-gradient(135deg,#00c6ff,#0072ff);
    transition:0.3s;
}

.home-btn:hover{
    transform:translateY(-3px);
    box-shadow:0 10px 25px rgba(0,114,255,0.5);
}

.footer{
    margin-top:20px;
    color:#dcdcdc;
    font-size:13px;
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
</style>
</head>
<body>

<div class="container">

    <h2>🎓 Search Result</h2>

    <div class="result-box">

        <div class="result-item">
            Admission Number :
            <span>${admissionNo}</span>
        </div>

        <div class="result-item">
            Student Name :
            <span>${studentName}</span>
        </div>

    </div>

    <a href="search" class="home-btn">
        🔍 Search Again
    </a>
    <a href="${pageContext.request.contextPath}/" class="home-btn">
        🏠 Back To Home
    </a>

    <div class="footer">
        © 2026 Student Search Portal | Designed by Subham
    </div>

</div>

</body>
</html>
