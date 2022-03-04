/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.controller;

import br.com.siszoo.dao.GenericDAO;
import br.com.siszoo.dao.ProdutoDAOImpl;
import br.com.siszoo.model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "SalvarProduto", urlPatterns = {"/SalvarProduto"})
public class SalvarProduto extends HttpServlet {

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
        
        String mensagem = null;
        
        Produto produto = new Produto();
        
        produto.setNomeProduto(request.getParameter("nome"));
        produto.setValorVendaProduto(Double.parseDouble(request.getParameter("valorvenda")));
        produto.setValorCompraProduto(Double.parseDouble(request.getParameter("valorcompra")));
        
        try {
            GenericDAO dao = new ProdutoDAOImpl();
            if (request.getParameter("id").equals("")) {
                //Cadastrar
                if (dao.cadastrar(produto)) {
                    mensagem = "Produto cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Produto!";
                }
            } else if (!request.getParameter("id").equals("")) {
                //Alterar
                produto.setIdProduto(Integer.parseInt(request.getParameter("id")));
                if (dao.alterar(produto)) {
                    mensagem = "Produto alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Produto!";
                }
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("Produto/salvar.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao salvar Produto!"
                    + "\n Erro: " + ex.getMessage());
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
