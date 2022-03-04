<%-- 
    Document   : gerenciarcategoriaproduto
    Created on : 03/03/2020, 17:31:20
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
        <form action="${pageContext.request.contextPath}/SalvarCategoriaProduto" method="POST">
            ID: <input type="Text" 
                       name="idcategoriaproduto">
            <br />
            Nome:<input type="Text" 
                        name="nomecategoriaproduto">
            <br />
            Descrição:<input type="Text" 
                        name="descricaocategoriaproduto">
            <br />
            
            <br />
            <input type="submit" value="Enviar">
        </form>
        <br />
        ${mensagem}
        
    </body>
</html>
