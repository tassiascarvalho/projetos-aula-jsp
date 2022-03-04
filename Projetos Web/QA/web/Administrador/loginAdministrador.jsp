<%-- 
    Document   : login
    Created on : 03/06/2020, 16:28:37
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            form{
                background: rgba(255,255,255,0.5); 
                border-radius: 10px; 
                height: 23%; 
                width: 11%;
                position: absolute; 
                left: 37%; 
                top: 34%; 
                padding: 15px
            } 
        </style>
    </head>
    <body>
        <form name="logar" method="post" action="${pageContext.request.contextPath}/LogarAdministrador">
        <table style="text-align: center">
            <thead>
            <th><h1>LOGIN</h1><hr></th>
            </thead>
            <tr>
                <td>
                    <input type="text" name="login" placeholder="Login" autofocus required>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="password" name="senha" placeholder="Senha" autofocus required>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="hidden" name="acao" value="logar"><input type="submit" value="Acessar" name="logar">
                    <a href="Administrador/salvar.jsp">Cadastrar</a>
                </td>
            </tr>
            <tr>
                <td>
            <center><label>${mensagem}</label></center>
            </td>
            </tr>
        </table>
    </form>
    </body>
</html>
