<%-- 
    Document   : index
    Created on : 29/05/2019, 22:36:55
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
        <h1>Menu para testes - Index</h1>
        <a href="${pageContext.request.contextPath}/ListarCategoria">Gerenciar Categoria - Cadastro Simples</a>   
        <br><br>
        <a href="${pageContext.request.contextPath}/ListarAdministrador">Gerenciar Administrador - Cadastro Simples</a>        
        <br><br>
        <a href="${pageContext.request.contextPath}/ListarCliente">Gerenciar Cliente (Herança)</a>     
        <br><br>
        <a href="${pageContext.request.contextPath}/ListarGenero">Gerenciar Genero - Cadastro Simples</a>    
        <br><br>
        <a href="${pageContext.request.contextPath}/ListarFilme">Gerenciar Filme (1..*)- Dependencia da Categoria e do Genero</a>     
         <br><br>
        <a href="${pageContext.request.contextPath}/ListarPergunta">Gerenciar Pergunta</a>    
        <br><br>
    </body>
</html>
