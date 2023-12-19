<%-- 
    Document   : login
    Created on : Dec 19, 2023, 6:47:07 AM
    Author     : pares
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="LoginForm" method="post">
           Email: <input type="text" name="email1" /><br/><br/>
            Password: <input type="password" name="pass1" /><br/><br/>
            <input type="submit" value="Login" /><br/><br/>
        </form>
    </body>
</html>
