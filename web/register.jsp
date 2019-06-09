<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/register.css"/>
<script src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js" type="text/javascript" charset="UTF-8"></script>
<script src="${pageContext.request.contextPath }/static/js/login_register.js" type="text/javascript" charset="utf-8"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/login.css"/>
	<script src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js" type="text/javascript" charset="UTF-8"></script>
	<script src="${pageContext.request.contextPath }/static/js/login_register.js" type="text/javascript" charset="utf-8"></script>
	<link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/static/css/bootstrap-theme.css"rel="stylesheet">
	<link href="${pageContext.request.contextPath}/static/js/bootstrap.js"rel="stylesheet">
	<link href="${pageContext.request.contextPath}/static/js/jquery-3.3.1.js"rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="banner">
			<div class="bg bg1 "></div>
			<div class="bg bg2"></div>
		</div>
		<div class="container">
			<div class="topic">
				注册
			</div>
			<div class="error">
				${error}
			</div>
			<form action="${pageContext.request.contextPath }/register" method="post">
				<div class="form">
					<div class="input">
						<%--@declare id=""--%><label for="">用户名</label>
						<input type="text" id="user" placeholder="username" name="username" required />
					</div>
					<div class="input">
						<label for="">密码</label>
						<input type="password" name="password" placeholder="password" required />
					</div>

					<div class="input">
						<label for="">学号</label>
						<input type="student_id" name="student_id" placeholder="student_id" required />
					</div>
					<div class="input">
						<input type="submit" name="submit" value="注册" />
					</div>
					<div class="bottom">
						<ul>
							<li>已注册，点此 &nbsp;<a href="${pageContext.request.contextPath }/login.jsp">登录</a></li>
						</ul>
					</div>
				</div>
			</form>				
		</div>
	</div>
</body>
</html>