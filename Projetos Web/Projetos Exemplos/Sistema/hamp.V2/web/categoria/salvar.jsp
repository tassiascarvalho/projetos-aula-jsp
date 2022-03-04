<%-- 
    Document   : salvar
    Created on : 03/09/2017, 07:56:27
    Author     : Aluno
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salvar Categoria</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
        <div class="row">
            <div class="col-md-4 center-block">
                
                    <h1>Cadastro de categoria</h1>
                    <form method="POST" action="${pageContext.request.contextPath}/SalvarCategoria">
                        <p><label>ID: </label><input type="number" name="idcategoria" size="60" readonly value="${categoria.idCategoria}" class="form-control"></p>
                        <label>Nome da Categoria: </label> <br><input class="form-control" type="text" name="nomeCategoria" required placeholder="Ex: Ortopéticos..." value="${categoria.nomeCategoria}"><br> <br>
                        <label>Descrição da Categoria: </label> <br><textarea class="form-control" name="descricaoCategoria" required rows="5" >${categoria.descricaoCategoria}</textarea><br> <br>
                        <input type="submit" name="enviar" value="Salvar" class="btn btn-success"><br><br>
                        <p class="text-info"> ${mensagem}</p>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
