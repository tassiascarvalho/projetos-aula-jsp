<%-- 
    Document   : listar
    Created on : 05/10/2017, 16:25:28
    Author     : Ludi
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Pessoas Física cadastradas</h1>
        <table id="tabela" align="center" class="table table-hover">
            <thead> 
                <tr>
                     <th> ID </th> 
                    <th> Nome </th>
                    <th> Email </th>
                    <th> Telefone </th>
                    <th> Senha </th>
                    <th> Cpf </th>
                    <th> Sexo </th>
                    <th> Data de Nascimento</th>  
                </tr>
            </thead>
            <tbody> 
            <c:forEach var="pessoaf" items="${pessoasf}"> 
                    <tr>
                        <td>${pessoaf.idPessoaFisica}</td>
                        <td>${pessoaf.nomePessoa}</td>
                        <td>${pessoaf.emailPessoa}</td>
                        <td>${pessoaf.telefonePessoa}</td>
                        <td>${pessoaf.senhaPessoa}</td>
                        <td>${pessoaf.cpfPessoaFisica}</td>
                        <td>${pessoaf.sexoPessoaFisica}</td>
                        <td>${pessoaf.dataNascimentoPessoaFisica}</td>
                      
                        <td><a href="${pageContext.request.contextPath}/ExcluirPessoaF?idpessoa=${pessoaf.idPessoa}">
                                <button class="btn btn-danger">Excluir</button>
                            </a>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/CarregarPessoaF?idpessoa=${pessoaf.idPessoa}">
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