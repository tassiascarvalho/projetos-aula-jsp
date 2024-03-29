<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : salvar
    Created on : 03/09/2017, 17:10:27
    Author     : Douglas Costa
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastrar Empresa</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/estilo.css" rel="stylesheet" type="text/css"/>
        <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery-3.2.1.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/javascript/formulario.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container">
            <h1>Cadastro de Empresa Locadora</h1>
            <form method="POST" action="${pageContext.request.contextPath}/CadastrarPessoaJ" enctype="multipart/form-data">
                <p> <input class="form-control" type="hidden" name="idpessoa" size="60" readonly value=${pessoaj.idPessoa} ></p>
                <p>Nome do Respons�vel: <input class="form-control" type="text" name="nomepessoa" required value=${pessoaj.nomePessoa}></p>
                <p>Raz�o Social da Empresa: <input class="form-control" type="text" name="razaosocial" required value=${pessoaj.razaoSocialPessoaJuridica}></p>
                <p>Cpnj: <input class="form-control" type="text" name="cpnj" required value=${pessoaj.cpnjPessoaJuridica}></p>
                <p>Telefone: <input class="form-control" type="tel" name="telefonepessoa" required value=${pessoaj.telefonePessoa}></p>

                <p>Email Empres�rial: <input class="form-control" type="email" name="emailpessoa" required value=${pessoaj.emailPessoa}></p>
                <p>Confirmar Email : <input class="form-control" type="email"  required value=${pessoaj.emailPessoa}></p>

                <p>Senha: <input class="form-control" type="password" name="senhapessoa" required value=${pessoaj.senhaPessoa}></p>
                <p>Confirmar Senha: <input class="form-control" type="password" required value=${pessoaj.senhaPessoa}></p>

                <input type="hidden" id="tipoForm" name="tipoForm" value="imagem">

                Arquivo: <input type="file" name="file[]" />
                <br />

                <p><input type="submit" value="Cadastrar" class="btn btn-success"> 
                    <a href="ListarPessoaJ">Ver perfil</a></p>
                <p>${mensagem}</p>

            </form>
        </div>
    </body>
</html>
