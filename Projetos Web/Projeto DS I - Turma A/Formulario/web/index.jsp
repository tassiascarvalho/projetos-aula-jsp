<%-- 
    Document   : index
    Created on : 13/05/2020, 16:35:54
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h2>LOGIN</h2>
            <form class="form-horizontal" action="${pageContext.request.contextPath}/LogarAdministrador">
                <div class="form-group">
                    <label class="control-label col-sm-2" for="usuarioadministrador">Usuario:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="usuarioadministrador" placeholder="Usuario" name="usuarioadministrador">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2" for="senhaadministrador">Senha:</label>
                    <div class="col-sm-10">          
                        <input type="password" class="form-control" id="senhaadministrador" placeholder="Senha" name="senhaadministrador">
                    </div>
                </div>
                
                <input type="hidden" name="acao" value="logar">
                
                <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Logar</button>
                        <br />
                        ${mensagem}
                    </div>
                </div>
            </form>
        </div>

    </body>
</html>
