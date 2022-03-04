<%-- 
    Document   : cadastrarconfiguracao
    Created on : 03/04/2018, 20:14:18
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Configurações Empréstimo</h1>
        <input type="number" name="idconfiguracao" value="" readonly><br>
            <input type="number" name="valormultapadrao" placeholder="Valor da Multa" step="0.50" value="" required>
            <input type="text" name="tempolimiteretirada" value="" placeholder="Tempo de Retirada" required><br>
            <input type="submit" value="Cadastrar" name="cadastrarconfiguracao" />
    </body>
</html>
