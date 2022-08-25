<%--
Document : gerenciaradministrador
Created on : 25 de mar de 2022, 11:14:20
Author : Tassia
--%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
        
        <script src=""
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



                        <h1>Cadastrar Administrador</h1>

                        <form action="SalvarAdministrador" method="POST" enctype="multipart/form-data">
                            
                            <input type="hidden" value="${oAdministrador.idPessoa}" name="idpessoa">
                            <div class="row">
                                <div class="form-group col-md-3">
                                    <label for="cpf" class="form-label">CPF</label>
                                    <input type="text" name="cpf" class="form-control" value="${oAdministrador.cpf}">
                                </div>
                                <div class="form-group col-md-9">
                                    <label for="nome" class="form-label">Nome</label>
                                    <input type="text" name="nome" class="form-control" value="${oAdministrador.nome}">
                                </div>
                            </div>
                            <div class="row">
                                <div class="form-group col-md-3">
                                    <label for="datanascimento" class="form-label">Data Nascimento</label>
                                    <input type="date" name="datanascimento" class="form-control" value="${oAdministrador.datanascimento}">
                                    <br />
                                </div>
                                <div class="form-group col-md-5">
                                    <label for="login" class="form-label">Login</label>
                                    <input type="text" name="login" class="form-control" value="${oAdministrador.login}">
                                    <br />
                                </div>
                                <div class="form-group col-md-4">
                                    <label for="senha" class="form-label">Senha</label>
                                    <input type="password" name="senha" class="form-control" value="${oAdministrador.senha}">
                                    <br />
                                </div>
                                <div class="form-group col-md-4">
                                    <label for="senha" class="form-label">Situação</label>
                                    <input type="text" name="situacao" class="form-control" value="${oAdministrador.situacao}">
                                    <br />
                                </div>
                            </div>
                            <label for="cidade" class="form-label">Cidade</label>
                            <select name="idcidade" class="form-control">
                                <option value="">Selecione</option>
                                <c:forEach var="cidade" items="${listadecidades}">
                                    <option value="${cidade.idCidade}"
                                            ${oAdministrador.cidade.idCidade == cidade.idCidade ? "selected": ""}>
                                        ${cidade.nomeCidade}
                                    </option>
                                </c:forEach>
                            </select>
                            <br /> <!--enctype="multipart/form-data"-->
                            <label for="caminhofoto" class="form-label">Caminho da Foto</label>
                            <br>
                            
                            <input name="caminhofoto" type="file" class="form-control" value="${oAdministrador.caminhofoto}" />
                            
                            <br />v
                            <label for="permitelogin" class="form-label">Permite Login:</label>
                            <select name="permitelogin" class="form-control">
                                <option value="N" ${oAdministrador.permiteLogin == 'N' ? "selected" : ""}>Não</option>
                                <option value="S" ${oAdministrador.permiteLogin == 'S' ? "selected" : ""}>Sim</option>
                            </select>
                            <br />
                            <input class="btn btn-primary" type="submit" value="Salvar">
                            <input class="btn btn-secondary" type="reset" value="Limpar">
                        </form>
                        ${mensagem}
                    </div>
                    <div class="col-sm-4"></div>
                    <table class="table table-success table-striped">
                        
                        <thead>
                        <th>Cidade</th>
                        <th>Nome</th>
                        <th>CPF</th>
                        <th>Nascimento</th>
                        <th>Permite Login</th>
                        <th>Foto</th>
                        <th colspan="2">Editar</th>
                        </thead>
                        
                        <tbody>
                            <c:forEach var="administrador" items="${listaadm}">
                                <tr>
                                    <td>${administrador.cidade.nomeCidade}</td>
                                    <td>${administrador.nome}</td>
                                    <td>${administrador.cpf}</td>
                                    <td>${administrador.datanascimento}</td>
                                    <td>${administrador.permiteLogin}</td>
                                    <td><img width="50px" height="50px" 
                                             src="${pageContext.request.contextPath}/fotos/
                                             ${administrador.caminhofoto}">
                                    </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ExcluirAdministrador?idpessoa=${administrador.idPessoa}">
                                            Excluir
                                        </a>
                                    </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/CarregarAdministrador?idpessoa=${administrador.idPessoa}">
                                            Alterar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                        
                    </table>
                </div>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>