<%--
  Created by IntelliJ IDEA.
  User: runll
  Date: 2019-6-5
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>首页</title>
  <link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/static/css/bootstrap-theme.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/static/js/bootstrap.js" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/static/js/jquery-3.3.1.js" rel="stylesheet">
</head>
<body>
<table class="table table-hover">
  <thead>
  <tr>
    <td>全选</td>
    <td>ID</td>
    <td>USERNAME</td>
    <td>PASSWORD</td>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="users" items="${ulist}">
    <tr>
      <td><input type="checkbox"></td>
      <td>${users.id}</td>
      <td>${users.username}</td>
      <td>${users.password}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
