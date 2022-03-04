<%-- 
    Document   : salvar
    Created on : 10/09/2016, 17:52:52
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript">
            function mascara(t, mask) {
            var i = t.value.length;
            var saida = mask.substring(1, 0);
            var texto = mask.substring(i)
            if (texto.substring(0, 1) !== saida) {
            t.value += texto.substring(0, 1);
        }
}
        </script>
        
        <title>Salvar | Cliente</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%;">
        <form name="salvarcliente" enctype="multipart/form-data" method="post" action="${pageContext.request.contextPath}/SalvarCliente">
            <table>
                <h1>Cadastro de Cliente</h1>
                <tr>
                    <td>
                        <label>ID:</label>
                    </td>
                    <td>
                        <input type="number" name="id" value="${cliente.idPessoa}" readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Nome:</label>
                    </td>
                    <td>
                        <input type="text" name="nome" placeholder="Nome" value="${cliente.nomePessoa}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>RG:</label>
                    </td>
                    <td>
                        <input type="text" name="rg" maxlength="13" placeholder="00.000.000-00" onkeypress="mascara(this, '##.###.###-#')" value="${cliente.rgCliente}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>CPF:</label>
                    </td>
                    <td>
                        <input type="text" name="cpf" maxlength="14" placeholder="000.000.000-00" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" onkeypress="mascara(this, '###.###.###-##')" value="${cliente.cpfPessoa}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Cidade:</label>
                    </td>
                    <td>
                        <input type="text" name="cidade" placeholder="Cidade" value="${cliente.cidadeCliente}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Qtd. Dep.:</label>
                    </td>
                    <td>
                        <input type="number" min="0" name="quantidade_dependentes" placeholder="00" value="${cliente.quantidadeDependentesCliente}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Login:</label>
                    </td>
                    <td>
                        <input type="text" name="login" placeholder="Login" value="${cliente.loginPessoa}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Senha:</label>
                    </td>
                    <td>
                        <input type="password" placeholder="Senha" name="senha" value="${cliente.senhaPessoa}" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Foto:</label>
                    </td>
                    <td>
                        <input type="file" accept="image/*" name="foto" required>
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <center><input type="submit" value="Salvar" name="cadastrar"></center>
                    </td>
                    <td>
                        <label>${mensagem}</label>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
