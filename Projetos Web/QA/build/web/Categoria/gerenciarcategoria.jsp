<%-- 
    Document   : gerenciarcategoria
    Created on : 27/03/2019, 22:24:53
    Author     : Tassia
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Uma Taglib é nada mais nada menos que uma biblioteca de tags customizadas que são
utilizadas na composição de páginas JSP. Pode-se dizer que uma Taglib é uma biblioteca de
“classes Java” que são utilizadas “na forma de tags” --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QA - Gerenciar Categoria</title>
        <link href="${pageContext.request.contextPath}/css/css.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <h1>Gerenciar Categoria</h1> 
        <form action="${pageContext.request.contextPath}/SalvarCategoria" method="get">
            <table>
                <tr>
                    <td><label>ID:</label></td>
                    <td><input type="hidden" name="idcategoria"  value="${categoria.idCategoria}"/></td>
                </tr>                
                <tr>
                    <td><label>Descrição:</label></td>
                    <td><input type="text" name="descricaocategoria" value="${categoria.descricaoCategoria}" required></td>
                </tr>                
                <tr>
                    <td>
                        <center>
                            <input type="submit" value="Salvar" name="cadastrar">
                            <input type="reset" value="Limpar"/>
                        </center>
                     </td>
                </tr>
                <tr>
                    <td><label>${mensagem}</label></td>
                </tr>
            </table>
        </form>

        <%--O que é JSTL? JavaServer Pages Standard Template Library
        o qual podemos usar para recuperar dados de forma transparente --%>        
        <table border=1 cellspacing=0 class="blueTable">
            <h1>Lista de Categorias </h1>
            <thead>
                <tr>
                    <th> ID </th>
                    <th> Descrição </th>
                    <th colspan="2"> Editar </th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="categoria" items="${categorias}"> <!--JSTL forEach - utilizado para percorrer a lista retornada pelo Servlet-->
                    <tr>
                        <td> ${categoria.idCategoria} </td>
                        <td> ${categoria.descricaoCategoria} </td>
                        <td><a href="${pageContext.request.contextPath}/ExcluirCategoria?idcategoria=${categoria.idCategoria}"> Excluir </a></td>
                        <td><a href="${pageContext.request.contextPath}/CarregarCategoria?idcategoria=${categoria.idCategoria}"> Alterar </a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>            
    </body>
</html>
