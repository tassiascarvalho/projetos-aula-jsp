<%-- 
    Document   : cadastrarcliente
    Created on : 03/04/2018, 19:47:31
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente</title>
        <script src="cidades-estados-1.4-utf8.js" type="text/javascript"></script>
    </head>
    <body>
        <form id="form" name="cadastrarpessoa" method="post" action="${pageContext.request.contextPath}/CadastrarPessoaCliente">
            <input type="text" name="nomepessoa" value="${pessoa.nomePessoa}" placeholder="Nome" required><br>
            <input type="text" name="responsavelpessoa" value="${pessoa.responsavelPessoa}" placeholder="Pai ou Responsável" required><br>
            <input type="text" name="telefoneresponsavelpessoa" value="${pessoa.telefoneResponsavelPessoa}" placeholder="Telefone do responsável" required><br>
            <input type="text" name="ceppessoa" value="${pessoa.cepPessoa}" placeholder="Cep" required><br>
            <select name="estadopessoa" id="estado1" value="${pessoa.estadoPessoa}"></select>
            <select name="cidadepessoa" id="cidade1" value="${pessoa.cidadePessoa}"></select>
            <script language="JavaScript" type="text/javascript" charset="utf-8">
                new dgCidadesEstados({
                    cidade: document.getElementById('cidade1'),
                    estado: document.getElementById('estado1')
                })
            </script><br>
            <input type="text" name="cpfpessoa" value="${pessoa.cpfPessoa}" placeholder="Cpf" required><br>
            <input type="text" name="telefonepessoa" value="${pessoa.telefonePessoa}" placeholder="Telefone"><br>
            <input type="text" name="celularpessoa" value="${pessoa.celularPessoa}" placeholder="Celular" required><br>
            <input type="text" name="enderecopessoa" value="${pessoa.enderecoPessoa}" placeholder="Endereço" required><br>
             <input type="text" name="numeroendpessoa" value="${pessoa.numeEndPessoa}" placeholder="Número" required><br>
            <input type="text" name="bairropessoa" value="${pessoa.bairroPessoa}" placeholder="Bairro" required><br>
            <input type="radio" id="Casado" value="${pessoa.sexoPessoa}" name="Civil"><label>Masculino</label>
            <input type="radio" id="Solteiro" value=" ${pessoa.sexoPessoa}" name="Civil" checked=""><label>Feminino</label>
            <input type="radio" id="Separado" value="${pessoa.sexoPessoa}" name="Civil"><label>Outros</label><br>
            <input type="text" name="emailpessoa" value="${pessoa.emailPessoa}" placeholder="Email" required><br>
            <input type="password" name="senhapessoa" value="${pessoa.senhaPessoa}" placeholder="Senha" required><br>
            <input type="date" name="datanascimentopessoa" value="${pessoa.dataNascimentoPessoa}" placeholder="Data de nascimento" required><br>
            <input type="hidden" name="perfilpessoa" value="Cliente"><br>
            <input type="submit" value="Cadastrar" name="cadastrarpessoa" />
        </form>
    </body>
</html>
