<%-- 
    Document   : listar
    Created on : 03/09/2017, 08:53:44
    Author     : Aluno
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar categoria</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Categorias cadastradas</h1>
        <table id="tabela" align="center" class="table table-hover">
            <thead> 
                <tr>
                     <th> ID </th> 
                    <th> Nome </th>
                    <th> Observação </th>
                    <th > Excluir </th>
                    <th > Alterar </th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="categoria" items="${categorias}"> 
                    <tr>
                        <td>${categoria.idCategoria}</td>
                        <td>${categoria.nomeCategoria}</td>
                        <td>${categoria.descricaoCategoria}</td>
                        <td><a href="${pageContext.request.contextPath}/ExcluirCategoria?idcategoria=${categoria.idCategoria}">
                                  Remover
                            </a>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/CarregarCategoria?idcategoria=${categoria.idCategoria}">
                                Alterar
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        </div>
    </body>
</html>
