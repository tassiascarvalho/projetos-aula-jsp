<%-- 
    Document   : cadastraracervo
    Created on : 03/04/2018, 19:48:23
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
        <form>
            <input type="number" name="idacervo" value="" readonly><br>
            <input type="number" name="quantidadeacervo" value="" placeholder="Quantidade" required><br>
            <input type="text" name="statuslivroacervo" value="" placeholder="Status do Livro" required><br>
            <input type="number" name="disponibilidadeacervo" value="" placeholder="Disponibilidade" required><br>
            <input type="submit" value="Cadastrar" name="cadastraracervo" />
        </form>
    </body>
</html>
