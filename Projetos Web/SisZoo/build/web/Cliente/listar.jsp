<%-- 
    Document   : listar
    Created on : 23/09/2016, 14:32:50
    Author     : Aluno
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar | Cliente</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%;">
            <table border=1 cellspacing=0 >
                <h1>Listagem de Cliente</h1>
                <thead>
                    <tr>
                        <th> ID </th>
                        <th> ID Cliente </th>
                        <th> Nome </th>
                        <th> CPF </th>
                        <th> RG </th>
                        <th> Login </th>
                        <th> Cidade </th>
                        <th> Qtd. Dep. </th>
                        <th colspan="2"> Editar </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="cliente" items="${clientes}"> <!--JSTL-->
                        <tr>
                            <td> ${cliente.idPessoa} </td>
                            <td> ${cliente.idCliente} </td>
                            <td> ${cliente.nomePessoa} </td>
                            <td> ${cliente.cpfPessoa} </td>
                            <td> ${cliente.rgCliente} </td>
                            <td> ${cliente.loginPessoa} </td>
                            <td> ${cliente.cidadeCliente} </td>
                            <td> ${cliente.quantidadeDependentesCliente} </td>
                            <td><a href="${pageContext.request.contextPath}/ExcluirCliente?idpessoa=${cliente.idPessoa}"> Excluir </a></td>
                            <td><a href="${pageContext.request.contextPath}/CarregarCliente?idpessoa=${cliente.idPessoa}"> Alterar </a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>
