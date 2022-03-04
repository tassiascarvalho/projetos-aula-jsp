<%-- 
    Document   : salvar
    Created on : 02/10/2017, 22:11:05
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastrar Cliente</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6">
                <h1>Cadastro de Cliente</h1>
                <form method="POST" action="${pageContext.request.contextPath}/SalvarPessoaF">
                    <input class="form-control"  type="number" name="idpessoa" size="60" readonly value=${pessoaf.idPessoa} >

                    <p>Nome Completo: <input class="form-control" type="text" name="nomepessoa" required value=${pessoaf.nomePessoa}></p>

                    <p>Gênero: 
                        <label class="form-check-label">
                            <input class="form-check-input" type="radio" name="sexo" id="masc" value="Masculino"> Masculino
                        </label>
                        <label class="form-check-label">
                            <input class="form-check-input" type="radio" name="sexo" id="fem" value="Feminino"> Feminino
                        </label>
                        <label class="form-check-label">
                            <input class="form-check-input" type="radio" name="sexo" id="outro" value="Outro"> Outro
                        </label>

                    </p>
                    <p>Data de nascimento: <input type="date"  class="form-control" name="data"  value=${pessoaf.dataNascimentoPessoaFisica}></p>

                    <p>CPF: <input class="form-control" type="text" name="cpf" required value=${pessoaf.cpfPessoaFisica}></p>

                    <p>Telefone: <input class="form-control" type="tel" name="telefonepessoa" required value=${pessoaf.telefonePessoa}></p>

                    <p>Email: <input class="form-control" type="email" name="emailpessoa" required value=${pessoaf.emailPessoa}></p>
                    <p>Confirmar Email : <input class="form-control" type="email"  required value=${pessoaf.emailPessoa}></p>

                    <p>Senha: <input class="form-control" type="password" name="senhapessoa" required value=${pessoaf.senhaPessoa}></p>
                    <p>Confirmar Senha: <input class="form-control" type="password" required value=${pessoaf.senhaPessoa}></p>

                    <p><input type="submit" value="Cadastrar" class="btn btn-success"> </p>           
                    <p>${mensagem}</p>


                </form>
                
            </div>
        </div>
    </body>
</html>
