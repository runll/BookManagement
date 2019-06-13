<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
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
        输入密码
    </div>
    <div class="text2">
        请输入新密码
    </div>
    <div class="form">
        <form action="${pageContext.request.contextPath }/findpassword" method="post">

            <div class="input">
                <input  type="hidden" value="${checked.student_id}" name="student_id"  />
            </div>
            <div class="input">
                <input  type="hidden" value="${checked.username}" name="username"  />
            </div>
            <div class="input">
                <input  type="password" name="password" placeholder="password" required />
            </div>
            <div class="input">
                <input type="submit" name="submit" value="提交" />
            </div>

            <%
                out.print("Hello form!"+"${checked}");
            %>
        </form>
    </div>
</div>
</body>
</html>
