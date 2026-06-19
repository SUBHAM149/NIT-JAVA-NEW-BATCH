<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>

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
	background:linear-gradient(135deg,#ff9a9e,#fad0c4,#fbc2eb);
}

.product-card{
	width:450px;
	background:white;
	border-radius:25px;
	overflow:hidden;
	box-shadow:0 15px 40px rgba(0,0,0,0.25);
	animation:zoomIn 1s ease;
}

@keyframes zoomIn{
	from{
		transform:scale(0.8);
		opacity:0;
	}
	to{
		transform:scale(1);
		opacity:1;
	}
}

.product-header{
	background:linear-gradient(135deg,#ff6b6b,#ff8e53);
	padding:30px;
	text-align:center;
	color:white;
}

.product-icon{
	font-size:70px;
	animation:float 3s ease-in-out infinite;
}

@keyframes float{
	0%,100%{
		transform:translateY(0);
	}
	50%{
		transform:translateY(-12px);
	}
}

.product-header h2{
	margin-top:10px;
	font-size:30px;
}

.product-body{
	padding:30px;
}

.info{
	background:#f8f9fa;
	padding:15px;
	margin-bottom:15px;
	border-radius:12px;
	display:flex;
	justify-content:space-between;
	transition:0.3s;
}

.info:hover{
	transform:translateX(8px);
	background:#fff3f3;
}

.label{
	font-weight:bold;
	color:#444;
}

.value{
	font-weight:600;
	color:#ff6b6b;
}

.price{
	color:#16a34a;
	font-size:22px;
	font-weight:bold;
}

.footer{
	text-align:center;
	padding:20px;
	background:#f1f5f9;
}

.btn{
	text-decoration:none;
	background:#ff6b6b;
	color:white;
	padding:12px 25px;
	border-radius:8px;
	font-weight:bold;
	transition:0.3s;
}

.btn:hover{
	background:#e63946;
}
</style>

</head>
<body>

<div class="product-card">

	<div class="product-header">
		<div class="product-icon">🛒</div>
		<h2>Product Details</h2>
	</div>

	<div class="product-body">

		<div class="info">
			<span class="label">Product ID</span>
			<span class="value">${id}</span>
		</div>

		<div class="info">
			<span class="label">Product Name</span>
			<span class="value">${name}</span>
		</div>

		<div class="info">
			<span class="label">Price</span>
			<span class="price">₹ ${price}</span>
		</div>

	</div>

	<div class="footer">
		<a href="index.jsp" class="btn">Back to Dashboard</a>
	</div>

</div>

</body>
</html>
