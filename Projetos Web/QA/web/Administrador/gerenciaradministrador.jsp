<%-- 
    Document   : gerenciaradministrador
    Created on : 20/04/2020, 15:51:21
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/css.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <form name="salvaradministrador" method="post" action="${pageContext.request.contextPath}/SalvarAdministrador">
            <table>
                <h1>Gerenciar Administrador</h1>
                <tr>
                    <td>
                        <label>ID:</label>
                    </td>
                    <td>
                        <input type="number" name="id" value="${administrador.idAdministrador}" readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Nome:</label>
                    </td>
                    <td>
                        <input type="text" name="nome" placeholder="Nome" value="${administrador.nomeAdministrador}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>CPF:</label>
                    </td>
                    <td>
                        <input type="text" name="cpf" maxlength="14" placeholder="000.000.000-00" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" onkeypress="mascara(this, '###.###.###-##')" value="${administrador.cpfAdministrador}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Login:</label>
                    </td>
                    <td>
                        <input type="text" name="login" placeholder="login" value="${administrador.loginAdministrador}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Senha:</label>
                    </td>
                    <td>
                        <input type="password" name="senha" value="${administrador.senhaAdministrador}" autofocus required>
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

            <table border=1 cellspacing=0 class="blueTable">
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
                    <!--forEach percorre a lista que veio do Servlet-->
                <c:forEach var="administrador" items="${administradores}">
                    <!--JSTL - (items - tem que ser igual esta no Servlet)-->
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
        </form>
    </body>
</html>
