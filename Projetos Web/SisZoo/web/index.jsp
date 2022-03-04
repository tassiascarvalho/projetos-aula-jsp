<%-- 
    Document   : index
    Created on : 04/09/2016, 08:50:08
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home | isabellacristinaxm</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://static.pexels.com/photos/9079/night-animal-cats-clean.jpg); height: 100%;"/>

    <form style="background: rgba(255,255,255,0.5); border-radius: 10px; height: 23%; width: 11%; position: absolute; left: 37%; top: 34%; padding: 15px" name="logar" method="post" action="${pageContext.request.contextPath}/LogarAdministrador">
        <table style="text-align: center">
            <thead>
            <th><h1>LOGIN</h1><hr></th>
            </thead>
            <tr>
                <td>
                    <input type="text" name="login" placeholder="Login" value="${administrador.loginAdministrador}" autofocus required>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="password" name="senha" placeholder="Senha" value="${administrador.senhaAdministrador}" autofocus required>
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
