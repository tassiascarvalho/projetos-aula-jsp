<%-- 
    Document   : cadastraraluno
    Created on : 2 de mar. de 2021, 13:26:18
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
        <h1>Cadastrar Aluno</h1>
        <form action="CadastrarAluno"> 
            Nome:  <input type="text" name="nomealuno"/>
            <br />
            Idade: <input type="number" name="idadealuno" required/>
            <br />
            Curso: <input type="text" name="cursoaluno"/>
            <br />
            <input type="submit" value="Enviar"/>
        </form>
        
        <h3>${mensagem}</h3>
    </body>
</html>
