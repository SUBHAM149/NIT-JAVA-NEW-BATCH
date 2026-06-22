<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Form Handling</title>

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

.container{
    text-align:center;
    background:rgba(255,255,255,0.12);
    backdrop-filter:blur(12px);
    padding:50px;
    border-radius:20px;
    box-shadow:0 8px 30px rgba(0,0,0,0.25);
    animation:fadeIn 1.5s ease;
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
    font-size:40px;
    margin-bottom:20px;
    animation:glow 2s infinite alternate;
}

@keyframes glow{
    from{
        text-shadow:0 0 10px #fff;
    }
    to{
        text-shadow:0 0 25px #fff,0 0 40px #00e5ff;
    }
}

p{
    color:#f1f1f1;
    margin-bottom:30px;
    font-size:18px;
}

.btn{
    display:inline-block;
    text-decoration:none;
    padding:15px 35px;
    font-size:18px;
    font-weight:bold;
    color:white;
    border-radius:50px;
    background:linear-gradient(135deg,#00c6ff,#0072ff);
    transition:all 0.4s ease;
    box-shadow:0 5px 20px rgba(0,0,0,0.3);
}

.btn:hover{
    transform:translateY(-5px) scale(1.05);
    box-shadow:0 10px 30px rgba(0,0,0,0.4);
}

.icon{
    font-size:70px;
    margin-bottom:20px;
    animation:float 3s ease-in-out infinite;
}

@keyframes float{
    0%,100%{
        transform:translateY(0);
    }
    50%{
        transform:translateY(-15px);
    }
}
</style>

</head>
<body>

<div class="container">

    <div class="icon">🚀</div>

    <h1>Spring MVC Form Handling</h1>

    <p>Create and Submit User Details Easily</p>

    <a href="form" class="btn">
        Open User Form
    </a>

</div>

</body>
</html>
