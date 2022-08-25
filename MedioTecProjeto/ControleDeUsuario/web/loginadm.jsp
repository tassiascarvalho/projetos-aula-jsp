<%-- 
    Document   : loginadm
    Created on : 10 de jun de 2022, 08:59:49
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login ADM</title>
        <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <form action="LogarAdministrador" method="post">
                    <div class="form-outline mb-4">
                        <input type="text" id="form2Example1" class="form-control" name="login"/>
                        <label class="form-label" for="form2Example1">Login</label>
                    </div>
                    <div class="form-outline mb-4">
                        <input type="password" id="form2Example2" class="form-control" name="senha" />
                        <label class="form-label" for="form2Example2">Senha</label>
                    </div>
                    <div class="row mb-4">
                        <div class="col d-flex justify-content-center">
                            <!-- Checkbox -->
                            <div class="form-check">                                                   
                            </div>
                        </div>
                        <div class="col">
                            <a href="#!">Esqueceu a senha?</a>
                        </div>
                    </div>
                    <input type="submit" value="Entrar" class="btn btn-primary btn-block mb-4">
                    <div class="text-center">
                        <p><a href="#!">Cadastre-se</a></p>                                       
                    </div>
                </form>
            </div>
            <div class="col-md-4"></div>
        </div>
        ${mensagem}

        <script src="assets/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
