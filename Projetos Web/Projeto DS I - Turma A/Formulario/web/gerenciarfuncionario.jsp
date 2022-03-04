<%-- 
    Document   : gerenciarfuncionario
    Created on : 19/02/2020, 16:04:42
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
       <form action="SalvarFuncionario" method="get">
            Nome: <input type="text" name="nome">
            <br/>
            Idade: <input type="text" name="idade">
            <br/>
            CPF: <input type="text" name="cpf">
            <br/>
            Função: 
            <select name="funcao">
                <option value="tec">Tecnico</option>
                <option value="sup">Supervisor</option>
                <option value="ger">Gerente</option>                
            </select>
            
            <br/>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
