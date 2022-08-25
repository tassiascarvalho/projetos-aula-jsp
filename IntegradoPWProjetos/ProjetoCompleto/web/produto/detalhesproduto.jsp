<%-- 
    Document   : detalhesproduto
    Created on : 9 de ago de 2022, 10:48:04
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>        
        <link href="${pageContext.request.contextPath}/assets/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="${pageContext.request.contextPath}/assets/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="row">
            <div class="col-12 border"> ${produtodetalhado.nomeProduto} </div>
        </div>
        <div class="row">
            <div class="col-8 border">FOTOS DO PRODUTO</div>
            <div class="col-4 border">
                <h1>${produtodetalhado.nomeProduto}</h1>
                <h2>R$ ${produtodetalhado.valorProduto}</h2>
                
                <p>Distribuido por: <strong> ${produtodetalhado.juridica.nomePessoa} </strong></p>
                
                
                <form action="SalvarItemCarrinho" method="get">
                    <!-- ID Produto -->
                    <input type="hidden" value="${produtodetalhado.valorProduto}" name="valorunitem">
                    <input type="hidden" value="${produtodetalhado.idProduto}" name="idproduto">
                    <input type="submit" class="btn btn-danger" value="Comprar">                    
                </form>
                
                
            </div>
        </div>
        <div class="row">
            <div class="col-12 border">COMENTARIOS</div>
        </div>        
    </body>
</html>
