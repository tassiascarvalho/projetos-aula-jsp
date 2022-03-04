<%-- 
    Document   : gerenciarcliente
    Created on : 18/02/2020, 16:03:45
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciar Cliente</title>
    </head>
    <body>
        
        <form action="SalvarCliente" method="get">
            Nome: <input type="text" name="nomeCliente">
            <br/>
            RG: <input type="text" name="rg">
            <br/>
            CPF: <input type="text" name="cpf">
            <br/>
            Cidade: 
            <select name="cidade">
                <option value="Ferpa">Fernandópolis</option>
                <option value="Votu">Votuporanga</option>
                <option value="Jales">Jales</option>                
            </select>
            <br/>
            Genero:
            Feminino<input type="radio" name="genero" value="F">
            Masculino<input type="radio" name="genero" value="M">
            <br/>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
