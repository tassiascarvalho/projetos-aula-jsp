<%-- 
    Document   : controle
    Created on : 14/10/2017, 20:06:42
    Author     : Douglas Costa
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<c:choose>
    <c:when test="${sessionScope.pessoaj != null}">
        <html>
            <head>
                <title>HAMP | PAINEL DE CONTROLE</title>
                <meta charset="ISO-8859-1">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">


                <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>  
                <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery-3.2.1.js" type="text/javascript"></script>
                <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.js" type="text/javascript"></script>
            </head>
            <body>
                <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="#">  ${saudacao} ${mensagem}</a>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Categoria <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="categoria/salvar.jsp">Salvar Categoria</a></li>
                                        <li><a href="ListarCategoria"> Listar Categoria</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Produto<span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="${pageContext.request.contextPath}/IdProduto?idpessoa=${pessoaj.idPessoa}"> Cadastrar novo Produto</a></li>
                                        <li><a href="${pageContext.request.contextPath}/ListarProduto?idempresa=${pessoaj.idPessoa}" >Listar Produtos</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <form class="navbar-form navbar-left" method="POST" action="CarregarPessoaJ">
                                        <input type="hidden" name="idpessoa" value="${pessoaj.idPessoa}">
                                        <input class="btn btn-info" type="submit" value="Minha Conta">
                                    </form>
                                </li>
                                <li>
                                    <form class="navbar-form navbar-left">
                                        <a class="btn btn-danger" href="${pageContext.request.contextPath}/LogarUsuario?acao=logout">Sair</a>
                                    </form>
                                </li>
                            </ul>


                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>                       
            </body>
        </html>
    </c:when>
    <c:otherwise> <!--ELSE do JSTL-->
        <c:redirect url="../../index.jsp"/> <!--IF do JSTL-->
    </c:otherwise>
</c:choose>