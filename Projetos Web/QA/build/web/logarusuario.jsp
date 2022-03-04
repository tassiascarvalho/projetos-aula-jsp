<%-- 
    Document   : logarusuario
    Created on : 03/06/2020, 19:26:47
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>

        <!DOCTYPE html>
    <!--
    To change this license header, choose License Headers in Project Properties.
    To change this template file, choose Tools | Templates
    and open the template in the editor.
    -->
    <html>
        <head>
            <title>LAN-HOUSE TSUNDERE</title>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
            <script src="jv/js.js" type="text/javascript"></script>
        </head>
        <body>
            <div class="login-reg-panel">
                <div class="login-info-box">
                    <h2>Ja tem uma conta existente?</h2>
                    <p>Clique aqui para logar</p>
                    <label id="label-register" for="log-reg-show" onclick="fadeLogar()">Login</label>
                    <input type="radio" name="active-log-panel" id="log-reg-show"  >
                </div>

                <div class="register-info-box">
                    <h2>Você não tem uma conta?</h2>
                    <p>Clique aqui agora mesmo para se cadastrar!</p>

                    <label id="label-login" for="log-login-show" onclick="fadeRegistrar()">Registrar
                        <input type="radio" name="active-log-panel" id="log-login-show"> </label>
                </div>

                <div class="white-panel">
                    <div class="login-show">
                        <h2>LOGIN</h2>
                        <form action="${pageContext.request.contextPath}/LogarPessoa" method="POST">
                            <input type="text" placeholder="Email" name="loginpessoa">
                            <input type="password" placeholder="Senha" name="senhapessoa">
                            <input type="button" value="Login">
                        </form>

                        <a href="">Esqueceu a senha?</a>
                    </div>
                    <div class="register-show">
                        <h2>REGISTRAR</h2>
                        <input type="text" placeholder="Email" >
                        <input type="password" placeholder="Senha">
                        <input type="password" placeholder="Confirmar Senha">
                        <input type="button" value="Registrar">
                    </div>
                </div>
            </div>
        </body>
    </html>





