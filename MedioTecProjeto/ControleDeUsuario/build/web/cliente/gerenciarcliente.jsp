<%-- 
    Document   : gerenciarcliente
    Created on : 25 de mar de 2022, 11:14:20
    Author     : Tassia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <title>Cliente</title>
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
                            
                            <input type="hidden" value="${oCliente.idPessoa}" name="idpessoa">
                            
                            <div class="row">
                                <div class="form-group col-md-3">
                                    <label for="cpf" class="form-label">CPF</label>
                                    <input type="text" name="cpf" class="form-control" value="${oCliente.cpf}">                                
                                </div>
                                <div class="form-group col-md-9">
                                    <label for="nome" class="form-label">Nome</label>
                                    <input type="text" name="nome" class="form-control" value="${oCliente.nome}">                               
                                </div> 
                            </div>
                            <div class="row">
                                <div class="form-group col-md-3">
                                    <label for="datanascimento" class="form-label">Data Nascimento</label>
                                    <input type="date" name="datanascimento" class="form-control" value="${oCliente.datanascimento}">
                                    <br />
                                </div>
                                <div class="form-group col-md-5">
                                    <label for="login" class="form-label">Login</label>
                                    <input type="text" name="login" class="form-control" value="${oCliente.login}">
                                    <br />
                                </div>
                                <div class="form-group col-md-4">
                                    <label for="senha" class="form-label">Senha</label>
                                    <input type="password" name="senha" class="form-control" value="${oCliente.senha}">
                                    <br />
                                </div>
                            </div>
                            <label for="cidade" class="form-label">Cidade</label>
                            <select name="idcidade" class="form-control">
                                <option value="">Selecione</option>
                                <c:forEach var="cidade" items="${listadecidades}">
                                    <option value="${cidade.idCidade}"
                                            ${oCliente.cidade.idCidade == cidade.idCidade ? "selected": ""}>
                                        ${cidade.nomeCidade}  
                                    </option>
                                </c:forEach>                        
                            </select>   
                            <br />
                            <label for="observacao" class="form-label">Observação</label>
                            <textarea name="observacao" class="form-control">${oCliente.observacao}</textarea>
                            <br />
                            <label for="permitelogin" class="form-label">Permite Login:</label>
                            <select name="permitelogin" class="form-control">
                                <option value="N" ${oCliente.permiteLogin == 'N' ? "selected" : ""}>Não</option>
                                <option value="S" ${oCliente.permiteLogin == 'S' ? "selected" : ""}>Sim</option>
                            </select>
                            <br />
                            <input class="btn btn-primary" type="submit" value="Salvar">
                            <input class="btn btn-secondary" type="reset" value="Limpar">
                        </form>
                        ${mensagem}


                        <h1>Lista de Cidades</h1>

                        <table  class="table table-success table-striped">

                            <thead>
                            <th>Cidade</th>
                            <th>Nome </th>
                            <th>CPF</th>
                            <th>Nascimento</th>
                            <th>Permite Login</th>
                            <th colspan="2">Editar</th>
                            </thead>

                            <tbody>                
                                <c:forEach var="cliente" items="${listadeclientes}">
                                    <tr>
                                        
                                        <td>${cliente.cidade.nomeCidade}</td>
                                        <td>${cliente.nome}</td>
                                        <td>${cliente.cpf}</td>
                                        <td>${cliente.datanascimento}</td>                               
                                        <td>${cliente.permiteLogin}</td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/ExcluirCliente?idpessoa=${cliente.idPessoa}">
                                                Excluir
                                            </a>
                                        </td>  
                                        <td>
                                            <a href="${pageContext.request.contextPath}/CarregarCliente?idpessoa=${cliente.idPessoa}">
                                                Alterar
                                            </a>
                                        </td>   
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-sm-4"></div> 
                </div>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
