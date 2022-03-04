<%-- 
    Document   : gerenciarsala
    Created on : 04/03/2020, 20:30:21
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/css/tabela.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
          <h1>Gerenciar Sala</h1>
        <form method="POST" action="${pageContext.request.contextPath}/SalvarSala">
            <input type="hidden" name="idsala"/>
            <br />
            Numero  <input type="text" name="numerosala"/>
            <br />
           
            <input type="submit" value="Salvar"/>
        </form>
        ${mensagem}

        <table class="blueTable">
            <tr>
                <th>ID</th>
                <th>Numero</th>
            </tr>
            <c:forEach var="sala" items="${salas}">
                <!--JSTL forEach - utilizado para percorrer a lista retornada pelo Servlet-->
                <tr> 
                    <td>${sala.idSala}</td>
                    <td>${sala.numeroSala}</td>
                </tr>  
            </c:forEach>
        </table>
    </body>
</html>
