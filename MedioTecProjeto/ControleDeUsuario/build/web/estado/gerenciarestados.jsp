<%-- 
    Document   : gerenciarestados
    Created on : 30/08/2021, 13:33:55
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <title>Gerenciar Estados</title>
    </head>

    <body>
        <h1>Gerenciar Estados</h1>
        <!--contextPath retorna a raiz do projeto-->
        <form action="${pageContext.request.contextPath}/SalvarEstado">
            <label for="id">ID</label>
            <input type="number" name="id" value="${oEstado.idEstado}"/>
            <br />
            <label for="nome">Nome</label>
            <input type="text" name="nome" value="${oEstado.nomeEstado}"/>
            <br />
            <label for="sigla">Sigla</label>
            <input type="text" name="sigla" value="${oEstado.siglaEstado}"/>
            <br />            
            <input type="submit" value="Salvar"/>
        </form>   
        ${mensagem}



        <div class="container mt-3">
            <h2>Lista de Estados</h2>

            <div class="container-fluid d-flex flex-wrap">
                <c:forEach var="estado" items="${listaestados}" >                  
                    <div class="col-sm-3 px-2">
                        <div class="card">
                            <div class="card-header bg-primary text-white">
                                <h1>${estado.nomeEstado}</h1>
                            </div>
                            <div class="card-body">
                                <h2>${estado.idEstado}</h2>
                                <h3>${estado.nomeEstado}</h3>
                                <h3>${estado.siglaEstado}</h3>
                            </div> 
                            <div class="card-footer bg-dark text-white"> 
                                <a class="btn btn-danger" href="ExcluirEstado?idestadoexcluir=${estado.idEstado}">Excluir</a>
                                <a class="btn btn-primary" href="CarregarEstado?idestadocarregar=${estado.idEstado}">Alterar</a>
                            </div>
                        </div>
                    </div>         
                </c:forEach>
            </div>
        </div>
    </body>
</html>
