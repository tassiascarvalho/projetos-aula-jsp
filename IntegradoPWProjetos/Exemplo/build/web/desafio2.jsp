<%-- 
    Document   : desafio2
    Created on : 13/04/2021, 13:50:50
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
        <p>Está acontecendo uma campanha de doação de sangue na cidade de Fernandópolis, 
            mas existem algumas restrições para doação, onde o peso deve ser maior ou igual a 50 e
            ter pelo menos 16 anos de idade. Desenvolva um software para receber o nome, o peso e
            a idade de uma pessoa, como resultado exiba uma mensagem informando se "pode doar", 
            ou se "não pode doar
        </p>
        
        <form action="Desafio2" method="get">
            <label>Nome</label>
            <input type="text" name="nome">
            <label>Idade</label>
            <input type="text" name="idade">
            <label>Peso</label>
            <input type="text" name="peso">
            <br />
            <input value="Enviar" type="submit">            
        </form>
    </body>
</html>
