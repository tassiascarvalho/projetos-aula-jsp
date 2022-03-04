/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.inbooking.controller;

import br.com.inbooking.model.Livro;
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
@WebServlet(name = "CadastrarLivro", urlPatterns = {"/CadastrarLivro"})
public class CadastrarLivro extends HttpServlet {

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
        
        Livro livro = new Livro();
        
        //o nome do parâmetro tem que ser identico ao que esta no name input do jsp   
        livro.setTituloLivro(request.getParameter("titulolivro"));
        livro.setIsbnLivro(request.getParameter("isbnlivro"));
        livro.setAnoPublicacaoLivro(request.getParameter("anopublicacaolivro"));
        livro.setIdiomaLivro(request.getParameter("idiomalivro"));
        livro.setUrlCapaLivro(request.getParameter("urlcapalivro"));
        livro.setCapitulosLivro(Integer.parseInt(request.getParameter("capituloslivro")));
        livro.setPaginasLivro(Integer.parseInt(request.getParameter("paginaslivro")));
        livro.setSinopseLivro(request.getParameter("sinopselivro"));
        livro.setAnoEdicaoLivro(Integer.parseInt(request.getParameter("anoedicaolivro")));
        livro.setIdiomaEdicaoLivro(Integer.parseInt(request.getParameter("idiomaedicaolivro")));
        livro.setNumeroEdicaoLivro(Integer.parseInt(request.getParameter("numeroedicaolivro")));
       
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
