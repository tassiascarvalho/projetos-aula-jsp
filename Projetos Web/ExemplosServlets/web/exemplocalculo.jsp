<%-- 
    Document   : exemplocalculo
    Created on : 15/03/2021, 08:31:02
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        
        <form method="get" action="CalcularValores">
            <label>Número 1</label>
            <input type="text" name="n1" />
            <br />
            <label>Número 2</label>
            <input type="text" name="n2" />
            <br />
            <label>Resultado</label>
            <input type="text" name="resultado" value="${resultado}" />
            <br />
            <label>Tipo do calculo</label>
            <br>
            Soma<input type="radio" name="tipoc" value="s">
            Subtração<input type="radio" name="tipoc" value="i">
            Divisão<input type="radio" name="tipoc" value="d">
            <input type="submit" value="Enviar"/>
            <input type="reset" value="Limpar"/>            
        </form>
        
    </body>
</html>
