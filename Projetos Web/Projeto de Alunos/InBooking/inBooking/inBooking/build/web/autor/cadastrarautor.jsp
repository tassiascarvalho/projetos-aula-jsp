<%-- 
    Document   : cadastrarautor
    Created on : 03/04/2018, 19:58:50
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar Autor</h1>
        <input type="number" name="idautor" value="" readonly><br>
            <input type="text" name="pseudonimoautor" value="" placeholder="Pseudônimo" required><br>
            <input type="text" name="nacionalidadeautor" value="" placeholder="Nacionalidade" required><br>
            <input type="text" name="nomeautor" value="" placeholder="Nome" required><br>
            <input type="text" name="sobrenomeautor" value="" placeholder="Sobrenome" required><br>
            <input type="submit" value="Cadastrar" name="cadastrarautor" />
    </body>
</html>
