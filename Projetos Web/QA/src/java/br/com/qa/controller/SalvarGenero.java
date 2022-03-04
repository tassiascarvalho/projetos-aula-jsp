/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.controller;

import br.com.qa.dao.GenericDAO;
import br.com.qa.dao.GeneroDAOImpl;
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
@WebServlet(name = "SalvarGenero", urlPatterns = {"/SalvarGenero"})
public class SalvarGenero extends HttpServlet {

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
        String nomeGenero = request.getParameter("nomegenero");
        String descricaoGenero = request.getParameter("descricaogenero");

        Genero genero = new Genero();
        genero.setNomeGenero(nomeGenero);
        genero.setDescricaoGenero(descricaoGenero);

        try {
            GenericDAO dao = new GeneroDAOImpl();
            if (request.getParameter("idgenero").equals("")){
            if (dao.cadastrar(genero)) {
                mensagem = "Gênero cadastrado com sucesso!";
            } else {
                mensagem = "Problemas ao cadastrar Gênero!";}
            }else {
                genero.setIdGenero(Integer.parseInt(request.getParameter("idgenero")));
                if(dao.alterar(genero)){
                    mensagem="Gênero alterado com sucesso!";
                }else{
                    mensagem="Problemas ao alterar Gênero!";
                }
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("ListarGenero").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Gênero! Erro: " + ex.getMessage());
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
