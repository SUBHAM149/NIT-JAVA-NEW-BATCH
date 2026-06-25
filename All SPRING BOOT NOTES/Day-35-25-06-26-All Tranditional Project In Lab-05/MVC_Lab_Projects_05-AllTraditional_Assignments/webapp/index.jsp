<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Assignment</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body{
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(-45deg,#0f172a,#1e3a8a,#2563eb,#0ea5e9);
    background-size:400% 400%;
    animation:bgAnimation 12s ease infinite;
}

@keyframes bgAnimation{
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

.container{
    width:450px;
    padding:40px;
    border-radius:25px;
    background:rgba(255,255,255,0.12);
    backdrop-filter:blur(15px);
    box-shadow:0 8px 32px rgba(0,0,0,0.3);
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

h1{
    color:white;
    margin-bottom:30px;
    font-size:34px;
    text-shadow:2px 2px 10px rgba(0,0,0,0.4);
}

.menu{
    display:flex;
    flex-direction:column;
    gap:15px;
}

.menu a{
    text-decoration:none;
    color:white;
    font-size:18px;
    font-weight:600;
    padding:15px;
    border-radius:15px;
    background:rgba(255,255,255,0.15);
    border:1px solid rgba(255,255,255,0.2);
    transition:all 0.4s ease;
}

.menu a:hover{
    transform:translateX(8px) scale(1.03);
    background:rgba(255,255,255,0.25);
    box-shadow:0 8px 20px rgba(0,0,0,0.3);
}

.footer{
    margin-top:25px;
    color:#ddd;
    font-size:14px;
}

</style>
</head>
<body>

<div class="container">

    <h1>🚀 Spring MVC Assignment</h1>

    <div class="menu">
        <a href="student">👨‍🎓 Student Registration Form</a>
        <a href="employee">💼 Employee Salary Calculator</a>
        <a href="feedback">⭐ Customer Feedback Form</a>
        <a href="product">🛒 Product Discount Calculator</a>
        <a href="admission">🏫 College Admission Form</a>
    </div>

    <div class="footer">
        Designed with ❤️ using Spring MVC
    </div>

</div>

</body>
</html>
