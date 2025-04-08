<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<header class="header">
			<h1 class="logo">
				<a href=""><img src="/New Dynamic Tutorial/src/main/webapp/resources/images/system/logo.png" /></a>
			</h1>
			<ul class="main-nav">
				<li><a href="${pageContext.request.contextPath}/pages/home.jsp">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Portfolio</a></li>
				<li><a href="#">Contact</a></li>
				<li><a href="${pageContext.request.contextPath}/pages/login.jsp">Login</a></li>
			</ul>
		</header>
	</div>

</body>
</html>