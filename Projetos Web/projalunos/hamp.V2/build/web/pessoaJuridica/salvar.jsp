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
    </head>
    <body>
        <div class="container">
            <h1>Cadastro de Empresa Locadora</h1>
            <form method="POST" action="${pageContext.request.contextPath}/SalvarPessoaJ" enctype="multipart/form-data">
                <p>Id Emprsa: <input class="form-control" type="hidden" name="idpessoa" size="60" readonly value=${pessoaj.idPessoa} ></p>
                <p>Nome do Responsável: <input class="form-control" type="text" name="nomepessoa" required value=${pessoaj.nomePessoa}></p>
                <p>Razão Social da Empresa: <input class="form-control" type="text" name="razaosocial" required value=${pessoaj.razaoSocialPessoaJuridica}></p>
                <p>Cpnj: <input class="form-control" type="text" name="cpnj" required value=${pessoaj.cpnjPessoaJuridica}></p>
                <p>Telefone: <input class="form-control" type="tel" name="telefonepessoa" required value=${pessoaj.telefonePessoa}></p>

                <p>Email Empresárial: <input class="form-control" type="email" name="emailpessoa" required value=${pessoaj.emailPessoa}></p>
                <p>Confirmar Email : <input class="form-control" type="email"  required value=${pessoaj.emailPessoa}></p>

                <p>Senha: <input class="form-control" type="password" name="senhapessoa" required value=${pessoaj.senhaPessoa}></p>
                <p>Confirmar Senha: <input class="form-control" type="password" required value=${pessoaj.senhaPessoa}></p>
                <p> Imagem <input type="file" class="form-control" 
                            placeholder=""  name="imgpessoaj" required value="${pessoaj.imagemPessoaj}" id="imagemPessoa" autofocus > </p>
                
                <p><input type="submit" value="Cadastrar" class="btn btn-success"> </p>           
                <p>${mensagem}</p>

            </form>
        </div>
    </body>
</html>
