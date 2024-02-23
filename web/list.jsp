<%-- 
    Document   : list
    Created on : Oct 17, 2023, 9:41:26 PM
    Author     : 2021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="model.Student" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="users" value="${sessionScope.account}"/>
        <c:if test="users!=null">
                
                <h1>Xin chào người dùng ${users.username}</h1>
         </c:if>
        
        
        
    </body>
</html>
