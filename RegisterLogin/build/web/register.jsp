<%-- 
    Document   : register
    Created on : Dec 19, 2023, 6:11:07 AM
    Author     : pares
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form action="regForm" method="post">
            Name: <input type="text" name="name1" /> <br/> <br/>
            Email: <input type="text" name="email1" /> <br/> <br/>
            Password: <input type="text" name="password1" /> <br/> <br/>
            Gender: <input type="radio" name="gender1" value="Male" /> Male
            <input type="radio" name="gender1" value="Female"/> Female <br/><br/>
            
            City: <select name="city1">
                <option>Select City</option>
                <option>Delhi</option>
                <option>Mumbai</option>
                <option>Pune</option>
                <option>Bangalore</option>
            </select><br/><br/>
            <input type="submit" value="Register"/>
        </form>
    </body>
</html>
