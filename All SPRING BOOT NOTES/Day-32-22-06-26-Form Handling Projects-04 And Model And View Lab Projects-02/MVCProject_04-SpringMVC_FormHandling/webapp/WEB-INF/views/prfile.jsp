<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>

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
    background:linear-gradient(-45deg,#11998e,#38ef7d,#00c9ff,#92fe9d);
    background-size:400% 400%;
    animation:bgMove 10s ease infinite;
}

@keyframes bgMove{
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

.card{
    width:500px;
    text-align:center;
    padding:40px;
    border-radius:20px;
    background:rgba(255,255,255,0.15);
    backdrop-filter:blur(12px);
    box-shadow:0 8px 30px rgba(0,0,0,0.25);
    animation:fadeIn 1s ease;
}

@keyframes fadeIn{
    from{
        opacity:0;
        transform:translateY(40px);
    }
    to{
        opacity:1;
        transform:translateY(0);
    }
}

.success-icon{
    font-size:80px;
    animation:bounce 2s infinite;
}

@keyframes bounce{
    0%,100%{transform:translateY(0);}
    50%{transform:translateY(-10px);}
}

h1{
    color:white;
    margin-top:15px;
    margin-bottom:15px;
}

.username{
    color:#fff;
    font-size:28px;
    font-weight:bold;
    text-shadow:0 0 10px rgba(255,255,255,0.8);
}

.thankyou{
    margin-top:20px;
    color:white;
    font-size:22px;
}

.btn{
    display:inline-block;
    margin-top:25px;
    text-decoration:none;
    padding:12px 30px;
    border-radius:50px;
    color:white;
    font-weight:bold;
    background:linear-gradient(135deg,#667eea,#764ba2);
    transition:0.4s;
}

.btn:hover{
    transform:translateY(-4px);
    box-shadow:0 8px 20px rgba(0,0,0,0.3);
}
</style>

</head>
<body>

<div class="card">

    <div class="success-icon">✅</div>

    <h1>Welcome</h1>

    <div class="username">${msg}</div>

    <div class="thankyou">
        Thank You For Submitting The Form 🎉
    </div>

    <a href="./index.jsp" class="btn">🏠 Back</a>

</div>

</body>
</html>
