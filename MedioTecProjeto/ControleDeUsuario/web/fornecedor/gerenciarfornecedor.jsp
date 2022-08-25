<%-- 
    Document   : gerenciarfornecedor
    Created on : 26 de abr de 2022, 20:58:56
    Author     : Ghost
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <c:choose>
            <c:when test = "${sessionScope.oAdministradorLogado != null}">
                <div class="row">
                    <div class="text-white col-3">
                        <jsp:include page="../menu.jsp"/>
                    </div>
                    <div class="col-9">
                        <form action="${pageContext.request.contextPath}/SalvarFornecedor" class="col-9 container">
                            <h1>Cadastrar Fornecedor</h1>
                            <label for="nome" class="form-label">Nome</label>
                            <input type="text" name="nome" class="form-control">
                            <br />
                            <div class="row">
                                <div class="form-group col-6">
                                    <label for = "" class="form-label">CPF</label>
                                    <input type="text" name="cpf" class="form-control">
                                </div>
                                <div class="form-group col-6">
                                    <label for="datanascimento" class="form-label">Data de Nascimento</label>
                                    <input type="date" name="datanascimento" class="form-control">
                                </div>
                                <div class="form-group col-6">
                                    <label for="login" class="form-label">Login</label>
                                    <input type="text" name="login" class="form-control">
                                </div>
                                <div class="form-group col-6">
                                    <label for="senha" class="form-label">Senha</label>
                                    <input type="password" name="senha" class="form-control">
                                </div>
                                <div class="col-10">
                                    <label for="url" class="form-label">URL</label>
                                    <input name="url" class="form-control"></input>
                                </div>  
                                <div class="col-10">
                                    <label for="situacao" class="form-label">Situação</label>
                                    <select name="situacao">
                                        <option selected="selected">Escolha</option>
                                        <option value="1" ${fornecedor.situacao == '1' ? "selected" : ""}>Ativo</option>
                                        <option value="0" ${fornecedor.situacao == '0' ? "selected" : ""}>Desativado</option>
                                    </select>
                                </div>                       
                            </div>
                            <br />
                            <label for="cidade" class="form-label">Cidade</label>
                            <select name="idcidade">
                                <br />
                                <option value="">Selecione</option>
                                <c:forEach var="cidade" items="${listadecidades}">
                                    <option value="${cidade.idCidade}" 
                                            ${cliente.cidade.idCidade == cidade.idCidade ? "selected": ""}>
                                        ${cidade.nomeCidade}
                                    </option>
                                </c:forEach>    
                            </select>
                            <br />
                            <label for="observacao" class="form-label">Observação</label>
                            <textarea name="observacao" class="form-control"></textarea>
                            <br />
                            <label for="permitelogin" class="form-label">Permite Login: </label>
                            <select name="permitelogin">
                                <option value="N" ${fornecedor.permiteLogin == 'N' ? "selected" : ""}>Não</option>
                                <option value="S" ${fornecedor.permiteLogin == 'S' ? "selected" : ""}>Sim</option>
                            </select>
                            <div class="container col-6">
                                <input type="submit" value="Salvar" class="form-control bg-primary text-white">
                            </div>
                            <div class="container col-6">
                                <input type="reset" value="Limpar" class="form-control bg-secondary text-white">
                            </div>
                        </form>
                        ${mensagem}
                        <br />
                    </div>
                    <div class="col-9"></div>
                    <div class="row">
                        <div class="col-6 text white"></div>
                        <div class="col-6 text-white"></div>
                    </div> 
                </div>
            </c:when>

            <c:otherwise>
                <c:redirect url = "loginadm.jsp"/>
            </c:otherwise>
        </c:choose>
        <script src="../assets/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
    </body>
</html>
