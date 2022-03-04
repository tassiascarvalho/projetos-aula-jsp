<%-- 
    Document   : gerenciarpergunta
    Created on : 17/06/2020, 19:22:37
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciar Pergunta</title>
    </head>
    <body>
        <h1>Gerenciar Pergunta</h1>

        <form action="${pageContext.request.contextPath}/SalvarPergunta" method="Get">
            ID Pergunta<input type="text" name="idpergunta" value="${pergunta.idPergunta}">
            <br />
            Descrição<input type="text" name="descricaopergunta" value="${pergunta.descricaoPergunta}">
            <br />
            Categoria:
            <!--Quem deve ser chamado no menu é o Servlet provedor dos dados-->
            <select name="idcategoriapergunta">
                <c:forEach var="categoria" items="${categorias}">
                    <option value="${categoria.idCategoria}" ${categoria.idCategoria==pergunta.categoria.idcategora?'selected':''}>${categoria.descricaoCategoria}</option>  
                </c:forEach>
            </select>
            
            <input type="hidden"  value="${sessionScope.pessoa.idPessoa}"
            <br />
            <input type="Submit" Value="Enviar">

        </form>


        <table border=1 cellspacing=0 class="blueTable">
            <h1>Lista de Perguntas </h1>
            <thead>
                <tr>
                    <th> ID </th>
                    <th> Descrição </th>
                    <th> Categoria </th>
                    <th colspan="2"> Editar </th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="pergunta" items="${perguntas}"> <!--JSTL forEach - utilizado para percorrer a lista retornada pelo Servlet-->
                    <tr>
                        <td> ${pergunta.idPergunta} </td>
                        <td> ${pergunta.descricaoPergunta} </td>
                        <td> ${pergunta.categoria.idCategoria} - ${pergunta.categoria.descricaoCategoria} </td>
                        <td> Excluir </td>
                        <td> Alterar </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>   
    </body>
</html>
