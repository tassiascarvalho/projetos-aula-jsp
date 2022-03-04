<%-- 
    Document   : listar
    Created on : 14/10/2017, 13:38:17
    Author     : Douglas Costa
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/estilo.css" rel="stylesheet" type="text/css"/>
        <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery-3.2.1.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/javascript/formulario.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container">
            <div class="col-md-12">
                <h1>Produtos </h1>
                <table class="table table-hover">
                    <thead>
                    <th>Imagem</th>
                    <th>Nome</th>
                    <th>Categoria</th>
                    <th>Tamanho(cm)</th>
                    <th>Peso(kl)</th>
                    <th>Valor por Dia</th>
                    <th>Cor</th>
                    <th>Descrição</th>
                    <th>Referência</th>
                    <th>Disponibilidade</th>
                    <th>Quantidade(Und)</th>
                    </thead>
                    <tbody>
                        <c:forEach var="produto" items="${produtos}">
                            <tr>
                                <td><img class="img-thumbnail" src="${pageContext.request.contextPath}/produtos/${produto.imagemProduto}"</td>
                                <td>${produto.nomeProduto}</td>
                                <td>${produto.categoriaProduto}</td>
                                <td>${produto.tamanhoProduto}</td>
                                <td>${produto.pesoProduto}</td>
                                <td>${produto.valorLocacaoDia}</td>
                                <td>${produto.corProduto}</td>
                                <td>${produto.descricaoProduto}</td>
                                <td>${produto.referenciaProduto}</td>
                                <td>${produto.disponibilidade}</td>
                                <td>${produto.quantidadeProduto}</td>                           
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
