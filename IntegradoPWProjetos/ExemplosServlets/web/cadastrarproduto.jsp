<%-- 
    Document   : cadastrarproduto
    Created on : 25 de fev. de 2021, 14:31:33
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
        
        <form action="CadastrarProduto">
            Nome<input type="text" name="nomeproduto">
            <br>            
            Descrição<input type="text" name="descproduto">
            <br>
            Valor<input type="text" name="valorproduto">
            <br>
            <input type="submit" value="Enviar">
            <input type="reset" value="Limpar">            
        </form>
    </body>
</html>
