<%-- 
    Document   : gerenciarcidade
    Created on : 23/11/2021, 17:53:48
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="${pageContext.request.contextPath}/assets/jquery-3.2.0.min.js" type="text/javascript"></script>
        <meta charset="UTF-8">
        <script src="${pageContext.request.contextPath}/cidade/carregarcidade.js" type="text/javascript"></script>
        <title>JSP Page</title>

    </head>
    <body>
        <div class="row">
            <div class="col-sm-3 bg-dark text-white">
                <jsp:include page="../menu.jsp" />
            </div>
            <div class="col-sm-9">
                <div class="row">                       
                    <div class="col-sm-6">
                        <h1>Gerenciar Cidade</h1>

                        <form action="SalvarCidade" method="get">
                            <label for="idcidade" class="form-label">Id Cidade - Fernandópolis - São Paulo</label>
                            <input type="number" value="${oCidade.idCidade}" name="idcidade" class="form-control" readonly>
                            <br /><br />
                            <label class="form-label">Nome Cidade</label>
                            <input type="text" value="${oCidade.nomeCidade}" class="form-control" name="nomecidade">
                            <br /><br />
                            <label class="form-label">Estado</label>
                            <select name="idestado" class="form-control">
                                <c:forEach var="estado" items="${estados}">
                                    <option value="${estado.idEstado}">${estado.siglaEstado}</option>
                                </c:forEach>
                            </select>
                            <br /><br />
                            <input  class="btn btn-primary" type="submit" value="Salvar">
                        </form>
                        <c:choose>
                            <c:when test="${tipomensagem == 'S'}">
                                <div class="alert alert-success 
                                     alert-dismissible fade show" 
                                     role="alert">
                                    <strong><h3>${mensagem}</h3></strong> 
                                    <button type="button" class="btn-close" 
                                            data-bs-dismiss="alert" aria-label="Close">                                                
                                    </button>
                                </div>

                            </c:when>
                            <c:when test="${tipomensagem == 'E'}">
                                <div class="alert alert-danger 
                                     alert-dismissible fade show" 
                                     role="alert">
                                    <strong><h3>${mensagem}</h3></strong> 
                                    <button type="button" class="btn-close" 
                                            data-bs-dismiss="alert" aria-label="Close">                                                
                                    </button>
                                </div>
                            </c:when>
                        </c:choose>
                    </div>
                </div>
                <h1>Lista de Cidades</h1>

                <table  class="table table-success table-striped">

                    <thead>
                    <th>ID Cidade</th>
                    <th>Nome Cidade</th>
                    <th>Sigla Estado</th>
                    <th>Nome Estado</th>
                    <th colspan="2">Editar</th>
                    </thead>
                    <tbody>                
                        <c:forEach var="cidade" items="${listadecidades}">
                            <tr class="table-light">
                                <td>${cidade.idCidade}</td>
                                <td>${cidade.nomeCidade}</td>
                                <td>${cidade.estado.siglaEstado}</td>
                                <td>${cidade.estado.nomeEstado}</td>
                                <td><a class="btn btn-danger" href="ExcluirCidade?idcidadeexcluir=${cidade.idCidade}">Excluir</a></td>
                                <td><a class="btn btn-primary" href="CarregarCidade?idcidadecarregar=${cidade.idCidade}">Editar</a></td>                                
                                <td>
                                    <!-- Button trigger modal -->
                                    <button onclick="carregarcidade(${cidade.idCidade})" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                        Carregar Modal
                                    </button>
                                <td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>




        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="row">                       
                            <div class="col-sm-12">
                                <h1>Gerenciar Cidade</h1>

                                <form action="SalvarCidade" method="get">
                                    <label for="idcidade" class="form-label">Id Cidade - Fernandópolis - São Paulo</label>
                                    <input type="number" value="${oCidadeModal.idCidade}" id="idcidademodal" name="idcidade" class="form-control" readonly>
                                    <br /><br />
                                    <label class="form-label">Nome Cidade</label>
                                    <input type="text" value="${oCidadeModal.nomeCidade}" id="nomecidademodal" class="form-control" name="nomecidade">
                                    <br /><br />
                                    <label class="form-label">Estado</label>
                                    <select name="idestado" class="form-control">
                                        <c:forEach var="estado" items="${estados}">
                                            <option value="${estado.idEstado}">${estado.siglaEstado}</option>
                                        </c:forEach>
                                    </select>
                                    <br /><br />
                                    <input  class="btn btn-primary" type="submit" value="Salvar">
                                </form>
                                <c:choose>
                                    <c:when test="${tipomensagem == 'S'}">
                                        <div class="alert alert-success 
                                             alert-dismissible fade show" 
                                             role="alert">
                                            <strong><h3>${mensagem}</h3></strong> 
                                            <button type="button" class="btn-close" 
                                                    data-bs-dismiss="alert" aria-label="Close">                                                
                                            </button>
                                        </div>

                                    </c:when>
                                    <c:when test="${tipomensagem == 'E'}">
                                        <div class="alert alert-danger 
                                             alert-dismissible fade show" 
                                             role="alert">
                                            <strong><h3>${mensagem}</h3></strong> 
                                            <button type="button" class="btn-close" 
                                                    data-bs-dismiss="alert" aria-label="Close">                                                
                                            </button>
                                        </div>
                                    </c:when>
                                </c:choose>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
