<%-- 
    Document   : gerenciarfilme
    Created on : 20/04/2020, 16:47:41
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/css.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gerenciar Filmes</h1>
        <form name="filme" action="${pageContext.request.contextPath}/SalvarFilme" method="POST">
            <p>Id Filme: <input type="number" name="idfilme" value="${filme.idFilme}" readonly/></p>
            <p>Nome: <input type="text" name="nomefilme" value="${filme.nomeFilme}" required/></p>
            <p>Duração: <input type="number" name="duracaofilme" value="${filme.duracaoFilme}"/></p>
            <p>Sinopse: <input type="text" name="sinopsefilme" value="${filme.sinopseFilme}"/></p>
            <p>Classificação: <input type="text" name="classificacaofilme" value="${filme.classificacaoFilme}"/></p>
            
                <p>Gênero: <select name="idgenero">
                    <c:forEach var="genero" items="${generos}">
                        <option value="${genero.idGenero}"${genero.idGenero==filme.genero.idGenero?'selected':''}>${genero.nomeGenero}</option>
                    </c:forEach>
                </select></p>
                
            <p>Categoria: <select name="idcategoria">
                    <c:forEach var="categoria" items="${categorias}">
                        <option value="${categoria.idCategoria}"${categoria.idCategoria==filme.categoria.idCategoria?'selected':''}>${categoria.descricaoCategoria}</option>
                    </c:forEach>
                </select></p>
            <p><input type="submit" name="salvar" value="Salvar"/></p>                                                                                                                        
        </form>
        ${mensagem}

        <h1>Lista de Filmes</h1>
        <table align="center" class="blueTable">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Duração</th>
                    <th>Sinopse</th>
                    <th>Classificação</th>
                    <th>Gênero</th>
                    <th colspan="2">Editar</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="filme" items="${filmes}">
                <tr>
                    <td>${filme.idFilme}</td>
                    <td>${filme.nomeFilme}</td>
                    <td>${filme.duracaoFilme}</td>
                    <td>${filme.sinopseFilme}</td>
                    <td>${filme.classificacaoFilme}</td>
                    <td>${filme.genero.nomeGenero}</td>
                    <td><a href="${pageContext.request.contextPath}/ExcluirFilme?idfilme=${filme.idFilme}">Excluir</a></td>
                    <td><a href="${pageContext.request.contextPath}/CarregarFilme?idfilme=${filme.idFilme}">Alterar</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>    
</body>
</html>
