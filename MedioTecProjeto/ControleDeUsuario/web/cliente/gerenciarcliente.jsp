<%-- 
    Document   : gerenciarcliente
    Created on : 25 de mar de 2022, 11:14:20
    Author     : Tassia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="row">
            <div class="col-sm-3 text-white">
                <jsp:include page="../menu.jsp" />
            </div>
            <div class="col-9">
                <div class="row">
                    <div class="col-sm-8">

                        <h1>Cadastrar Cliente</h1>

                        <form action="SalvarCliente">
                            <div class="row">
                                <div class="form-group col-md-3">
                                    <label for="cpf" class="form-label">CPF</label>
                                    <input type="text" name="cpf" class="form-control">                                
                                </div>
                                <div class="form-group col-md-9">
                                    <label for="nome" class="form-label">Nome</label>
                                    <input type="text" name="nome" class="form-control">                               
                                </div> 
                            </div>
                            <div class="row">
                                <div class="form-group col-md-3">
                                    <label for="datanascimento" class="form-label">Data Nascimento</label>
                                    <input type="date" name="datanascimento" class="form-control">
                                    <br />
                                </div>
                                <div class="form-group col-md-5">
                                    <label for="login" class="form-label">Login</label>
                                    <input type="text" name="login" class="form-control">
                                    <br />
                                </div>
                                <div class="form-group col-md-4">
                                    <label for="senha" class="form-label">Senha</label>
                                    <input type="password" name="senha" class="form-control">
                                    <br />
                                </div>
                            </div>
                            <label for="cidade" class="form-label">Cidade</label>
                            <select name="idcidade" class="form-control">
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
                            <label for="permitelogin" class="form-label">Permite Login:</label>
                            <select name="permitelogin" class="form-control">
                                <option value="N" ${cliente.permiteLogin == 'N' ? "selected" : ""}>Não</option>
                                <option value="S" ${cliente.permiteLogin == 'S' ? "selected" : ""}>Sim</option>
                            </select>
                            <br />
                            <input class="btn btn-primary" type="submit" value="Salvar">
                            <input class="btn btn-secondary" type="reset" value="Limpar">
                        </form>
                           ${mensagem}
                    </div>
                    <div class="col-sm-4"></div> 
                </div>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
