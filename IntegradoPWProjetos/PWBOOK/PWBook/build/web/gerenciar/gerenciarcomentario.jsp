<%-- 
    Document   : gerenciarcomentario
    Created on : 27/05/2021, 13:40:03
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciar</title>

    </head>
    <body>
        <h1>Gerenciar Comentário</h1>

        <table>
            <form action="#" method="POST">            
                <tr>
                    <td><label for="idComentario">ID</label></td>
                    <td><input type="number" name="idComentario"></td>
                </tr>                
                <tr>
                    <td><label for="textoComentario">Texto</label></td>
                    <td><textarea name="textComentario"></textarea><br></td>
                </tr>             
                <tr>
                    <td><label for="respostaComentario">Resposta</label></td>
                    <td><textarea name="respostaComentario"></textarea><br></td>
                </tr>             
                <td></td>
                <td colspan="2" id="Enviar"><input type="submit" value="Enviar"></td>
                </tr>            
            </form>            
        </table>
    </body>
</html>
