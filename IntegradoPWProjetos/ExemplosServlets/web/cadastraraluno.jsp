<%-- 
    Document   : cadastraraluno
    Created on : 23 de fev. de 2021, 13:27:52
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
        <h1>Formulário de Cadastro de Aluno</h1>
        
        <form action="CadastrarAluno">
            Nome<input type="text" name="nomealuno">
            <br><!-- pula linha -->
            Idade<input type="number" name="idadealuno">
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
