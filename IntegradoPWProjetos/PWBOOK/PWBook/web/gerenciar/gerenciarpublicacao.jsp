
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciar Publicação</title>
    </head>
    <body>
        <h1>Gerenciar Publicação</h1>        
        <h1>Usuario Escolhido: ${usuario.nomeUsuario}</h1>        
        <form action="SalvarPublicacao" method="POST">
            <label for="idPublicacao" >ID Publicação</label>
            <input type="text" name="idPublicacao" />
            <br />            
            <label for="dataPublicacao">Data Publicação</label>
            <input type="date" name="dataPublicacao" />
            <br />
            <label for="textoPublicacao">Descrição Publicação</label><br />
            <textarea name="textoPublicacao" rows="10" cols="70"></textarea>
            <br />
            <label for="tipoPublicacao">Tipo Publicação</label>
            <input type="radio" name="tipoPublicacao" value="1" />Privada
            <input type="radio" name="tipoPublicacao" value="2" />Todos Visualizam
            <input type="radio" name="tipoPublicacao" value="3" />Somente Amigos
            <br />
            
            <input type="hidden" name="idUsuario" value="${usuario.idUsuario}" />
            <br />
            <input type="submit" value="Publicar" />                
        </form>
        <h3>${mensagem}</h3>
    </body>
</html>
