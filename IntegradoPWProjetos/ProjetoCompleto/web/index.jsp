<%-- 
    Document   : index
    Created on : 15/03/2022, 13:20:24
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/dist/css/sidebars.css" rel="stylesheet" type="text/css"/>
        <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${sessionScope.pessoalogada != null}">
                <div class="flex-shrink-0 p-3 bg-white" style="width: 280px;">
                    <a href="/" class="d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom">
                        <svg class="bi me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
                        <span class="fs-5 fw-semibold">Collapsible</span>
                    </a>
                    <ul class="list-unstyled ps-0">
                        <li class="mb-1">
                            <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse" data-bs-target="#home-collapse" aria-expanded="true">
                                Gerenciar
                            </button>
                            <div class="collapse show" id="home-collapse">
                                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                    <li><a href="ListarFisica" class="link-dark rounded">Fisica</a></li>
                                    <li><a href="#" class="link-dark rounded">Juridica</a></li>
                                    <li><a href="DadosProduto" class="link-dark rounded">Produto</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="mb-1">
                            <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse" data-bs-target="#dashboard-collapse" aria-expanded="false">
                                Dashboard
                            </button>
                            <div class="collapse" id="dashboard-collapse">
                                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                    <li><a href="#" class="link-dark rounded">Overview</a></li>
                                    <li><a href="#" class="link-dark rounded">Weekly</a></li>
                                    <li><a href="#" class="link-dark rounded">Monthly</a></li>
                                    <li><a href="#" class="link-dark rounded">Annually</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="mb-1">
                            <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse" data-bs-target="#orders-collapse" aria-expanded="false">
                                Orders
                            </button>
                            <div class="collapse" id="orders-collapse">
                                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                    <li><a href="#" class="link-dark rounded">New</a></li>
                                    <li><a href="#" class="link-dark rounded">Processed</a></li>
                                    <li><a href="#" class="link-dark rounded">Shipped</a></li>
                                    <li><a href="#" class="link-dark rounded">Returned</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="border-top my-3"></li>
                        <li class="mb-1">
                            <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse" data-bs-target="#account-collapse" aria-expanded="false">
                                Conta
                            </button>
                            <div class="collapse" id="account-collapse">
                                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                    <li><a href="LogarFisica?acao=logout" class="link-dark rounded">Sair</a></li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>

                ${mensagem}
            </c:when>            
            <c:otherwise>
                <c:redirect url="loginfisica.jsp"></c:redirect>
            </c:otherwise>
        </c:choose>





        <script src="assets/dist/js/sidebars.js" type="text/javascript"></script>
        <script src="assets/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>

    </body>
</html>
