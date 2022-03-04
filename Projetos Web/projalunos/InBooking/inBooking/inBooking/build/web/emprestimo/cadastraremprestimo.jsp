<%-- 
    Document   : cadastraremprestimo
    Created on : 03/04/2018, 20:24:44
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
        <h1>Empréstimo</h1>
        <input type="number" name="idemprestimo" value="" readonly><br>
            <input type="date" name="dataemprestimo" value="" placeholder="Data do Empréstimo" required><br>
            <input type="date" name="datadevolucao" value="" placeholder="Data de Devolução" required><br>
            <input type="text" name="statusemprestimo" value="" placeholder="Status Empréstimo" required><br>
            <input type="submit" value="Cadastrar" name="cadastraremprestimo" />
    </body>
</html>
