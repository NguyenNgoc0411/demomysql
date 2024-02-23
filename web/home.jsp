<%-- 
    Document   : home
    Created on : Oct 18, 2023, 8:22:58 AM
    Author     : 2021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="model.Student" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style/main.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <title>Document</title>
</head>
<body>
    <header>
        <div class="logo">
            <a href="" class="logo_ptit">
                <img src="image/logo-thong-bao.jpg">

            </a>
        </div>
        <div class="tim_kiem">
            <form class="tim " action="tim" method="GET">
                <div class="timkiem_goiy">
                    <div class="control">
                        <input type="text" id="search" class="nhap_tim_kiem" name="timkiem">
                    </div>
                    <div class="action">
                        <button type="submit" title="Search" class="btn_submit action search">
                            <i class="fa-solid fa-magnifying-glass"></i>
                        </button>
                    </div>
                </div>

            </form>
        </div>
        <div class="home">
            <a href="home" class="trang_chu">
                <i class="fa-solid fa-house"></i>
            </a>
            <a href="home">Trang chủ</a>

        </div>
       
       
        <div class="home nguoi_dung">
            <c:set var="users" value="${sessionScope.account}"/>
            <c:choose>
            <c:when test="${users.roleid==1}">
                
                <a href="admin" >
                <i class="fa-solid fa-user"></i>
                
            </a>
            <a href="admin">Admin Panel</a>
            </c:when>
            <c:when test="${users.roleid==2}">
                
                <a href="list.jsp" >
                <i class="fa-solid fa-user"></i>
                
            </a>
            <a href="list.jsp">Tài khoản của tôi</a>
            </c:when>
            <c:otherwise>
                 <a href="login" >
                <i class="fa-solid fa-user"></i>
                
            </a>
                    <a href="login">Tài khoản của tôi</a>
             </c:otherwise>
            </c:choose>
            
        </div>
        <div class="home dang_xuat">
            <a href="logout">
                <i class="fa-solid fa-right-from-bracket"></i>
            </a>
            <a href="logout">Đăng xuất</a>
        </div>



    </header>
    <div id="top_bar_header" class="box_shadow" >
        <div class="item">
        
        <c:set var="cat" value="${requestScope.data}"/>
         <c:set var="cid" value="${requestScope.cid}"/>
         <a class="cickMe" class="${cid==0?"active":""}" href="products?cid=${0}">ALL</a>
         <c:forEach items="${cat}" var="c">
             <a class="clickMe" class ="${c.iddong==cid?"active":""}" href="products?cid=${c.iddong}">${c.tendong}</a>
         </c:forEach>
         
        
        </div>

    </div>
         <div class="container">
             
                 <c:forEach items="${requestScope.products}" var="p">
                     <div class="content box_shadow">
                       <h1>${p.tieude}</h1>
                       <p>${p.noidung}</p>
                     </div>
                      
                       
                      
                    
                 </c:forEach>
                
             
             
         </div>
    
         <script src="style/script.js"></script>
</body>
</html>
