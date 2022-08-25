<%-- 
    Document   : gerenciarproduto
    Created on : 26 de jul de 2022, 10:53:12
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
        <h1>Gerenciar Produto</h1>
        
        <form action="SalvarProduto" method="get">
            <label>ID</label>
            <input type="number" name="idproduto">
            <br />
            <label>Nome</label>
            <input type="text" name="nomeproduto">
            <br />
            <label>Valor</label>
            <input type="text" name="valorproduto">
            <br />
            <label>Data Fabricação</label>
            <input type="date" name="datafabricacaoproduto">
            <br />
            <label>Fornecedor</label>
            <select name="idjuridica">
                <c:forEach items="${listajuridica}" var="juridica">
                    <option value="${juridica.idFisica}" ${produto.juridica.idFisica==juridica.idFisica?'selected':''}>
                        ${juridica.idFisica} - ${juridica.nomePessoa}
                    </option>
                </c:forEach>
            </select>
            <input type="hidden" value="${sessionScope.pessoalogada.idPessoa}"
            <br />
            <input type="submit" value="Salvar">            
        </form>        
            
            <h1>Lista de Produtos</h1>    
            
            <table>
                <thead>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Valor</th>
                    <th>ID Fornecedor</th>
                    <th>Nome Fornecedor</th>
                    <th>Detalhes</th>
                </thead>
                <tbody>
                    <c:forEach items="${listaprodutos}" var="produto">
                        <tr>
                            <td>${produto.idProduto}</td>
                            <td>${produto.nomeProduto}</td>
                            <td>${produto.valorProduto}</td>
                            <td>${produto.juridica.idJuridica}</td>
                            <td>${produto.juridica.nomePessoa}</td>
                            <td><a href="${pageContext.request.contextPath}/CarregarProduto?idprodutodetalhes=${produto.idProduto}"/>Detalhes</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>
