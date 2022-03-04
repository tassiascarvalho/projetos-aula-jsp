<%-- 
    Document   : listar
    Created on : 06/09/2017, 20:07:54
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <style>
            
        </style>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Pessoas Juridicas cadastradas</h1>
        <table id="tabela" align="center" class="table table-hover">
            <thead> 
                <tr>
                     <th> ID </th> 
                    <th> Nome </th>
                    <th> Email </th>
                    <th> Telefone </th>
                    <th> Senha </th>
                    <th> CNPJ </th>
                    <th> Razão Social </th>
                    <th> Imagem</th>  
                </tr>
            </thead>
            <tbody> 
            <c:forEach var="pessoaj" items="${pessoasj}"> 
                    <tr>
                        <td>${pessoaj.idPessoaJuridica}</td>
                        <td>${pessoaj.nomePessoa}</td>
                        <td>${pessoaj.emailPessoa}</td>
                        <td>${pessoaj.telefonePessoa}</td>
                        <td>${pessoaj.senhaPessoa}</td>
                        <td>${pessoaj.cpnjPessoaJuridica}</td>
                        <td>${pessoaj.razaoSocialPessoaJuridica}</td>
                        <td><img class="img-thumbnail img-responsive" src="${pageContext.request.contextPath}/fotos/${pessoaj.imagemPessoaJ}"></td>
                        <td></td>
                        <td><a href="${pageContext.request.contextPath}/ExcluirPessoaJ?idpessoa=${pessoaj.idPessoa}">
                                <button class="btn btn-danger">Excluir</button>
                            </a>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/CarregarPessoaJ?idpessoa=${pessoaj.idPessoa}">
                                <button class="btn btn-info">Alterar</button>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        </div>
        
    </body>
</html>
