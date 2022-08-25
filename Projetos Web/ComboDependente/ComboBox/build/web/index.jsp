<%-- 
    Document   : Index
    Created on : 28/04/2018, 02:47:53
    Author     : Leroy2
--%>

<%@page import="java.util.List"%>
<%@page import="Br.com.ComboBox.MODEL.EstadoMODEL"%>
<%@page import="Br.com.ComboBox.DAO.EstadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
EstadoDAO dao = new EstadoDAO();

List<EstadoMODEL> estadoList;
estadoList = dao.ListarEstado();

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="JavaScript/jquery-3.2.0.min.js"></script>
        <script src="JavaScript/CidadeAjax.js"></script>
        <title>Exemplo Combo box</title>
    </head>
    <body>
        <form>
            
            <label for="estado" >Estado</label>
            <select name="estado" id="estado">
                <option selected disabled>Estado</option>
                <%for(EstadoMODEL registro : estadoList){%>   
                <option value=<%= registro.getCod_Estado() %>><%= registro.getNome_Estado()%></option>
                <%}%>
            </select>
            <br>
            <br>
            
             <label for="cidade" >Cidade</label>
                <select name="cidade" id="cidade">


                </select>
             
        </form>
    </body>
</html>
