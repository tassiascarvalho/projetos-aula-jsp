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
        <title>Salvar | Especie</title>
    </head>
    <body style="font-family:Arial; background-size: 100%; background-image:url(https://visualhunt.com/photos/l/4/pug-dog-pet-animal-cute-tongue.jpg); height: 100%;">
        <form name="salvarespecie" method="post" action="${pageContext.request.contextPath}/SalvarEspecie">
            <table>
                <h1>Cadastro de Espécie</h1>
                <tr>
                    <td>
                        <label>ID:</label>
                    </td>
                    <td>
                        <input type="number" name="id" value="${especie.idEspecie}" readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Nome:</label>
                    </td>
                    <td>
                        <input type="text" name="nome" placeholder="Nome" value="${especie.nomeEspecie}" autofocus required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Descrição:</label>
                    </td>
                    <td>
                        <input type="text" name="descricao" placeholder="Descrição" value="${especie.descricaoEspecie}" required>
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
