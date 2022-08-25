<%-- 
    Document   : loginfisica
    Created on : 7 de jun de 2022, 13:32:08
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
        <h1>Login Pessoa Física</h1>
        <form action="LogarFisica" method="POST">
            <label>E-mail</label>
            <input type="text" name="emailpessoa">
            <br>
            <label>Senha</label>
            <input type="password" name="senhapessoa">
            <input type="hidden" name="acao" value="login">
            <br>
            <input type="submit" value="Entrar">        
        </form>
        ${mensagem}
    </body>
</html>
