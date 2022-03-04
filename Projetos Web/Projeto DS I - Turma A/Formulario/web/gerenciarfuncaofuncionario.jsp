<%-- 
    Document   : gerenciarfuncaofuncionario
    Created on : 03/03/2020, 16:49:28
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>GERENCIAR FUNÇÃO</h1>
        <form action="SalvarFuncaoFuncionario" method="POST">
            ID: <input type="Text" 
                       name="idfuncaofuncionario">
            <br />
            Nome:<input type="Text" 
                        name="nomefuncaofuncionario">
            <br />
            Descrição:<input type="Text" 
                        name="descricaofuncaofuncionario">
            <br />
            Base Salarial:<input type="Text"
                    name="basesalarialfuncaofuncionario">
            <br />
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
