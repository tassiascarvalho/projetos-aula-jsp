<%-- 
    Document   : gerenciargenero
    Created on : 20/04/2020, 16:47:52
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/css.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Salvar Gênero</h1>
        <form name="genero" action="${pageContext.request.contextPath}/SalvarGenero" method="POST">
            <p>Id Gênero: <input type="number" name="idgenero" value="${genero.idGenero}" readonly/></p>
            <p>Nome: <input type="text" name="nomegenero" value="${genero.nomeGenero}" required/></p>
            <p>Descrição: <input type="text" name="descricaogenero" value="${genero.descricaoGenero}"/></p>
            <p><input type="submit" name="salvar" value="Salvar"/></p>                                                                                                                        
            
        </form>
        ${mensagem}

        <h1>Lista de Gênero</h1>
        <table align="center" class="blueTable">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th colspan="2">Editar</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="genero" items="${generos}">
                <tr>
                    <td>${genero.idGenero}</td>
                    <td>${genero.nomeGenero}</td>
                    <td>${genero.descricaoGenero}</td>
                    <td><a href="${pageContext.request.contextPath}/ExcluirGenero?idgenero=${genero.idGenero}">Excluir</a></td>
                    <td><a href="${pageContext.request.contextPath}/CarregarGenero?idgenero=${genero.idGenero}">Alterar</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>     
</body>
</html>
