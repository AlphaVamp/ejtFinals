<%-- 
    Document   : profile
    Created on : Dec 18, 2023, 9:29:04 PM
    Author     : pares
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <%
            String myname = (String) session.getAttribute("name_key");
         %>
         <h1>Hello <%= myname %></h1>
         
         <a href="home-page.jsp">Home</a>
         <a href="about-us.jsp">About Us</a>
         <a href="logout">Logout</a>
    </body>
</html>
