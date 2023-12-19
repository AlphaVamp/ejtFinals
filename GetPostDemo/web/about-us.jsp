<%-- 
    Document   : about-us
    Created on : Dec 18, 2023, 9:57:08 PM
    Author     : pares
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
    </head>
    <body>
          <%
            String myname = (String) session.getAttribute("name_key");
         %>
         <h1>Hello <%= myname %></h1>
         
         <a href="home-page.jsp">Home</a>
         <a href="profile.jsp">Profile</a>
    </body>
</html>
