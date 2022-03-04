<%-- 
    Document   : exemploselect
    Created on : 22/03/2021, 08:04:16
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>exemploselect.jsp</title>
    </head>
    <body>
        <h1>Classificação de um hotel</h1>

        <p>1.	Desenvolva um software para classificar um hotel 
            de acordo com a quantidade de estrelas, e permita ao usuario
            fazer um comentário sobre sua estadia:
            <br>    1 estrela  - Péssimo
            <br>    2 estrelas - Ruim
            <br>    3 estrelas - Médio
            <br>    4 estrelas - Bom 
            <br>    5 estrelas – Ótimo
        </p>
        
        <form action="ClassificacaoHotel" method="get">
            <select name="qtdestrela" required="required">
                <option value="1">1 Estrela</option>
                <option value="2">2 Estrelas</option>
                <option value="3">3 Estrelas</option>
                <option value="4">4 Estrelas</option>
                <option value="5">5 Estrelas</option>
            </select>
            <br><br><br>
            <textarea placeholder="Acrescente suas observações" rows="15" cols="40" name="comentario"></textarea>
               
            <br>
            <input type="submit" value="Enviar" name="Enviar"/>
        </form>
        
        <h3>${msg}</h3>
    </body>
</html>
