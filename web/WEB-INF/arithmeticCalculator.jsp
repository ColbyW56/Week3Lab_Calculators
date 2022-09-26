<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 25, 2022, 7:31:56 PM
    Author     : colby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value=${first}><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="button" value="+">
            <input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*">
            <input type="submit" name="button" value="%">
        </form>
            
        <p>Result: ${result}</p>
        
        <a href="age">Age Calculator></a>
        
    </body>
</html>
