<%-- 
    Document   : salvar
    Created on : 11/10/2017, 15:42:37
    Author     : Ludi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salvar Administrador</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
        <div class="row">
            <div class="col-md-4 center-block">              
                    <h1>Cadastro de Administrador</h1>
                    <form method="POST" action="${pageContext.request.contextPath}/SalvarAdm">
                        <p><label>ID: </label><input type="number" name="idcategoria" size="60" readonly value="${adm.idAdm}" class="form-control"></p>
                        <label>Nome Administrador: </label> <br><input class="form-control" type="text" name="nomeadm" required value="${adm.nomeAdm}"><br> 
                        <label>Login Administrador: </label> <br><input type="text" class="form-control" name="loginadm" required rows="5" >${adm.loginAdm}<br> 
                        <label>Senha Administrador: </label> <br><input type="password" class="form-control" name="senhaadm" required rows="5" >${adm.senhaAdm}<br> 
                        <input type="submit" name="enviar" value="Salvar" class="btn btn-success"><br><br>
                        <p class="text-info"> ${mensagem}</p>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>