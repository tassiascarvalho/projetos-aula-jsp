<%-- 
    Document   : gerenciarestados
    Created on : 30/08/2021, 13:33:55
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        
        <title>Gerenciar Estados</title>
        <style>
            table.blueTable {
                border: 1px solid #1C6EA4;
                background-color: #EEEEEE;
                width: 100%;
                text-align: left;
                border-collapse: collapse;
            }
            table.blueTable td, table.blueTable th {
                border: 1px solid #AAAAAA;
                padding: 3px 2px;
            }
            table.blueTable tbody td {
                font-size: 13px;
            }
            table.blueTable tr:nth-child(even) {
                background: #D0E4F5;
            }
            table.blueTable thead {
                background: #1C6EA4;
                background: -moz-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
                background: -webkit-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
                background: linear-gradient(to bottom, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
                border-bottom: 2px solid #444444;
            }
            table.blueTable thead th {
                font-size: 15px;
                font-weight: bold;
                color: #FFFFFF;
                border-left: 2px solid #D0E4F5;
            }
            table.blueTable thead th:first-child {
                border-left: none;
            }

            input{
                border: 3px groove #FFA5A5;
                outline:0;
                height:25px;
                width: 275px;
            }

        </style>
    </head>

    <body>
        <h1>Gerenciar Estados</h1>
        <!--contextPath retorna a raiz do projeto-->
        <form action="${pageContext.request.contextPath}/SalvarEstado">
            <label for="id">ID</label>
            <input type="number" name="id" value="${oEstado.idEstado}"/>
            <br />
            <label for="nome">Nome</label>
            <input type="text" name="nome" value="${oEstado.nomeEstado}"/>
            <br />
            <label for="sigla">Sigla</label>
            <input type="text" name="sigla" value="${oEstado.siglaEstado}"/>
            <br />            
            <input type="submit" value="Salvar"/>
        </form>   
        ${mensagem}
        <h1>Lista de Estados</h1>
        <table class="blueTable">
            <thead>
            <th>ID</th>
            <th>Nome</th>
            <th>Sigla</th>
            <th colspan="2">Editar</th>
        </thead>
        <tbody>
            <c:forEach var="estado" items="${listaestados}" >
                <!--Vai se repetir enquanto houver estados para serem mostrados-->
                <tr>
                    <td>${estado.idEstado}</td>
                    <td>${estado.nomeEstado}</td>
                    <td>${estado.siglaEstado}</td>
                    <td><a href="ExcluirEstado?idestadoexcluir=${estado.idEstado}">Excluir</a></td>
                    <td><a href="CarregarEstado?idestadocarregar=${estado.idEstado}">Alterar</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
