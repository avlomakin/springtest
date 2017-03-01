<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alom2_000
  Date: 28.02.2017
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<h2>Input login and password to access db</h2><br/>
<spring:form method="post"  modelAttribute="user" action="try-access">

    Name: <spring:input path="name"/>   <br/>
    Password: <spring:input path="password"/>   <br/>
    <spring:button>OK</spring:button>

</spring:form>
</html>
