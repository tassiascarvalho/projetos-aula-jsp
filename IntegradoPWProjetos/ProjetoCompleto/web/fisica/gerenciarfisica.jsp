<%-- 
    Document   : gerenciarfisica
    Created on : 24/02/2022, 11:32:41
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-5">
                <h1 class="text-danger">Cadastro de Pessoa Fisica</h1>
                <form action="#" method="post">                    
                    <label for="idpessoa"  class="form-label">Id Pessoa </label>
                    <input class="form-control" type="text" name="idpessoa"> <br />            
                    <label for="nomepessoa" class="form-label">Nome Pessoa</label>
                    <input type="text"  class="form-control"  name="nomepessoa"> <br />
                    E-mail Pessoa <input type="text"  class="form-control"  name="emailpessoa"> <br />
                    Id Fisica <input type="text" class="form-control"  name="idfisica"><br />
                    CPF Fisica <input type="text" class="form-control"  name="cpffisica"><br />
                    Apelido Fisica <input type="text" class="form-control"  name="apelidofisica"><br />
                    <input class="btn btn-primary" type="submit" value="Salvar">
                </form>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>