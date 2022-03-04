<%-- 
    Document   : exercicio4
    Created on : 18/03/2021, 14:00:42
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
        <h1>Exercicio 4</h1>
        <p>Faça um programa que:
        - Leia a cotação do dólar
        - Leia um valor em dólares
        - Converta esse valor para Real
        - Mostre o resultado</p>
        
        <form action="Exercicio4" method="get">
            Cotação <input type="text" name="cotacao">
            <br><br>
            Valor em Dólar <input type="text" name="vdolar">
            <br><br>
            
            <input type="submit" value="Enviar">
            
        </form>
        
    </body>
</html>
