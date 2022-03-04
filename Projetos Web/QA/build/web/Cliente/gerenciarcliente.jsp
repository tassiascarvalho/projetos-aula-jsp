<%-- 
    Document   : gerenciarcliente
    Created on : 20/04/2020, 16:16:48
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/css.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
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
    </head>
    <body>
        <form name="salvarcliente" enctype="multipart/form-data" method="get" action="${pageContext.request.contextPath}/SalvarCliente">
            <table>
                <h1>Cadastro de Cliente</h1>
                <tr>
                    <td>
                        <label>ID Pessoa:</label>
                    </td>
                    <td>
                        <input type="number" name="id" value="${cliente.idPessoa}" readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>ID Cliente:</label>
                    </td>
                    <td>
                        <input type="number" name="id" value="${cliente.idCliente}" readonly>
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
                        <input type="number" min="0" name="qtddep" placeholder="00" value="${cliente.quantidadeDependentesCliente}" required>
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
                        <input type="file" accept="image/*" name="foto">
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


        <table border=1 cellspacing=0 class="blueTable">
            <h1>Listagem de Cliente</h1>
            <thead>
                <tr>
                    <th> ID </th>
                    <th> ID Cliente </th>
                    <th> Nome </th>
                    <th> CPF </th>
                    <th> RG </th>
                    <th> Login </th>
                    <th> Cidade </th>
                    <th> Qtd. Dep. </th>
                    <th> Editar </th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="cliente" items="${clientes}"> <!--JSTL-->
                <tr>
                    <td> ${cliente.idPessoa} </td>
                    <td> ${cliente.idCliente} </td>
                    <td> ${cliente.nomePessoa} </td>
                    <td> ${cliente.cpfPessoa} </td>
                    <td> ${cliente.rgCliente} </td>
                    <td> ${cliente.loginPessoa} </td>
                    <td> ${cliente.cidadeCliente} </td>
                    <td> ${cliente.quantidadeDependentesCliente} </td>
                    
                    <td><a href="${pageContext.request.contextPath}/CarregarCliente?idpessoaCarregar=${cliente.idPessoa}">Alterar</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
