/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.controller;


import br.com.qa.dao.FilmeDAOImpl;
import br.com.qa.dao.GenericDAO;
import br.com.qa.model.Categoria;
import br.com.qa.model.Filme;
import br.com.qa.model.Genero;
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
@WebServlet(name = "SalvarFilme", urlPatterns = {"/SalvarFilme"})
public class SalvarFilme extends HttpServlet {

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
        Filme filme = new Filme();
        filme.setNomeFilme(request.getParameter("nomefilme"));
        filme.setDuracaoFilme(Integer.parseInt(request.getParameter("duracaofilme")));
        filme.setSinopseFilme(request.getParameter("sinopsefilme"));
        filme.setClassificacaoFilme(request.getParameter("classificacaofilme"));
        //Recuperando das classes que se associam 
        filme.setGenero(new Genero(Integer.parseInt(request.getParameter("idgenero"))));
        filme.setCategoria(new Categoria(Integer.parseInt(request.getParameter("idcategoria"))));

        try {
            GenericDAO dao = new FilmeDAOImpl();
            if (request.getParameter("idfilme").equals("")) {
                if (dao.cadastrar(filme)) {
                    mensagem = "Filme cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Filme!";
                }
            } else {
                filme.setIdFilme(Integer.parseInt(request.getParameter("idfilme")));
                if (dao.alterar(filme)) {
                    mensagem = "Filme alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Filme!";
                }
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("ListarFilme").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Filme! Erro: " + ex.getMessage());
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
