<%-- 
    Document   : itenscarrinho
    Created on : 25 de ago de 2022, 11:48:24
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Itens Carrinho</h1>
        
        <table>        
            <thead>
                <th>Id Produto</th>
                <th>Nome Produto</th>
                <th>Valor Produto</th>
                <th>Fornecedor</th>
                <th>Qtd Produto</th>
            </thead>
            <tbody>
                <c:forEach items="${itenscarrinho}" var="item">
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </c:forEach>
            </tbody>        
        </table>        
    </body>
</html>
