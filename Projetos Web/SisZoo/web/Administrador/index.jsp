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
            <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/3/dog-view-funny-sweet-animal-portrait-eyes-dear.jpg); height: 100%;"/>
            <h1 style="text-align: center">${saudacao}</h1>
            <center><p><a href="${pageContext.request.contextPath}/LogarAdministrador?acao=logout">Sair</a></p></center>
            <center><label>
                /*Criar nessa ordem:
                </br>Model, DAOImpl, View, Servlet,
                </br>e o CRUD um por um,
                </br>Create, Retrieve, Update, Delete*/
                </label></center>
                
                
            <table style="background: rgba(255,255,255,0.5); border-radius: 10px; text-align: center; width: 20%; position: absolute; left: 40%; top: 25%; padding: 5px">
                <thead>
                <th>Cadastrar</th>
                <th>Listar</th>
                </thead>
                <tr>
                    <td>
                        <a href="Especie/salvar.jsp">Cadastrar Especie</a>
                    </td>
                    <td>
                        <a href="ListarEspecie">Listar Especie</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="DadosAnimal">Cadastrar Animal</a>
                    </td>
                    <td>
                        <a href="ListarAnimal">Listar Animal</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="Administrador/salvar.jsp">Cadastrar ADM</a>
                    </td>
                    <td>
                        <a href="ListarAdministrador">Listar ADM</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="Produto/salvar.jsp">Cadastrar Produto</a>
                    </td>
                    <td>
                        <a href="ListarProduto">Listar Produto</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="Cliente/salvar.jsp">Cadastrar Cliente</a>
                    </td>
                    <td>
                        <a href="ListarCliente">Listar Cliente</a>
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