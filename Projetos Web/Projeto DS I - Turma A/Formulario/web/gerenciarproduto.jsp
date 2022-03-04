<%-- 
    Document   : gerenciarproduto
    Created on : 19/02/2020, 16:48:51
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
        <form action="SalvarProduto" method="get">
            Id: <input type="text" name="id">
            <br/>
            Nome: <input type="text" name="nome">
            <br/>
            Valor: <input type="text" name="valor">
            <br/>            
            Descrição: <input type="text" name="descricao">
            <br/>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
