<%-- 
    Document   : desafio1
    Created on : 13/04/2021, 13:43:45
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
        <h1>Hello World!</h1>
        <p>Desenvolva um software para verificar se o número digitado pertence 
            ao intervalo de 1..50.          (NUM>=1 && NUM<=50)</p>
        
        <form action="Desafio1" method="get">
            <label>Numero</label>
            <input type="text" name="numero">
            <br />
            <input value="Enviar" type="submit">            
        </form>
        
    </body>
</html>
