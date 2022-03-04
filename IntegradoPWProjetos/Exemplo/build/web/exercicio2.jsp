<%-- 
    Document   : exercicio2
    Created on : 11/03/2021, 13:55:18
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
        <h1>Exercício</h1>
        
        <p>2. Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTAÇÃO = 
            VALOR + (VALOR * (TAXA / 100) * TEMPO).</p>
        
        <form action="Exercicio2" method="get">
            Valor <input type="text" name="valor">
            <br><br>
            Taxa <input type="text" name="taxa">
            <br><br>
            Tempo <input type="text" name="tempo">
            <br><br>
            <input type="submit" value="Enviar">
        </form>
        
        

    </body>
</html>
