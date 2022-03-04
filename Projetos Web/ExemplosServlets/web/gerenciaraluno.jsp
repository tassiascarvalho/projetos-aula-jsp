<%-- 
    Document   : gerenciaraluno
    Created on : 11/03/2021, 08:19:49
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciar Aluno</title>
    </head>
    <body>
        <h1>Gerenciar Aluno</h1>
        
        <form method="post" action="CadastrarAluno" name="frmDadosAluno">
            <label>Nome: </label>
            <input type="text" name="nomeAluno"/>
            <br><br>
            <label>Endereço: </label>
            <input type="text" name="enderecoAluno"/>
            <br><br>            
            <label>Numero: </label>
            <input type="text" name="numeroAluno"/>
            <br><br>            
            <label>Cidade: </label>
            <input type="text" name="cidadeAluno"/>
            <br><br>            
            <label>Telefone: </label>
            <input type="text" name="telefoneAluno"/>
            <br><br>        
            <label>Idade: </label>
            <input type="number" name="idadeAluno"/>
            <br><br>   
            <label>E-mail: </label>
            <input type="text" name="emailAluno"/>
            <br><br>            
            <label>Senha: </label>
            <input type="text" name="senhaAluno"/>
            <br><br>            
            <input type="submit" value="Enviar"/>
        </form> 
        <hr>
        ${mensagem}
         <br/>
        <hr/>
        <br/> 
        
        <!-- Lista de Alunos -->
        <h1> Lista de Alunos </h1>
        
        <table border = "1">
            <thead> <!--Cabeçalho-->
                <tr> <!--Linha-->
                    <th>ID</th> <!--Título da Coluna-->
                    <th>Nome</th>
                    <th>Endereço</th>
                    <th>Numero</th>
                    <th>Cidade</th>
                    <th>Telefone</th>
                    <th>Idade</th>
                    <th>Email</th>
                    <th>Senha</th>
                </tr>
            </thead> 
            <tbody>
                <c:forEach items="${listaalunos}" var="aluno">
                    <tr>
                        <td>${aluno.idAluno}</td>
                        <td>${aluno.nomeAluno}</td>
                        <td>${aluno.enderecoAluno}</td>
                        <td>${aluno.numeroAluno}</td>
                        <td>${aluno.cidadeAluno}</td>
                        <td>${aluno.telefoneAluno}</td>
                        <td>${aluno.idadeAluno}</td>
                        <td>${aluno.emailAluno}</td>
                        <td>${aluno.senhaAluno}</td>
                    </tr>    
                </c:forEach> 
            </tbody>
        </table>
    </body>
</html>
