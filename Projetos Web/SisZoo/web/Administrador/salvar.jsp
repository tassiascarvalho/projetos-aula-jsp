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
        
        <title>Salvar | Administrador</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%;">
        <form name="salvaradministrador" method="post" action="${pageContext.request.contextPath}/SalvarAdministrador">
            <table>
                <h1>Cadastro de Administrador</h1>
                <tr>
                    <td>
                        <label>ID:</label>
                    </td>
                    <td>
                        <input type="number" name="id" value="${administrador.idAdministrador}" readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Nome:</label>
                    </td>
                    <td>
                        <input type="text" name="nome" placeholder="Nome" value="${administrador.nomeAdministrador}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>CPF:</label>
                    </td>
                    <td>
                        <input type="text" name="cpf" maxlength="14" placeholder="000.000.000-00" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" onkeypress="mascara(this, '###.###.###-##')" value="${administrador.cpfAdministrador}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Login:</label>
                    </td>
                    <td>
                        <input type="text" name="login" placeholder="login" value="${administrador.loginAdministrador}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Senha:</label>
                    </td>
                    <td>
                        <input type="password" name="senha" value="${administrador.senhaAdministrador}" autofocus required>
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
