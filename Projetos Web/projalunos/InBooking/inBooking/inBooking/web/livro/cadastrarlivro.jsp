<%-- 
    Document   : cadastrarlivro
    Created on : 03/04/2018, 20:34:27
    Author     : Aluno
--%>
<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:choose>
    <c:when test="${sessionScope.pessoa != null && sessionScope.pessoa.PerfilPessoa =="Funcionario"}">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar Livro</h1>
        <input type="number" name="idlivro" value="" readonly><br>
            <input type="text" name="titulolivro" value="" placeholder="Título" required><br>
            <input type="text" name="isbnlivro" value="" placeholder="ISBN" required><br>
            <input type="text" name="anopublicacaolivro" value="" placeholder="Ano da Publicação" required><br>
            <input type="text" name="idiomalivro" value="" placeholder="Idioma" required><br>
            <input type="text" name="urlcapalivro" value="" placeholder="Capa URL" required><br>
            <input type="number" name="capituloslivro" value="" placeholder="Capítulos" required><br>
            <input type="number" name="paginaslivro" value="" placeholder="Quantidade de Páginas" required><br>
            <input type="text" name="sinopselivro" value="" placeholder="Sinopse" required><br>
            <input type="text" name="anoedicaolivro" value="" placeholder="Ano da Edição" required><br>
            <input type="text" name="idiomaedicaolivro" value="" placeholder="Idioma Edição" required><br>
            <input type="number" name="numeroedicaolivro" value="" placeholder="Número da Edição" required><br>
            <input type="submit" value="Cadastrar" name="cadastrarlivro" />
    </body>
</html>
</c:when>
<c:otherwise> <!Else do JSTL-->
    <c:redirect url="../index.jsp"/><!--If do JSTL-->
</c:otherwise>
</c:choose>
