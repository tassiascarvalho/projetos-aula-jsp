<%-- 
    Document   : salvar
    Created on : 10/09/2016, 17:52:52
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salvar | Animal</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%;">
        <form name="salvaranimal" method="post" action="${pageContext.request.contextPath}/SalvarAnimal">
            <table>
                <h1>Cadastro de Animal</h1>
                <tr>
                    <td>
                        <label>ID:</label>
                    </td>
                    <td>
                        <input type="number" name="id" value="${animal.idAnimal}" readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Nome:</label>
                    </td>
                    <td>
                        <input type="text" name="nome" placeholder="Nome" value="${animal.nomeAnimal}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Data de Nascimento:</label>
                    </td>
                    <td>
                        <input type="date" name="data_nascimento" value="${animal.dataNascimentoAnimal}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Peso:</label>
                    </td>
                    <td>
                        <input type="number" placeholder="00,00" step="0.01" name="peso" value="${animal.pesoAnimal}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Espécie:</label>
                    </td>
                    <td>
                        <select name="idespecie">
                            <c:forEach var="especie" items="${especies}">
                                <option value="${especie.idEspecie}" ${animal.especie.idEspecie==especie.idEspecie?'selected':''}> ${especie.nomeEspecie} </option>
                                <!--${animal.especie.idEspecie==especie.idEspecie?'selected':''} isso faz a Especie correta vir selecionada-->
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <center><input type="submit" value="Salvar" name="cadastrar"></center>
                    </td>
                    <td>
                        <label>${mensagem}</label>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
