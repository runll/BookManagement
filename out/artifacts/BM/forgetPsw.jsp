<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>找回密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/forgetPsw.css"/>

  </head>
  
 <body>
	<div class="box">
		<div class="text1">
			找回密码
		</div>
		<div class="text2">
			这个页面即将被废弃，除非/forgetPsw下的user可以保留到/findpassword
		</div>
		<div class="form">
			<form action="${pageContext.request.contextPath }/findpassword.jsp" method="post">
				<div class="input">
					<input  type="student_id" name="student_id" placeholder="student_id" required />
				</div>
				<div class="input">
					<input  type="username" name="username" placeholder="username" required />
				</div>
				<div class="input">
					<input type="submit" name="submit" value="提交" />
				</div>
			</form>
		</div>
	</div>
</body>
</html>
