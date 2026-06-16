<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Page</title>

<style>
body {
    font-family: Arial;
    background: #1e1e2f;
    color: white;
    text-align: center;
}

.box {
    margin-top: 120px;
    background: #2c2c3e;
    display: inline-block;
    padding: 40px;
    border-radius: 12px;
}

a {
    display: inline-block;
    margin-top: 20px;
    padding: 10px 20px;
    background: red;
    color: white;
    text-decoration: none;
    border-radius: 8px;
}
</style>

</head>

<body>

<div class="box">

    <h1>Hello Page Loaded Successfully 🚀</h1>

    <a href="${pageContext.request.contextPath}/">Back to Home</a>

</div>

</body>
</html>
