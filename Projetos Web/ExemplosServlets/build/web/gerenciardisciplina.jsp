vvv<%-- 
    Document   : gerenciardisciplina
    Created on : 01/04/2021, 08:27:14
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Gerenciar Disciplina</title>
        
    </head>
    <body>
        <h1>Gerenciar Disciplina</h1>
        
        <form action="CadastrarDisciplina" method="post">
            <label>Nome Disciplina:</label>
            <input type="text" name="nomeDisciplina">
            <br /><br />
            <label>Descricao Disciplina:</label>
            <input type="text" name="descricaoDisciplina">
            <br /><br />
            <label>Ementa Disciplina:</label>
            <textarea placeholder="Ementa" type="text" name="ementaDisciplina"></textarea>
            <br /><br />
            <input type="submit" value="Salvar">
        </form>
        
        <h3>${mensagem}</h3>
        <br/>
        <hr/>
        <br/> 
        
        <!-- Lista de Disciplinas -->
        <h1> Lista de Disciplinas </h1>
        
        <table border = "1">
            <thead> <!--Cabeçalho-->
                <tr> <!--Linha-->
                    <th>ID</th> <!--Título da Coluna-->
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Ementa</th>
                    <th>Editar</th>
                </tr>
            </thead> 
            <tbody>
                <c:forEach items="${listadisciplinas}" var="disciplina">
                    <tr>
                        <td>${disciplina.idDisciplina}</td>
                        <td>${disciplina.nomeDisciplina}</td>
                        <td>${disciplina.descricaoDisciplina}</td>
                        <td>${disciplina.ementaDisciplina}</td>
                        
                        <td><a href="${pageContext.request.contextPath}/ExcluirDisciplina?iddisciplina=${disciplina.idDisciplina}"> Excluir </a></td>
                    </tr>    
                </c:forEach> 
            </tbody>
        </table>
        
        
        
        
    </body>
</html>
