<%-- 
    Document   : ageCalculator
    Created on : Sep 25, 2022, 12:27:31 AM
    Author     : colby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="post" action="age">
            <p>Enter your age: </p> 
            <input type="text" name="ageBox" value=${ageBox}>
            <br>
            <input type="submit" value="Age next birthday">
        </form>
            
        <p>${ageVal}</p>
        
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
