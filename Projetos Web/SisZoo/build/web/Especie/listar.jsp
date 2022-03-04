<%-- 
    Document   : listar
    Created on : 23/09/2016, 14:32:50
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar | Especie</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%;">
            <table border=1 cellspacing=0 >
                <h1>Listagem de Espécie</h1>
                <thead>
                    <tr>
                        <th> ID </th>
                        <th> Nome </th>
                        <th> Descrição </th>
                        <th colspan="2"> Editar </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="especie" items="${especies}"> <!--JSTL-->
                        <tr>
                            <td> ${especie.idEspecie} </td>
                            <td> ${especie.nomeEspecie} </td>
                            <td> ${especie.descricaoEspecie} </td>
                            <td><a href="${pageContext.request.contextPath}/ExcluirEspecie?idespecie=${especie.idEspecie}"> Excluir </a></td>
                            <td><a href="${pageContext.request.contextPath}/CarregarEspecie?idespecie=${especie.idEspecie}"> Alterar </a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>
