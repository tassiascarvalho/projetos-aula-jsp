/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.controller;

import br.com.controledeusuario.dao.FornecedorDAOImpl;
import br.com.controledeusuario.dao.GenericDAO;
import br.com.controledeusuario.model.Cidade;
import br.com.controledeusuario.model.Fornecedor;
import br.com.controledeusuario.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ghost
 */
@WebServlet(name = "SalvarFornecedor", urlPatterns = {"/SalvarFornecedor"})
public class SalvarFornecedor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Fornecedor oFornecedor = new Fornecedor();
        
        oFornecedor.setNome(request.getParameter("nome"));
        oFornecedor.setCpf(request.getParameter("cpf"));
        oFornecedor.setDatanascimento(Conversoes.ConverterData(request.getParameter("datanascimento")));
        oFornecedor.setLogin(request.getParameter("login"));
        oFornecedor.setSenha(request.getParameter("senha"));
        oFornecedor.setCidade(new Cidade(Integer.parseInt(request.getParameter("idcidade"))));
        oFornecedor.setUrl(request.getParameter("url"));
        oFornecedor.setObservacao("observação");
        oFornecedor.setSituacao("situacao");
        oFornecedor.setPermiteLogin(request.getParameter("permitelogin"));
        
        
        String mensagem="";
        try{
            GenericDAO dao = new FornecedorDAOImpl();
            
            if(dao.cadastrar(oFornecedor)) {
                mensagem = "Fornecedor cadastrado com sucesso.";
            }else{
                mensagem = "Erro ao cadastrar Fornecedor.";
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("ListarFornecedor").forward(request, response);
        }catch(Exception ex){
            System.out.println("Erro ao SalvarFornecedor: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
