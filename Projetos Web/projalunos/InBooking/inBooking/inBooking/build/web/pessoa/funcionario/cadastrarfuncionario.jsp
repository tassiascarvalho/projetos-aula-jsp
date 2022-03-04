<%-- 
    Document   : cadastrarfuncionario
    Created on : 03/04/2018, 19:47:31
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="../cliente/cidades-estados.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente</title>
    </head>
    <body>
        <form id="form" name="cadastrarpessoa" method="post" action="${pageContext.request.contextPath}/CadastrarPessoaFuncionario">
            <input type="number" name="idpessoa" value="${pessoa.idPessoa}" readonly><br>
            <input type="text" name="nomepessoa" value="${pessoa.nomePessoa}" placeholder="Nome" required><br>
            <input type="text" name="responsavelpessoa" value="${pessoa.responsavelPessoa}" placeholder="Responsável" required><br>
            <input type="text" name="telefoneresponsavelpessoa" value="${pessoa.telefoneResponsavelPessoa}" placeholder="Telefone do responsável" required><br>
            <input type="text" name="ceppessoa" value="${pessoa.cepPessoa}" placeholder="Cep" required><br>
            <select id="estado1" value="${pessoa.estadoPessoa}"></select>
            <select id="cidade1" value="${pessoa.cidadePessoa}"></select>
            <script  language="JavaScript" type="text/javascript" charset="utf-8">
                new dgCidadesEstados({
                    cidade: document.getElementById('cidadepessoa'),
                    estado: document.getElementById('estadopessoa')
                })
            </script><br>
            <input type="text" name="cpfpessoa" value="${pessoa.cpfPessoa}" placeholder="Cpf" required><br>
            <input type="text" name="telefonepessoa" value="${pessoa.telefonePessoa}" placeholder="Telefone"><br>
            <input type="text" name="celularpessoa" value="${pessoa.celularPessoa}" placeholder="Celular" required><br>
            <input type="text" name="enderecopessoa" value="${pessoa.enderecoPessoa}" placeholder="Endereço" required><br>
            <input type="text" name="bairropessoa" value="${pessoa.bairroPessoa}" placeholder="Bairro" required><br>
            <input type="text" name="sexopessoa" value="" placeholder="${pessoa.sexoPessoa}" required><br>
            <input type="text" name="emailpessoa" value="${pessoa.emailPessoa}" placeholder="Email" required><br>
            <input type="password" name="senhapessoa" value="${pessoa.cpfPessoa}" placeholder="Senha" required><br>
            <input type="date" name="datanascimentopessoa" value="${pessoa.datanascimentoPessoa}" placeholder="Data de nascimento" required><br>
            <input type="text" name="statuspessoa" value="${pessoa.statusPessoa}" placeholder="Status" required><br>
            <input type="hidden" name="perfilpessoa" value="Funcionario"><br>
            <input type="submit" value="Cadastrar" name="cadastrarpessoa" />           
        </form>
    </body>
</html>
