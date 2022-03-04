<%-- 
    Document   : calculo
    Created on : 4 de mar. de 2021, 14:15:51
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Soma</h1>
        
        <form action="Calculos">
            Primeiro Número <input type="text" name="n1">
            <br>
            Segundo Número <input type="text" name="n2">
            <br>
            <input type="Submit" value="Enviar">
        </form>
        
        <h3>${resultado}</h3>
    </body>
</html>
