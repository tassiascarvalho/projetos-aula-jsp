<%-- 
    Document   : gerenciargenero
    Created on : 05/05/2020, 16:09:13
    Author     : Tassia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<link href="${pageContext.request.contextPath}/estilo.css" rel="stylesheet" type="text/css"/>
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

        <form action="${pageContext.request.contextPath}/SalvarGenero" method="get">
            <h1>Gerenciar Genero - ${sessionScope.administrador.nomeAdministrador}</h1>
            ID: <input type="text" name="idgenero" value="${genero.idGenero}"/>
            <br />
            Nome: <input type="text" name="nomegenero" value="${genero.nomeGenero}"/>
            <br />
            Descrição: <input type="text" name="descricaogenero" value="${genero.descricaoGenero}"/>
            <br />
            <input type="Submit" value="Enviar"/>
        </form>
        ${mensagem}


        <br /><br /><br />

        <table class='blueTable'>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Descrição</th>
                <th>Excluir</th>
                <th>Alterar</th>
            </tr>

            <c:forEach items="${tabelageneros}" var="genero">
                <tr>
                    <td>${genero.idGenero}</td>
                    <td>${genero.nomeGenero}</td>
                    <td>${genero.descricaoGenero}</td>
                    <td><a href="${pageContext.request.contextPath}/ExcluirGenero?idgeneroExcluir=${genero.idGenero}">Excluir</a></td>
                    <td><a href="${pageContext.request.contextPath}/CarregarGenero?idgeneroCarregar=${genero.idGenero}">Alterar</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
