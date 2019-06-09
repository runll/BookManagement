<%--
  Created by IntelliJ IDEA.
  User: runll
  Date: 2019-6-5
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/bootstrap-theme.css"rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/js/bootstrap.js"rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/js/jquery-3.3.1.js"rel="stylesheet">
</head>
<body background="${pageContext.request.contextPath}/static/wqw.jpg">
<div class="container">
    <div class="row">
        <form action="${pageContext.request.contextPath}/selectList" method="post" class="form-horizontal col-sm-3 col-md-3">
            <h3>Login Form</h3>
            <div class="col-md-9 col-sm-9">
                <div class="form-group">
                    <span class="glyphicon glyphicon-user"></span>
                    <input class="form-control" type="text" name="username" placeholder="username">
                </div>
                <div class="form-group">
                    <span class="glyphicon glyphicon-lock"></span>
                    <input class="form-control" type="password" name="password" placeholder="password">
                </div>
                <div class="form-group">
                    <input class="btn btn-primary btn-lg btn-block" type="submit" value="登录">
                </div>
                <div>
                    <h4>${error}</h4>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
