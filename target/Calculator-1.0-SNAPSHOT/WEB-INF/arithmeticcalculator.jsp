<%-- 
    Document   : arithmeticcalculator
    Created on : Jan. 16, 2022, 1:13:15 p.m.
    Author     : emmar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            
            <label for="first">First:</label>
            <input type="number" id="first" name="first" value="${first}"><!-- User enters first number -->
            
            <br>
            
            <label for="second">Second:</label>
            <input type="number" id="second" name="second" value="${second}"><!-- User enters second number -->
            
            <br>
            
            <button type="submit" name="calculate" id="add" value="add">+</button><!--addition button-->
            <button type="submit" name="calculate" id="subtract" value="subtract">-</button><!-- subtraction button-->
            <button type="submit" name="calculate" id="multiply" value="multiply">*</button><!-- multiplication button -->
            <button type="submit" name="calculate" id="divide" value="divide">/</button><!-- division button -->
            
            <p>Result : ${message}</p>
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
