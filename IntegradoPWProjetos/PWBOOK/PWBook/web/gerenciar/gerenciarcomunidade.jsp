

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciar</title>

    </head>
    <body>
        <h1>Gerenciar Comunidade</h1>

        <table>
            <form action="#" method="POST">
                <tr>
                    <td><label for="idComunidade">ID</label></td>
                    <td><input type="number" name="idComunidade"></td>
                </tr>                
                <tr>
                    <td><label for="nomeComunidade">Nome</label></td>
                    <td><input type="text" name="nomeComunidade"><br></td>
                </tr>             
                <tr>
                    <td><label for="descricaoComunidade">Descrição</label></td>
                    <td><textarea name="descricaoComunidade"></textarea><br></td>
                </tr>             
                <tr> 
                    <td><label for="caminhofotoComunidade">Foto</label></td>
                    <td><input type="file" name="caminhofotoComunidade"><br></td>
                </tr>             
                <tr> 
                    <td></td>
                    <td colspan="2" id="Enviar"><input type="submit" value="Enviar"></td>
                </tr>            
            </form>            
        </table>
    </body>
</html>
