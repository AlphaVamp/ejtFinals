<%-- 
    Document   : home-page
    Created on : Dec 18, 2023, 9:57:23 PM
    Author     : pares
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
          <%
            String myname = (String) session.getAttribute("name_key");
         %>
         <h1>Hello <%= myname %></h1>
         
         <a href="profile.jsp">Profile</a>
         <a href="about-us.jsp">About Us</a>
    </body>
</html>
