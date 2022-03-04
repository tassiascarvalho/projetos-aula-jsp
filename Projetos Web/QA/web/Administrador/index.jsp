<%-- 
    Document   : index
    Created on : 04/09/2016, 08:50:08
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:choose>
    <c:when test="${sessionScope.admin != null}">
        <html>
            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Home | Administrador</title>
            </head>
            <body>
                <h1 style="text-align: center">${saudacao} - ${sessionScope.admin.idAdministrador}</h1>

            <center><p><a href="${pageContext.request.contextPath}/LogarAdministrador?acao=logout">Sair</a></p></center>

            <table>
                <thead>
                <th>Gerenciar</th>
            </thead>

            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/ListarCategoria">Gerenciar Categoria - Cadastro Simples</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/ListarAdministrador">Gerenciar Administrador - Cadastro Simples</a> 
                </td>
            </tr>

            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/ListarCliente">Gerenciar Cliente (Herança)</a>
                </td>
            </tr>
            <tr>
                <td> 
                    <a href="${pageContext.request.contextPath}/ListarGenero">Gerenciar Genero - Cadastro Simples</a> 
                </td>
            </tr>
            <tr>
                <td> 
                    <a href="${pageContext.request.contextPath}/ListarFilme">Gerenciar Filme (1..*)- Dependencia da Categoria e do Genero</a> 
                </td>
            </tr>
        </table>
    </body>
</html>
</c:when>
<c:otherwise> <!--ELSE do JSTL-->
    <c:redirect url="../index.jsp"/> <!--IF do JSTL-->
</c:otherwise>
</c:choose>