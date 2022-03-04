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
        <title>Salvar | Produto</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%;">
        <form name="salvarproduto" method="post" action="${pageContext.request.contextPath}/SalvarProduto">
            <table>
                <h1>Cadastro de Produto</h1>
                <tr>
                    <td>
                        <label>ID:</label>
                    </td>
                    <td>
                        <input type="number" name="id" value="${produto.idProduto}" readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Nome:</label>
                    </td>
                    <td>
                        <input type="text" name="nome" placeholder="Nome" value="${produto.nomeProduto}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Valor de Venda:</label>
                    </td>
                    <td>
                        <input type="number" step="0.01" name="valorvenda" value="${produto.valorVendaProduto}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Valor de Compra:</label>
                    </td>
                    <td>
                        <input type="number" step="0.01" name="valorcompra" value="${produto.valorCompraProduto}" required>
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
