<%-- 
    Document   : salvar
    Created on : 16/10/2017, 22:48:34
    Author     : Douglas
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>  
        <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery-3.2.1.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6">
                <form method="POST" action="${pageContext.request.contextPath}/SalvarProduto" enctype="multipart/form-data" >
                    <h3>Adicionar novo produto</h3>
                    <!-- Id da pessoa da Empresa -->
                    <input type="hidden" value="${idpessoa}" name="idempresa">
                    <input type="hidden" value="${produto.idProduto}" name="idproduto">

                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputEmail4">Nome do produto</label>
                            <input  class="form-control" type="text" name="nome"  required />
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputPassword4">Categoria do produto</label>
                            <select  class="form-control" name="categoria" required>
                                <option value="1">Almofadas Ortopédicas</option>
                                <option value="2">Andadores</option>
                                <option value="3">Bengalas</option>
                                <option value="4">Botas Imobilizadoras</option>
                                <option value="5">Cadeiras de rodas e banho</option>
                                <option value="6">Coletes de coluna</option>
                                <option value="7">Faixas Abdominais</option>
                                <option value="8">Imobilizadores de Joelhos</option>
                                <option value="9">Joelheiras Articuladas</option>
                                <option value="10">Muletas </option>
                                <option value="11">Ortese para Ombro</option>                  
                                <option value="12">Tornozeleira</option>
                                <option value="13">Outros</option>
                            </select>
                        </div>
                        <div class="form-group col-md-12">
                            <label>Valor da locação por dia</label>
                            <input  class="form-control" type="number"  name="preco" required/>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Tamanho do Produto</label>
                            <input class="form-control" type="number"  name="tamanho" required/>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Peso do produto</label>
                            <input class="form-control" type="number"  name="peso" required/>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Cor do produto</label>
                            <input class="form-control"  type="color"  name="cor" required/>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Referencia do Produto</label>
                            <input class="form-control" type="text"  name="ref" required>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Quantidade</label>
                            <input type="number" name="quant"  class="form-control" />
                        </div>

                        <div class="form-group col-md-9">
                            <p><label>Descrição do produto</label></p>
                            <textarea  class="form-control" rows="5" required name="desc">                   
                            </textarea>
                        </div>
                        <div class="form-group col-md-3">
                            <label>Diponibilidade de Locação</label>
                            <p> <label>Dísponivel</label> <input type="radio" class="radio" name="disp" value="Diponivel" required/></p>
                            <p> <label>Indisponivel</label><input type="radio" class="radio" name="disp" value="Indisponivel" required/></p>
                        </div>
                        <div class="form-group col-md-12">
                            <label>Adcionar fotos <input class="form-control" type="file"  name="file[]"  required></label>
                            <input type="submit" value="Publicar Produto" class="btn btn-success"/>
                        </div>
               
                    </div>
                </form>
                ${mensagem}
            </div>
        </div>

    </body>
</html>
