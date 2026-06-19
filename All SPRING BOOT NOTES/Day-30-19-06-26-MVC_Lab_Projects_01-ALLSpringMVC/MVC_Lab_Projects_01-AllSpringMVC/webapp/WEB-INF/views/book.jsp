<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Information</title>

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
	background:linear-gradient(-45deg,#4c1d95,#6d28d9,#7c3aed,#a855f7);
	background-size:400% 400%;
	animation:gradientBG 10s ease infinite;
}

@keyframes gradientBG{
	0%{
		background-position:0% 50%;
	}
	50%{
		background-position:100% 50%;
	}
	100%{
		background-position:0% 50%;
	}
}

.card{
	width:500px;
	background:rgba(255,255,255,0.12);
	backdrop-filter:blur(15px);
	border:1px solid rgba(255,255,255,0.2);
	border-radius:25px;
	padding:35px;
	color:white;
	box-shadow:0 15px 35px rgba(0,0,0,0.3);
	animation:slideUp 1s ease;
}

@keyframes slideUp{
	from{
		opacity:0;
		transform:translateY(50px);
	}
	to{
		opacity:1;
		transform:translateY(0);
	}
}

.book-icon{
	text-align:center;
	font-size:70px;
	margin-bottom:15px;
	animation:float 3s ease-in-out infinite;
}

@keyframes float{
	0%,100%{
		transform:translateY(0);
	}
	50%{
		transform:translateY(-10px);
	}
}

h2{
	text-align:center;
	margin-bottom:25px;
	font-size:32px;
}

.info{
	background:rgba(255,255,255,0.15);
	padding:15px;
	margin:12px 0;
	border-radius:12px;
	transition:0.4s;
}

.info:hover{
	transform:scale(1.05);
	background:rgba(255,255,255,0.25);
}

.label{
	font-weight:bold;
	color:#ffd700;
}

.value{
	float:right;
}

.btn{
	display:block;
	width:220px;
	margin:25px auto 0;
	text-align:center;
	text-decoration:none;
	padding:12px;
	border-radius:10px;
	background:#7c3aed;
	color:white;
	font-weight:bold;
	transition:0.4s;
}

.btn:hover{
	background:#6d28d9;
	transform:translateY(-3px);
}
</style>

</head>
<body>

<div class="card">

	<div class="book-icon">📚</div>

	<h2>Book Information</h2>

	<div class="info">
		<span class="label">Book ID</span>
		<span class="value">${id}</span>
	</div>

	<div class="info">
		<span class="label">Book Name</span>
		<span class="value">${name}</span>
	</div>

	<div class="info">
		<span class="label">Author</span>
		<span class="value">${author}</span>
	</div>

	<a href="index.jsp" class="btn">⬅ Back to Dashboard</a>
	

</div>

</body>
</html>
