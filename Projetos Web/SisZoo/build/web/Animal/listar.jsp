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
        <title>Listar | Animal</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%;">
            <table border=1 cellspacing=0 >
                <h1>Listagem de Animal</h1>
                <thead>
                    <tr>
                        <th> ID </th>
                        <th> Nome </th>
                        <th> Data Nascimento </th>
                        <th> Peso </th>
                        <th> Especie </th>
                        <th colspan="2"> Editar </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="animal" items="${animais}"> <!--JSTL-->
                        <tr>
                            <td> ${animal.idAnimal} </td>
                            <td> ${animal.nomeAnimal} </td>
                            <td><fmt:formatDate type="date" pattern="dd/MM/yyyy" value="${animal.dataNascimentoAnimal}"></fmt:formatDate></td>
                            <!--^ como formatar a data pra pt-br-->
                            <td> ${animal.pesoAnimal} </td>
                            <td value="${animal.especie.idEspecie}"> ${animal.especie.nomeEspecie} </td>
                            <td><a href="${pageContext.request.contextPath}/ExcluirAnimal?idanimal=${animal.idAnimal}"> Excluir </a></td>
                            <td><a href="${pageContext.request.contextPath}/CarregarAnimal?idanimal=${animal.idAnimal}"> Alterar </a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>
