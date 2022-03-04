<%-- 
    Document   : cadastrargenero
    Created on : 03/04/2018, 20:31:38
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
        <h1>Cadastrar Gênero</h1>
        <input type="number" name="idgenero" value="" readonly><br>
            <input type="text" name="descricaogenero" value="" placeholder="Descrição" required><br>
            <input type="submit" value="Cadastrar" name="cadastrargenero" />
    </body>
</html>
