<%-- 
    Document   : menulogado
    Created on : 17/06/2020, 16:32:19
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
        
        <br />
         <h1>
             <a href="${pageContext.request.contextPath}/LogarAdministrador?acao=logout">Sair</a>
         </h1>
        <br />
        
        
        <h1>Menu - ${sessionScope.administrador.nomeAdministrador}</h1>
        
        <a href="${pageContext.request.contextPath}/ListarGenero"><h1>Gerenciar Genero</h1></a>
    </body>
</html>
