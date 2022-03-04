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
        <title>Listar | Administrador</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%">
            <table border=1 cellspacing=0 >
                <h1>Listagem de Administrador</h1>
                <thead>
                    <tr>
                        <th> ID </th>
                        <th> Nome </th>
                        <th> CPF </th>
                        <th> Login </th>
                        <th colspan="2"> Editar </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="administrador" items="${administradores}"> <!--JSTL-->
                        <tr>
                            <td> ${administrador.idAdministrador} </td>
                            <td> ${administrador.nomeAdministrador} </td>
                            <td> ${administrador.cpfAdministrador} </td>
                            <td> ${administrador.loginAdministrador} </td>
                            <td><a href="${pageContext.request.contextPath}/ExcluirAdministrador?idadministrador=${administrador.idAdministrador}"> Excluir </a></td>
                            <td><a href="${pageContext.request.contextPath}/CarregarAdministrador?idadministrador=${administrador.idAdministrador}"> Alterar </a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>
