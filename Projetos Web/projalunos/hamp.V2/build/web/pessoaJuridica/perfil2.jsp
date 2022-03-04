<%-- 
    Document   : perfil
    Created on : 14/10/2017, 13:36:51
    Author     : Douglas Costa
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>  
        <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery-3.2.1.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.js" type="text/javascript"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-3">
                <img class="img-rounded img-responsive" src="${pageContext.request.contextPath}/fotos/${pessoaj.imagemPessoaJ}">
            </div>
            <div class="col-md-9">
                <form method="POST" action="${pageContext.request.contextPath}/CadastrarPessoaJ" enctype="multipart/form-data">
                    <p> <input class="form-control" type="hidden" name="idpessoa" size="60" readonly value=${pessoaj.idPessoa} ></p>

                    <label>Nome do Responsável:</label> 
                    <input disabled class="form-control" type="text" name="nomepessoa" required value="${pessoaj.nomePessoa}">
                    <label>Nome Fantasia da Empresa:</label> 
                    <input disabled class="form-control" type="text" name="razaosocial" required value=${pessoaj.razaoSocialPessoaJuridica}>
                    <label>CNPJ:</label> 
                    <input disabled class="form-control" type="text" name="cpnj" required value=${pessoaj.cpnjPessoaJuridica}>
                    <label>Telefone:</label> 
                    <input disabled class="form-control" type="tel" name="telefonepessoa" required value=${pessoaj.telefonePessoa}>

                    <label>Email Empresárial:</label> 
                    <input  disabled class="form-control" type="email" name="emailpessoa" required value=${pessoaj.emailPessoa}>

                    <label>Senha:</label> 
                    <input disabled class="form-control form-inline" type="password" name="senhapessoa" required value=${pessoaj.senhaPessoa}>

                    <input type="hidden" id="tipoForm" name="tipoForm" value="imagem">

                    <label> Foto de perfil
                        <input type="file"  disabled  name="file[]"  required class="btn btn-default" value="${pessoaj.imagemPessoaJ}"/>
                    </label> 
                    <br />
                    <button type="button" class="btn btn-info" id="alterar">Alterar Dados</button>
                    <button type="submit" class="btn btn-success" id="salvar" disabled>Salvar Perfil<span class=" glyphicon glyphicon-ok"></span></button> 


                    <script src="${pageContext.request.contextPath}/javascript/formulario.js" type="text/javascript"></script>
                    <p>${mensagem}</p>

                </form>
            </div>
        </div>
    </body>
</html>
