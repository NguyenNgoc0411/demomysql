<%-- 
    Document   : add
    Created on : Oct 18, 2023, 11:09:07 AM
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
        <script>
                function doDelete(usname)
                {
                    if(confirm("Xác nhận xóa "+usname))
                    {
                        window.location="delete?username="+usname;
                    }
                }
        </script>
    </head>
    <body>
        <h1>Xin chào quản trị viên</h1>
        <h1> Danh sách người dùng</h1>
        
        <table border="1px" width="40%">
            <tr>
                <th>username</th>
                <th>action</th>
            </tr>
            <c:forEach items="${requestScope.userlist}" var="u">
                <c:set var="usname" value="${u.username}"/>
                <tr>
                    <td>${usname}</td>
                    <td>
                        <a href="#" onclick="doDelete('${usname}')">Delete</a>
                    </td>
                </tr>
                      
                       
                      
                    
                 </c:forEach>
            
        </table>
        
    </body>
</html>
