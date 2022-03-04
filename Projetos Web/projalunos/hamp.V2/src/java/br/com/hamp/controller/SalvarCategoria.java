/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.controller;

import br.com.hamp.DAO.CategoriaDAOImpl;
import br.com.hamp.DAO.GenericDAO;
import br.com.hamp.model.Categoria;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "SalvarCategoria", urlPatterns = {"/SalvarCategoria"})
public class SalvarCategoria extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String mensagem = null;
        String nomeCategoria = request.getParameter("nomeCategoria");
        String descricaoCategoria = request.getParameter("descricaoCategoria");
        
        Categoria categoria = new Categoria();
        categoria.setNomeCategoria(nomeCategoria);
        categoria.setDescricaoCategoria(descricaoCategoria);
        if (request.getParameter("idcategoria").equals("")) {

            try {
                GenericDAO dao = new CategoriaDAOImpl();
                if (dao.cadastrar(categoria)) {
                    mensagem = "Categoria cadastradada com sucesso";
                } else {
                    mensagem = "Problemas ao cadastrar Categoria!";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("categoria/salvar.jsp").forward(request, response);
            } catch (Exception ex) {
                System.err.println("Problemas ao cadastrar Categoria!Erro:" + ex.getMessage());
                ex.printStackTrace();
            }

        } else {
            categoria.setIdCategoria(Integer.parseInt(request.getParameter("idcategoria")));
            try {
                GenericDAO dao = new CategoriaDAOImpl();
                if (dao.alterar(categoria)) {
                    mensagem = "Categoria alterada com sucesso";
                } else {
                    mensagem = "Problemas ao alterar Categoria!";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("categoria/salvar.jsp").forward(request, response);
            } catch (Exception ex) {
                System.err.println("Problemas ao alterar Categoria!Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
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
