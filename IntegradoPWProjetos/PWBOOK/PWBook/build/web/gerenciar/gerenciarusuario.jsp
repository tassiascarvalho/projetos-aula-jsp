<%-- 
    Document   : gerenciarusuario
    Created on : 27/05/2021, 13:29:51
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Uma Taglib é nada mais nada menos que uma biblioteca de tags
customizadas que são utilizadas na composição de páginas JSP. 
Pode-se dizer que uma Taglib é uma biblioteca de
“classes Java” que são utilizadas “na forma de tags” --%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.jsdelivr.net/npm/vue@2.6.14/dist/vue.js"></script>
        <title>Gerenciar Usuario</title>
    </head>
    <body>
        <h1>Gerenciar Usuario</h1>        
        <form action="${pageContext.request.contextPath}/SalvarUsuario" method="POST">
            <label for="idUsuario">Id Usuario</label>
            <input type="number" name="idUsuario" value="${usuario.idUsuario}">
            <br /><br />
            <label for="nomeUsuario">Nome Usuario</label>
            <input type="text" name="nomeUsuario" value="${usuario.nomeUsuario}">
            <br /><br />
            <label for="dataNascimentoUsuario">Data Nascimento</label>
            <input type="date" name="dataNascimentoUsuario" value="${usuario.dataNascimentoUsuario}">
            <br /><br />
            <label for="emailUsuario">E-mail</label>
            <input type="email" name="emailUsuario" value="${usuario.emailUsuario}">
            <br /><br />
            <label for="senhaUsuario">Senha</label>
            <input type="password" name="senhaUsuario" value="${usuario.senhaUsuario}">
            <br /><br />
            <label for="telefoneUsuario">Telefone</label>
            <input type="text" name="telefoneUsuario" value="${usuario.telefoneUsuario}">
            <br /><br />
            <label for="generoUsuario">Gênero</label>
            <input type="text" name="generoUsuario" maxlength="1" value="${usuario.generoUsuario}">
            <br /><br />
            <label for="caminhofotoUsuario">Foto</label>
            <input type="file" name="caminhofotoUsuario" value="${usuario.caminhofotoUsuario}">
            <br /><br />
            <label for="sinteseUsuario">Sintese Usuario</label><br />
            <textarea rows="10" cols="30" name="sinteseUsuario" value="${usuario.sinteseUsuario}"></textarea>
            <br /><br />
            <label for="caminhocapaUsuario">Capa</label>
            <input type="file" name="caminhocapaUsuario" value="${usuario.caminhocapaUsuario}">
            <br /><br />
            <label for="tiposeguidorUsuario">Privacidade:</label>
            Conteúdo Aberto<input type="radio" value="A" name="tiposeguidorUsuario" ${usuario.tiposeguidorUsuario == 'A'?'checked':''}>
            Conteúdo Restrito<input type="radio" value="R" name="tiposeguidorUsuario" ${usuario.tiposeguidorUsuario == 'R'?'checked':''}>
            <br /><br />             
            <input type="submit" value="Salvar">            
        </form>
        ${mensagem}

        <!--Listagem-->
        <table border="1px">
            <caption>Lista de Usuarios Cadastrados</caption>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>nome</th>
                    <th>data de nascimento</th>
                    <th>e-mail</th>
                    <th>senha</th>
                    <th>telefone</th>
                    <th>genero</th>
                    <th>foto</th>
                    <th>sintese</th>
                    <th>capa</th>
                    <th>tipo seguidor</th>  
                    <th colspan="2">Editar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="usuario" items="${listadeusuarios}" >
                    <tr>
                        <td>${usuario.idUsuario}</td>
                        <td>${usuario.nomeUsuario}</td>
                        <td>${usuario.dataNascimentoUsuario}</td>
                        <td>${usuario.emailUsuario}</td>
                        <td>${usuario.senhaUsuario}</td>
                        <td>${usuario.telefoneUsuario}</td>
                        <td>${usuario.generoUsuario}</td>
                        <td>${usuario.caminhofotoUsuario}</td>
                        <td>${usuario.sinteseUsuario}</td>
                        <td>${usuario.caminhocapaUsuario}</td>
                        <td>${usuario.tiposeguidorUsuario}</td>
                        <td><a href="${pageContext.request.contextPath}/ExcluirUsuario?idUsuario=${usuario.idUsuario}">  Excluir </a></td>
                        <td><a href="${pageContext.request.contextPath}/CarregarUsuario?idUsuario=${usuario.idUsuario}"> Alterar </a></td>
                        <td><a href="${pageContext.request.contextPath}/DadosPublicacao?idUsuario=${usuario.idUsuario}"> Publicação </a></td>
                    </tr>
                </c:forEach>                
            </tbody>
        </table>
    </body>
</html>
