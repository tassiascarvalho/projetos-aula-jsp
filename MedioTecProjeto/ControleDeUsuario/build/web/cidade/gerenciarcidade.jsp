<%-- 
    Document   : gerenciarcidade
    Created on : 23/11/2021, 17:53:48
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>JSP Page</title>
        <style>
            body{
                width: 50%;
                margin-left: 25%;
            }
        </style>
    </head>
    <body>
        <h1>Gerenciar Cidade</h1>
        
        <form action="SalvarCidade" method="post">
            <label for="idcidade" class="form-label">Id Cidade</label>
            <input type="number" name="idcidade" class="form-control">
            <br /><br />
            <label class="form-label">Nome Cidade</label>
            <input type="text" class="form-control" name="nomecidade">
            <br /><br />
            <label class="form-label">Estado</label>
            <select name="idestado" class="form-control">
                <c:forEach var="estado" items="${estados}">
                     <option value="${estado.idEstado}">${estado.siglaEstado}</option>
                </c:forEach>
            </select>
            <br /><br />
            <input type="submit" value="Salvar">
        </form>
        <h3>${mensagem}</h3>
        <h1>Lista de Cidades</h1>

        <table border="1" class="table table-dark table-hover">
            
            <thead>
            <th>ID Cidade</th>
            <th>Nome Cidade</th>
            <th>Sigla Estado</th>
            <th>Nome Estado</th>
            <th colspan="2">Editar</th>
        </thead>
        <tbody>                
            <c:forEach var="cidade" items="${listadecidades}">
                <tr>
                    <td>${cidade.idCidade}</td>
                    <td>${cidade.nomeCidade}</td>
                    <td>${cidade.estado.siglaEstado}</td>
                    <td>${cidade.estado.nomeEstado}</td>
                    <td><a href="ExcluirCidade?idcidadeexcluir=${cidade.idCidade}">Excluir</a></td>
                    <td><a href="CarregarCidade?idcidadecarregar=${cidade.idCidade}">Editar</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </body>
</html>
