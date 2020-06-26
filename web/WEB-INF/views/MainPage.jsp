<%-- 
    Document   : MainPage
    Created on : 17 Jun, 2020, 12:09:26 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="template.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="logindata" class = "com.Covid19.Models.LoginModel"/>
    </head>
    <body>
        <h1>login sucesssful</h1>
        <h2>${msg}</h2>
        <h2>
        <jsp:getProperty name = "logindata" property="username"/>
        </h2>
        
    </body>
</html>
