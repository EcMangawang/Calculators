<%-- 
    Document   : agecalculator
    Created on : Jan. 15, 2022, 3:58:29 p.m.
    Author     : emmar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            <label>Enter your age:</label>
            <input type="number" name="age" id="age">
            <br>
           
            <button type="submit"><strong>Age next birthday</strong></button>
            
        </form>
        
        <p>${message}</p>
        
        <a href "arithmetic">Arithmetic Calculator</a>
    </body>
</html>
