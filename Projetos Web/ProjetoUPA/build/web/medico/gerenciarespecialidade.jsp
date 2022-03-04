<%-- 
    Document   : gerenciarespecialidade
    Created on : 12/02/2020, 21:34:32
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciar Especialidade</title>
        <link href="${pageContext.request.contextPath}/css/tabela.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <h1>Gerenciar Especialidade</h1>
        <form method="POST" action="${pageContext.request.contextPath}/SalvarEspecialidade">
            <input type="hidden" name="idespecialidade"/>
            <br />
            NOME  <input type="text" name="nomeespecialidade"/>
            <br />
            DESCRIÇÃO<input type="text" name="descricaoespecialidade"/>
            <br />
            <input type="submit" value="Salvar"/>
        </form>
        ${mensagem}

        <table class="blueTable">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Descrição</th>
            </tr>
            <c:forEach var="especialidade" 
                       items="${especialidades}">
                <!--JSTL forEach - utilizado para percorrer a lista retornada pelo Servlet-->
                <tr> 
                    <td>${especialidade.idEspecialidade}</td>
                    <td>${especialidade.nomeEspecialidade}</td>
                    <td>${especialidade.descricaoEspecialidade}</td>
                </tr>  
            </c:forEach>
        </table>


    </body>
</html>
