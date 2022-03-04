<%-- 
    Document   : exercicio1
    Created on : 11/03/2021, 13:22:30
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
        <h1> Exercício 1</h1>
        <p>
                1. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
                calcular e escrever a área do retângulo (Formula: A = (b* h))
        </p>
        <!--form proporciona interação
            action = para onde os dados serão enviados
            method = como os dados serão enviados
        -->
        <form action="Exercicio1" method="get">
            Base <input type="text" name="base" required="required"/>
            <br><br>
            Altura <input type="text" name="altura" required="required"/>
            <br><br>
            <input type="submit" value="Enviar"/>
        </form>

    </body>
</html>
